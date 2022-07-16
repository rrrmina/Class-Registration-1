package mainFrame;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constants.Constants.ELoginDialog;
import control.CLogin;
import control.CUser;
import mainFrame.Main.ActionHandler;
import valueObject.VLogin;
import valueObject.VUser;

public class PLoginDialog extends JDialog {
	Font f = new Font("DX영화자막 M", Font.PLAIN, 13);
	//attributes
	private static final long serialVersionUID = 1L;

	//components 
	private JLabel userIdLabel;
	private JTextField UserIdTextField;
	private JLabel passwordLabel;
	private JTextField passwordTextField;
	private JButton okButton;
	private JButton cancelButton;
	
	//control
	private CLogin cLogin;
	private CUser cUser;
		
	
	public PLoginDialog(ActionHandler actionHandler) {
		//attributes 
		
		setTitle("Login");
		this.setSize(ELoginDialog.width.getInt(), ELoginDialog.height.getInt());
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.setLayout(new FlowLayout());
		
		ImageIcon mju = new ImageIcon("img/명지로고.jpg");
		ImageIcon h = new ImageIcon("img/하트.png");
		ImageIcon h2 = new ImageIcon("img/깨진하트.png");
		//components

		JLabel l1 = new JLabel(mju);
		this.add(l1);
		
		JLabel l2 = new JLabel("명지대 수강신청");
		this.add(l2);
		l2.setFont(f);
		
		JPanel line1 = new JPanel();
			this.userIdLabel = new JLabel(ELoginDialog.nameLabel.getText());
			line1.add(this.userIdLabel);	
			userIdLabel.setFont(f);
			this.UserIdTextField = new JTextField("아이디",ELoginDialog.sizeNameText.getInt());
			line1.add(this.UserIdTextField);
		this.add(line1);
		JPanel line2 = new JPanel();
			this.passwordLabel = new JLabel(ELoginDialog.passwordLabel.getText());
			line2.add(this.passwordLabel);
			passwordLabel.setFont(f);
			this.passwordTextField = new JPasswordField("비밀번호",ELoginDialog.sizePasswordText.getInt());
			line2.add(this.passwordTextField);
		this.add(line2);
		JPanel line3 = new JPanel();
			this.okButton = new JButton(ELoginDialog.okButtonLabel.getText(),h);
			okButton.setFont(f);
			this.okButton.addActionListener(actionHandler);
			this.okButton.setActionCommand(this.okButton.getText());
			this.getRootPane().setDefaultButton(this.okButton);
			line3.add(this.okButton);		
			
			this.cancelButton = new JButton(ELoginDialog.cancelButtonLabel.getText(),h2);
			cancelButton.setFont(f);
			this.cancelButton.addActionListener(actionHandler);
			this.cancelButton.setActionCommand(this.cancelButton.getText());
			line3.add(this.cancelButton);
		this.add(line3);
		
		//control
		this.cLogin = new CLogin();
		this.cUser = new CUser();
	}
	
	public void initialize() {
		
	}	

	public VUser validateUser(String actionCommand) {
		VUser vUser = null;
		if (actionCommand.contentEquals(this.okButton.getText())) {
			VLogin vLogin = new VLogin(this.UserIdTextField.getText(), this.passwordTextField.getText());	
			boolean bLoginSuccess = this.cLogin.validate(vLogin);			
			if (bLoginSuccess) {
				vUser = this.cUser.getUser(vLogin.getUserId());			
				if (vUser == null) {
					
					JOptionPane.showMessageDialog(this, ELoginDialog.noAccountInfo.getText());
				}
			} else {
				
				JOptionPane.showMessageDialog(this, ELoginDialog.LoginFailed.getText());
			}
		}
		return vUser;
	}

}
