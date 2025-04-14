//working version

package statsVisualiser.gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import booking.*;
import parking.*;


public class BookingUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static BookingUI instance;

	public static BookingUI getInstance() {
		if (instance == null)
			instance = new BookingUI();

		return instance;
	}
	
	JCheckBox handicapCheckBox, evCheckBox, coveredCheckBox;
	JTextArea resultArea;
	JTextField licensePlateField, bookingHrs;
	
	private BookingReceiver bookingReceiver;
    private CommandInvoker invoker;
    private ParkingLotManager parkingLotManager;
	
	
	private BookingUI() {
		
		//make sure to add section to validate licenseplate
		super("Book your parking Spot");
		
		bookingReceiver = new BookingReceiver();
        invoker = new CommandInvoker();
        parkingLotManager = ParkingLotManager.getInstance();
		
		JPanel top = new JPanel();
		top.setBackground(Color.WHITE);
		
		JPanel mid = new JPanel();
//		mid.setBackground(Color.BLUE);
		mid.setLayout(new BoxLayout(mid, BoxLayout.Y_AXIS));
		
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		
		add(top, BorderLayout.NORTH);
		add(mid, BorderLayout.CENTER);
		add(bottom, BorderLayout.SOUTH);
		
		JLabel h1 = new JLabel("Book your parking Spot");
		top.add(h1);
		
//		JLabel pkLocation = new JLabel("ParkingSpot Location: ");
//		mid.add(pkLocation);
		
		JPanel bookingInfoP = new JPanel();
		bookingInfoP.setLayout(new BoxLayout(bookingInfoP, BoxLayout.Y_AXIS));
		bookingInfoP.add(new JLabel("Input licence Plate"));
		licensePlateField = new JTextField();
		bookingInfoP.add(licensePlateField);
		bookingInfoP.add(new JLabel("Input booking time in hours: "));
		bookingHrs = new JTextField();
		bookingInfoP.add(bookingHrs);
		
		mid.add(bookingInfoP);
		
        JPanel featurePanel = new JPanel();
        evCheckBox = new JCheckBox("EV Charging");
        coveredCheckBox = new JCheckBox("Covered Parking");
        handicapCheckBox = new JCheckBox("Handicap Accessible");

        featurePanel.add(evCheckBox);
        featurePanel.add(coveredCheckBox);
        featurePanel.add(handicapCheckBox);
        
        mid.add(featurePanel);
		
		JButton bookbttn = new JButton("Book Parking Spot");
		JButton extendbttn = new JButton("Extend Booking Time");
		JButton cancelbttn = new JButton("Cancel Booking");
		
		bookbttn.addActionListener(e -> bookSpot());
		extendbttn.addActionListener(e -> extendSpot());
		cancelbttn.addActionListener(e -> cancelSpot());
		
		JPanel buttonsPanel = new JPanel();
		
		buttonsPanel.add(bookbttn);
		buttonsPanel.add(extendbttn);
		buttonsPanel.add(cancelbttn);
		
		
		
		mid.add(buttonsPanel);
		
		resultArea = new JTextArea(10, 40);
		resultArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(resultArea);
		
		bottom.add(scrollPane);
		
		
	}
	
	private void cancelSpot() {
		String userID = "32789432";
        String licensePlate = licensePlateField.getText().trim();

        ICommand command = new CancelCommand(bookingReceiver, userID, licensePlate);
        invoker.setCommand(command);
        invoker.executeCommand();

        resultArea.setText("Booking canceled.");
	}




	private void extendSpot() {
		try {
			String userID = "32789432";
            String licensePlate = licensePlateField.getText().trim();
            int extraHours = Integer.parseInt(bookingHrs.getText().trim());

            ICommand command = new ExtendCommand(bookingReceiver, userID, licensePlate, extraHours);
            invoker.setCommand(command);
            invoker.executeCommand();

            resultArea.setText("Booking extended.");

        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid hours input.");
        }
	}




	private void bookSpot() {
		try {
            String userID = "32789432";
            String licensePlate = licensePlateField.getText().trim();
            int hrs = Integer.parseInt(bookingHrs.getText().trim());

            if (userID.isEmpty() || licensePlate.isEmpty() || hrs <= 0) {
                resultArea.setText("❗ Please fill out all fields correctly.");
                return;
            }

            ParkingSpot spot = new ParkingSpot(20, "A1", "Lot1");

            if (evCheckBox.isSelected()) spot = new EVChargingDecorator(spot);
            if (coveredCheckBox.isSelected()) spot = new CoveredParkingDecorator(spot);
            if (handicapCheckBox.isSelected()) spot = new HandicapAccessDecorator(spot);

            parkingLotManager.addParkingSpot(spot);

            ICommand command = new BookCommand(bookingReceiver, userID, licensePlate, hrs);
            invoker.setCommand(command);
            invoker.executeCommand();

            resultArea.setText("Booking successful!\n" + spot.getDetails());

        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid hours input. Must be a number.");
        } catch (Exception ex) {
            resultArea.setText("Booking failed: " + ex.getMessage());
        }
		

	}



	public static void main(String[] args) {

		JFrame frame = BookingUI.getInstance();
		frame.setSize(900, 600);
//		frame.pack();
		frame.setVisible(true);
	}
	

}