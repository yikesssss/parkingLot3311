
package statsVisualiser.gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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

import user.*;

public class RegisterUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static RegisterUI instance;

	public static RegisterUI getInstance() {
		if (instance == null)
			instance = new RegisterUI();

		return instance;
	}
	
	private RegisterUI() {
		super("YorkU Parking Booking System");
		
		JPanel top = new JPanel();
		top.setBackground(Color.WHITE);
		
		JPanel mid = new JPanel();
//		mid.setBackground(Color.BLUE);
		mid.setLayout(new GridLayout(1, 2));
		
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		
		add(top, BorderLayout.NORTH);
		add(mid, BorderLayout.CENTER);
		add(bottom, BorderLayout.SOUTH);
		
	
		JLabel h1 = new JLabel("Register for an account");
		top.add(h1);
		
		JPanel loginPanel = createLoginPanel();
		JPanel registerPanel = createRegisterPanel();
		
		
		
		mid.add(loginPanel, "Login");
		mid.add(registerPanel, "Register");
		
		resultArea = new JTextArea(4, 20);
		resultArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(resultArea);
		
		bottom.add(scrollPane);
		
		
	}
	
	JTextField loginEmail;
	JPasswordField loginPass;
	JTextArea resultArea;
	
	private JPanel createLoginPanel() { //make this layout vertical
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(new JLabel("Login Here"));
		
		panel.add(new JLabel("Email: "));
		loginEmail = new JTextField();
		panel.add(loginEmail);
		
		panel.add(new JLabel("Password: "));
//		JPasswordField loginPass = new JPasswordField();
		loginPass = new JPasswordField();
		panel.add(loginPass);
		
		JButton submitbttn = new JButton("Submit");
		submitbttn.addActionListener(e -> checkLogin()); //have this go to auth
		panel.add(submitbttn);
		
		resultArea = new JTextArea(10, 40);
		
		return panel;
	}
	
	JTextField registerEmail, registerName;
	JPasswordField registerPass;
	JComboBox userOptionList;
	
	private JPanel createRegisterPanel() {
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(new JLabel("Register Here"));
		
		panel.add(new JLabel("Email: "));
		registerEmail = new JTextField();
		panel.add(registerEmail);
		
		panel.add(new JLabel("Username: "));
		registerName = new JTextField();
		panel.add(registerName);
		
		panel.add(new JLabel("Password: "));
//		JPasswordField loginPass = new JPasswordField();
		registerPass = new JPasswordField();
		panel.add(registerPass);
		
		panel.add(new JLabel("User Type"));
		String[] userOptions = {"Student", "Visitor", "Faculty", "Management Team", "SuperManager"};
		userOptionList = new JComboBox<>(userOptions);
		panel.add(userOptionList);
		
		JButton submitbttn = new JButton("Submit");
		submitbttn.addActionListener(e -> registerUser()); //have this go to auth
		panel.add(submitbttn);
		
//		resultArea = new JTextArea(4, 20);
		
		return panel;
	}
	
	private void checkLogin() {
		String email = loginEmail.getText().trim();
		String password = loginPass.getText().trim();
		
		User test = new Visitor("visior@gmail.com", "mon", "apples");
		
		if(test.login(email, password)) { //make call to database and see if person is on it
			resultArea.setText("Login Successful"); //move the person to booking page
			
		} else {
			resultArea.setText("Login Failed");
			
		}
		
		
	}
	
	private void registerUser() {
		UserAbstractFactory userFactory;
		
		String email = registerEmail.getText().trim();
		String username = registerName.getText().trim();
		String password = registerPass.getText().trim();
		String userType = (String) userOptionList.getSelectedItem();
		
		if(userType.equals("SuperManager") || userType.equals("Management Team")) {
			 userFactory = FactoryProducer.getFactory(false);
		} else {
			userFactory = FactoryProducer.getFactory(true);
		}
		
		User newUser = userFactory.createUser(userType, email, username, password);
		
		if(!newUser.validateEmail()) {
			resultArea.setText("Invalid email format");
		}
		
		if(!newUser.validatePassword()) {
			resultArea.setText("Invalid email format");
		}
		
		newUser.register();
		resultArea.setText(userType + " account registered");
		
		
	}

	public static void main(String[] args) {

		JFrame frame = RegisterUI.getInstance();
		frame.setSize(900, 600);
//		frame.pack();
		frame.setVisible(true);
	}
	

}