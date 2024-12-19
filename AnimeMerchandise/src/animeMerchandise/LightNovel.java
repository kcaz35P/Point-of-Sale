package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LightNovel extends Reading{
	String LightNovelFormat;
	
	public void SetLightNovelFormat(String LightNovelFormat) {
		this.LightNovelFormat = LightNovelFormat;
	}
	public String GetLightNovelFormat() {
		return LightNovelFormat;
	}
}
class ProductsLightNovel{
	
	protected static LightNovel LN1;
	protected static LightNovel LN2;
	protected static LightNovel LN3;
	
	void ItemLightNovel() {
			
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		LN1 = new LightNovel();
		LN2 = new LightNovel();
		LN3 = new LightNovel();
		
		LN1.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Shippuden Kakashi LN.JPG")).getImage());
		Image newItemImage = LN1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		LN1.SetItemName("Kakashi LN");
		LN1.SetPrice(715);	
		LN1.SetAnimeTitle("Naruto Shippuden");
		LN1.SetItemCode("E1-777789 ");
		LN1.SetGenre("Action,Tragic");
		LN1.SetVolume(1);
		LN1.SetLightNovelFormat("Hardback");
		LN1.SetStocks(20);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>Naruto Shippuden Kakashi LN Vol.1 "
				+ "<br/> Hardback Action,Tragic<center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + LN1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.LN1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.LN1.add(itemLabel1.ItemPrice);
		
		
		LN2.SetImage(new ImageIcon(this.getClass().getResource("/DBS Broly LN.JPG")).getImage());
		Image newItemImage2 = LN2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		LN2.SetItemName("Broly LN ");
		LN2.SetAnimeTitle("Dragon Ball Super");
		LN2.SetPrice(325);
		LN2.SetItemCode("E2-157689 ");
		LN2.SetGenre("Action,Drama");
		LN2.SetVolume(1);
		LN2.SetLightNovelFormat("Paperback");
		LN2.SetStocks(30);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Dragon Ball Super Broly LN Vol.1 "
				+ " <br/>Paperback Action,Drama<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + LN2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DropdownNavigation.contain.LN2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.LN2.add(itemLabel2.ItemPrice);
		
		
		LN3.SetImage(new ImageIcon(this.getClass().getResource("/One Piece Ace LN.JPG")).getImage());
		Image newItemImage3 = LN3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		LN3.SetItemName("Ace LN");
		LN3.SetPrice(435);
		LN3.SetAnimeTitle("One Piece");
		LN3.SetItemCode("E3-781689 ");
		LN3.SetGenre("Action,Drama");
		LN3.SetVolume(1);
		LN3.SetLightNovelFormat("Paperback");
		LN3.SetStocks(25);
		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>Ace LN Vol.1"
				+ " <br/>Paperback Action,Drame One Piece<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + LN3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.LN3.add(itemLabel3.ItemNameLabel);
		DropdownNavigation.contain.LN3.add(itemLabel3.ItemPrice);
		}
}
class ProductsLightNovelReading{
	protected static LightNovel LN1;
	protected static LightNovel LN2 ;
	protected static LightNovel LN3;
	void ItemLightNovelReading() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		LN1 = new LightNovel();
		LN2 = new LightNovel();
		LN3 = new LightNovel();
		
		LN1.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Shippuden Kakashi LN.JPG")).getImage());
		Image newItemImage = LN1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		LN1.SetItemName("Kakashi LN");
		LN1.SetPrice(715);	
		LN1.SetAnimeTitle("Naruto Shippuden");
		LN1.SetItemCode("E1-777789 ");
		LN1.SetGenre("Action,Tragic");
		LN1.SetVolume(1);
		LN1.SetLightNovelFormat("Hardback");
		LN1.SetStocks(20);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>Naruto Shippuden Kakashi LN Vol.1 "
				+ "<br/> Hardback Action,Tragic<center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + LN1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.LN1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.LN1.add(itemLabel1.ItemPrice);
		
		
		LN2.SetImage(new ImageIcon(this.getClass().getResource("/DBS Broly LN.JPG")).getImage());
		Image newItemImage2 = LN2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		LN2.SetItemName("Broly LN ");
		LN2.SetAnimeTitle("Dragon Ball Super");
		LN2.SetPrice(325);
		LN2.SetItemCode("E2-157689 ");
		LN2.SetGenre("Action,Drama");
		LN2.SetVolume(1);
		LN2.SetLightNovelFormat("Paperback");
		LN2.SetStocks(30);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Dragon Ball Super Broly LN Vol.1 "
				+ " <br/>Paperback Action,Drama<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + LN2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DecoReadCosProducts.contain2.LN2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.LN2.add(itemLabel2.ItemPrice);
		
		
		LN3.SetImage(new ImageIcon(this.getClass().getResource("/One Piece Ace LN.JPG")).getImage());
		Image newItemImage3 = LN3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		LN3.SetItemName("Ace LN");
		LN3.SetPrice(435);
		LN3.SetAnimeTitle("One Piece");
		LN3.SetItemCode("E3-781689 ");
		LN3.SetGenre("Action,Drama");
		LN3.SetVolume(1);
		LN3.SetLightNovelFormat("Paperback");
		LN3.SetStocks(25);
		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>Ace LN Vol.1"
				+ " <br/>Paperback Action,Drame One Piece<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + LN3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.LN3.add(itemLabel3.ItemNameLabel);
		DecoReadCosProducts.contain2.LN3.add(itemLabel3.ItemPrice);
		}
}