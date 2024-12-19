package animeMerchandise;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class DecoReadCosProducts extends GUIDesign{
	protected static JPanel layeredDeco;
	protected static JPanel layeredRead;
	protected static JPanel layeredCos;
	
	public JRadioButton plushButton1x;
	public JRadioButton plushButton2x;
	public JRadioButton plushButton3x;
	
	public JRadioButton figButton1x;
	public JRadioButton figButton2x;
	public JRadioButton figButton3x;
	
	public JRadioButton postButton1x;
	public JRadioButton postButton2x;
	public JRadioButton postButton3x;
	
	public JRadioButton mangaButton1x;
	public JRadioButton mangaButton2x;
	public JRadioButton mangaButton3x;
	
	public JRadioButton LNButton1x;
	public JRadioButton LNButton2x;
	public JRadioButton LNButton3x;
	
	public JRadioButton headButton1x;
	public JRadioButton headButton2x;
	
	public JRadioButton upperButton1x;
	public JRadioButton upperButton2x;
	
	public JRadioButton lowerButton1x;
	public JRadioButton lowerButton2x;
	
	public JRadioButton feetButton1x;
	public JRadioButton feetButton2x;
	protected static GUIDesign contain2 = new GUIDesign();
	
	public void productMainPanel() {
		layeredDeco = new JPanel();
		layeredDeco.setBounds(200,160,1080,601);
		layeredDeco.setBackground(new Color(0xE5D8BB));
		layeredDeco.setLayout(null);
		layeredDeco.setVisible(false);
		layeredPanel.add(layeredDeco, Integer.valueOf(0));
		
		layeredRead = new JPanel();
		layeredRead.setBounds(200,160,1080,601);
		layeredRead.setBackground(new Color(0xE5D8BB));
		layeredRead.setLayout(null);
		layeredRead.setVisible(false);
		layeredPanel.add(layeredRead, Integer.valueOf(0));
		
		layeredCos = new JPanel();
		layeredCos.setBounds(200,160,1080,601);
		layeredCos.setBackground(new Color(0xE5D8BB));
		layeredCos.setLayout(null);
		layeredCos.setVisible(false);
		layeredPanel.add(layeredCos, Integer.valueOf(0));
	}
	
	
	public void DRCProducts(){
	
		contain2.plushies1 = new JPanel();
		contain2.plushies1.setBounds(20,20,180, 240);
		contain2.plushies1.setBackground(Color.white);
		layeredDeco.add(contain2.plushies1);
		
		contain2.plushies2 = new JPanel();
		contain2.plushies2.setBounds(230,20,180,240);
		contain2.plushies2.setBackground(Color.white);
		layeredDeco.add(contain2.plushies2);
		
		contain2.plushies3 = new JPanel();
		contain2.plushies3.setBounds(440,20,180,240);
		contain2.plushies3.setBackground(Color.white);
		layeredDeco.add(contain2.plushies3);
		
		contain2.figurines1 = new JPanel();
		contain2.figurines1.setBounds(650,20,180,240);
		contain2.figurines1.setBackground(Color.white);
		layeredDeco.add(contain2.figurines1);
		
		contain2.figurines2 = new JPanel();
		contain2.figurines2.setBounds(860,20,180,240);
		contain2.figurines2.setBackground(Color.white);
		layeredDeco.add(contain2.figurines2);
		
		contain2.figurines3 = new JPanel();
		contain2.figurines3.setBounds(20,280,180,240);
		contain2.figurines3.setBackground(Color.white);
		layeredDeco.add(contain2.figurines3);
		
		contain2.posters1 = new JPanel();
		contain2.posters1.setBounds(230,280,180,240);
		contain2.posters1.setBackground(Color.white);
		layeredDeco.add(contain2.posters1);
		
		contain2.posters2 = new JPanel();
		contain2.posters2.setBounds(440,280,180,240);
		contain2.posters2.setBackground(Color.white);
		layeredDeco.add(contain2.posters2);
		
		contain2.posters3 = new JPanel();
		contain2.posters3.setBounds(650,280,180,240);
		contain2.posters3.setBackground(Color.white);
		layeredDeco.add(contain2.posters3);
		
		//readings
		contain2.manga1 = new JPanel();
		contain2.manga1.setBounds(20,20,180, 240);
		contain2.manga1.setBackground(Color.white);
		layeredRead.add(contain2.manga1);
		
		contain2.manga2 = new JPanel();
		contain2.manga2.setBounds(230,20,180,240);
		contain2.manga2.setBackground(Color.white);
		layeredRead.add(contain2.manga2);
		
		contain2.manga3 = new JPanel();
		contain2.manga3.setBounds(440,20,180,240);
		contain2.manga3.setBackground(Color.white);
		layeredRead.add(contain2.manga3);
		
		contain2.LN1 = new JPanel();
		contain2.LN1.setBounds(650,20,180,240);
		contain2.LN1.setBackground(Color.white);
		layeredRead.add(contain2.LN1);
		
		contain2.LN2 = new JPanel();
		contain2.LN2.setBounds(860,20,180,240);
		contain2.LN2.setBackground(Color.white);
		layeredRead.add(contain2.LN2);
		
		contain2.LN3 = new JPanel();
		contain2.LN3.setBounds(20,280,180,240);
		contain2.LN3.setBackground(Color.white);
		layeredRead.add(contain2.LN3);
		
		//Cosplay
		contain2.head1 = new JPanel();
		contain2.head1.setBounds(20,20,180, 240);
		contain2.head1.setBackground(Color.white);
		layeredCos.add(contain2.head1);
		
		contain2.head2 = new JPanel();
		contain2.head2.setBounds(230,20,180,240);
		contain2.head2.setBackground(Color.white);
		layeredCos.add(contain2.head2);
		
		contain2.upper1 = new JPanel();
		contain2.upper1.setBounds(440,20,180,240);
		contain2.upper1.setBackground(Color.white);
		layeredCos.add(contain2.upper1);
		
		contain2.upper2 = new JPanel();
		contain2.upper2.setBounds(650,20,180,240);
		contain2.upper2.setBackground(Color.white);
		layeredCos.add(contain2.upper2);
		
		contain2.lower1 = new JPanel();
		contain2.lower1.setBounds(860,20,180,240);
		contain2.lower1.setBackground(Color.white);
		layeredCos.add(contain2.lower1);
		
		contain2.lower2 = new JPanel();
		contain2.lower2.setBounds(20,280,180,240);
		contain2.lower2.setBackground(Color.white);
		layeredCos.add(contain2.lower2);
		
		contain2.feet1 = new JPanel();
		contain2.feet1.setBounds(230,280,180,240);
		contain2.feet1.setBackground(Color.white);
		layeredCos.add(contain2.feet1);
		
		contain2.feet2 = new JPanel();
		contain2.feet2.setBounds(440,280,180,240);
		contain2.feet2.setBackground(Color.white);
		layeredCos.add(contain2.feet2);
	}
}
