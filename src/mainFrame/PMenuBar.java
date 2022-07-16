package mainFrame;
import java.awt.Font;

import javax.swing.JMenuBar;

public class PMenuBar extends JMenuBar {
	Font f = new Font("DX영화자막 M", Font.PLAIN, 13);
	private static final long serialVersionUID = 1L;

	private PFileMenu pFileMenu;
	private PEditMenu pEditMenu;
	
	public PMenuBar() {
		// create and register components
		this.pFileMenu = new PFileMenu();
		pFileMenu.setFont(f);
		this.add(pFileMenu);
		
		this.pEditMenu = new PEditMenu();
		pEditMenu.setFont(f);
		this.add(pEditMenu);
	}

	public void initialize() {
		this.pFileMenu.initialize();
		this.pEditMenu.initialize();		
	}
}
