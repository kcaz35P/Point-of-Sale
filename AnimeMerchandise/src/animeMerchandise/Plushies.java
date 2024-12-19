package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Plushies extends Decoration{
	String texture;
	String appearance;
	public JLabel itemLabel1;
	
	
	public void SetTexture(String texture) {
		this.texture = texture;
	}
	public void SetAppearance(String appearance) {
		this.appearance = appearance;
	}
	public String GetTexture() {
		return texture;
	}
	public String GetAppearance() {
		return appearance;
	}
	
}

class ProductsPlushies{
	protected static Plushies plushies1;
	protected static Plushies plushies2;
	protected static Plushies plushies3;
	
	void ItemPlushies() {
	GUIDesign itemLabel1 = new GUIDesign();
	GUIDesign itemLabel2 = new GUIDesign();
	GUIDesign itemLabel3 = new GUIDesign();
	
	plushies1 = new Plushies();
	plushies2 = new Plushies();
	plushies3 = new Plushies();
	
	plushies1.SetImage(new ImageIcon(this.getClass().getResource("/Chopper Plushie.jpg")).getImage());
	Image newItemImage = plushies1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
	plushies1.SetItemName("Chopper Plushie");
	plushies1.SetPrice(275);
	plushies1.SetStocks(99);
	plushies1.SetAnimeTitle("One Piece ");
	plushies1.SetItemCode("A1-353535");
	plushies1.SetSize(40);
	plushies1.SetColor("Orange ");
	plushies1.SetTexture("Smooth ");
	plushies1.SetAppearance("Moe ");
	
	itemLabel1.ItemNameLabel = new JLabel();
	itemLabel1.ItemPrice = new JLabel();
	itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
	itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
	itemLabel1.ItemNameLabel.setText("<html><center> One Piece Chopper Plushie"
			+ "<br/> Orange Moe Smooth 40cm<center><html>");
	itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
	itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
	itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
	itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel1.ItemPrice.setText("P" + plushies1.price);
	itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
	itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
	itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
	itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
	DropdownNavigation.contain.plushies1.add(itemLabel1.ItemNameLabel);
	DropdownNavigation.contain.plushies1.add(itemLabel1.ItemPrice);
	
	plushies2.SetImage(new ImageIcon(this.getClass().getResource("/DB MajinnBu Plushie.png")).getImage());
	Image newItemImage2 = plushies2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
	plushies2.SetItemName("MajinnBu Plushie ");
	plushies2.SetPrice(300);
	plushies2.SetStocks(99);
	plushies2.SetAnimeTitle("Dragon Ball ");
	plushies2.SetItemCode("A2-831022 ");
	plushies2.SetSize(30);
	plushies2.SetColor("Pink ");
	plushies2.SetTexture("Fuzzy ");
	plushies2.SetAppearance("Chibi ");
	
	itemLabel2.ItemNameLabel = new JLabel();
	itemLabel2.ItemPrice = new JLabel();
	itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
	itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
	itemLabel2.ItemNameLabel.setText("<html><center> Dragon Ball Z MajinnBu Plushie<br/> Pink Chibi Fuzzy 30cm<center><html>");
	itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
	itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
	itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
	itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel2.ItemNameLabel.setVisible(true);
	itemLabel2.ItemPrice.setText("P" + plushies2.price);
	itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
	itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
	itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
	itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel2.ItemPrice.setVisible(true);
	DropdownNavigation.contain.plushies2.add(itemLabel2.ItemNameLabel);
	DropdownNavigation.contain.plushies2.add(itemLabel2.ItemPrice);
	
	
	
	plushies3.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Plushie.jpg")).getImage());
	Image newItemImage3 = plushies3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
	plushies3.SetItemName("Naruto Plushie");
	plushies3.SetPrice(550);
	plushies3.SetStocks(109);
	plushies3.SetAnimeTitle("Naruto Shippuden ");
	plushies3.SetItemCode("A3-102065 ");
	plushies3.SetSize(35);
	plushies3.SetColor("Orange ");
	plushies3.SetTexture("Smooth ");
	plushies3.SetAppearance("Chibi ");
	
	itemLabel3.ItemNameLabel = new JLabel();
	itemLabel3.ItemPrice = new JLabel();
	itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
	itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
	itemLabel3.ItemNameLabel.setText("<html><center> Naruto Shippuden Naruto Plushie"
			+ " <br/>Orange Chibi Smooth 35cm<center><html>");
	itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
	itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
	itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
	itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel3.ItemPrice.setText("P" + plushies3.price);
	itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
	itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
	itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
	itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
	DropdownNavigation.contain.plushies3.add(itemLabel3.ItemNameLabel);
	DropdownNavigation.contain.plushies3.add(itemLabel3.ItemPrice);
	}
}
class ProductsPlushiesDecoration{
	
