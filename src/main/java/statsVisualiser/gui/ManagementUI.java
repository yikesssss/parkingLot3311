/*************************************************
 * FALL 2022
 * EECS 3311 GUI SAMPLE CODE
 * ONLT AS A REFERENCE TO SEE THE USE OF THE jFree FRAMEWORK
 * THE CODE BELOW DOES NOT DEPICT THE DESIGN TO BE FOLLOWED 
 */

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


public class ManagementUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static ManagementUI instance;

	public static ManagementUI getInstance() {
		if (instance == null)
			instance = new ManagementUI();

		return instance;
	}
	
	JCheckBox handicapCheckBox, evCheckBox, coveredCheckBox;
	
	
	private ManagementUI() {
		
		//make sure to add section to validate licenseplate
		super("Book your parking Spot");
		
		
		
		//if supermanager add the make new account feature
		
//		JPanel top = new JPanel();
//		top.setBackground(Color.WHITE);
//		
//		JPanel mid = new JPanel();
//		mid.setBackground(Color.BLUE);
//		
//		JPanel bottom = new JPanel();
//		bottom.setBackground(Color.WHITE);
//		
//		setLayout(new BorderLayout());
//		
//		add(top, BorderLayout.NORTH);
//		add(mid, BorderLayout.CENTER);
//		add(bottom, BorderLayout.SOUTH);
//		
//		JLabel h1 = new JLabel("Book your parking Spot");
//		top.add(h1);
//		
//		JLabel pkLocation = new JLabel("ParkingSpot Location: ");
//		mid.add(pkLocation);
//		
//		BookingReceiver bookingReceiver = new BookingReceiver();
//		CommandInvoker invoker = new CommandInvoker();
//		
//		// Parking Features Panel (Checkboxes)
//        JPanel featurePanel = new JPanel();
//        evCheckBox = new JCheckBox("EV Charging");
//        coveredCheckBox = new JCheckBox("Covered Parking");
//        handicapCheckBox = new JCheckBox("Handicap Accessible");
//
//        featurePanel.add(evCheckBox);
//        featurePanel.add(coveredCheckBox);
//        featurePanel.add(handicapCheckBox);
//        
//        mid.add(featurePanel);
//		
//		JButton bookbttn = new JButton("Book Parking Spot");
//		JButton extendbttn = new JButton("Extend Booking Time");
//		JButton cancelbttn = new JButton("Cancel Booking");
//		
//		bookbttn.addActionListener(e -> bookSpot());
//		extendbttn.addActionListener(e -> extendSpot());
//		cancelbttn.addActionListener(e -> cancelSpot());
//		
//		mid.add(bookbttn);
//		mid.add(extendbttn);
//		mid.add(cancelbttn);
		
		
	}
	
	private void cancelSpot() {
		// TODO Auto-generated method stub
	}




	private void extendSpot() {
		// TODO Auto-generated method stub
	}




	private void bookSpot() {
		ParkingSpot spot = new ParkingSpot(20, "A1", "Lot1");
		 if (evCheckBox.isSelected()) {
             spot = new EVChargingDecorator(spot);
         }
         if (coveredCheckBox.isSelected()) {
             spot = new CoveredParkingDecorator(spot);
         }
         if (handicapCheckBox.isSelected()) {
             spot = new HandicapAccessDecorator(spot);
         }
         
//         parkingManager.addParkingSpot(spot);
//         
//         ICommand command = new BookCommand(bookingReceiver, userID, licensePlate, hrs);
//         
//         if (command != null) {
//             invoker.setCommand(command);
//             invoker.executeCommand();
//             resultArea.setText("✅ " + actionType + " action completed successfully!\n" 
//                             + spot.getDetails());
//         } else {
//             resultArea.setText("❗ Error processing request.");
//         }

	}



	public static void main(String[] args) {

		JFrame frame = ManagementUI.getInstance();
		frame.setSize(900, 600);
//		frame.pack();
		frame.setVisible(true);
	}
	// TODO Auto-generated method stub

}