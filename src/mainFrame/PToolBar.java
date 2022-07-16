package mainFrame;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

import mainFrame.Main.ActionHandler;
import sugangSincheong.PClock;


public class PToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public PToolBar(ActionHandler actionHandler) {
		Font f = new Font("DX��ȭ�ڸ� M", Font.PLAIN, 13);
		ImageIcon mju = new ImageIcon("img/������.jpg");
		//components

		JLabel l1 = new JLabel(mju);
		this.add(l1);
		JButton button2 = new JButton("������û");
		button2.setFont(f);
		this.add(button2);	
		JButton button3 = new JButton("�̸������");
		button3.setFont(f);
		this.add(button3);	
		JButton button4 = new JButton("�ð�Ȯ��");
		button4.setFont(f);
		button4.addActionListener(new ActionListener(){
			private PClock dc;
			public void actionPerformed(ActionEvent e){
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("�ð�Ȯ��"))
					this.dc = new PClock();
			}
		});
		this.add(button4);	
		JButton button5 = new JButton("Ȩ������");
		button5.setFont(f);
		button5.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("Ȩ������"))
					try { 
						Desktop.getDesktop().browse(new URI("https://www.mju.ac.kr/mjukr/index.do")); 
						} 
					catch (IOException e1) { e1.printStackTrace(); } 
					catch (URISyntaxException e2) { e2.printStackTrace(); } 
			}
		});
		this.add(button5);
	
		
		
        
	}

	public void initialize() {
	}

	
}
