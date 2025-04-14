
package statsVisualiser.gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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

import payment.*;

public class PaymentUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static PaymentUI instance;

	public static PaymentUI getInstance() {
		if (instance == null)
			instance = new PaymentUI();

		return instance;
	}
	
	
	private JTextField transactionIDField, amountField;
    private JComboBox<String> paymentMethodsSelect;
    private JTextArea resultArea;
    private int amount;
    private String transactionId = "ADX"+Math.random();
    
    
	
	
	private PaymentUI() {
		super("YorkU Parking Payment");
		
//		transactionID = "ABECSG" + Math.random();
//		this.amount = amount;
		this.amount = 20;
		
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
		
		JLabel h1 = new JLabel("Pay here");
		top.add(h1);
		
		
		
		mid.add(new JLabel("Transaction Id: "+ transactionId));
		mid.add(new JLabel("Amount due: " + this.amount));
		

		String[] paymentMethods = {"CreditCard", "DebitCard", "PayPal" };
		paymentMethodsSelect = new JComboBox<>(paymentMethods);
		mid.add(paymentMethodsSelect);
		
		JButton paybttn = new JButton("Submit Payment");
		paybttn.addActionListener(e -> processPayment());
		mid.add(paybttn);
		//display confirmation
		
		resultArea = new JTextArea(10, 40);
		resultArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(resultArea);
		
		bottom.add(scrollPane);
		
		
		
	}



	private void processPayment() {
		String method = (String) paymentMethodsSelect.getSelectedItem();
		try {
            PaymentGateway gateway = PaymentProcessor.getPaymentGateway(method);
            boolean success = gateway.processTransaction(transactionId, amount, method);

            if (success) {
                resultArea.setText("Payment successful!\n" + gateway.paymentConfirmation(transactionId));
            } else {
                resultArea.setText("Payment failed.\n" + gateway.paymentFailure("500"));
            }
        } catch (Exception e) {
            resultArea.setText("Error: " + e.getMessage());
        }
	}



	public static void main(String[] args) {

		JFrame frame = PaymentUI.getInstance();
		frame.setSize(900, 600);
//		frame.pack();
		frame.setVisible(true);
	}
	

}