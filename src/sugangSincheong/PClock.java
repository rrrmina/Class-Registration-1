package sugangSincheong;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PClock extends JFrame implements Runnable{
	public String now;
	private Thread thread;
	private JLabel l1;
	public PClock(){
		
		Font font = new Font("digital-7", Font.BOLD, 17);
		l1 = new JLabel();
		l1.setFont(font);
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}
		add(l1);
		setBounds(100,100,300,110);
		setVisible(true);

	}
	public static void main(String[] args) {
		new PClock();
	}
	public void run(){
		while(true){
			Calendar cal = Calendar.getInstance();
			int amPm = cal.get(Calendar.AM_PM);
			String ampm=amPm==Calendar.AM? "PM":"AM";
			 now = cal.get(Calendar.YEAR)+"."+
					(cal.get(Calendar.MONTH)+1)+"."+
					cal.get(Calendar.DATE)+" "+ampm+ " "+
					cal.get(Calendar.HOUR)+":"+
					cal.get(Calendar.MINUTE)+":"+
					cal.get(Calendar.SECOND);
			l1.setText("                  "+now);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

