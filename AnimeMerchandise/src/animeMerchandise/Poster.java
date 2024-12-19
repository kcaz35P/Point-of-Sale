package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Poster extends Decoration{
	String artStyle;
	String visual;
	
	public void SetArtStyle(String artStyle) {
		this.artStyle = artStyle;
	}
	public void SetVisual(String visual) {
		this.visual = visual;
	}
	public String GetArtStyle() {
		return artStyle;
	}
	public String GetVisual() {
		return visual;
	}
}

class ProductsPoster{
	
	protected static Poster poster1;
	protected static Poster poster2;
	protected static Poster poster3;
	
	void ItemPoster() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		poster1 = new Poster();
		poster2 = new Poster();
		poster3 = new Poster();
		
		poster1.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Shippuden Poster.JPG")).getImage());
		Image newItemImage = poster1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		poster1.SetItemName("Akatsuki Poster");
		poster1.SetPrice(559);
		poster1.SetAnimeTitle("Naruto Shippuden");
		poster1.SetItemCode("C1-763598 ");
		poster1.SetSize(24);//cm
		poster1.SetColor("Black ");
		poster1.SetArtStyle("Graphic Art ");
		poster1.SetVisual("Modern ");
		poster1.SetStocks(70);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>Naruto Shippuden Akatsuki Poster<br/> "
				+ " Modern Graphic Art Black size24cm<center><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + poster1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.posters1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.posters1.add(itemLabel1.ItemPrice);
		
		
		poster2.SetImage(new ImageIcon(this.getClass().getResource("/One Piece Poster.JPG")).getImage());
		Image newItemImage2 = poster2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		poster2.SetItemName("Strawhat Poster");
		poster2.SetPrice(259);
		poster2.SetAnimeTitle("One Piece");
		poster2.SetItemCode("C2-356321 ");
		poster2.SetSize(24);//cm
		poster2.SetColor("Dull-Colored ");
		poster2.SetArtStyle("Painted Art ");
		poster2.SetVisual("Classical ");
		poster2.SetStocks(56);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>One Piece Strawhat Poster Classic<br/>"
				+ "Painted Art Dull-Colored size24cm<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + poster2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DropdownNavigation.contain.posters2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.posters2.add(itemLabel2.ItemPrice);
		
		
		poster3.SetImage(new ImageIcon(this.getClass().getResource("/Dragon Ball Poster.JPG")).getImage());
		Image newItemImage3 = poster3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		poster3.SetItemName("DBVerse Poster");
		poster3.SetPrice(259);
		poster3.SetAnimeTitle("Dragon Ball ");
		poster3.SetItemCode("C3-336597 ");
		poster3.SetSize(24);//cm
		poster3.SetColor("Vivid-Colored ");
		poster3.SetArtStyle("Painted Art ");
		poster3.SetVisual("Vintage ");
		poster3.SetStocks(60);
		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>Dragon Ball DBVerse Poster Vintage<br/> "
				+ " Painted Art Vivid-Colored size24cm<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + poster3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.posters3.add(itemLabel3.ItemNameLabel);
		DropdownNavigation.contain.posters3.add(itemLabel3.ItemPrice);
		}
}
class ProductsPosterDecoration{
	
	void ItemPosterDecoration() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		Poster poster1 = new Poster();
		Poster poster2 = new Poster();
		Poster poster3 = new Poster();
		
		poster1.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Shippuden Poster.JPG")).getImage());
		Image newItemImage = poster1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		poster1.SetItemName("Akatsuki Poster");
		poster1.SetPrice(559);
		poster1.SetAnimeTitle("Naruto Shippuden");
		poster1.SetItemCode("C1-763598 ");
		poster1.SetSize(24);//cm
		poster1.SetColor("Black ");
		poster1.SetArtStyle("Graphic Art ");
		poster1.SetVisual("Modern ");
		poster1.SetStocks(70);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>Naruto Shippuden Akatsuki Poster<br/> "
				+ " Modern Graphic Art Black size24cm<center><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + poster1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.posters1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.posters1.add(itemLabel1.ItemPrice);
		
		
		poster2.SetImage(new ImageIcon(this.getClass().getResource("/One Piece Poster.JPG")).getImage());
		Image newItemImage2 = poster2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		poster2.SetItemName("Strawhat Poster");
		poster2.SetPrice(259);
		poster2.SetAnimeTitle("One Piece");
		poster2.SetItemCode("C2-356321 ");
		poster2.SetSize(24);//cm
		poster2.SetColor("Dull-Colored ");
		poster2.SetArtStyle("Painted Art ");
		poster2.SetVisual("Classical ");
		poster2.SetStocks(56);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>One Piece Strawhat Poster Classic<br/>"
				+ "Painted Art Dull-Colored size24cm<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + poster2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DecoReadCosProducts.contain2.posters2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.posters2.add(itemLabel2.ItemPrice);
		
		
		poster3.SetImage(new ImageIcon(this.getClass().getResource("/Dragon Ball Poster.JPG")).getImage());
		Image newItemImage3 = poster3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		poster3.SetItemName("DBVerse Poster");
		poster3.SetPrice(259);
		poster3.SetAnimeTitle("Dragon Ball");
		poster3.SetItemCode("C3-336597 ");
		poster3.SetSize(24);//cm
		poster3.SetColor("Vivid-Colored ");
		poster3.SetArtStyle("Painted Art ");
		poster3.SetVisual("Vintage ");
		poster3.SetStocks(60);
		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>Dragon Ball DBVerse Poster Vintage<br/> "
				+ " Painted Art Vivid-Colored size24cm<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + poster3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.posters3.add(itemLabel3.ItemNameLabel);
		DecoReadCosProducts.contain2.posters3.add(itemLabel3.ItemPrice);
		}
}
