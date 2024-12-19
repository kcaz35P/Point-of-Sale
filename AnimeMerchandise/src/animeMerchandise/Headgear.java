package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Headgear extends CosplayCustomize{
	String variety;
	int size;
	
	public void SetVariety(String variety) {
		this.variety = variety;
	}
	public void SetSize(int size) {
		this.size = size;
	}
	public String GetVariety() {
		return variety;
	}
	public int getSize() {
		return size;
	}
}
class ProductsHeadgear{
	
	protected static Headgear headgear1;
	protected static Headgear headgear2;
	
	void ItemHeadgear() {
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		headgear1 = new Headgear();
		headgear2 = new Headgear();
		
		headgear1.SetImage(new ImageIcon(this.getClass().getResource("/Straw Hat Cosplay Headgear.jpg")).getImage());
		Image newItemImage = headgear1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		headgear1.SetItemName("Straw Hat Cosplay");
		headgear1.SetPrice(85);
		headgear1.SetAnimeTitle("One Piece");
		headgear1.SetItemCode("G1-655489 ");
		headgear1.SetGender("Unisex");
		headgear1.SetFabric("Straw");
		headgear1.SetColor("Yellow");
		headgear1.SetVariety("Hat");
		headgear1.SetSize(40);
		headgear1.SetStocks(13);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Straw Hat Cosplay"
				+ "<br/>Unisex Yellow size40cm<center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + headgear1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.head1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.head1.add(itemLabel1.ItemPrice);
		
		
		headgear2.SetImage(new ImageIcon(this.getClass().getResource("/Hidden Leaf Cosplay .jpg")).getImage());
		Image newItemImage2 = headgear2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		headgear2.SetItemName("Hidden Leaf Band Cosplay");
		headgear2.SetPrice(357);
		headgear2.SetAnimeTitle("Naruto Shippuden");
		headgear2.SetItemCode("G2-611189 ");
		headgear2.SetGender("Unisex");
		headgear2.SetFabric("Polyester");
		headgear2.SetColor("Black");
		headgear2.SetVariety("Forehead Band");
		headgear2.SetSize(40);
		headgear2.SetStocks(15);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Hidden Leaf Band Cosplay"
				+ "<br/>Unisex Polyester Black size40cm<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + headgear2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DropdownNavigation.contain.head2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.head2.add(itemLabel2.ItemPrice);
		
		}
}
class ProductsHeadgearCosplay{
	
	void ItemHeadgearCosplay() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		
		Headgear headgear1 = new Headgear();
		Headgear headgear2 = new Headgear();
		
		headgear1.SetImage(new ImageIcon(this.getClass().getResource("/Straw Hat Cosplay Headgear.jpg")).getImage());
		Image newItemImage = headgear1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		headgear1.SetItemName("Straw Hat Cosplay");
		headgear1.SetPrice(85);
		headgear1.SetAnimeTitle("One Piece");
		headgear1.SetItemCode("G1-655489 ");
		headgear1.SetGender("Unisex");
		headgear1.SetFabric("Straw");
		headgear1.SetColor("Yellow");
		headgear1.SetVariety("Hat");
		headgear1.SetSize(40);
		headgear1.SetStocks(13);
		
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>One Piece Straw Hat Cosplay"
				+ "<br/>Unisex Yellow size40cm<center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + headgear1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.head1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.head1.add(itemLabel1.ItemPrice);
		
		
		headgear2.SetImage(new ImageIcon(this.getClass().getResource("/Hidden Leaf Cosplay .jpg")).getImage());
		Image newItemImage2 = headgear2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		headgear2.SetItemName("Hidden Leaf Band Cosplay");
		headgear2.SetPrice(357);
		headgear2.SetAnimeTitle("Naruto Shippuden");
		headgear2.SetItemCode("G2-611189 ");
		headgear2.SetGender("Unisex");
		headgear2.SetFabric("Polyester");
		headgear2.SetColor("Black");
		headgear2.SetVariety("Forehead Band");
		headgear2.SetSize(40);
		headgear2.SetStocks(15);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Hidden Leaf Band Cosplay"
				+ "<br/>Unisex Polyester Black size40cm<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + headgear2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DecoReadCosProducts.contain2.head2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.head2.add(itemLabel2.ItemPrice);
		
		}
}