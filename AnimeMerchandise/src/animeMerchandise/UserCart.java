package animeMerchandise;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class UserCart {
	String itemList;
	String itemDescription;
	String date;
	String transactionNo;
	int quantity;
	
	
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setDate(String date) {
		if(date == null) {
			date = " ";
		}
		this.date = date;
	}
	
	public void setTransactionNo(String transacNo) {
		this.transactionNo = transacNo;
	}
	
	//getters
	public String getItemList( ) {
		return itemList;
	}
	public String getItemDescription( ) {
		return itemDescription;
	}
	public String getDate( ) {
		return date;
	}
	
	public String getTransactionNo() {
		return transactionNo;
	}
	public int getQuantity() {
		return quantity;
	}
	
}
class CurrentDateTime{
	protected static  DateTimeFormatter dtf;
	protected static LocalDateTime now;
	protected static UserCart date = new UserCart();
	public void Date() {    
	dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	now = LocalDateTime.now();  
	date.setDate(String.valueOf(dtf.format(now)));
	  }   
	
}    

class TransNo{
	Random rand = new Random();
	protected static UserCart RNG = new UserCart();
	public void Rand() {
		int No1 = rand.nextInt(10);
		int No2 = rand.nextInt(10);
		int No3 = rand.nextInt(10);
		int No4 = rand.nextInt(10);
		int No5 = rand.nextInt(10);
		int No6 = rand.nextInt(10);
		int No7 = rand.nextInt(10);
		int No8 = rand.nextInt(10);
		int No9 = rand.nextInt(10);
		int No10 = rand.nextInt(10);
		int No11 = rand.nextInt(10);
		int No12 = rand.nextInt(10);
		String TransacNo =  "" + No1 + No2 + No3 + No4 + No5 + No6 + No7 + No8 + No9
				+ No10 + No11 + No12;
		RNG.setTransactionNo(TransacNo);
	}
}
class TabularForm extends GUIDesign{
	
	JTable table;
	protected static DefaultTableModel model;
	protected static JPanel customerCart;
	protected static JButton addButton;
	protected static ReceiptForm run = new ReceiptForm();
	public Object[] row;
	protected static ReceiptForm valueCaller = new ReceiptForm();
	
