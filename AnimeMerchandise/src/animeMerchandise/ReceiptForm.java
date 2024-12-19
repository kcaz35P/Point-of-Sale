package animeMerchandise;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReceiptForm extends GUIDesign{
	public int amount;
	public int totalAmount;
	public float VAT;
	public float discount;
	public float grandTotal;
	public float payment;
	public float change;
	JPanel receipt;
	
	int totalAmountTemp = 0;
	float vatTemp = 0;
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setTotalAmount(int totalAmount) {
	
		if(totalAmount == 0) {
		totalAmount =0;
		totalAmountTemp = 0;
		}
		totalAmountTemp += totalAmount;
		totalAmount = totalAmountTemp;
		this.totalAmount = totalAmount;
	}
	public void setValueAddedTax(float VAT) {
		if(VAT == 0) {
			VAT =0;
		}
		this.VAT = VAT;
	}
	public void setDiscount(float discount) {
		if(discount == 0) {
			discount =0;
		}
		this.discount = discount;
	}
	public void setGrandTotal(float grandTotal) {
		if(grandTotal == 0) {
			grandTotal =0;
		}
		this.grandTotal = grandTotal;
	}
	public void setPayment(float payment) {
		if(payment == 0) {
			payment =0;
		}
		this.payment = payment;
	}
	public void setChange(float change) {
		if(change == 0) {
			change =0;
		}
		this.change = change;
	}
	
	//getters
	public int getAmount() {
		return amount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public float getValueAddedTax() {
		return VAT;
	}
	public float getDiscount() {
		return discount;
	}
	public float getGrandTotal() {
		return grandTotal;
	}
	public float getPayment() {
		return payment;
	}
	public float getChange() {
		return change;
	}
}

class OrderReceipt extends TabularForm{
	JTable tableReceipt;
	DefaultTableModel modelReceipt;
	protected static JButton buyButton;
	protected static JButton clearButton;
	protected static JLabel totalAmountReceipt;
	protected static JLabel VATReceipt;
	protected static JLabel discountReceipt;
	protected static JLabel grandTotalAmountReceipt;
	protected static JLabel amountTenderedReceipt;
	protected static JLabel changeReceipt;
	protected static JLabel nameReceiptInput;
	protected static JLabel	transReceiptInput;
	protected static JLabel	modReceiptInput;
	protected static JLabel	dateTimeReceiptInput;
	
	public void customerReceipt() {
		JPanel panelReceipt = new JPanel();
		panelReceipt.setBounds(0, 246, 410,204);
		panelReceipt.setBackground(new Color(0xE5D8BB));
		panelReceipt.setLayout(null);
		panelReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		customerCart.add(panelReceipt);
		
		JLabel totalAmountPanel = new JLabel("Total Amount: ");
		totalAmountPanel.setHorizontalAlignment(JLabel.RIGHT);
		totalAmountPanel.setBounds(0,0,205,36);
		totalAmountPanel.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(totalAmountPanel);
		
		JLabel VATPanel = new JLabel("VAT: ");
		VATPanel.setHorizontalAlignment(JLabel.RIGHT);
		VATPanel.setBounds(0,34,205,36);
		VATPanel.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(VATPanel);
		
		JLabel discountPanel = new JLabel("Discount: ");
		discountPanel.setHorizontalAlignment(JLabel.RIGHT);
		discountPanel.setBounds(0,68,205,36);
		discountPanel.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(discountPanel);
		
		JLabel grandTotalAmountPanel = new JLabel("Grand Total Amount: ");
		grandTotalAmountPanel.setHorizontalAlignment(JLabel.RIGHT);
		grandTotalAmountPanel.setBounds(0,102,205,36);
		grandTotalAmountPanel.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(grandTotalAmountPanel);
		
		JLabel amountTenderedPanel = new JLabel("Amount Tendered: ");
		amountTenderedPanel.setHorizontalAlignment(JLabel.RIGHT);
		amountTenderedPanel.setBounds(0,136,205,36);
		amountTenderedPanel.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(amountTenderedPanel);
		
		JLabel changePanel = new JLabel("Change: ");
		changePanel.setHorizontalAlignment(JLabel.RIGHT);
		changePanel.setBounds(0,170,205,36);
		changePanel.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(changePanel);
		
		totalAmountReceipt = new JLabel();
		totalAmountReceipt.setHorizontalAlignment(JLabel.CENTER);
		totalAmountReceipt.setBounds(205,0,205,36);
		totalAmountReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(totalAmountReceipt);
		
		VATReceipt = new JLabel();
		VATReceipt.setHorizontalAlignment(JLabel.CENTER);
		VATReceipt.setBounds(205,34,205,36);
		VATReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(VATReceipt);
		
		discountReceipt = new JLabel();
		discountReceipt.setHorizontalAlignment(JLabel.CENTER);
		discountReceipt.setBounds(205,68,205,36);
		discountReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(discountReceipt);
		
		grandTotalAmountReceipt = new JLabel();
		grandTotalAmountReceipt.setHorizontalAlignment(JLabel.CENTER);
		grandTotalAmountReceipt.setBounds(205,102,205,36);
		grandTotalAmountReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(grandTotalAmountReceipt);
		
		amountTenderedReceipt = new JLabel();
		amountTenderedReceipt.setHorizontalAlignment(JLabel.CENTER);
		amountTenderedReceipt.setBounds(205,136,205,36);
		amountTenderedReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(amountTenderedReceipt);
		
		changeReceipt = new JLabel();
		changeReceipt.setHorizontalAlignment(JLabel.CENTER);
		changeReceipt.setBounds(205,170,205,36);
		changeReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		panelReceipt.add(changeReceipt);
		
		JPanel CustomerInfoReceipt = new JPanel();
		CustomerInfoReceipt.setBounds(410, 246, 610,204);
		CustomerInfoReceipt.setBackground(new Color(0xE5D8BB));
		CustomerInfoReceipt.setLayout(null);
		CustomerInfoReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		customerCart.add(CustomerInfoReceipt);
		
		JLabel nameReceipt = new JLabel("Customer Name: ");
		nameReceipt.setHorizontalAlignment(JLabel.RIGHT);
		nameReceipt.setBounds(50,0,205,52);
		nameReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(nameReceipt);
		
		nameReceiptInput = new JLabel();
		nameReceiptInput.setHorizontalAlignment(JLabel.LEFT);
		nameReceiptInput.setBounds(253,0,357,52);
		nameReceiptInput.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(nameReceiptInput);
		
		JLabel dateTimeReceipt = new JLabel("Date/Time of Purchased: ");
		dateTimeReceipt.setHorizontalAlignment(JLabel.RIGHT);
		dateTimeReceipt.setBounds(50,51,205,52);
		dateTimeReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(dateTimeReceipt);
		
		dateTimeReceiptInput = new JLabel();
		dateTimeReceiptInput.setHorizontalAlignment(JLabel.LEFT);
		dateTimeReceiptInput.setBounds(253,51,357,52);
		dateTimeReceiptInput.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(dateTimeReceiptInput);
		
		JLabel transReceipt = new JLabel("Transaction No.: ");
		transReceipt.setHorizontalAlignment(JLabel.RIGHT);
		transReceipt.setBounds(50,102,205,52);
		transReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(transReceipt);
		
		transReceiptInput = new JLabel();
		transReceiptInput.setHorizontalAlignment(JLabel.LEFT);
		transReceiptInput.setBounds(253,102,357,52);
		transReceiptInput.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(transReceiptInput);
		
		JLabel modReceipt = new JLabel("Mode of Payment: ");
		modReceipt.setHorizontalAlignment(JLabel.RIGHT);
		modReceipt.setBounds(50,153,205,52);
		modReceipt.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(modReceipt);
		
		modReceiptInput = new JLabel();
		modReceiptInput.setHorizontalAlignment(JLabel.LEFT);
		modReceiptInput.setBounds(253,153,357,52);
		modReceiptInput.setBackground(new Color(0xE5D8BB));
		modReceiptInput.setBorder(BorderFactory.createLineBorder(null, 2,true));
		CustomerInfoReceipt.add(modReceiptInput);
		
		buyButton  = new JButton("BUY");
		buyButton.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		buyButton.setForeground(Color.white);
		buyButton.setBackground(new Color(0xa21420));
		buyButton.setFocusable(false);
		buyButton.setBorder(BorderFactory.createEtchedBorder());
		buyButton.setBounds(800,0,200,61);
		panelBuy.add(buyButton);
		buyButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buyButton) {
					
					Float pay;
					ReceiptForm valueAttri = new ReceiptForm();
					pay = Float.parseFloat(JOptionPane.showInputDialog("Input Payment: "));
					if (pay < valueCaller.getGrandTotal()) {
						JOptionPane.showMessageDialog(null, "Your Payment is not Enough!!!!!!! \n Please Try Again",null,JOptionPane.WARNING_MESSAGE);
					}
					else {
					valueAttri.setPayment(pay);
					amountTenderedReceipt.setText(String.valueOf(valueAttri.getPayment()));
					
					Float subtractedMoney;
					subtractedMoney = pay - valueCaller.getGrandTotal();
					
						valueAttri.setChange(subtractedMoney);
						changeReceipt.setText(String.valueOf(valueAttri.getChange()));
						nameReceiptInput.setText(ProfileEditingFrame.userInfo.getCustomerName());
						dateTimeReceiptInput.setText(CurrentDateTime.date.getDate());
						transReceiptInput.setText(TransNo.RNG.getTransactionNo());
						modReceiptInput.setText(ProfileEditingFrame.userInfo.getModeOfPayment());
						changeReceipt.setText(String.valueOf(valueAttri.getChange()));
					
						JOptionPane.showMessageDialog(null,"Thank You for Buying :>");
					}
					
				}
			}
			
		});
		Image clearImage = new ImageIcon(this.getClass().getResource("/reset.png")).getImage();
		Image newClearImage = clearImage.getScaledInstance(100,100,Image.SCALE_SMOOTH);
		
		clearButton  = new JButton("BUY");
		clearButton.setFont(new Font("Century Schoolbook", Font.BOLD,30 ));
		clearButton.setForeground(Color.white);
		clearButton.setBackground(new Color(0xa21420));
		clearButton.setFocusable(false);
		clearButton.setBorder(BorderFactory.createEtchedBorder());
		clearButton.setBounds(1000,0,100,61);
		clearButton.setIcon(new ImageIcon(newClearImage));
		panelBuy.add(clearButton);
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiptForm valueAttri = new ReceiptForm();
				//if(){
					
				//}
				if(e.getSource() == clearButton) {
					TabularForm.run.setTotalAmount(0);
					CurrentDateTime.date.setDate("0");
					totalAmountReceipt.setText(String.valueOf(TabularForm.run.getTotalAmount()));
					
					valueCaller.setValueAddedTax(0);
					VATReceipt.setText(String.valueOf(valueCaller.getValueAddedTax()));
					
					valueCaller.setDiscount(0);
					OrderReceipt.discountReceipt.setText(String.valueOf(valueCaller.getDiscount()));
					
					valueCaller.setGrandTotal(0);
					OrderReceipt.grandTotalAmountReceipt.setText(String.valueOf(valueCaller.getGrandTotal()));
					
					valueAttri.setPayment(0);
					amountTenderedReceipt.setText(String.valueOf(valueAttri.getPayment()));
					
					valueAttri.setChange(0);
					changeReceipt.setText(String.valueOf(valueAttri.getChange()));
					
					model.setRowCount(0);
					
					CurrentDateTime.date.setDate(null);
					ProfileEditingFrame.userInfo.setCustomerName(null);
					
					nameReceiptInput.setText(" ");
					dateTimeReceiptInput.setText(" ");
					transReceiptInput.setText(" ");
					modReceiptInput.setText(" ");
				}
			}
			
		});
		
	
	}
}

