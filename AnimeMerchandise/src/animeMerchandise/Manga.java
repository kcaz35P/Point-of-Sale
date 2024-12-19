package animeMerchandise;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Manga extends Reading{
	boolean colorization;
	String Demographic;
	
	public void SetColorization(boolean colorization) {
		this.colorization = colorization;
	}
	public void SetDemographic(String Demographic) {
		this.Demographic = Demographic;
	}
	public boolean GetColorization() {
		return colorization;
	}
	public String GetDemographic() {
		return Demographic;
	}
}
class ProductsManga{
	
	protected static Manga manga1;
	protected static Manga manga2;
	protected static Manga manga3;
	
	void ItemManga() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		manga1 = new Manga();
		manga2 = new Manga();
		manga3 = new Manga();
		
		manga1.SetImage(new ImageIcon(this.getClass().getResource("/DBZ Manga .JPG")).getImage());
		Image newItemImage = manga1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		manga1.SetItemName("DBZ Manga");
		manga1.SetPrice(875);
		manga1.SetAnimeTitle("DragonBallZ ");
		manga1.SetItemCode("D1-123366 ");
		manga1.SetGenre("Action,Adventure");
		manga1.SetVolume(1);
		manga1.SetColorization(false);
		manga1.SetDemographic("Shonen");
		manga1.SetStocks(25);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>DragonBallZ DBZ Manga Vol.1"
				+ "<br/> Shonen NotColored Action,Adventure<center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + manga1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.manga1.add(itemLabel1.ItemNameLabel);
		DropdownNavigation.contain.manga1.add(itemLabel1.ItemPrice);
		
		
		manga2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Shippuden Manga.JPG")).getImage());
		Image newItemImage2 = manga2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		manga2.SetItemName("Naruto Manga");
		manga2.SetPrice(785);
		manga2.SetAnimeTitle("Naruto Shippuden ");
		manga2.SetItemCode("D2-987366 ");
		manga2.SetGenre("Action,Comedy");
		manga2.SetVolume(72);
		manga2.SetColorization(true);
		manga2.SetDemographic("Shonen");
		manga2.SetStocks(38);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Shippuden NarutoManga Vol.72"
				+ " <br/>Shonen Colored Action,Comedy<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + manga2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DropdownNavigation.contain.manga2.add(itemLabel2.ItemNameLabel);
		DropdownNavigation.contain.manga2.add(itemLabel2.ItemPrice);
		
		
		manga3.SetImage(new ImageIcon(this.getClass().getResource("/One Piece Manga.JPG")).getImage());
		Image newItemImage3 = manga3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		manga3.SetItemName("OP Manga");
		manga3.SetPrice(625);
		manga3.SetAnimeTitle("One Piece");
		manga3.SetItemCode("D3-547789 ");
		manga3.SetGenre("Action,Comedy");
		manga3.SetVolume(93);
		manga3.SetColorization(false);
		manga3.SetDemographic("Shonen");
		manga3.SetStocks(33);
		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>One Piece OP Manga Vol. 93 "
				+ "<br/>Shonen NotColored Action,Comedy<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + manga3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DropdownNavigation.contain.manga3.add(itemLabel3.ItemNameLabel);
		DropdownNavigation.contain.manga3.add(itemLabel3.ItemPrice);
		}
}
class ProductsMangaReading{
	
