package animeMerchandise;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class GUIDesign {
	
	private static GUIFrame frame;
	
	/*
	 * Upper Design
	 */
	private static JPanel panelTop;
	private static JPanel panelLogo;
	private static JPanel panelShohin;
	/*
	 * Left-part Design Opt
	 */
	private static JPanel panelLeft;
	protected static JPanel panelHome;
	private static JPanel panelAcc;
	private static JPanel panelCart;
	
	/*
	 * lower design
	 */
	protected static JPanel panelBuyAdd;
	/*
	 * Decorations
	 */
	private static JPanel panelDeco;
	private static JPanel optFig;
	private static JPanel optPlush;
	private static JPanel optPost;
	/*
	 * Readings
	 */
	private static JPanel panelRead;
	private static JPanel optManga;
	private static JPanel optLN;
	/*
	 * Cosplay
	 */
	private static JPanel panelCos;
	private static JPanel optHead;
	private static JPanel optUpper;
	private static JPanel optLower;
	private static JPanel optFeet;
	
	/*
	 * Layers
	 */
	protected static JPanel layeredHome;
	protected static JPanel layeredAccount;
	protected static JPanel layeredCart;
	protected static JLayeredPane layeredPanel;
	protected static JLayeredPane layeredAddBuy;
	protected static JPanel panelBuy;
	protected static JPanel panelAdd;
	protected static JPanel panelClearAccInfo;
	protected static JPanel panelNormal;
	
	private static JButton buttonDeco;
	private static JButton buttonRead;
	private static JButton buttonCos;
	
	private Image newDropdown;
	private static JLabel labelDropRead;
	private static JLabel labelDropDeco;
	private static JLabel labelDropCos;
	
	/*
	 * panel for sales
	 */
	//Decorations
	public JPanel plushies1;
	public JPanel plushies2;
	public JPanel plushies3;
	public JPanel figurines1;
	public JPanel figurines2;
	public JPanel figurines3;
	public JPanel posters1;
	public JPanel posters2;
	public JPanel posters3;
	//Readings
	public JPanel manga1;
	public JPanel manga2;
	public JPanel manga3;
	public JPanel LN1;
	public JPanel LN2;
	public JPanel LN3;
	//Cosplay
	public JPanel head1;
	public JPanel head2;
	public JPanel upper1;
	public JPanel upper2;
	public JPanel lower1;
	public JPanel lower2;
	public JPanel feet1;
	public JPanel feet2;
	
	private JLabel Display;
	private JPanel panel;
  	private JLabel Display1;
  	private JLabel Display2;
  	private JLabel Display3;
	private JLabel Display4;
	//items
	public JLabel ItemNameLabel;
	public JLabel ItemPrice;
	public JPanel itemSelect;
	protected static ButtonGroup group = new ButtonGroup();
	
	public static void main(String[] args) {
		/*
		 * Calling Methods
		 */
		GUIDesign run = new GUIDesign();
		DropdownNavigation run1= new DropdownNavigation();
		DecoReadCosProducts run3 = new DecoReadCosProducts();
		AnimeMerchandise run2 = new AnimeMerchandise();
		TabularForm newTabularForm = new TabularForm();
		RadButtonCart checkboxes = new RadButtonCart();
		OrderReceipt receipt = new OrderReceipt();
		YourAccount infoAcc = new YourAccount();
		CurrentDateTime date = new CurrentDateTime();
		TransNo runRNG = new TransNo();
		run.Frame();
		run.LayeredPane();
		run1.ItemNavigation();
		run3.productMainPanel();
		run3.DRCProducts();
		run1.DropdownItems();
		run.Panel();
		date.Date();
		runRNG.Rand();
		checkboxes.CheckBoxDeclaration();
		checkboxes.AddCheckBoxDeclaration();
		infoAcc.UserAccountInformation();
		newTabularForm.tablePanel();
		newTabularForm.tableItemAdded();
		run.Buttons();
		run.Label();
		run2.runProducts();
		receipt.customerReceipt();
		run.HomePanel();
		frame.setVisible(true);
	}
	
	
	void Frame(){
		frame = new GUIFrame();
	}

	void Panel() {
		
		/*
		 * Top Panel
		 */
		
		panelTop = new JPanel();
		panelTop.setBounds(200,0,1065,80);
		panelTop.setBackground(new Color(128,0,0));
		panelTop.setLayout(null);
		frame.add(panelTop);
		
		panelLogo = new JPanel();
		panelLogo.addMouseListener(new clickIconMouse(panelLogo));
		panelLogo.setBounds(0, 0, 200, 160);
		panelLogo.setBackground(new Color(0xb4a750));
		panelLogo.setLayout(null);
		frame.add(panelLogo);
		
		panelShohin = new JPanel();
		panelShohin.setBounds(20,90,150,55);
		panelShohin.setOpaque(false);
		panelLogo.add(panelShohin);
		
		/*
		 * This the Panel for the left side options
		 */
		panelLeft = new JPanel();
		panelLeft.setBounds(0,0,200,720);
		panelLeft.setBackground(new Color(0xb4a750));
		panelLeft.setLayout(null);
		frame.getContentPane().add(panelLeft);
		
		panelHome = new JPanel();
		panelHome.addMouseListener(new PanelButtonMouseAdapter(panelHome));
		panelHome.setBounds(0,160,200,140);
		panelHome.setBackground(new Color(0xb4a750));
		panelHome.setBorder(BorderFactory.createEtchedBorder());
		panelHome.setLayout(null);
		panelLeft.add(panelHome);
		
		panelAcc = new JPanel();
		panelAcc.addMouseListener(new PanelButtonMouseAdapter(panelAcc));
		panelAcc.setBounds(0,300,200,140);
		panelAcc.setBackground(new Color(0xb4a750));
		panelAcc.setBorder(BorderFactory.createEtchedBorder());
		panelAcc.setLayout(null);
		panelLeft.add(panelAcc);
		
		panelCart = new JPanel();
		panelCart.addMouseListener(new PanelButtonMouseAdapter(panelCart));
		panelCart.setBounds(0,440,200,140);
		panelCart.setBackground(new Color(0xb4a750));
		panelCart.setBorder(BorderFactory.createEtchedBorder());
		panelCart.setLayout(null);
		panelLeft.add(panelCart);
		
		/*
		 * lower panel
		 */
		panelBuy = new JPanel();
		panelBuy.setBounds(0,0,1065,610);
		panelBuy.setLayout(null);
		panelBuy.setVisible(false);
		panelBuy.setBackground(new Color(0xa21420));
		layeredAddBuy.add(panelBuy,Integer.valueOf(1));
		
		panelAdd = new JPanel();
		panelAdd.setBounds(0,0,1065,610);
		panelAdd.setLayout(null);
		panelAdd.setVisible(false);
		panelAdd.setBackground(new Color(0xa21420));
		layeredAddBuy.add(panelAdd,Integer.valueOf(1));
		
		panelClearAccInfo = new JPanel();
		panelClearAccInfo.setBounds(0,0,1065,610);
		panelClearAccInfo.setLayout(null);
		panelClearAccInfo.setVisible(false);
		panelClearAccInfo.setBackground(new Color(0xa21420));
		layeredAddBuy.add(panelClearAccInfo,Integer.valueOf(1));
		
		panelNormal = new JPanel();
		panelNormal.setBounds(0,0,1065,610);
		panelNormal.setLayout(null);
		panelNormal.setBackground(new Color(0xa21420));
		layeredAddBuy.add(panelNormal,Integer.valueOf(0));
		
	
		/*
		 * Subclasses panel
		 */
		panelDeco = new JPanel();
		panelDeco.setBounds(279,0,80,80);
		panelDeco.setBackground(new Color(0xa21420));
		panelDeco.setBorder(BorderFactory.createEtchedBorder());
		panelDeco.setLayout(null);
		panelDeco.addMouseListener(new clickIconMouse(panelDeco));
		panelTop.add(panelDeco);
		
		panelRead = new JPanel();
		panelRead.setBounds(634,0,80,80);
		panelRead.setBackground(new Color(0xa21420));
		panelRead.setBorder(BorderFactory.createEtchedBorder());
		panelRead.setLayout(null);
		panelRead.addMouseListener(new clickIconMouse(panelDeco));
		panelTop.add(panelRead);
		
		panelCos = new JPanel();
		panelCos.setBounds(984,0,80,80);
		panelCos.setBackground(new Color(0xa21420));
		panelCos.setBorder(BorderFactory.createEtchedBorder());
		panelCos.setLayout(null);
		panelCos.addMouseListener(new clickIconMouse(panelDeco));
		panelTop.add(panelCos);
		
		/*
		 * Navigation
		 */

		optPlush = new JPanel();
		optPlush.setBounds(201,160,280,50);
		optPlush.setBackground(new Color(0xEE4B2B));
		optPlush.setVisible(false);
		optPlush.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optPlush.addMouseListener(new PanelButtonMouseAdapter(optPlush));
		layeredPanel.add(optPlush,Integer.valueOf(6));
		
		optFig = new JPanel();
		optFig.setBounds(202,210,280,50);
		optFig.setBackground(new Color(0xEE4B2B));
		optFig.setVisible(false);
		optFig.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optFig.addMouseListener(new PanelButtonMouseAdapter(optFig));
		layeredPanel.add(optFig,Integer.valueOf(6));
		
		optPost = new JPanel();
		optPost.setBounds(203,260,280,50);
		optPost.setBackground(new Color(0xEE4B2B));
		optPost.setVisible(false);
		optPost.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optPost.addMouseListener(new PanelButtonMouseAdapter(optPost));
		layeredPanel.add(optPost,Integer.valueOf(6));
		
		optManga = new JPanel();
		optManga.setBounds(559,160,278,50);
		optManga.setBackground(new Color(0xEE4B2B));
		optManga.setVisible(false);
		optManga.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optManga.addMouseListener(new PanelButtonMouseAdapter(optManga));
		layeredPanel.add(optManga,Integer.valueOf(6));
		
		optLN = new JPanel();
		optLN.setBounds(560,210,278,50);
		optLN.setBackground(new Color(0xEE4B2B));
		optLN.setVisible(false);
		optLN.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optLN.addMouseListener(new PanelButtonMouseAdapter(optLN));
		layeredPanel.add(optLN,Integer.valueOf(6));
		
		optHead = new JPanel();
		optHead.setBounds(911,160,275,50);
		optHead.setBackground(new Color(0xEE4B2B));
		optHead.setVisible(false);
		optHead.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optHead.addMouseListener(new PanelButtonMouseAdapter(optHead));
		layeredPanel.add(optHead,Integer.valueOf(6));
		
		optUpper = new JPanel();
		optUpper.setBounds(912,210,275,50);
		optUpper.setBackground(new Color(0xEE4B2B));
		optUpper.setVisible(false);
		optUpper.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optUpper.addMouseListener(new PanelButtonMouseAdapter(optUpper));
		layeredPanel.add(optUpper,Integer.valueOf(6));
		
		optLower = new JPanel();
		optLower.setBounds(913,260,275,50);
		optLower.setBackground(new Color(0xEE4B2B));
		optLower.setVisible(false);
		optLower.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optLower.addMouseListener(new PanelButtonMouseAdapter(optLower));
		layeredPanel.add(optLower,Integer.valueOf(6));
		
		optFeet = new JPanel();
		optFeet.setBounds(914,310,275,50);
		optFeet.setBackground(new Color(0xEE4B2B));
		optFeet.setVisible(false);
		optFeet.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		optFeet.addMouseListener(new PanelButtonMouseAdapter(optFeet));
		layeredPanel.add(optFeet,Integer.valueOf(6));
		
		/*
		 * LayeredPane Panels
		 */
		layeredHome = new JPanel();
		layeredHome.setBounds(200,160,1080,601);
		layeredHome.setBackground(Color.white);
		layeredHome.setLayout(null);
		layeredPanel.add(layeredHome, Integer.valueOf(0));
		
		layeredAccount = new JPanel();
		layeredAccount.setBounds(200,160,1080,601);
		layeredAccount.setBackground(Color.white);
		layeredAccount.setLayout(null);
		layeredAccount.setVisible(false);
		layeredPanel.add(layeredAccount, Integer.valueOf(0));
		
		layeredCart = new JPanel();
		layeredCart.setBounds(200,160,1080,601);
		layeredCart.setBackground(Color.white);
		layeredCart.setVisible(false);
		layeredCart.setLayout(null);
		layeredPanel.add(layeredCart, Integer.valueOf(0));
		
	}
	
	void Label() {
		/*
		 * Label Images for Header
		 */
		Image ShohinLogo = new ImageIcon(this.getClass().getResource("/Shohin Logo.png")).getImage();
		JLabel Logo = new JLabel();
		Logo.setBounds(45,20,100,100);
		Logo.setIcon(new ImageIcon(ShohinLogo));
		panelLogo.add(Logo);
			
		Image CorporationName = new ImageIcon(this.getClass().getResource("/CorporationName.png")).getImage();
		JLabel CorpsName = new JLabel();
		CorpsName.setBounds(50,50,50,50);
		CorpsName.setIcon(new ImageIcon(CorporationName));
		panelShohin.add(CorpsName);
		
		/*
		 * Labels Texts & Images for left side options
		 */
		Image HomeIcon = new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		Image newHomeIcon = HomeIcon.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
		JLabel labelHome = new JLabel();
		labelHome.setIcon(new ImageIcon(newHomeIcon));
		labelHome.setBounds(0,0,200,140);
		labelHome.setText("HOME");
		labelHome.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelHome.setForeground(Color.black);
		labelHome.setHorizontalAlignment(JLabel.CENTER);
		labelHome.setVerticalAlignment(JLabel.CENTER);
		labelHome.setHorizontalTextPosition(JLabel.CENTER);
		labelHome.setVerticalTextPosition(JLabel.BOTTOM);
		panelHome.add(labelHome);
		
		Image AccIcon = new ImageIcon(this.getClass().getResource("/Account.png")).getImage();
		Image newAccIcon = AccIcon.getScaledInstance(80,80,Image.SCALE_SMOOTH);
		JLabel labelAcc = new JLabel();
		labelAcc.setIcon(new ImageIcon(newAccIcon));
		labelAcc.setBounds(0,0,200,140);
		labelAcc.setText("Your Account");
		labelAcc.setFont(new Font("Century Schoolbook", Font.BOLD,20 ));
		labelAcc.setForeground(Color.black);
		labelAcc.setHorizontalAlignment(JLabel.CENTER);
		labelAcc.setVerticalAlignment(JLabel.CENTER);
		labelAcc.setHorizontalTextPosition(JLabel.CENTER);
		labelAcc.setVerticalTextPosition(JLabel.BOTTOM);
		panelAcc.add(labelAcc);
		
		Image CartIcon = new ImageIcon(this.getClass().getResource("/Cart.png")).getImage();
		Image newCartIcon = CartIcon.getScaledInstance(80,80,Image.SCALE_SMOOTH);
		JLabel labelCart = new JLabel();
		labelCart.setIcon(new ImageIcon(newCartIcon));
		labelCart.setBounds(0,0,200,140);
		labelCart.setText("Your Order(s)");
		labelCart.setFont(new Font("Century Schoolbook", Font.BOLD,20 ));
		labelCart.setForeground(Color.black);
		labelCart.setHorizontalAlignment(JLabel.CENTER);
		labelCart.setVerticalAlignment(JLabel.CENTER);
		labelCart.setHorizontalTextPosition(JLabel.CENTER);
		labelCart.setVerticalTextPosition(JLabel.BOTTOM);
		panelCart.add(labelCart);
		
		Image dropdown = new ImageIcon(this.getClass().getResource("/dropdown.png")).getImage();
		newDropdown = dropdown.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		
		
		labelDropDeco = new JLabel();
		labelDropDeco.setIcon(new ImageIcon(newDropdown));
		labelDropDeco.setHorizontalAlignment(JLabel.CENTER);
		labelDropDeco.setVerticalAlignment(JLabel.CENTER);
		labelDropDeco.setBounds(0,0,80,80);
		panelDeco.add(labelDropDeco);
		
		labelDropRead = new JLabel();
		labelDropRead.setIcon(new ImageIcon(newDropdown));
		labelDropRead.setHorizontalAlignment(JLabel.CENTER);
		labelDropRead.setVerticalAlignment(JLabel.CENTER);
		labelDropRead.setBounds(0,0,80,80);
		panelRead.add(labelDropRead);
		
		labelDropCos = new JLabel();
		labelDropCos.setIcon(new ImageIcon(newDropdown));
		labelDropCos.setHorizontalAlignment(JLabel.CENTER);
		labelDropCos.setVerticalAlignment(JLabel.CENTER);
		labelDropCos.setBounds(0,0,80,80);
		panelCos.add(labelDropCos);
		
		JLabel labelOptPlush = new JLabel("PLUSHIES");
		labelOptPlush.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptPlush.setForeground(Color.white);
		optPlush.add(labelOptPlush);
		
		JLabel labelOptFig = new JLabel("FIGURINES");
		labelOptFig.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptFig.setForeground(Color.white);
		optFig.add(labelOptFig);
		
		JLabel labelOptPost = new JLabel("POSTERS");
		labelOptPost.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptPost.setVerticalTextPosition(JLabel.CENTER);
		labelOptPost.setForeground(Color.white);
		optPost.add(labelOptPost);
		
		JLabel labelOptManga = new JLabel("MANGA");
		labelOptManga.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptManga.setVerticalTextPosition(JLabel.CENTER);
		labelOptManga.setForeground(Color.white);
		optManga.add(labelOptManga);
		
		JLabel labelOptLN = new JLabel("LIGHT NOVEL");
		labelOptLN.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptLN.setVerticalTextPosition(JLabel.CENTER);
		labelOptLN.setForeground(Color.white);
		optLN.add(labelOptLN);
		
		JLabel labelOptHead = new JLabel("HEADGEAR");
		labelOptHead.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptHead.setVerticalTextPosition(JLabel.CENTER);
		labelOptHead.setForeground(Color.white);
		optHead.add(labelOptHead);
		
		JLabel labelOptUpper = new JLabel("UPPER BODY");
		labelOptUpper.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptUpper.setVerticalTextPosition(JLabel.CENTER);
		labelOptUpper.setForeground(Color.white);
		optUpper.add(labelOptUpper);
		
		JLabel labelOptLower = new JLabel("LOWER BODY");
		labelOptLower.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptLower.setVerticalTextPosition(JLabel.CENTER);
		labelOptLower.setForeground(Color.white);
		optLower.add(labelOptLower);
		
		JLabel labelOptFeet = new JLabel("FOOTWEAR");
		labelOptFeet.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		labelOptFeet.setVerticalTextPosition(JLabel.CENTER);
		labelOptFeet.setForeground(Color.white);
		optFeet.add(labelOptFeet);
	}
	
	void LayeredPane() {
		layeredPanel = new JLayeredPane();
		layeredPanel.setBounds(0,-80,1264,700);
		frame.add(layeredPanel);
		
		layeredAddBuy = new JLayeredPane();
		layeredAddBuy.setBounds(200,620,1064,61);
		layeredAddBuy.setBackground(Color.black);
		frame.add(layeredAddBuy);
		
	}
	void layersVisibility() {
		layeredHome.setVisible(false);
		layeredAccount.setVisible(false);
		layeredCart.setVisible(false);
		
		DecoReadCosProducts.layeredDeco.setVisible(false);
		DecoReadCosProducts.layeredRead.setVisible(false);
		DecoReadCosProducts.layeredCos.setVisible(false);
		
		DropdownNavigation.panelPlush.setVisible(false);
		DropdownNavigation.panelFig.setVisible(false);
		DropdownNavigation.panelPost.setVisible(false);
		
		DropdownNavigation.panelManga.setVisible(false);
		DropdownNavigation.panelLN.setVisible(false);
		
		DropdownNavigation.panelHead.setVisible(false);
		DropdownNavigation.panelUpper.setVisible(false);
		DropdownNavigation.panelLower.setVisible(false);
		DropdownNavigation.panelFeet.setVisible(false);
		
		optPlush.setVisible(false);
		optFig.setVisible(false);
		optPost.setVisible(false);
		optLN.setVisible(false);
		optManga.setVisible(false);
		optHead.setVisible(false);
		optUpper.setVisible(false);
		optLower.setVisible(false);
		optFeet.setVisible(false);
		
		labelDropDeco.setIcon(new ImageIcon(newDropdown));
		labelDropRead.setIcon(new ImageIcon(newDropdown));
		labelDropCos.setIcon(new ImageIcon(newDropdown));
		
		panelBuy.setVisible(false);
		panelAdd.setVisible(false);
		panelClearAccInfo.setVisible(false);
		
		TabularForm.addButton.setEnabled(true);
		OrderReceipt.buyButton.setEnabled(false);
	}
	void Buttons() {
		buttonDeco = new JButton("Decorations");
		buttonDeco.setBounds(0,0,280,80);
		buttonDeco.setBackground(new Color(0xa21420));
		buttonDeco.setFocusable(false);
		buttonDeco.setForeground(Color.white);
		buttonDeco.setFont(new Font("Serif", Font.BOLD,30));
		buttonDeco.setBorder(BorderFactory.createEtchedBorder());
		panelTop.add(buttonDeco);
		buttonDeco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonDeco) {
					layersVisibility();
					panelAdd.setVisible(true);
					DecoReadCosProducts.layeredDeco.setVisible(true);
				}
				
			}
		});
		buttonRead = new JButton("Readings");
		buttonRead.setBounds(358,0,278,80);
		buttonRead.setBackground(new Color(0xa21420));
		buttonRead.setFocusable(false);
		buttonRead.setForeground(Color.white);
		buttonRead.setFont(new Font("Serif", Font.BOLD,30));
		buttonRead.setBorder(BorderFactory.createEtchedBorder());
		panelTop.add(buttonRead);
		buttonRead.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonRead) {
					layersVisibility();
					panelAdd.setVisible(true);
					DecoReadCosProducts.layeredRead.setVisible(true);
				}
				
			}
			
		});
		buttonCos = new JButton("Cosplay");
		buttonCos.setBounds(710,0,275,80);
		buttonCos.setBackground(new Color(0xa21420));
		buttonCos.setFocusable(false);
		buttonCos.setForeground(Color.white);
		buttonCos.setFont(new Font("Serif", Font.BOLD,30));
		buttonCos.setBorder(BorderFactory.createEtchedBorder());
		panelTop.add(buttonCos);
		buttonCos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonCos) {
					layersVisibility();
					panelAdd.setVisible(true);
					DecoReadCosProducts.layeredCos.setVisible(true);
				}
				
			}
			
		});
	}
	/*
	 * Mouse Listener for the leftOpt & drop down
	 */
	
	private class clickIconMouse extends MouseAdapter{
		int dropIdentifierDeco = 0;
		int dropIdentifierRead = 0;
		int dropIdentifierCos = 0;
		public clickIconMouse(JPanel mousePanel) {
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			Image dropUp = new ImageIcon(this.getClass().getResource("/dropup.png")).getImage();
			Image newDropUp = dropUp.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			if(e.getSource()==panelLogo) {
				
				layersVisibility();
				panelNormal.setVisible(true);
				TabularForm.addButton.setEnabled(false);
				layeredHome.setVisible(true);
				
			}
			else if (dropIdentifierDeco == 1) {
				labelDropDeco.setIcon(new ImageIcon(newDropdown));
				optPlush.setVisible(false);
				optFig.setVisible(false);
				optPost.setVisible(false);
				dropIdentifierDeco = 0;
				dropIdentifierRead = 0;
				dropIdentifierCos = 0;
			}
			else if (e.getSource() == panelDeco) {
				optPlush.setVisible(true);
				optFig.setVisible(true);
				optPost.setVisible(true);
				optLN.setVisible(false);
				optManga.setVisible(false);
				optHead.setVisible(false);
				optUpper.setVisible(false);
				optLower.setVisible(false);
				optFeet.setVisible(false);
				labelDropDeco.setIcon(new ImageIcon(newDropUp));
				labelDropRead.setIcon(new ImageIcon(newDropdown));
				labelDropCos.setIcon(new ImageIcon(newDropdown));
				dropIdentifierDeco = 1;
				dropIdentifierRead = 0;
				dropIdentifierCos = 0;
			}
			else if (dropIdentifierRead == 1) {
				labelDropRead.setIcon(new ImageIcon(newDropdown));
				optLN.setVisible(false);
				optManga.setVisible(false);
				dropIdentifierDeco = 0;
				dropIdentifierRead = 0;
				dropIdentifierCos = 0;
			}
			else if (e.getSource() == panelRead) {
				optPlush.setVisible(false);
				optFig.setVisible(false);
				optPost.setVisible(false);
				optLN.setVisible(true);
				optManga.setVisible(true);
				optHead.setVisible(false);
				optUpper.setVisible(false);
				optLower.setVisible(false);
				optFeet.setVisible(false);
				labelDropDeco.setIcon(new ImageIcon(newDropdown));
				labelDropRead.setIcon(new ImageIcon(newDropUp));
				labelDropCos.setIcon(new ImageIcon(newDropdown));
				dropIdentifierDeco = 0;
				dropIdentifierRead = 1;
				dropIdentifierCos = 0;
			}
			else if (dropIdentifierCos== 1) {
				labelDropCos.setIcon(new ImageIcon(newDropdown));
				optHead.setVisible(false);
				optUpper.setVisible(false);
				optLower.setVisible(false);
				optFeet.setVisible(false);
				dropIdentifierDeco = 0;
				dropIdentifierRead = 0;
				dropIdentifierCos = 0;
			}
			else if (e.getSource() == panelCos) {
				optPlush.setVisible(false);
				optFig.setVisible(false);
				optPost.setVisible(false);
				optLN.setVisible(false);
				optManga.setVisible(false);
				optHead.setVisible(true);
				optUpper.setVisible(true);
				optLower.setVisible(true);
				optFeet.setVisible(true);
				labelDropDeco.setIcon(new ImageIcon(newDropdown));
				labelDropRead.setIcon(new ImageIcon(newDropdown));
				labelDropCos.setIcon(new ImageIcon(newDropUp));
				dropIdentifierDeco = 0;
				dropIdentifierRead = 0;
				dropIdentifierCos = 1;
			}

		}
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel mousePanel;
		public PanelButtonMouseAdapter(JPanel mousePanel) {
			this.mousePanel = mousePanel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getSource() == panelHome || e.getSource() == panelAcc || e.getSource() == panelCart) {
				mousePanel.setBackground(Color.white);
				mousePanel.setBorder(BorderFactory.createLineBorder(null, 3));
			}
			else {
				mousePanel.setBackground(Color.black);
			}
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getSource() == panelHome || e.getSource() == panelAcc || e.getSource() == panelCart) {
				mousePanel.setBackground(new Color(0xb4a750));
				mousePanel.setBorder(BorderFactory.createEtchedBorder());
			}else if(e.getSource() == panelDeco || e.getSource() == panelRead || e.getSource() == panelCos) {
				mousePanel.setBackground(new Color(0xa21420));
			}
			else {
				mousePanel.setBackground(new Color(0xEE4B2B));
			}
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			mousePanel.setBackground(Color.black);
			
			if(e.getSource() == panelHome) {
				layersVisibility();
				panelNormal.setVisible(true);
				layeredHome.setVisible(true);
				TabularForm.addButton.setEnabled(false);
				
			}
			else if (e.getSource() == panelAcc) {
				layersVisibility();
				panelNormal.setVisible(true);
				layeredAccount.setVisible(true);
				panelClearAccInfo.setVisible(true);
				TabularForm.addButton.setEnabled(false);
			}
			else if (e.getSource() == panelCart) {
				layersVisibility();
				panelBuy.setVisible(true);
				layeredCart.setVisible(true);
				TabularForm.addButton.setEnabled(false);
				OrderReceipt.buyButton.setEnabled(true);
			}
			else if (e.getSource() == optPlush) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelPlush.setVisible(true);
				
			}
			else if (e.getSource() == optFig) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelFig.setVisible(true);
				DropdownNavigation.panelPost.setVisible(false);
			}
			else if (e.getSource() == optPost) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelPost.setVisible(true);
			}
			else if (e.getSource() == optManga) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelManga.setVisible(true);
			}
			else if (e.getSource() == optLN) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelLN.setVisible(true);
			}
			else if (e.getSource() == optHead) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelHead.setVisible(true);
			}
			
			else if (e.getSource() == optUpper) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelUpper.setVisible(true);
			}
			else if (e.getSource() == optLower) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelLower.setVisible(true);
			}
			else if (e.getSource() == optFeet) {
				layersVisibility();
				panelAdd.setVisible(true);
				DropdownNavigation.panelFeet.setVisible(true);
			}
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			if(e.getSource() == panelHome || e.getSource() == panelAcc || e.getSource() == panelCart) {
				mousePanel.setBackground(Color.white);
			}
			else {
				mousePanel.setBackground(new Color(0xa21420));
			}
		}
	}
	
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JRadioButton r1,r2,r3;
	Thread th;
	public void HomePanel() {

		r1 = new JRadioButton();
		r1.setBounds(404, 178, 21, 21);
		r1.setOpaque(false);
		layeredHome.add(r1);
		
		r2 = new JRadioButton();
		r2.setBounds(513, 178, 21, 21);
		r2.setOpaque(false);
		layeredHome.add(r2);
		
		r3 = new JRadioButton();
		r3.setBounds(622, 178, 21, 21);
		r3.setOpaque(false);
		layeredHome.add(r3);
		
		lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/New Year.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(139, 11, 783, 192);
		layeredHome.add(lblNewLabel);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 220, 298, 320);
		layeredHome.add(scrollPane);
		
		Display = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/Display.png")).getImage();
		Image newimg4 = img4.getScaledInstance( 290, 450,Image.SCALE_SMOOTH);
		Display.setIcon(new ImageIcon(newimg4));
		scrollPane.setViewportView(Display);
		
		panel = new JPanel();
		panel.setBackground(new Color(165, 42, 42));
		panel.setBounds(0, 0, 1064, 211);
		layeredHome.add(panel);
		panel.setLayout(null);
		
		
		Display1 = new JLabel();
		Image ImageIcon = new ImageIcon(this.getClass().getResource("/Naruto Top Cosplay.JPG")).getImage();
		Image newImageIcon = ImageIcon.getScaledInstance(190,255,Image.SCALE_SMOOTH);
		Display1 = new JLabel();
		Display1.setIcon(new ImageIcon(newImageIcon));
		Display1.setText("Naruto Ninja Track Suit");
		Display1.setHorizontalAlignment(JLabel.CENTER);
		Display1.setVerticalAlignment(JLabel.CENTER);
		Display1.setHorizontalTextPosition(JLabel.CENTER);
		Display1.setVerticalTextPosition(JLabel.BOTTOM);
		Display1.setBackground(Color.white);
		Display1.setBounds(503, 250, 173, 293);
		layeredHome.add(Display1);
		
		Display2 = new JLabel();
		Image ImageIcon2 = new ImageIcon(this.getClass().getResource("/Luffy Figurine.JPG")).getImage();
		Image newImageIcon2 = ImageIcon2.getScaledInstance(190,255,Image.SCALE_SMOOTH);
		Display2 = new JLabel();
		Display2.setIcon(new ImageIcon(newImageIcon2));
		Display2.setText("Monkey D. Luffy Action Figure");
		Display2.setHorizontalAlignment(JLabel.CENTER);
		Display2.setVerticalAlignment(JLabel.CENTER);
		Display2.setHorizontalTextPosition(JLabel.CENTER);
		Display2.setVerticalTextPosition(JLabel.BOTTOM);
		Display2.setBackground(new Color(107, 142, 35));
		Display2.setBounds(686, 250, 173, 293);
		layeredHome.add(Display2);
		
		Display3 = new JLabel();
		Image ImageIcon3 = new ImageIcon(this.getClass().getResource("/Naruto Shippuden Kakashi LN.JPG")).getImage();
		Image newImageIcon3 = ImageIcon3.getScaledInstance(190,255,Image.SCALE_SMOOTH);
		Display3 = new JLabel();
		Display3.setIcon(new ImageIcon(newImageIcon3));
		Display3.setText("Kakashi's Story Light Novel");
		Display3.setHorizontalAlignment(JLabel.CENTER);
		Display3.setVerticalAlignment(JLabel.CENTER);
		Display3.setHorizontalTextPosition(JLabel.CENTER);
		Display3.setVerticalTextPosition(JLabel.BOTTOM);
		Display3.setBackground(new Color(107, 142, 35));
		Display3.setBounds(869, 250, 173, 293);
		layeredHome.add(Display3);
		
		Display4 = new JLabel();
		Image ImageIcon4 = new ImageIcon(this.getClass().getResource("/Dragon Ball Poster.JPG")).getImage();
		Image newImageIcon4 = ImageIcon4.getScaledInstance(190,255,Image.SCALE_SMOOTH);
		Display4 = new JLabel();
		Display4.setIcon(new ImageIcon(newImageIcon4));
		Display4.setText("Vintage Paint Dragon Ball");
		Display4.setHorizontalAlignment(JLabel.CENTER);
		Display4.setVerticalAlignment(JLabel.CENTER);
		Display4.setHorizontalTextPosition(JLabel.CENTER);
		Display4.setVerticalTextPosition(JLabel.BOTTOM);
		Display4.setBackground(new Color(255, 255, 255));
		Display4.setBounds(318, 250, 173, 293);
		layeredHome.add(Display4);
		
		JTextPane txtpnHotItem = new JTextPane();
		txtpnHotItem.setForeground(new Color(255, 255, 255));
		txtpnHotItem.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		txtpnHotItem.setText("HOT ITEMS :");
		txtpnHotItem.setBackground(new Color(255, 165, 0));
		txtpnHotItem.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnHotItem.setBounds(323, 220, 719, 30);
		layeredHome.add(txtpnHotItem);
		
		
		
		th = new Thread(rr);
		th.start();
	}
	
   Runnable rr=()->{
	   		
	   		try {
	   			while(true){
	   				Thread.sleep(3000);
	   				Image img = new ImageIcon(this.getClass().getResource("/SLOT 2.png")).getImage();
	   				lblNewLabel.setIcon(new ImageIcon(img));
	   				r1.setSelected(false);
	   				r3.setSelected(false);
	   				r2.setSelected(true);
	   				
	   				Thread.sleep(3000);
	   				Image img2 = new ImageIcon(this.getClass().getResource("/SLOT 3.png")).getImage();
	   				lblNewLabel.setIcon(new ImageIcon(img2));
	   				r1.setSelected(false);
	   				r2.setSelected(false);
	   				r3.setSelected(true);
	   				
	   				Thread.sleep(3000);
	   				Image img3 = new ImageIcon(this.getClass().getResource("/New Year.png")).getImage();
	   				lblNewLabel.setIcon(new ImageIcon(img3));
	   				r2.setSelected(false);
	   				r3.setSelected(false);
	   				r1.setSelected(true);
	   				continue;
	   			}
	   		}
	   		catch(Exception e)
	   		{
	   			
	   		}
	   
	   
   };


}
