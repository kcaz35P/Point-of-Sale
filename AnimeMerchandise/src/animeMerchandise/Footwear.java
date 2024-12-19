package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Footwear  extends CosplayCustomize{
	int footLength;
	
	public void SetFootLength(int footLength) {
		this.footLength = footLength;
	}
	public int GetFootLength() {
		return footLength;
	}
}
class ProductsFootwear{
	
	protected static Footwear footwear1;
	protected static Footwear footwear2;
	
	void ItemFootwear() {
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		footwear1 = new Footwear();
		footwear2 = new Footwear();
		
		footwear1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy Sandals  Cosplay.JPG")).getImage());
		Image newItemImage = footwear1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		footwear1.SetItemName("Luffy Sandals Cosplay");
		footwear1.SetPrice(450);
		footwear1.SetAnimeTitle("One Piece");
		footwear1.SetItemCode("J1-356879 ");
		footwear1.SetGender("Unisex");
		footwear1.SetColor("Yellow");
		footwear1.SetFabric("Straw");
		footwear1.SetFootLength(22);
		footwear1.SetStocks(13);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Luffy Sandals Cosplay"
				+ "<br/>Yellow Straw footsize22cm  <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + footwear1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.feet1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.feet1.add(itemLabel1.ItemPrice);
		
		footwear2.SetImage(new ImageIcon(this.getClass().getResource("/Ninja Boots Foot Wear.jpg")).getImage());
		Image newItemImage2 = footwear2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		footwear2.SetItemName("Ninja Boots Cosplay");
		footwear2.SetPrice(425);
		footwear2.SetAnimeTitle("One Piece");
		footwear2.SetItemCode("J1-356879 ");
		footwear2.SetGender("Unisex");
		footwear2.SetColor("Black");
		footwear2.SetFabric("Woven");
		footwear2.SetFootLength(24);
		footwear2.SetStocks(15);
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Ninja Boots Cosplay Unisex"
				+ "<br/>Black Woven footsize24cm <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + footwear2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DropdownNavigation.contain.feet2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.feet2.add(itemLabel2.ItemPrice);
	}
}
class ProductsFootwearCosplay{
	
	protected static Footwear footwear1;
	protected static Footwear footwear2;
	
	void ItemFootwearCosplay() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		footwear1 = new Footwear();
		footwear2 = new Footwear();
		
		footwear1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy Sandals  Cosplay.JPG")).getImage());
		Image newItemImage = footwear1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		footwear1.SetItemName("Luffy Sandals Cosplay");
		footwear1.SetPrice(450);
		footwear1.SetAnimeTitle("One Piece");
		footwear1.SetItemCode("J1-356879 ");
		footwear1.SetGender("Unisex");
		footwear1.SetColor("Yellow");
		footwear1.SetFabric("Straw");
		footwear1.SetFootLength(22);
		footwear1.SetStocks(13);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Luffy Sandals Cosplay"
				+ "<br/>Yellow Straw footsize22cm  <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + footwear1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.feet1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.feet1.add(itemLabel1.ItemPrice);
		
		
		footwear2.SetImage(new ImageIcon(this.getClass().getResource("/Ninja Boots Foot Wear.jpg")).getImage());
		Image newItemImage2 = footwear2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		footwear2.SetItemName("Ninja Boots Cosplay");
		footwear2.SetPrice(425);
		footwear2.SetAnimeTitle("One Piece");
		footwear2.SetItemCode("J1-356879 ");
		footwear2.SetGender("Unisex");
		footwear2.SetColor("Black");
		footwear2.SetFabric("Woven");
		footwear2.SetFootLength(24);
		footwear2.SetStocks(15);
		
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Ninja Boots Cosplay Unisex"
				+ "<br/>Black Woven footsize24cm <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + footwear2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DecoReadCosProducts.contain2.feet2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.feet2.add(itemLabel2.ItemPrice);
	}
}