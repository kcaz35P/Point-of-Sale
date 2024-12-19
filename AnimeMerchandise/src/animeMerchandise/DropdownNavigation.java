package animeMerchandise;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DropdownNavigation extends GUIDesign {
	protected static JPanel panelPlush;
	protected static JPanel panelFig;
	protected static JPanel panelPost;
	
	protected static JPanel panelManga;
	protected static JPanel panelLN;
	
	protected static JPanel panelHead;
	protected static JPanel panelUpper;
	protected static JPanel panelLower;
	protected static JPanel panelFeet;
	
	public JRadioButton plushButton1;
	public JRadioButton plushButton2;
	public JRadioButton plushButton3;
	
	public JRadioButton figButton1;
	public JRadioButton figButton2;
	public JRadioButton figButton3;
	
	public JRadioButton postButton1;
	public JRadioButton postButton2;
	public JRadioButton postButton3;
	
	public JRadioButton mangaButton1;
	public JRadioButton mangaButton2;
	public JRadioButton mangaButton3;
	
	public JRadioButton LNButton1;
	public JRadioButton LNButton2;
	public JRadioButton LNButton3;
	
	public JRadioButton headButton1;
	public JRadioButton headButton2;
	
	public JRadioButton upperButton1;
	public JRadioButton upperButton2;
	
	public JRadioButton lowerButton1;
	public JRadioButton lowerButton2;
	
	public JRadioButton feetButton1;
	public JRadioButton feetButton2;
	
	protected static GUIDesign contain = new GUIDesign();
	
	public void ItemNavigation(){
		
		panelPlush = new JPanel();
		panelPlush.setBounds(200,160,1080,601);
		panelPlush.setBackground(new Color(0xE5D8BB));
		panelPlush.setLayout(null);
		panelPlush.setVisible(false);
		layeredPanel.add(panelPlush, Integer.valueOf(1));
		
		panelFig = new JPanel();
		panelFig.setBounds(200,160,1080,601);
		panelFig.setBackground(new Color(0xE5D8BB));
		panelFig.setLayout(null);
		panelFig.setVisible(false);
		layeredPanel.add(panelFig, Integer.valueOf(1));
		
		panelPost = new JPanel();
		panelPost.setBounds(200,160,1080,601);
		panelPost.setBackground(new Color(0xE5D8BB));
		panelPost.setLayout(null);
		panelPost.setVisible(false);
		layeredPanel.add(panelPost, Integer.valueOf(1));
		
		panelManga = new JPanel();
		panelManga.setBounds(200,160,1080,601);
		panelManga.setBackground(new Color(0xE5D8BB));
		panelManga.setLayout(null);
		panelManga.setVisible(false);
		layeredPanel.add(panelManga, Integer.valueOf(1));
		
		panelLN = new JPanel();
		panelLN.setBounds(200,160,1080,601);
		panelLN.setBackground(new Color(0xE5D8BB));
		panelLN.setLayout(null);
		panelLN.setVisible(false);
		layeredPanel.add(panelLN, Integer.valueOf(1));
		
		panelHead = new JPanel();
		panelHead.setBounds(200,160,1080,601);
		panelHead.setBackground(new Color(0xE5D8BB));
		panelHead.setLayout(null);
		panelHead.setVisible(false);
		layeredPanel.add(panelHead, Integer.valueOf(1));
		
		panelUpper = new JPanel();
		panelUpper.setBounds(200,160,1080,601);
		panelUpper.setBackground(new Color(0xE5D8BB));
		panelUpper.setLayout(null);
		panelUpper.setVisible(false);
		layeredPanel.add(panelUpper, Integer.valueOf(1));
		
		panelLower = new JPanel();
		panelLower.setBounds(200,160,1080,601);
		panelLower.setBackground(new Color(0xE5D8BB));
		panelLower.setLayout(null);
		panelLower.setVisible(false);
		layeredPanel.add(panelLower, Integer.valueOf(1));
		
		panelFeet = new JPanel();
		panelFeet.setBounds(200,160,1080,601);
		panelFeet.setBackground(new Color(0xE5D8BB));
		panelFeet.setLayout(null);
		panelFeet.setVisible(false);
		layeredPanel.add(panelFeet, Integer.valueOf(1));
	}
	public void DropdownItems() {
		
		contain.plushies1 = new JPanel();
		contain.plushies1.setBounds(20,40,180, 240);
		contain.plushies1.setBackground(Color.white);
		panelPlush.add(contain.plushies1);
		
		contain.plushies2 = new JPanel();
		contain.plushies2.setBounds(230,40,180,240);
		contain.plushies2.setBackground(Color.white);
		panelPlush.add(contain.plushies2);
			
		contain.plushies3 = new JPanel();
		contain.plushies3.setBounds(440,40,180,240);
		contain.plushies3.setBackground(Color.white);
		panelPlush.add(contain.plushies3);
			
		contain.figurines1 = new JPanel();
		contain.figurines1.setBounds(20,40,180, 240);
		contain.figurines1.setBackground(Color.white);
		panelFig.add(contain.figurines1);
			
		contain.figurines2 = new JPanel();
		contain.figurines2.setBounds(230,40,180,240);
		contain.figurines2.setBackground(Color.white);
		panelFig.add(contain.figurines2);
			
		contain.figurines3 = new JPanel();
		contain.figurines3.setBounds(440,40,180,240);
		contain.figurines3.setBackground(Color.white);
		panelFig.add(contain.figurines3);
			
		contain.posters1 = new JPanel();
		contain.posters1.setBounds(20,40,180, 240);
		contain.posters1.setBackground(Color.white);
		panelPost.add(contain.posters1);
			
		contain.posters2 = new JPanel();
		contain.posters2.setBounds(230,40,180,240);
		contain.posters2.setBackground(Color.white);
		panelPost.add(contain.posters2);
			
		contain.posters3 = new JPanel();
		contain.posters3.setBounds(440,40,180,240);
		contain.posters3.setBackground(Color.white);
		panelPost.add(contain.posters3);
			
		//readings
		contain.manga1 = new JPanel();
		contain.manga1.setBounds(20,40,180, 240);
		contain.manga1.setBackground(Color.white);
		panelManga.add(contain.manga1);
			
		contain.manga2 = new JPanel();
		contain.manga2.setBounds(230,40,180,240);
		contain.manga2.setBackground(Color.white);
		panelManga.add(contain.manga2);
			
		contain.manga3 = new JPanel();
		contain.manga3.setBounds(440,40,180,240);
		contain.manga3.setBackground(Color.white);
		panelManga.add(contain.manga3);
			
		contain.LN1 = new JPanel();
		contain.LN1.setBounds(20,40,180, 240);
		contain.LN1.setBackground(Color.white);
		panelLN.add(contain.LN1);
			
		contain.LN2 = new JPanel();
		contain.LN2.setBounds(230,40,180,240);
		contain.LN2.setBackground(Color.white);
		panelLN.add(contain.LN2);
			
		contain.LN3 = new JPanel();
		contain.LN3.setBounds(440,40,180,240);
		contain.LN3.setBackground(Color.white);
		panelLN.add(contain.LN3);
			
		//Cosplay
		contain.head1 = new JPanel();
		contain.head1.setBounds(20,40,180, 240);
		contain.head1.setBackground(Color.white);
		panelHead.add(contain.head1);
			
		contain.head2 = new JPanel();
		contain.head2.setBounds(230,40,180,240);
		contain.head2.setBackground(Color.white);
		panelHead.add(contain.head2);
			
		contain.upper1 = new JPanel();
		contain.upper1.setBounds(20,40,180, 240);
		contain.upper1.setBackground(Color.white);
		panelUpper.add(contain.upper1);
			
		contain.upper2 = new JPanel();
		contain.upper2.setBounds(230,40,180,240);
		contain.upper2.setBackground(Color.white);
		panelUpper.add(contain.upper2);
			
		contain.lower1 = new JPanel();
		contain.lower1.setBounds(20,40,180, 240);
		contain.lower1.setBackground(Color.white);
		panelLower.add(contain.lower1);
			
		contain.lower2 = new JPanel();
		contain.lower2.setBounds(230,40,180,240);
		contain.lower2.setBackground(Color.white);
		panelLower.add(contain.lower2);
			
		contain.feet1 = new JPanel();
		contain.feet1.setBounds(20,40,180, 240);
		contain.feet1.setBackground(Color.white);
		panelFeet.add(contain.feet1);
			
		contain.feet2 = new JPanel();
		contain.feet2.setBounds(230,40,180,240);
		contain.feet2.setBackground(Color.white);
		panelFeet.add(contain.feet2);	
	}
	
}
