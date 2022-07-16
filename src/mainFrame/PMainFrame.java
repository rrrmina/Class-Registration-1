package mainFrame;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import constants.Constants;
import mainFrame.Main.ActionHandler;
import sugangSincheong.PSugangSincheongPanel;
import valueObject.VUser;

public class PMainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private PMenuBar pMenuBar;
	private PToolBar pToolBar;
	private PSugangSincheongPanel pMainPanel;
	private WindowListener windowListener;
	
	// constructor
	public PMainFrame(ActionHandler actionHandler) {
		// set attributes
		setTitle("������û");
		this.setSize(
				Constants.EMainFrame.width.getInt()*2, 
				Constants.EMainFrame.height.getInt()
				);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.windowListener = new WindowHandler();
		this.addWindowListener(this.windowListener);
		this.setLayout(new BorderLayout());
		
		// create and register components
		this.pMenuBar = new PMenuBar();
		this.setJMenuBar(this.pMenuBar);		
		
		this.pToolBar = new PToolBar(actionHandler);
		this.add(this.pToolBar, BorderLayout.NORTH);
		
		this.pMainPanel = new PSugangSincheongPanel();
		this.add(this.pMainPanel, BorderLayout.CENTER);	
	}
	
	public void initialize(VUser vUser) {
		this.pMenuBar.initialize();
		this.pToolBar.initialize();
		this.pMainPanel.initialize(vUser);		
	}
	
	private void save() {
		this.pMainPanel.save();
	}
	
	private class WindowHandler implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			
		}

		@Override
		public void windowClosing(WindowEvent e) { //exit��ư
			save();
		}

		@Override
		public void windowClosed(WindowEvent e) { //������ ���� ����
			
		}

		@Override
		public void windowIconified(WindowEvent e) { //�۾�ǥ���ٿ� ����
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) { //�۾�ǥ����
			
		}

		@Override
		public void windowActivated(WindowEvent e) { //ȭ�� ���̱� 
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) { //ȭ�� ũ�� �ø��� 
			
		}
		
	}
}
