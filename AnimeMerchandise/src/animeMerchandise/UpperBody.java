package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class UpperBody extends CosplayCustomize{
	int armLength;
	int chestLength;
	int shoulderLength;
	
	public void SetUpperLength(int armLength,int chestLength,int shoulderLength) {
		this.armLength = armLength;
		this.chestLength = chestLength;
		this.shoulderLength = shoulderLength;
	}
	public int GetArmLength() {
		return armLength;
	}
	public int GetChestLength() {
		return chestLength;
	}
	public int GetShoulderLength() {
		return shoulderLength;
	}
	
}
class ProductsUpperBody{
	
	protected static UpperBody upperBody1;
	protected static UpperBody upperBody2;
	
	void ItemUpperBody() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		upperBody1 = new UpperBody();
		upperBody2 = new UpperBody();
		
		upperBody1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy Top Cosplay .JPG")).getImage());
		Image newItemImage = upperBody1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		upperBody1.SetItemName("Luffy Top Cosplay");
		upperBody1.SetPrice(935);
		upperBody1.SetAnimeTitle("One Piece");
		upperBody1.SetItemCode("G1-655489 ");
		upperBody1.SetGender("Male");
		upperBody1.SetColor("Red");
		upperBody1.SetFabric("Polyester");
		upperBody1.SetUpperLength(50,104,41);
		upperBody1.SetStocks(13);
		
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Luffy Red Top Cosplay Male "
				+ " <br/>Polyester arm50,chest103,shoulder41cm  <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + upperBody1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.upper1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.upper1.add(itemLabel1.ItemPrice);
		
		
		upperBody2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Top Cosplay.JPG")).getImage());
		Image newItemImage2 = upperBody2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		upperBody2.SetItemName("Ninja Suit Cosplay");
		upperBody2.SetPrice(850);
		upperBody2.SetAnimeTitle("Naruto");
		upperBody2.SetItemCode("G2-996852 ");
		upperBody2.SetGender("Unisex");
		upperBody2.SetColor("Orange");
		upperBody2.SetFabric("Woven");
		upperBody2.SetUpperLength(55,110,41);
		upperBody2.SetStocks(15);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Orange Top Cosplay Unisex "
				+ "<br/>Woven arm55,chest110,shoulder,41cm <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + upperBody2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DropdownNavigation.contain.upper2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.upper2.add(itemLabel2.ItemPrice);
		
		}
}
class ProductsUpperBodyCosplay{
	
	protected static UpperBody upperBody1;
	protected static UpperBody upperBody2;
	void ItemUpperBodyCosplay() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		upperBody1 = new UpperBody();
		upperBody2 = new UpperBody();
		
		upperBody1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy Top Cosplay .JPG")).getImage());
		Image newItemImage = upperBody1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		upperBody1.SetItemName("Luffy Top Cosplay");
		upperBody1.SetPrice(935);
		upperBody1.SetAnimeTitle("One Piece");
		upperBody1.SetItemCode("G1-655489 ");
		upperBody1.SetGender("Male");
		upperBody1.SetColor("Red");
		upperBody1.SetFabric("Polyester");
		upperBody1.SetUpperLength(50,104,41);
		upperBody1.SetStocks(13);
		
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Luffy Red Top Cosplay Male "
				+ " <br/>Polyester arm50,chest103,shoulder41cm  <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + upperBody1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.upper1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.upper1.add(itemLabel1.ItemPrice);
		
		
		upperBody2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Top Cosplay.JPG")).getImage());
		Image newItemImage2 = upperBody2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		upperBody2.SetItemName("Ninja Suit Cosplay");
		upperBody2.SetPrice(850);
		upperBody2.SetAnimeTitle("Naruto");
		upperBody2.SetItemCode("G2-996852 ");
		upperBody2.SetGender("Unisex");
		upperBody2.SetColor("Orange");
		upperBody2.SetFabric("Woven");
		upperBody2.SetUpperLength(55,110,41);
		upperBody2.SetStocks(15);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Orange Top Cosplay Unisex "
				+ "<br/>Woven arm55,chest110,shoulder,41cm <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + upperBody2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DecoReadCosProducts.contain2.upper2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.upper2.add(itemLabel2.ItemPrice);
		
		}
}

