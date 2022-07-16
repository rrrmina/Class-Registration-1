package sugangSincheong;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PFooterPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	Font f = new Font("DX영화자막 M", Font.BOLD, 11);

	public PFooterPanel() {
		JLabel clabel = new JLabel("Copyrightⓒ MJU_객체적사고와 프로그래밍 All rights reserved.");
		clabel.setFont(f);
		this.add(clabel);
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}
}
