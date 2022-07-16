package sugangSincheong;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import valueObject.VUser;

public class PHeaderPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	Font f = new Font("DX��ȭ�ڸ� M", Font.PLAIN, 13);

	private JLabel welcomeLabel;
	private JLabel infoLabel;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	
	public PHeaderPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.welcomeLabel = new JLabel();
		welcomeLabel.setFont(f);
		this.add(this.welcomeLabel);
		this.infoLabel = new JLabel("                              "+"----------��������----------");
		infoLabel.setFont(f);
		this.add(this.infoLabel);
		this.l1 = new JLabel();
		l1.setFont(f);
		this.add(this.l1);
		this.l2 = new JLabel();
		l2.setFont(f);
		this.add(this.l2);
		this.l3 = new JLabel();
		l3.setFont(f);
		this.add(this.l3);
		this.l4 = new JLabel();
		l4.setFont(f);
		this.add(this.l4);
		this.l5 = new JLabel();
		l5.setFont(f);
		this.add(this.l5);
	}
	public void initialize(VUser vUser) {
		this.welcomeLabel.setText("                              "+vUser.getName()+"�� �ȳ��ϼ���.");
		this.l1.setText("                              "+"�̸� : "+vUser.getName());
		this.l2.setText("                              "+"�й� : "+vUser.getHakbeon());
		this.l3.setText("                              "+"�а� : "+vUser.getMajor());
		this.l4.setText("                              "+"�г� : "+vUser.getGrade());
		this.l5.setText("                              "+"�ּ� : "+vUser.getAddress());
	}
}
