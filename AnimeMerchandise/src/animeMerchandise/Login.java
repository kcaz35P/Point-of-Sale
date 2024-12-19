package animeMerchandise;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	
	protected static JFrame loginFrame = new JFrame();
	
	
	private static JLabel Logo;
	private static JLabel Wallpaper;
	void loginFrame() {
		loginFrame.setTitle("Anime Merchandise");
		loginFrame.setSize(800,500);
		loginFrame.setResizable(false);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setLayout(null);
		Image ShohinLogo = new ImageIcon(this.getClass().getResource("/Shohin Logo.png")).getImage();
		loginFrame.setIconImage(ShohinLogo);
		loginFrame.getContentPane().setBackground(Color.white);
	}
	void ImageLogin() {
		Image WallpaperPic = new ImageIcon(this.getClass().getResource("/sakura.png")).getImage();
		Image newWallpaperIcon = WallpaperPic.getScaledInstance(800,500,Image.SCALE_SMOOTH);
		Wallpaper = new JLabel();
		Wallpaper.setBounds(0,0,800,500);
		Wallpaper.setIcon(new ImageIcon(newWallpaperIcon));
		
		Image ShohinLogo = new ImageIcon(this.getClass().getResource("/LOGINLOGO.png")).getImage();
		Image newShohinIcon = ShohinLogo.getScaledInstance(300, 300,Image.SCALE_SMOOTH);
		Logo = new JLabel();
		Logo.setBounds(-10,0,300,300);
		Logo.setIcon(new ImageIcon(newShohinIcon));
			
	}
	public static void main(String[] args) {
		
		Login run = new Login();
		run.loginFrame();
		run.ImageLogin();
		
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(0,0,300,700);
		rightPanel.setBackground(new Color(0xFFE5B4));
		rightPanel.setLayout(null);
		loginFrame.add(rightPanel);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 270, 300, 200);
		loginPanel.setBackground(new Color(0xFFE5B4));
		loginPanel.setLayout(null);
		rightPanel.add(loginPanel);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBounds(10, -20, 300, 300);
		panelLogo.setOpaque(false);
		panelLogo.setLayout(null);
		rightPanel.add(panelLogo);
		panelLogo.add(Logo);
		
		JLabel animeWallpaper = new JLabel();
		animeWallpaper.setBounds(0,0,980,720);
		loginFrame.add(animeWallpaper);
		animeWallpaper.add(Wallpaper);
		
		JLabel userLabel = new JLabel("USERNAME:");
		userLabel.setBounds(10,50,80,25);
		loginPanel.add(userLabel);
		
		JTextField textfield = new JTextField();
		textfield.setBounds(100,50,165,25);
		loginPanel.add(textfield);
		
		JLabel passLabel = new JLabel("PASSWORD:");
		passLabel.setBounds(10,80,80,25);
		loginPanel.add(passLabel);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(100,80,165,25);
		loginPanel.add(password);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(100,120,80,25);
		loginButton.setFocusable(false);
		loginButton.setBorder(BorderFactory.createEtchedBorder());
		loginPanel.add(loginButton);
		
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String user = textfield.getText();
				String pass = password.getText();
				int counter =0;
				
					if(user.equals("Customer") && pass.equals("123456")) {
						JOptionPane.showMessageDialog(loginFrame, "LOG-IN SUCCESSFUL");
						GUIDesign.main(args);
						loginFrame.dispose();
					}
					else if(user != "Customer" && pass !="123456") {
						for(int i=0;i<4;) {
						JOptionPane.showMessageDialog(loginFrame, "LOG-IN FAILED!");
						JOptionPane.showMessageDialog(loginFrame, "You have " + (2-counter) + " attempt(s) left (Maximum of 3 attempts)");
						counter++;
						
						if(counter==3) {
							JOptionPane.showMessageDialog(loginButton, "(Windows Closing)");
							loginFrame.dispose();
						}
							break;
						}
					}
				
			}
		});
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.setBounds(185,120,80,25);
		cancelButton.setFocusable(false);
		cancelButton.setBorder(BorderFactory.createEtchedBorder());
		loginPanel.add(cancelButton);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(null);
				password.setText(null);
			}
		});
		
		loginFrame.setVisible(true);
	}

}