	void ItemMangaReading() {
		
		
		GUIDesign itemLabel1 = new GUIDesign();
		GUIDesign itemLabel2 = new GUIDesign();
		GUIDesign itemLabel3 = new GUIDesign();
		
		Manga manga1 = new Manga();
		Manga manga2 = new Manga();
		Manga manga3 = new Manga();
		
		manga1.SetImage(new ImageIcon(this.getClass().getResource("/DBZ Manga .JPG")).getImage());
		Image newItemImage = manga1.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		manga1.SetItemName("DBZ Manga");
		manga1.SetPrice(875);
		manga1.SetAnimeTitle("DragonBallZ ");
		manga1.SetItemCode("D1-123366 ");
		manga1.SetGenre("Action,Adventure");
		manga1.SetVolume(1);
		manga1.SetColorization(false);
		manga1.SetDemographic("Shonen");
		manga1.SetStocks(25);
		
		itemLabel1.ItemNameLabel = new JLabel();
		itemLabel1.ItemPrice = new JLabel();
		itemLabel1.ItemNameLabel.setIcon(new ImageIcon(newItemImage));
		itemLabel1.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel1.ItemNameLabel.setText("<html><center>DragonBallZ DBZ Manga Vol.1"
				+ "<br/> Shonen NotColored Action,Adventure<center/><html>");
		itemLabel1.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel1.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setText("P" + manga1.price);
		itemLabel1.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel1.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel1.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel1.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.manga1.add(itemLabel1.ItemNameLabel);
		DecoReadCosProducts.contain2.manga1.add(itemLabel1.ItemPrice);
		
		
		manga2.SetImage(new ImageIcon(this.getClass().getResource("/Naruto Shippuden Manga.JPG")).getImage());
		Image newItemImage2 = manga2.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		manga2.SetItemName("Naruto Manga");
		manga2.SetPrice(785);
		manga2.SetAnimeTitle("Naruto Shippuden ");
		manga2.SetItemCode("D2-987366 ");
		manga2.SetGenre("Action,Comedy");
		manga2.SetVolume(72);
		manga2.SetColorization(true);
		manga2.SetDemographic("Shonen");
		manga2.SetStocks(38);
		
		itemLabel2.ItemNameLabel = new JLabel();
		itemLabel2.ItemPrice = new JLabel();
		itemLabel2.ItemNameLabel.setIcon(new ImageIcon(newItemImage2));
		itemLabel2.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel2.ItemNameLabel.setText("<html><center>Naruto Shippuden NarutoManga Vol.72"
				+ " <br/>Shonen Colored Action,Comedy<center><html>");
		itemLabel2.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel2.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemNameLabel.setVisible(true);
		itemLabel2.ItemPrice.setText("P" + manga2.price);
		itemLabel2.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel2.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel2.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel2.ItemPrice.setVisible(true);
		DecoReadCosProducts.contain2.manga2.add(itemLabel2.ItemNameLabel);
		DecoReadCosProducts.contain2.manga2.add(itemLabel2.ItemPrice);
		
		
		manga3.SetImage(new ImageIcon(this.getClass().getResource("/One Piece Manga.JPG")).getImage());
		Image newItemImage3 = manga3.imageItem.getScaledInstance(178,160,Image.SCALE_SMOOTH);
		manga3.SetItemName("OP Manga");
		manga3.SetPrice(625);
		manga3.SetAnimeTitle("One Piece");
		manga3.SetItemCode("D3-547789 ");
		manga3.SetGenre("Action,Comedy");
		manga3.SetVolume(93);
		manga3.SetColorization(false);
		manga3.SetDemographic("Shonen");
		manga3.SetStocks(33);
		
		itemLabel3.ItemNameLabel = new JLabel();
		itemLabel3.ItemPrice = new JLabel();
		itemLabel3.ItemNameLabel.setIcon(new ImageIcon(newItemImage3));
		itemLabel3.ItemNameLabel.setBounds(0,0,200,140);
		itemLabel3.ItemNameLabel.setText("<html><center>One Piece OP Manga Vol. 93 "
				+ "<br/>Shonen NotColored Action,Comedy<center><html>");
		itemLabel3.ItemNameLabel.setFont(new Font("Arial", Font.BOLD,9 ));
		itemLabel3.ItemNameLabel.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalAlignment(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemNameLabel.setVerticalTextPosition(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setText("P" + manga3.price);
		itemLabel3.ItemPrice.setFont(new Font("Arial", Font.BOLD,12 ));
		itemLabel3.ItemPrice.setHorizontalAlignment(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalAlignment(JLabel.BOTTOM);
		itemLabel3.ItemPrice.setHorizontalTextPosition(JLabel.CENTER);
		itemLabel3.ItemPrice.setVerticalTextPosition(JLabel.BOTTOM);
		DecoReadCosProducts.contain2.manga3.add(itemLabel3.ItemNameLabel);
		DecoReadCosProducts.contain2.manga3.add(itemLabel3.ItemPrice);
		}
}