	void ItemPlushiesDecoration() {
	GUIDesign itemLabel1 = new GUIDesign();
	GUIDesign itemLabel2 = new GUIDesign();
	GUIDesign itemLabel3 = new GUIDesign();
	
	Plushies plushies1 = new Plushies();
	Plushies plushies2 = new Plushies();
	Plushies plushies3 = new Plushies();
	
	plushies1.SetImage(new ImageIcon(this.getClass().getResource("/Chopper Plushie.jpg")).getImage());
	Image newItemImage = plushies1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
	plushies1.SetItemName("Chopper Plushie");
	plushies1.SetPrice(275);
	plushies1.SetStocks(99);
	plushies1.SetAnimeTitle("One Piece ");
	plushies1.SetItemCode("A1-353535");
	plushies1.SetSize(40);
	plushies1.SetColor("Orange ");
	plushies1.SetTexture("Smooth ");
	plushies1.SetAppearance("Moe ");
	
	itemLabel1.ItemNameLabel = new JLabel();
	itemLabel1.ItemPrice = new JLabel();
	itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
	itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
	itemLabel1.ItemNameLabel.setText("<html><center> One Piece Chopper Plushie"
			+ "<br/> Orange Moe Smooth 40cm<center><html>");
	itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
	itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
	itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
	itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel1.ItemPrice.setText("P" + plushies1.price);
	itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
	itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
	itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
	itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
	DecoReadCosProducts.contain2.plushies1.add(itemLabel1.ItemNameLabel);
	DecoReadCosProducts.contain2.plushies1.add(itemLabel1.ItemPrice);
	
	plushies2.SetImage(new ImageIcon(this.getClass().getResource("/DB MajinnBu Plushie.png")).getImage());
	Image newItemImage2 = plushies2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
	plushies2.SetItemName("MajinnBu Plushie ");
	plushies2.SetPrice(300);
	plushies2.SetStocks(99);
	plushies2.SetAnimeTitle("Dragon Ball ");
	plushies2.SetItemCode("A2-831022 ");
	plushies2.SetSize(30);
	plushies2.SetColor("Pink ");
	plushies2.SetTexture("Fuzzy ");
	plushies2.SetAppearance("Chibi ");
	
	itemLabel2.ItemNameLabel = new JLabel();
	itemLabel2.ItemPrice = new JLabel();
	itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
	itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
	itemLabel2.ItemNameLabel.setText("<html><center> Dragon Ball Z MajinnBu Plushie<br/> Pink Chibi Fuzzy 30cm<center><html>");
	itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
	itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
	itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
	itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel2.ItemNameLabel.setVisible(true);
	itemLabel2.ItemPrice.setText("P" + plushies2.price);
	itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
	itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
	itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
	itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel2.ItemPrice.setVisible(true);
	DecoReadCosProducts.contain2.plushies2.add(itemLabel2.ItemNameLabel);
	DecoReadCosProducts.contain2.plushies2.add(itemLabel2.ItemPrice);
	
	
	
	plushies3.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Plushie.jpg")).getImage());
	Image newItemImage3 = plushies3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
	plushies3.SetItemName("Naruto Plushie");
	plushies3.SetPrice(550);
	plushies3.SetStocks(109);
	plushies3.SetAnimeTitle("Naruto Shippuden ");
	plushies3.SetItemCode("A3-102065 ");
	plushies3.SetSize(35);
	plushies3.SetColor("Orange ");
	plushies3.SetTexture("Smooth ");
	plushies3.SetAppearance("Chibi ");
	
	itemLabel3.ItemNameLabel = new JLabel();
	itemLabel3.ItemPrice = new JLabel();
	itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
	itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
	itemLabel3.ItemNameLabel.setText("<html><center> Naruto Shippuden Naruto Plushie"
			+ " <br/>Orange Chibi Smooth 35cm<center><html>");
	itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
	itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
	itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
	itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
	itemLabel3.ItemPrice.setText("P" + plushies3.price);
	itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
	itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
	itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
	itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
	itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
	DecoReadCosProducts.contain2.plushies3.add(itemLabel3.ItemNameLabel);
	DecoReadCosProducts.contain2.plushies3.add(itemLabel3.ItemPrice);
	}
}

	

	
