package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LowerBody extends CosplayCustomize {
	int hipLength;
	int waistLength;
	
	public void SetLowerLength(int hipLength, int waistLength) {
		this.hipLength = hipLength;
		this.waistLength = waistLength;
	}
	public int GetHipLength() {
		return hipLength;
	}
	public int GetWaistLength() {
		return waistLength;
	}
}
class ProductsLowerBody{
	
	protected static LowerBody lowerBody1;
	protected static LowerBody lowerBody2;
	
	void ItemLowerBody() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		lowerBody1 = new LowerBody();
		lowerBody2 = new LowerBody();
		
		lowerBody1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy  Pants Cosplay.jpg")).getImage());
		Image newItemImage = lowerBody1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		lowerBody1.SetItemName("Luffy Pants Cosplay");
		lowerBody1.SetPrice(475);
		lowerBody1.SetAnimeTitle("One Piece");
		lowerBody1.SetItemCode("H1-795489 ");
		lowerBody1.SetGender("Unisex");
		lowerBody1.SetColor("Blue");
		lowerBody1.SetFabric("Polyester");
		lowerBody1.SetLowerLength(92,68);
		lowerBody1.SetStocks(13);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Blue Luffy Pants Cosplay "
				+ " <br/>Unisex Polyester hip92,waist68cm <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + lowerBody1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.lower1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.lower1.add(itemLabel1.ItemPrice);
		
		
		lowerBody2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Ninja Pants Cosplay.jpg")).getImage());
		Image newItemImage2 = lowerBody2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		lowerBody2.SetItemName("Ninja Pants Cosplay");
		lowerBody2.SetPrice(685);
		lowerBody2.SetAnimeTitle("One Piece");
		lowerBody2.SetItemCode("H2-888489 ");
		lowerBody2.SetGender("Unisex");
		lowerBody2.SetColor("Orange");
		lowerBody2.SetFabric("Woven");
		lowerBody2.SetLowerLength(92,68);
		lowerBody2.SetStocks(15);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Ninja Pants Cosplay Unisex"
				+ "<br/>Orange Woven hip90,waist65cm  <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setText("P" + lowerBody2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.lower2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.lower2.add(itemLabel2.ItemPrice);
		
		
	}
}
class ProductsLowerBodyCosplay{
	
	protected static LowerBody lowerBody1;
	protected static LowerBody lowerBody2;
	
	void ItemLowerBodyCosplay() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		lowerBody1 = new LowerBody();
		lowerBody2 = new LowerBody();
		
		lowerBody1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy  Pants Cosplay.jpg")).getImage());
		Image newItemImage = lowerBody1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		lowerBody1.SetItemName("Luffy Pants Cosplay");
		lowerBody1.SetPrice(475);
		lowerBody1.SetAnimeTitle("One Piece");
		lowerBody1.SetItemCode("H1-795489 ");
		lowerBody1.SetGender("Unisex");
		lowerBody1.SetColor("Blue");
		lowerBody1.SetFabric("Polyester");
		lowerBody1.SetLowerLength(92,68);
		lowerBody1.SetStocks(13);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Blue Luffy Pants Cosplay "
				+ " <br/>Unisex Polyester hip92,waist68cm <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + lowerBody1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.lower1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.lower1.add(itemLabel1.ItemPrice);
		
		
		lowerBody2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Ninja Pants Cosplay.jpg")).getImage());
		Image newItemImage2 = lowerBody2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		lowerBody2.SetItemName("Ninja Pants Cosplay");
		lowerBody2.SetPrice(685);
		lowerBody2.SetAnimeTitle("One Piece");
		lowerBody2.SetItemCode("H2-888489 ");
		lowerBody2.SetGender("Unisex");
		lowerBody2.SetColor("Orange");
		lowerBody2.SetFabric("Woven");
		lowerBody2.SetLowerLength(92,68);
		lowerBody2.SetStocks(15);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Ninja Pants Cosplay Unisex"
				+ "<br/>Orange Woven hip90,waist65cm  <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setText("P" + lowerBody2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.lower2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.lower2.add(itemLabel2.ItemPrice);
		
		
	}
}