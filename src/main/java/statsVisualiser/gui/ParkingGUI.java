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
import java.util.Vector;

import javax.swing.BorderFactory;
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

import parking.*;

public class ParkingGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static ParkingGUI instance;

	public static ParkingGUI getInstance() {
		if (instance == null)
			instance = new ParkingGUI();

		return instance;
	}
	
	private ParkingSpot parkingSpot;
	private ParkingLotManager manager;
	private JCheckBox evCharging;
	private JCheckBox handicap;
	private JCheckBox coveredParking;
	
	
	private ParkingGUI() {
		super("Book your parking Spot");
		
		JPanel top = new JPanel();
		top.setBackground(Color.WHITE);
		
		JPanel mid = new JPanel();
		mid.setBackground(Color.BLUE);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		
		add(top, BorderLayout.NORTH);
		add(mid, BorderLayout.CENTER);
		add(bottom, BorderLayout.SOUTH);
		
		JLabel h1 = new JLabel("Book your parking Spot");
		top.add(h1);
		
		manager = ParkingLotManager.getInstance();
		
		JLabel parkingId = new JLabel("Parking Spot ID is: ");
		mid.add(parkingId);
//		psIdTextField = new JTextField();
		
		JLabel parkingLot = new JLabel("Parking Lot Location: ");
		mid.add(parkingLot);
		
		evCharging = new JCheckBox("EV Charging Space"); //these should be select instead
		handicap = new JCheckBox("Handicap Space");
		coveredParking = new JCheckBox("Covered Parking Spot");
		
		mid.add(evCharging);
		mid.add(handicap);
		mid.add(coveredParking);
		
		JButton addSpot = new JButton("Add Parking Spot");
		JButton showDetails = new JButton("Show Final Details");
		
		mid.add(addSpot);
		mid.add(showDetails);
		
		addSpot.addActionListener(null);
		showDetails.addActionListener(null);
		
		
		
	}



	public static void main(String[] args) {

		JFrame frame = ParkingGUI.getInstance();
		frame.setSize(900, 600);
//		frame.pack();
		frame.setVisible(true);
	}
	// TODO Auto-generated method stub

}