	public void tablePanel() {
		
		customerCart = new JPanel();
		customerCart.setBounds(20,70,1020,450);
		customerCart.setOpaque(false);
		customerCart.setLayout(null);
		customerCart.setBorder(BorderFactory.createLineBorder(null, 2, true));
		layeredCart.add(customerCart);
		
		JPanel shohin = new JPanel();
		shohin.setBounds(0,0,1020,50);
		shohin.setBackground(new Color(0xE5D8BB));
		shohin.setBorder(BorderFactory.createLineBorder(null, 2,true));
		customerCart.add(shohin);
		
		JLabel shohinText = new JLabel();
		shohinText.setText("Shohin Co.");
		shohinText.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		shohin.add(shohinText);
	}
	
	
	public  void tableItemAdded() {
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 48, 1020,201);
		scrollPane.setBorder(BorderFactory.createLineBorder(null, 2,true));
		customerCart.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(0xE5D8BB));
		model = new DefaultTableModel();
		Object[] column = {"Item Code/Reference","Quantity","Item Description","Price","Amount"};
		final Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		table.setDefaultEditor(Object.class, null);
		table.setRowHeight(65);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		
		addButton  = new JButton("ADD");
		addButton.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		addButton.setForeground(Color.white);
		addButton.setBackground(new Color(0xa21420));
		addButton.setFocusable(false);
		addButton.setBorder(BorderFactory.createEtchedBorder());
		addButton.setBounds(600,0,200,61);
		panelBuy.add(addButton);
			
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				UserCart quantity1x = new UserCart();
				
				
			if(ProfileEditingFrame.userInfo.getCustomerID() != null) {
					
				if(RadButtonCart.radButton1.isSelected() || RadButtonCart.radButton1x.isSelected() == true) {
				CurrentDateTime.date.getDate();
				
				quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
				+ ProductsPlushies.plushies1.getStocks()+"\nInput Quantity:")));
					
					if(quantity1x.getQuantity() > ProductsPlushies.plushies1.getStocks()) {
						JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
					ProductsPlushies.plushies1.getStocks() + " item(s)");
						}
					else {
						/*
						 *This Should be added on buy 
						*/
						JOptionPane.showMessageDialog(null, "Added to Cart");
						int container = ProductsPlushies.plushies2.getStocks();
						container = container - quantity1x.getQuantity();
						ProductsPlushies.plushies1.SetStocks(container);
						row[0] = ProductsPlushies.plushies1.getItemCode();
						row[1] = quantity1x.getQuantity();
						row[2] = "<html>" + ProductsPlushies.plushies1.getAnimeTitle()
						+ ProductsPlushies.plushies1.getItemName()+ 
						ProductsPlushies.plushies1.getColor() + "<br/> size" + ProductsPlushies.plushies1.getSize()
						+ " " + ProductsPlushies.plushies1.GetTexture() +
						ProductsPlushies.plushies1.GetAppearance()+"<html>";
						row[3] = ProductsPlushies.plushies1.getPrice();
						run.setAmount(quantity1x.getQuantity() * ProductsPlushies.plushies1.getPrice());
						row[4] = run.getAmount();
						model.addRow(row);
						run.setTotalAmount(run.getAmount());
					}
				}
				else if(RadButtonCart.radButton2.isSelected() || RadButtonCart.radButton2x.isSelected() == true) {
				quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
						+ ProductsPlushies.plushies2.getStocks()+"\nInput Quantity:")));
					
					if(quantity1x.getQuantity() > ProductsPlushies.plushies2.getStocks()) {
						JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
					ProductsPlushies.plushies2.getStocks() + " item(s)");
						}
					else {
						/*
						 *This Should be added on buy 
						*/
						JOptionPane.showMessageDialog(null, "Added to Cart");
						int container2 = ProductsPlushies.plushies2.getStocks();
						container2 = container2 - quantity1x.getQuantity();
						ProductsPlushies.plushies2.SetStocks(container2);
						row[0] = ProductsPlushies.plushies2.getItemCode();
						row[1] = quantity1x.getQuantity();
						row[2] = "<html>" + ProductsPlushies.plushies2.getAnimeTitle()
						+ ProductsPlushies.plushies2.getItemName()+ 
						ProductsPlushies.plushies2.getColor() + "<br/> size" + 
						ProductsPlushies.plushies2.getSize()
						+ " " + ProductsPlushies.plushies2.GetTexture() +
						ProductsPlushies.plushies2.GetAppearance()+"<html>";
						row[3] = ProductsPlushies.plushies2.getPrice();
						run.setAmount(quantity1x.getQuantity() * ProductsPlushies.plushies2.getPrice());
						row[4] = run.getAmount();
						model.addRow(row);
						run.setTotalAmount(run.getAmount());
					}
				}
				else if(RadButtonCart.radButton3.isSelected() || RadButtonCart.radButton3x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsPlushies.plushies3.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsPlushies.plushies3.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
						ProductsPlushies.plushies3.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsPlushies.plushies3.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsPlushies.plushies3.SetStocks(container3);
							row[0] = ProductsPlushies.plushies3.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsPlushies.plushies3.getAnimeTitle()
							+ ProductsPlushies.plushies3.getItemName()+ 
							ProductsPlushies.plushies3.getColor() + "<br/> size" + 
							ProductsPlushies.plushies3.getSize()
							+ " " + ProductsPlushies.plushies3.GetTexture() +
							ProductsPlushies.plushies3.GetAppearance()+"<html>";
							row[3] = ProductsPlushies.plushies3.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsPlushies.plushies3.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton4.isSelected() || RadButtonCart.radButton4x.isSelected() == true) {
					quantity1x.setQuantity(0);
						quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsFigurine.figurine1.getStocks()+"\nInput Quantity:")));
						
						if(quantity1x.getQuantity() > ProductsFigurine.figurine1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsFigurine.figurine1.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container4 = ProductsFigurine.figurine1.getStocks();
							container4 = container4 - quantity1x.getQuantity();
							ProductsFigurine.figurine1.SetStocks(container4);
							row[0] = ProductsFigurine.figurine1.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsFigurine.figurine1.getAnimeTitle()
							+ ProductsFigurine.figurine1.getItemName()+ 
							ProductsFigurine.figurine1.getColor() + "<br/> size" + 
							ProductsFigurine.figurine1.getSize()
							+ " " + ProductsFigurine.figurine1.GetModel() +
							ProductsFigurine.figurine1.GetWeight()+"<html>";
							row[3] = ProductsFigurine.figurine1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsFigurine.figurine1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton5.isSelected() || RadButtonCart.radButton5x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsFigurine.figurine2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsFigurine.figurine2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsFigurine.figurine2.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container5 = ProductsFigurine.figurine2.getStocks();
							container5 = container5 - quantity1x.getQuantity();
							ProductsFigurine.figurine2.SetStocks(container5);
							row[0] = ProductsFigurine.figurine2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsFigurine.figurine2.getAnimeTitle()
							+ ProductsFigurine.figurine2.getItemName()+ 
							ProductsFigurine.figurine2.getColor() + "<br/> size" + 
							ProductsFigurine.figurine2.getSize()
							+ " " + ProductsFigurine.figurine2.GetModel() +
							ProductsFigurine.figurine2.GetWeight()+"<html>";
							row[3] = ProductsFigurine.figurine2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsFigurine.figurine2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton6.isSelected() || RadButtonCart.radButton6x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsFigurine.figurine3.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsFigurine.figurine3.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsFigurine.figurine3.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container6 = ProductsFigurine.figurine3.getStocks();
							container6 = container6 - quantity1x.getQuantity();
							ProductsFigurine.figurine3.SetStocks(container6);
							row[0] = ProductsFigurine.figurine3.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsFigurine.figurine3.getAnimeTitle()
							+ ProductsFigurine.figurine3.getItemName()+ 
							ProductsFigurine.figurine3.getColor() + "<br/> size" + 
							ProductsFigurine.figurine3.getSize()
							+ " " + ProductsFigurine.figurine3.GetModel() +
							ProductsFigurine.figurine3.GetWeight()+"<html>";
							row[3] = ProductsFigurine.figurine3.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsFigurine.figurine3.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton7.isSelected() || RadButtonCart.radButton7x.isSelected()== true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsPoster.poster1.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsPoster.poster1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsPoster.poster1.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsPoster.poster1.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsPoster.poster1.SetStocks(container3);
							row[0] = ProductsPoster.poster1.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsPoster.poster1.getAnimeTitle()
							+ ProductsPoster.poster1.getItemName()+ 
							ProductsPoster.poster1.getColor() + "<br/> size" + 
							ProductsPoster.poster1.getSize()
							+ " " + ProductsPoster.poster1.GetArtStyle() +
							ProductsPoster.poster1.GetVisual()+"<html>";
							row[3] = ProductsPoster.poster1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsPoster.poster1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton8.isSelected() || RadButtonCart.radButton8x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsPoster.poster2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsPoster.poster2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
									ProductsPoster.poster2.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsPoster.poster2.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsPoster.poster2.SetStocks(container3);
							row[0] = ProductsPoster.poster2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsPoster.poster2.getAnimeTitle()
							+ ProductsPoster.poster2.getItemName()+ 
							ProductsPoster.poster2.getColor() + "<br/> size" + 
							ProductsPoster.poster2.getSize()
							+ " " + ProductsPoster.poster2.GetArtStyle() +
							ProductsPoster.poster2.GetVisual()+"<html>";
							row[3] = ProductsPoster.poster2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsPoster.poster2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton9.isSelected() || RadButtonCart.radButton9x.isSelected()== true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsPoster.poster3.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsPoster.poster3.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsPoster.poster3.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsPoster.poster3.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsPoster.poster3.SetStocks(container3);
							row[0] = ProductsPoster.poster3.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsPoster.poster3.getAnimeTitle()
							+ ProductsPoster.poster3.getItemName()+ 
							ProductsPoster.poster3.getColor() + "<br/> size" + 
							ProductsPoster.poster3.getSize()
							+ " " + ProductsPoster.poster3.GetArtStyle() +
							ProductsPoster.poster3.GetVisual()+"<html>";
							row[3] = ProductsPoster.poster3.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsPoster.poster3.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton10.isSelected()|| RadButtonCart.radButton10x.isSelected()== true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsManga.manga1.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsManga.manga1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsManga.manga1.getStocks() + " item(s)");
							}
						else {
							String coloredManga = "";
							if(ProductsManga.manga1.GetColorization() == false) {
								 coloredManga = " NotColored ";
							}else {
								coloredManga = " Colored ";
							}
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsManga.manga1.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsManga.manga1.SetStocks(container3);
							row[0] = ProductsManga.manga1.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsManga.manga1.getAnimeTitle()
							+ ProductsManga.manga1.getItemName()+ 
							ProductsManga.manga1.GetDemographic() + "<br/>" + 
							coloredManga + " " + ProductsManga.manga1.GetGenre() + " Vol." +
							ProductsManga.manga1.GetVolume()+"<html>";
							row[3] = ProductsManga.manga1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsManga.manga1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton11.isSelected() || RadButtonCart.radButton11x.isSelected()== true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsManga.manga2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsManga.manga2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsManga.manga2.getStocks() + " item(s)");
							}
						else {
							String coloredManga = "";
							if(ProductsManga.manga1.GetColorization() == false) {
								 coloredManga = "NotColored";
							}else {
								coloredManga = "Colored";
							}
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsManga.manga2.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsManga.manga2.SetStocks(container3);
							row[0] = ProductsManga.manga2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsManga.manga2.getAnimeTitle()
							+ ProductsManga.manga2.getItemName()+ 
							ProductsManga.manga2.GetDemographic() + "<br/>" + 
							coloredManga + " " + ProductsManga.manga2.GetGenre() + " Vol." +
							ProductsManga.manga2.GetVolume()+"<html>";
							row[3] = ProductsManga.manga2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsManga.manga2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton12.isSelected() || RadButtonCart.radButton12x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsManga.manga3.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsManga.manga3.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsManga.manga3.getStocks() + " item(s)");
							}
						else {
							String coloredManga = "";
							if(ProductsManga.manga3.GetColorization() == false) {
								 coloredManga = "NotColored";
							}else {
								coloredManga = "Colored";
							}
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsManga.manga3.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsManga.manga3.SetStocks(container3);
							row[0] = ProductsManga.manga3.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsManga.manga3.getAnimeTitle()
							+ ProductsManga.manga3.getItemName()+ 
							ProductsManga.manga3.GetDemographic() + "<br/>" + 
							coloredManga + " " + ProductsManga.manga3.GetGenre() + " Vol." +
							ProductsManga.manga3.GetVolume()+"<html>";
							row[3] =ProductsManga.manga3.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsManga.manga3.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton13.isSelected() || RadButtonCart.radButton13x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsLightNovel.LN1.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsLightNovel.LN1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
									ProductsLightNovel.LN1.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsLightNovel.LN1.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsLightNovel.LN1.SetStocks(container3);
							row[0] = ProductsPlushies.plushies3.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsLightNovel.LN1.getAnimeTitle()
							+ ProductsLightNovel.LN1.getItemName()+ "<br/>" + 
							ProductsLightNovel.LN1.GetLightNovelFormat()
							+ " " + ProductsLightNovel.LN1.GetGenre() + " Vol." +
							ProductsLightNovel.LN1.GetVolume()+"<html>";
							row[3] = ProductsLightNovel.LN1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsLightNovel.LN1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton14.isSelected() || RadButtonCart.radButton14x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsLightNovel.LN2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsLightNovel.LN2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsLightNovel.LN2.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsLightNovel.LN2.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsLightNovel.LN2.SetStocks(container3);
							row[0] = ProductsLightNovel.LN2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsLightNovel.LN2.getAnimeTitle()
							+ ProductsLightNovel.LN2.getItemName()+ "<br/>" + 
							ProductsLightNovel.LN2.GetLightNovelFormat()
							+ " " + ProductsLightNovel.LN2.GetGenre() + " Vol." +
							ProductsLightNovel.LN2.GetVolume()+"<html>";
							row[3] = ProductsLightNovel.LN2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsLightNovel.LN2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton15.isSelected() || RadButtonCart.radButton15x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ ProductsLightNovel.LN3.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsLightNovel.LN3.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsLightNovel.LN3.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsLightNovel.LN3.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsLightNovel.LN3.SetStocks(container3);
							row[0] = ProductsLightNovel.LN3.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsLightNovel.LN3.getAnimeTitle()
							+ ProductsLightNovel.LN3.getItemName()+ "<br/>" + 
							ProductsLightNovel.LN1.GetLightNovelFormat()
							+ " " + ProductsLightNovel.LN3.GetGenre() +" Vol." +
							ProductsLightNovel.LN3.GetVolume()+"<html>";
							row[3] = ProductsLightNovel.LN3.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsLightNovel.LN3.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton16.isSelected() || RadButtonCart.radButton16x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsHeadgear.headgear1.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsHeadgear.headgear1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsHeadgear.headgear1.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsHeadgear.headgear1.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsHeadgear.headgear1.SetStocks(container3);
							row[0] = ProductsHeadgear.headgear1.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsHeadgear.headgear1.getAnimeTitle()
							+ ProductsHeadgear.headgear1.getItemName()+ 
							ProductsHeadgear.headgear1.GetGender() + "<br/> size" + 
							ProductsHeadgear.headgear1.GetColor()
							+ " " + ProductsHeadgear.headgear1.getSize() + "<html>";
							row[3] = ProductsHeadgear.headgear1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsHeadgear.headgear1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				
				else if(RadButtonCart.radButton17.isSelected() || RadButtonCart.radButton17x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsHeadgear.headgear2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsHeadgear.headgear2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
								ProductsHeadgear.headgear2.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsHeadgear.headgear2.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsHeadgear.headgear2.SetStocks(container3);
							row[0] = ProductsHeadgear.headgear2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsPlushies.plushies3.getAnimeTitle()
							+ ProductsHeadgear.headgear2.getItemName()+ 
							ProductsHeadgear.headgear2.GetGender() + "<br/> size" + 
							ProductsHeadgear.headgear2.GetColor()
							+ " " + ProductsHeadgear.headgear2.getSize() +"<html>";
							row[3] = ProductsHeadgear.headgear2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsHeadgear.headgear2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton18.isSelected() || RadButtonCart.radButton18x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsUpperBody.upperBody1.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsUpperBody.upperBody1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsUpperBody.upperBody1.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsUpperBody.upperBody1.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsUpperBody.upperBody1.SetStocks(container3);
							row[0] = ProductsUpperBody.upperBody1.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsUpperBody.upperBody1.getAnimeTitle()
							+ ProductsUpperBody.upperBody1.getItemName()+ 
							ProductsUpperBody.upperBody1.GetColor() + "<br/> size" + 
							ProductsUpperBody.upperBody1.GetGender()
							+ " " + ProductsUpperBody.upperBody1.GetFabric()
							+" lengths:arm50,chest103,shoulder41cm<html>";
							row[3] = ProductsUpperBody.upperBody1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsUpperBody.upperBody1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton19.isSelected() || RadButtonCart.radButton19x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsUpperBody.upperBody2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsUpperBody.upperBody2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
									ProductsUpperBody.upperBody2.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsUpperBody.upperBody2.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsUpperBody.upperBody2.SetStocks(container3);
							row[0] = ProductsUpperBody.upperBody2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsUpperBody.upperBody2.getAnimeTitle()
							+ ProductsUpperBody.upperBody2.getItemName()+ 
							ProductsUpperBody.upperBody2.GetColor() + "<br/> size" + 
							ProductsUpperBody.upperBody2.GetGender()
							+ " " + ProductsUpperBody.upperBody2.GetFabric()
							+" lengths:arm55cm,chest110cm,shoulder,41cm<html>";
							row[3] = ProductsUpperBody.upperBody2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsUpperBody.upperBody2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton20.isSelected() || RadButtonCart.radButton20x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsLowerBody.lowerBody1.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsLowerBody.lowerBody1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsLowerBody.lowerBody1.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsLowerBody.lowerBody1.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsLowerBody.lowerBody1.SetStocks(container3);
							row[0] = ProductsLowerBody.lowerBody1.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsLowerBody.lowerBody1.getAnimeTitle()
							+ ProductsLowerBody.lowerBody1.getItemName()+ 
							ProductsLowerBody.lowerBody1.GetColor() + "<br/> size" + 
							ProductsLowerBody.lowerBody1.GetGender()
							+ " " + ProductsLowerBody.lowerBody1.GetFabric() +
							" lengths:hip92cm,waist68cm<html>";
							row[3] = ProductsLowerBody.lowerBody1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsLowerBody.lowerBody1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton21.isSelected() || RadButtonCart.radButton21x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsLowerBody.lowerBody2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsLowerBody.lowerBody2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsLowerBody.lowerBody2.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsLowerBody.lowerBody2.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsLowerBody.lowerBody2.SetStocks(container3);
							row[0] = ProductsLowerBody.lowerBody2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsLowerBody.lowerBody2.getAnimeTitle()
							+ ProductsLowerBody.lowerBody2.getItemName()+ 
							ProductsLowerBody.lowerBody2.GetColor() + "<br/> size" + 
							ProductsLowerBody.lowerBody2.GetGender()
							+ " " + ProductsLowerBody.lowerBody2.GetFabric() +
							" hip90,waist65cm <html>";
							row[3] = ProductsLowerBody.lowerBody2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsLowerBody.lowerBody2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton22.isSelected() || RadButtonCart.radButton22x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsFootwear.footwear1.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsFootwear.footwear1.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsFootwear.footwear1.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsFootwear.footwear1.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsFootwear.footwear1.SetStocks(container3);
							row[0] = ProductsFootwear.footwear1.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsFootwear.footwear1.getAnimeTitle()
							+ ProductsFootwear.footwear1.getItemName()+ 
							ProductsFootwear.footwear1.GetColor() + "<br/> size" + 
							ProductsFootwear.footwear1.GetGender()
							+ " " + ProductsFootwear.footwear1.GetFabric() +
							"length foot: "+ ProductsFootwear.footwear1.GetFootLength()+"<html>";
							row[3] = ProductsFootwear.footwear1.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsFootwear.footwear1.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else if(RadButtonCart.radButton23.isSelected() || RadButtonCart.radButton23x.isSelected() == true) {
					quantity1x.setQuantity(0);
					quantity1x.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Stocks: "
							+ProductsFootwear.footwear2.getStocks()+"\nInput Quantity:")));
						if(quantity1x.getQuantity() > ProductsFootwear.footwear2.getStocks()) {
							JOptionPane.showMessageDialog(null, "Out of Stocks (Available: " +
							ProductsFootwear.footwear2.getStocks() + " item(s)");
							}
						else {
							JOptionPane.showMessageDialog(null, "Added to Cart");
							int container3 = ProductsFootwear.footwear2.getStocks();
							container3 = container3 - quantity1x.getQuantity();
							ProductsFootwear.footwear2.SetStocks(container3);
							row[0] = ProductsFootwear.footwear2.getItemCode();
							row[1] = quantity1x.getQuantity();
							row[2] = "<html>" + ProductsFootwear.footwear2.getAnimeTitle()
							+ ProductsFootwear.footwear2.getItemName()+ 
							ProductsFootwear.footwear2.GetColor() + "<br/> size" + 
							ProductsFootwear.footwear2.GetGender()
							+ " " + ProductsFootwear.footwear2.GetFabric() +
							"length foot: "+ ProductsFootwear.footwear2.GetFootLength()+"<html>";
							row[3] = ProductsFootwear.footwear2.getPrice();
							run.setAmount(quantity1x.getQuantity() * ProductsFootwear.footwear2.getPrice());
							row[4] = run.getAmount();
							model.addRow(row);
							run.setTotalAmount(run.getAmount());
						}
					}
				else {
					System.out.println("false");
				}
				
				//Display
				OrderReceipt.totalAmountReceipt.setText(String.valueOf(TabularForm.run.getTotalAmount()));
				
				Float vatTemp = Float.valueOf((float) (TabularForm.run.getTotalAmount()*0.12));
				valueCaller.setValueAddedTax(vatTemp);
				OrderReceipt.VATReceipt.setText(String.valueOf(valueCaller.getValueAddedTax()));
				Float grandTotalAmountTemp = Float.valueOf((float)(TabularForm.run.getTotalAmount()
						+ valueCaller.getValueAddedTax()));
				if(ProfileEditingFrame.selectedBool == true) {
					Float discountTemp;
					discountTemp = (float) (grandTotalAmountTemp * 0.20);
					valueCaller.setDiscount(discountTemp);
					OrderReceipt.discountReceipt.setText(String.valueOf(valueCaller.getDiscount()));
					grandTotalAmountTemp -= discountTemp;
					valueCaller.setGrandTotal(grandTotalAmountTemp);
					OrderReceipt.grandTotalAmountReceipt.setText(String.valueOf(valueCaller.getGrandTotal()));
				}else if (ProfileEditingFrame.selectedBool == false){
					valueCaller.setDiscount(0);
					OrderReceipt.discountReceipt.setText(String.valueOf(valueCaller.getDiscount()));
					valueCaller.setGrandTotal(grandTotalAmountTemp);
					OrderReceipt.grandTotalAmountReceipt.setText(String.valueOf(valueCaller.getGrandTotal()));
				}
				else {
					OrderReceipt.discountReceipt.setText(String.valueOf(valueCaller.getDiscount()));
					valueCaller.setGrandTotal(grandTotalAmountTemp);
					OrderReceipt.grandTotalAmountReceipt.setText(String.valueOf(valueCaller.getGrandTotal()));
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Please Fill Out Your Account Information First",null,JOptionPane.WARNING_MESSAGE);
			}
			} 
			
		});
	}
}
