package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Figurine extends Decoration{
	String model;
	int weight;
	
	public void SetModel(String model) {
		this.model = model;
	}
	public void SetWeight(int weight) {
		this.weight = weight;
	}
	public String GetModel() {
		return model;
	}
	public int GetWeight() {
		return weight;
	}
}
class ProductsFigurine{
	
	protected static Figurine figurine1;
	protected static Figurine figurine2;
	protected static Figurine figurine3;
	
	void ItemFigurine() {
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		figurine1 = new Figurine();
		figurine2 = new Figurine();
		figurine3 = new Figurine();
		
		figurine1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy Figurine.JPG")).getImage());
		Image newItemImage = figurine1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		figurine1.SetItemName("Luffy Figure");
		figurine1.SetPrice(850);
		figurine1.SetAnimeTitle("One Piece ");
		figurine1.SetItemCode("B1-987654 ");
		figurine1.SetSize(24);//cm
		figurine1.SetColor("Red ");
		figurine1.SetModel("Action ");
		figurine1.SetWeight(3);
		figurine1.SetStocks(60);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center> Action One Piece "
				+ "<br/>Luffy Figure Red 3lb size24cm <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + figurine1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.figurines1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.figurines1.add(itemLabel1.ItemPrice);
		
		
		figurine2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Figurine.JPG")).getImage());
		Image newItemImage2 = figurine2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		figurine2.SetItemName("Naruto Figure");
		figurine2.SetPrice(727);
		figurine2.SetAnimeTitle("Naruto Shippuden ");
		figurine2.SetItemCode("B2-635985 ");
		figurine2.SetSize(12);//cm
		figurine2.SetColor("Red-Orange ");
		figurine2.SetModel("Nendoroid ");
		figurine2.SetWeight(1);
		figurine2.SetStocks(41);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Nendoroid Naruto Shippuden"
				+ "<br/> Naruto Figure Red-Orange 1lb size12cm  <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + figurine2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DropdownNavigation.contain.figurines2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.figurines2.add(itemLabel2.ItemPrice);
		
		
		figurine3.SetImage(new ImageIcon(this.getClass().getResource("/Goku Gohan Figurine.JPG")).getImage());
		Image newItemImage3 = figurine3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		figurine3.SetItemName("Goku & Gohan Figure");
		figurine3.SetPrice(284);
		figurine3.SetAnimeTitle("Dragon Ball ");
		figurine3.SetItemCode("B3-309763 ");
		figurine3.SetSize(12);//cm
		figurine3.SetColor("Orange-Yellow ");
		figurine3.SetModel("Chibi ");
		figurine3.SetWeight(1);
		figurine3.SetStocks(33);

		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>Chibi  Dragon Ball Z Goku & Gohan  <br/> "
				+ "Figure Orange-Yellow 1lb size12cm<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + figurine3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.figurines3.add(itemLabel3.ItemNameLabel);
		DropdownNavigation.contain.figurines3.add(itemLabel3.ItemPrice);
		}
}
class ProductsFigurineDecoration{
	
	void ItemFigurineDecoration() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		Figurine figurine1 = new Figurine();
		Figurine figurine2 = new Figurine();
		Figurine figurine3 = new Figurine();
		
		figurine1.SetImage(new ImageIcon(this.getClass().getResource("/Luffy Figurine.JPG")).getImage());
		Image newItemImage = figurine1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		figurine1.SetItemName("Luffy Figure");
		figurine1.SetPrice(850);
		figurine1.SetAnimeTitle("One Piece ");
		figurine1.SetItemCode("B1-987654 ");
		figurine1.SetSize(24);//cm
		figurine1.SetColor("Red ");
		figurine1.SetModel("Action ");
		figurine1.SetWeight(3);
		figurine1.SetStocks(60);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center> Action One Piece "
				+ "<br/>Luffy Figure Red 3lb size24cm <center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + figurine1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.figurines1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.figurines1.add(itemLabel1.ItemPrice);
		
		
		figurine2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Figurine.JPG")).getImage());
		Image newItemImage2 = figurine2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		figurine2.SetItemName("Naruto Figure");
		figurine2.SetPrice(727);
		figurine2.SetAnimeTitle("Naruto Shippuden ");
		figurine2.SetItemCode("B2-635985 ");
		figurine2.SetSize(12);//cm
		figurine2.SetColor("Red-Orange ");
		figurine2.SetModel("Nendoroid ");
		figurine2.SetWeight(1);
		figurine2.SetStocks(41);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Nendoroid Naruto Shippuden"
				+ "<br/> Naruto Figure Red-Orange 1lb size12cm  <center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + figurine2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DecoReadCosProducts.contain2.figurines2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.figurines2.add(itemLabel2.ItemPrice);
		
		
		figurine3.SetImage(new ImageIcon(this.getClass().getResource("/Goku Gohan Figurine.JPG")).getImage());
		Image newItemImage3 = figurine3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		figurine3.SetItemName("Goku & Gohan Figure");
		figurine3.SetPrice(284);
		figurine3.SetAnimeTitle("Dragon Ball ");
		figurine3.SetItemCode("B3-309763 ");
		figurine3.SetSize(12);//cm
		figurine3.SetColor("Orange-Yellow ");
		figurine3.SetModel("Chibi ");
		figurine3.SetWeight(1);
		figurine3.SetStocks(33);

		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>Chibi  Dragon Ball Z Goku & Gohan  <br/> "
				+ "Figure Orange-Yellow 1lb size12cm<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + figurine3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.figurines3.add(itemLabel3.ItemNameLabel);
		DecoReadCosProducts.contain2.figurines3.add(itemLabel3.ItemPrice);
		}
}