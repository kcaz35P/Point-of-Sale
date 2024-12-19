package animeMerchandise;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUIFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	GUIFrame(){
		this.setTitle("Anime Merchandise");
		this.setSize(1280,720);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		Image ShohinLogo = new ImageIcon(this.getClass().getResource("/Shohin Logo.png")).getImage();
		this.setIconImage(ShohinLogo);
		this.getContentPane().setBackground(Color.green);

	}
	
}
