package animeMerchandise;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class UserInformation{
	String customerName;
	String customerAddress;
	String contactDetails;
	String customerID;
	String modeOfPayment;
	
	//setters
	public void setCustomerName(String customerName) {
		if(customerName == null) {
			customerName = " ";
		}
		this.customerName = customerName;
	}
	public void setCustomerAddress(String customerAddress) {
		if(customerAddress == null) {
			customerAddress = " ";
		}
		this.customerAddress = customerAddress;
	}
	public void setContactDetails(String contactDetails) {
		if(contactDetails == null) {
			contactDetails = " ";
		}
		this.contactDetails = contactDetails;
	}
	public void setCostumerID(String customerID) {
		if(customerID == null) {
			customerID = " ";
		}
		this.customerID = customerID;
	}
	public void setModeOfPayment(String modeOfPayment) {
		if(modeOfPayment == null) {
			modeOfPayment = " ";
		}
		this.modeOfPayment = modeOfPayment;
	}
	
	//getters
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public String getCustomerID() {
		return customerID;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
}

class YourAccount extends GUIDesign{
	private static JLabel name;
	private static JLabel costumerID;
	private static JLabel address;
	private static JLabel cdetails;
	private static JLabel payment;
	private static JLabel Discount;
	static JLabel labelID;
	static JLabel labelName;
	static JLabel labelAddress;
	static JLabel labelContact;
	static JLabel labelMOD;
	static JLabel radButtonAcc1;
	static JLabel radButtonAcc2;
	private static JButton editButton;
	private static JPanel accUserPanel;
	private static JLabel Icon;
	private JPanel panel_6;
	private JPanel panel_7;
	
	public  void UserAccountInformation() {
		YourAccount run = new YourAccount();
		run.UserInfo();
	}

	void UserInfo() {
		
	
				
			//Label
		costumerID = new JLabel("Costumer ID: ");
		costumerID.setBounds(20,125, 150,30);
		costumerID.setFont(new Font("Arial", Font.BOLD,15 ));
				
		labelID =new JLabel(" ");
		labelID.setBounds(30,149, 350,30);
		labelID.setFont(new Font("Arial", Font.BOLD,15 ));
				
		name = new JLabel("Name: ");
		name.setBounds(625,125, 80,30);
		name.setFont(new Font("Arial", Font.BOLD,15 ));
				
		labelName = new JLabel("");
		labelName.setBounds(630,149, 350,30);
		labelName.setFont(new Font("Arial", Font.BOLD,15 ));
				
		address = new JLabel("Address: ");
		address.setBounds(20,225, 80,30);
		address.setFont(new Font("Arial", Font.BOLD,15 ));
				
		labelAddress =new JLabel("");
		labelAddress.setBounds(30,249, 450,30);
		labelAddress.setFont(new Font("Arial", Font.BOLD,15 ));
				
		cdetails = new JLabel("Contact Details: ");
		cdetails.setBounds(625,225, 150,30);
		cdetails.setFont(new Font("Arial", Font.BOLD,15 ));
				
		labelContact=new JLabel("");
		labelContact.setBounds(630,249, 350,30);
		labelContact.setFont(new Font("Arial", Font.BOLD,15 ));
				
		payment = new JLabel("Mode of Payment: ");
		payment.setBounds(20,325, 200,30);
		payment.setFont(new Font("Arial", Font.BOLD,15 ));
				
		labelMOD =new JLabel("");
		labelMOD.setBounds(30,349, 350,30);
		labelMOD.setFont(new Font("Arial", Font.BOLD,15 ));
				
		Discount = new JLabel("Discount: ");
		Discount.setBounds(625,325, 80,30);
		Discount.setFont(new Font("Arial", Font.BOLD,15 ));
			
		radButtonAcc1=new JLabel("");
		radButtonAcc1.setBounds(625,349, 80,30);
				
		radButtonAcc2=new JLabel("");
		radButtonAcc2.setBounds(635,349, 80,30);
				
		//Button
			editButton = new JButton("Change");
			editButton.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
			editButton.setBackground(new Color(0xa21420));
			editButton.setForeground(Color.white);
			editButton.setBorder(BorderFactory.createEtchedBorder());
			editButton.setFocusable(false);
			editButton.setBounds(800,0,200,61);	
			editButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e){
						ProfileEditingFrame newf= new ProfileEditingFrame();
						newf.EditInfo();
					}
				});
			Image clearImage = new ImageIcon(this.getClass().getResource("/reset.png")).getImage();
			Image newClearImage = clearImage.getScaledInstance(100,100,Image.SCALE_SMOOTH);
			JButton clearAccButton  = new JButton("BUY");
			clearAccButton.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
			clearAccButton.setForeground(Color.white);
			clearAccButton.setBackground(new Color(0xa21420));
			clearAccButton.setFocusable(false);
			clearAccButton.setBorder(BorderFactory.createEtchedBorder());
			clearAccButton.setBounds(1000,0,100,61);
			clearAccButton.setIcon(new ImageIcon(newClearImage));
			clearAccButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ProfileEditingFrame.userInfo.setCustomerName(null);
					ProfileEditingFrame.userInfo.setCustomerAddress(null);
					ProfileEditingFrame.userInfo.setContactDetails(null);
					ProfileEditingFrame.userInfo.setCostumerID(null);
					ProfileEditingFrame.userInfo.setModeOfPayment(null);
					
					YourAccount.labelID.setText(ProfileEditingFrame.userInfo.getCustomerID());
					YourAccount.labelName.setText(ProfileEditingFrame.userInfo.getCustomerName());
					YourAccount.labelAddress.setText(ProfileEditingFrame.userInfo.getCustomerAddress());
					YourAccount.labelContact.setText(ProfileEditingFrame.userInfo.getCustomerName());
					YourAccount.labelMOD.setText(ProfileEditingFrame.userInfo.getModeOfPayment());
					YourAccount.radButtonAcc2.setText(" ");
				}});

		//Picture
		Image PersonIcon = new ImageIcon(this.getClass().getResource("/Acc Logo.png")).getImage();
		Image newPersonIcon = PersonIcon.getScaledInstance(80,80,Image.SCALE_SMOOTH);
		Icon = new JLabel();
		Icon.setBounds(250, 45, 80, 80);
		Icon.setIcon(new ImageIcon(newPersonIcon));

				
		//Red Panel sa taas
		accUserPanel = new JPanel();
		accUserPanel.setBackground(new Color(0xC10E0E));
		accUserPanel.setBounds(0,0,1280,125);
		accUserPanel.setLayout(null);
		accUserPanel.add(Icon);
				
		//Title
		JLabel title = new JLabel("Your Profile Account");
		title.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 46));
		title.setForeground(new Color(255, 255, 255));
		title.setBounds(340, 70, 362, 44);
			 	
		//Display
		layeredAccount.add(costumerID);
		layeredAccount.add(name);
		layeredAccount.add(payment);
		layeredAccount.add(labelID); 
		layeredAccount.add(labelName);
		layeredAccount.add(labelAddress); 
		layeredAccount.add(labelContact); 
		layeredAccount.add(labelMOD);
		panelClearAccInfo.add(editButton);
		panelClearAccInfo.add(clearAccButton);
		layeredAccount.add(accUserPanel);
		accUserPanel.add(title);
		layeredAccount.add(address);
		layeredAccount.add(cdetails);
		layeredAccount.add(Discount); 
		layeredAccount.add(radButtonAcc1);
		layeredAccount.add(radButtonAcc2);

				
		//Ito yung White Panel 
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(20, 149, 383, 74);
		layeredAccount.add(panel);
				
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(20, 249, 383, 74);
		layeredAccount.add(panel_1);
				
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(20, 349, 383, 74);
		layeredAccount.add(panel_2);
				
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(625, 149, 383, 74);
		layeredAccount.add(panel_3);
				
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(625, 249, 383, 74);
		layeredAccount.add(panel_4);
				
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(625, 349, 383, 74);
		layeredAccount.add(panel_5);
				
		//Panel sa baba na red
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(165, 42, 42));
		panel_6.setBounds(0, 482, 1064, 80);
		layeredAccount.add(panel_6);
				
		//Panel sa gitna na black
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 0));
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(488, 125, 27, 361);
		layeredAccount.add(panel_7);
	}
}