class RadButtonCart extends GUIDesign{
	
	protected static JRadioButton radButton1;
	protected static JRadioButton radButton2;
	protected static JRadioButton radButton3;
	protected static JRadioButton radButton4;
	protected static JRadioButton radButton5;
	protected static JRadioButton radButton6;
	protected static JRadioButton radButton7;
	protected static JRadioButton radButton8;
	protected static JRadioButton radButton9;
	protected static JRadioButton radButton10;
	protected static JRadioButton radButton11;
	protected static JRadioButton radButton12;
	protected static JRadioButton radButton13;
	protected static JRadioButton radButton14;
	protected static JRadioButton radButton15;
	protected static JRadioButton radButton16;
	protected static JRadioButton radButton17;
	protected static JRadioButton radButton18;
	protected static JRadioButton radButton19;
	protected static JRadioButton radButton20;
	protected static JRadioButton radButton21;
	protected static JRadioButton radButton22;
	protected static JRadioButton radButton23;
	
	
	public void CheckBoxDeclaration() {
		radButton1 = new JRadioButton();
		radButton1.setFocusable(false);
		radButton1.setBounds(20,40,180, 20);
		radButton1.setOpaque(false);
		DropdownNavigation.contain.plushies1.add(radButton1);
		

		group.add(radButton1);
		
		radButton2 = new JRadioButton();
		radButton2.setFocusable(false);
		radButton2.setBounds(20,40,180, 20);
		radButton2.setOpaque(false);
		radButton2.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.plushies2.add(radButton2);
		group.add(radButton2);
		
		radButton3 = new JRadioButton();
		radButton3.setFocusable(false);
		radButton3.setBounds(20,40,180, 20);
		radButton3.setOpaque(false);
		radButton3.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.plushies3.add(radButton3);
		group.add(radButton3);
		
		radButton4 = new JRadioButton();
		radButton4.setFocusable(false);
		radButton4.setBounds(20,40,180, 20);
		radButton4.setOpaque(false);
		radButton4.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.figurines1.add(radButton4);
		group.add(radButton4);
		
		radButton5 = new JRadioButton();
		radButton5.setFocusable(false);
		radButton5.setBounds(20,40,180, 20);
		radButton5.setOpaque(false);
		radButton5.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.figurines2.add(radButton5);
		group.add(radButton5);
		
		radButton6 = new JRadioButton();
		radButton6.setFocusable(false);
		radButton6.setBounds(20,40,180, 20);
		radButton6.setOpaque(false);
		radButton6.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.figurines3.add(radButton6);
		group.add(radButton6);
		
		radButton7 = new JRadioButton();
		radButton7.setFocusable(false);
		radButton7.setBounds(20,40,180, 20);
		radButton7.setOpaque(false);
		radButton7.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.posters1.add(radButton7);
		group.add(radButton7);
		
		radButton8 = new JRadioButton();
		radButton8.setFocusable(false);
		radButton8.setBounds(20,40,180, 20);
		radButton8.setOpaque(false);
		radButton8.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.posters2.add(radButton8);
		group.add(radButton8);
		
		radButton9 = new JRadioButton();
		radButton9.setFocusable(false);
		radButton9.setBounds(20,40,180, 20);
		radButton9.setOpaque(false);
		radButton9.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.posters3.add(radButton9);
		group.add(radButton9);
		
		radButton10 = new JRadioButton();
		radButton10.setFocusable(false);
		radButton10.setBounds(20,40,180, 20);
		radButton10.setOpaque(false);
		radButton10.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.manga1.add(radButton10);
		group.add(radButton10);
		
		radButton11 = new JRadioButton();
		radButton11.setFocusable(false);
		radButton11.setBounds(20,40,180, 20);
		radButton11.setOpaque(false);
		radButton11.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.manga2.add(radButton11);
		group.add(radButton11);
		
		radButton12 = new JRadioButton();
		radButton12.setFocusable(false);
		radButton12.setBounds(20,40,180, 20);
		radButton12.setOpaque(false);
		radButton12.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.manga3.add(radButton12);
		group.add(radButton12);
		
		radButton13 = new JRadioButton();
		radButton13.setFocusable(false);
		radButton13.setBounds(20,40,180, 20);
		radButton1.setOpaque(false);
		radButton13.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.LN1.add(radButton13);
		group.add(radButton13);
		
		radButton14 = new JRadioButton();
		radButton14.setFocusable(false);
		radButton14.setBounds(20,40,180, 20);
		radButton14.setOpaque(false);
		radButton14.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.LN2.add(radButton14);
		group.add(radButton14);
		
		radButton15 = new JRadioButton();
		radButton15.setFocusable(false);
		radButton15.setBounds(20,40,180, 20);
		radButton15.setOpaque(false);
		radButton15.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.LN3.add(radButton15);
		group.add(radButton15);
		
		radButton16 = new JRadioButton();
		radButton16.setFocusable(false);
		radButton16.setBounds(20,40,180, 20);
		radButton16.setOpaque(false);
		radButton16.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.head1.add(radButton16);
		group.add(radButton16);
		
		radButton17 = new JRadioButton();
		radButton17.setFocusable(false);
		radButton17.setBounds(20,40,180, 20);
		radButton17.setOpaque(false);
		radButton17.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.head2.add(radButton17);
		group.add(radButton17);
		
		radButton18 = new JRadioButton();
		radButton18.setFocusable(false);
		radButton18.setBounds(20,40,180, 20);
		radButton1.setOpaque(false);
		radButton18.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.upper1.add(radButton18);
		group.add(radButton18);
		
		radButton19 = new JRadioButton();
		radButton19.setFocusable(false);
		radButton19.setBounds(20,40,180, 20);
		radButton19.setOpaque(false);
		radButton19.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.upper2.add(radButton19);
		group.add(radButton19);
		
		radButton20 = new JRadioButton();
		radButton20.setFocusable(false);
		radButton20.setBounds(20,40,180, 20);
		radButton20.setOpaque(false);
		radButton20.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.lower1.add(radButton20);
		group.add(radButton20);
		
		radButton21 = new JRadioButton();
		radButton21.setFocusable(false);
		radButton21.setBounds(20,40,180, 20);
		radButton21.setOpaque(false);
		radButton21.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.lower2.add(radButton21);
		group.add(radButton21);
		
		radButton22 = new JRadioButton();
		radButton22.setFocusable(false);
		radButton22.setBounds(20,40,180, 20);
		radButton22.setOpaque(false);
		radButton22.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.feet1.add(radButton22);
		group.add(radButton22);
		
		radButton23 = new JRadioButton();
		radButton23.setFocusable(false);
		radButton23.setBounds(20,40,180, 20);
		radButton23.setOpaque(false);
		radButton23.setHorizontalAlignment(JCheckBox.RIGHT);
		DropdownNavigation.contain.feet2.add(radButton23);
		group.add(radButton23);
		
	}
	protected static JRadioButton radButton1x;
	protected static JRadioButton radButton2x;
	protected static JRadioButton radButton3x;
	protected static JRadioButton radButton4x;
	protected static JRadioButton radButton5x;
	protected static JRadioButton radButton6x;
	protected static JRadioButton radButton7x;
	protected static JRadioButton radButton8x;
	protected static JRadioButton radButton9x;
	protected static JRadioButton radButton10x;
	protected static JRadioButton radButton11x;
	protected static JRadioButton radButton12x;
	protected static JRadioButton radButton13x;
	protected static JRadioButton radButton14x;
	protected static JRadioButton radButton15x;
	protected static JRadioButton radButton16x;
	protected static JRadioButton radButton17x;
	protected static JRadioButton radButton18x;
	protected static JRadioButton radButton19x;
	protected static JRadioButton radButton20x;
	protected static JRadioButton radButton21x;
	protected static JRadioButton radButton22x;
	protected static JRadioButton radButton23x;