class ProfileEditingFrame{
	private static JLabel customerIDPanel;
	private static JLabel customerNamePanel;
	private static JLabel customerAddressPanel;
	private static JLabel customerContactPanel;
	private static JLabel customerPayPanel;
	private static JLabel customerDiscountPanel;
	private static JButton editButton;
	private static JTextField IDInput;
	private static JTextField NameInput;
	private static JTextField AddressInput;
	private static JTextField ContactInput;
	private static JTextField MODInput;
	private static JFrame frameAcc;
	protected static JRadioButton radButtonNone;
	protected static JRadioButton radButton;
	private ButtonGroup group;
	protected static boolean selectedBool;
	protected static String InputText;
	protected static String InputText2;
	protected static String InputText3;
	protected static String InputText4;
	protected static String InputText5;
	
	protected static UserInformation userInfo = new UserInformation();
	
void EditInfo() {
	
//Frame labelName
		frameAcc=new JFrame("Profile Editor");
		
		//Label
		customerIDPanel = new JLabel("Costumer ID:");
		customerIDPanel.setBounds(20,20, 80,30);
		
		customerNamePanel = new JLabel("Name:");
		customerNamePanel.setBounds(20,75, 80,30);
		
		customerAddressPanel = new JLabel("Address:");
		customerAddressPanel.setBounds(20,130, 80,30);
		
		customerContactPanel = new JLabel("Contact Details:");
		customerContactPanel.setBounds(20,185, 100,30);
		
		customerPayPanel = new JLabel("Mode of Payment:");
		customerPayPanel.setBounds(20,240, 150,30);
		
		customerDiscountPanel = new JLabel("Discount:");
		customerDiscountPanel.setBounds(20,295, 150,30);
		
		//Button
		editButton = new JButton("Confirm");
		editButton.setBounds(270,360, 80,30);
		editButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				boolean complete = true;
				
				while(complete == true) {
					
					String InputText = IDInput.getText();
					userInfo.setCostumerID(InputText);
					
					String InputText2 = NameInput.getText();
					userInfo.setCustomerName(InputText2);
					
					String InputText3 = AddressInput.getText();
					userInfo.setCustomerAddress(InputText3);
					
					String InputText4 = ContactInput.getText();
					userInfo.setContactDetails(InputText4);
					
					String InputText5 = MODInput.getText();
					userInfo.setModeOfPayment(InputText5);
						if(InputText.isEmpty() == false &&
								InputText2.isEmpty() == false &&
								InputText3.isEmpty() == false &&
								InputText4.isEmpty() == false &&
								InputText5.isEmpty() == false) {
								YourAccount.labelID.setText(userInfo.getCustomerID());
								YourAccount.labelName.setText(userInfo.getCustomerName());
								YourAccount.labelAddress.setText(userInfo.getCustomerAddress());
								YourAccount.labelContact.setText(userInfo.getContactDetails());
								YourAccount.labelMOD.setText(userInfo.getModeOfPayment());
						
							if(radButtonNone.isSelected()== true){
					 			YourAccount.radButtonAcc1.setText("NONE");
					 			selectedBool = false;
					 		}
				 
						 	else if(radButton.isSelected() == true){
						 			YourAccount.radButtonAcc2.setText("20%");
						 			selectedBool = true;
						 		}
								complete = false;
						}
						
						else {
							JOptionPane.showMessageDialog(null, "Please Complete The Information",null, JOptionPane.WARNING_MESSAGE);
							ProfileEditingFrame.userInfo.setCustomerName(null);
							ProfileEditingFrame.userInfo.setCustomerAddress(null);
							ProfileEditingFrame.userInfo.setContactDetails(null);
							ProfileEditingFrame.userInfo.setCostumerID(null);
							ProfileEditingFrame.userInfo.setModeOfPayment(null);
							complete = false;
						}
				}
					
					
					
					frameAcc.setVisible(true);
					frameAcc.dispose();
			}
		});

		//Informations
		IDInput = new JTextField();
		IDInput.setBounds(100,20, 280,30);
		
		NameInput = new JTextField();
		NameInput.setBounds(100,75, 280,30);
		
		AddressInput = new JTextField();
		AddressInput.setBounds(100,130, 280,30);
	 	
		ContactInput= new JTextField();
		ContactInput.setBounds(120,185, 260,30);
		
		MODInput = new JTextField();
		MODInput.setBounds(130,240, 250,30);
		
		radButtonNone = new JRadioButton("NONE");
		radButtonNone.setBounds(100, 300, 80, 21);
		frameAcc.add(radButtonNone);
		
		radButton = new JRadioButton("SENIOR / PWD");
		radButton.setBounds(200, 300, 150, 21);
		frameAcc.add(radButton);
		
		group = new ButtonGroup();
		group.add(radButtonNone);
		group.add(radButton);
		
	 	//Display
	 	 frameAcc.add(customerIDPanel); 
	 	 frameAcc.add(customerNamePanel);
	 	 frameAcc.add(customerAddressPanel);
	 	 frameAcc.add(customerContactPanel); 
	 	 frameAcc.add(customerPayPanel);
	 	 frameAcc.add(customerDiscountPanel);
	 	 frameAcc.add(editButton);
	 	 frameAcc.add(IDInput);
	 	 frameAcc.add(NameInput);
	 	 frameAcc.add(ContactInput);
	 	 frameAcc.add(MODInput);
	 	 frameAcc.add(AddressInput);
	 	//Frame Layout
		 	frameAcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	frameAcc.setSize(400,450);
		 	frameAcc.setLayout(null);
		 	frameAcc.setVisible(true);
	 	
}
}