	void AddCheckBoxDeclaration() {
		
		radButton1x = new JRadioButton();
		radButton1x.setFocusable(false);
		radButton1x.setBounds(20,40,180, 20);
		radButton1x.setOpaque(false);
		radButton1x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.plushies1.add(radButton1x);
		group.add(radButton1x);
		
		radButton2x = new JRadioButton();
		radButton2x.setFocusable(false);
		radButton2x.setBounds(20,40,180, 20);
		radButton2x.setOpaque(false);
		radButton2x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.plushies2.add(radButton2x);
		group.add(radButton2x);
		
		radButton3x = new JRadioButton();
		radButton3x.setFocusable(false);
		radButton3x.setBounds(20,40,180, 20);
		radButton3x.setOpaque(false);
		radButton3x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.plushies3.add(radButton3x);
		group.add(radButton3x);
		
		radButton4x = new JRadioButton();
		radButton4x.setFocusable(false);
		radButton4x.setBounds(20,40,180, 20);
		radButton4x.setOpaque(false);
		radButton4x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.figurines1.add(radButton4x);
		group.add(radButton4x);
		
		radButton5x = new JRadioButton();
		radButton5x.setFocusable(false);
		radButton5x.setBounds(20,40,180, 20);
		radButton5x.setOpaque(false);
		radButton5x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.figurines2.add(radButton5x);
		group.add(radButton5x);
		
		radButton6x = new JRadioButton();
		radButton6x.setFocusable(false);
		radButton6x.setBounds(20,40,180, 20);
		radButton6x.setOpaque(false);
		radButton6x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.figurines3.add(radButton6x);
		group.add(radButton6x);
		
		radButton7x = new JRadioButton();
		radButton7x.setFocusable(false);
		radButton7x.setBounds(20,40,180, 20);
		radButton7x.setOpaque(false);
		radButton7x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.posters1.add(radButton7x);
		group.add(radButton7x);
		
		radButton8x = new JRadioButton();
		radButton8x.setFocusable(false);
		radButton8x.setBounds(20,40,180, 20);
		radButton8x.setOpaque(false);
		radButton8x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.posters2.add(radButton8x);
		group.add(radButton8x);
		
		radButton9x = new JRadioButton();
		radButton9x.setFocusable(false);
		radButton9x.setBounds(20,40,180, 20);
		radButton9x.setOpaque(false);
		radButton9x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.posters3.add(radButton9x);
		group.add(radButton9x);
		
		radButton10x = new JRadioButton();
		radButton10x.setFocusable(false);
		radButton10x.setBounds(20,40,180, 20);
		radButton10x.setOpaque(false);
		radButton10x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.manga1.add(radButton10x);
		group.add(radButton10x);
		
		radButton11x = new JRadioButton();
		radButton11x.setFocusable(false);
		radButton11x.setBounds(20,40,180, 20);
		radButton11x.setOpaque(false);
		radButton11x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.manga2.add(radButton11x);
		group.add(radButton11x);
		
		radButton12x = new JRadioButton();
		radButton12x.setFocusable(false);
		radButton12x.setBounds(20,40,180, 20);
		radButton12x.setOpaque(false);
		radButton12x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.manga3.add(radButton12x);
		group.add(radButton12x);
		
		radButton13x = new JRadioButton();
		radButton13x.setFocusable(false);
		radButton13x.setBounds(20,40,180, 20);
		radButton13x.setOpaque(false);
		radButton13x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.LN1.add(radButton13x);
		group.add(radButton13x);
		
		radButton14x = new JRadioButton();
		radButton14x.setFocusable(false);
		radButton14x.setBounds(20,40,180, 20);
		radButton14x.setOpaque(false);
		radButton14x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.LN2.add(radButton14x);
		group.add(radButton14x);
		
		radButton15x = new JRadioButton();
		radButton15x.setFocusable(false);
		radButton15x.setBounds(20,40,180, 20);
		radButton15x.setOpaque(false);
		radButton15x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.LN3.add(radButton15x);
		group.add(radButton15x);
		
		radButton16x = new JRadioButton();
		radButton16x.setFocusable(false);
		radButton16x.setBounds(20,40,180, 20);
		radButton16x.setOpaque(false);
		radButton16x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.head1.add(radButton16x);
		group.add(radButton16x);
		
		radButton17x = new JRadioButton();
		radButton17x.setFocusable(false);
		radButton17x.setBounds(20,40,180, 20);
		radButton17x.setOpaque(false);
		radButton17x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.head2.add(radButton17x);
		group.add(radButton17x);
		
		radButton18x = new JRadioButton();
		radButton18x.setFocusable(false);
		radButton18x.setBounds(20,40,180, 20);
		radButton18x.setOpaque(false);
		radButton18x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.upper1.add(radButton18x);
		group.add(radButton18x);
		
		radButton19x = new JRadioButton();
		radButton19x.setFocusable(false);
		radButton19x.setBounds(20,40,180, 20);
		radButton19x.setOpaque(false);
		radButton19x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.upper2.add(radButton19x);
		group.add(radButton19x);
		
		radButton20x = new JRadioButton();
		radButton20x.setFocusable(false);
		radButton20x.setBounds(20,40,180, 20);
		radButton20x.setOpaque(false);
		radButton20x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.lower1.add(radButton20x);
		group.add(radButton20x);
		
		radButton21x = new JRadioButton();
		radButton21x.setFocusable(false);
		radButton21x.setBounds(20,40,180, 20);
		radButton21x.setOpaque(false);
		radButton21x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.lower2.add(radButton21x);
		group.add(radButton21x);
		
		radButton22x = new JRadioButton();
		radButton22x.setFocusable(false);
		radButton22x.setBounds(20,40,180, 20);
		radButton22x.setOpaque(false);
		radButton22x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.feet1.add(radButton22x);
		group.add(radButton22x);
		
		radButton23x = new JRadioButton();
		radButton23x.setFocusable(false);
		radButton23x.setBounds(20,40,180, 20);
		radButton23x.setOpaque(false);
		radButton23x.setHorizontalAlignment(JCheckBox.RIGHT);
		DecoReadCosProducts.contain2.feet2.add(radButton23x);
		group.add(radButton23x);
		
	}
}




