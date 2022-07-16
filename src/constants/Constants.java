package constants;

public class Constants {

	public enum EConfiguration{
		rootFileName("root"),
		miridamgiFilePostfix("M"),
		sincheongFilePostfix("S");
		
		private String text;

		private EConfiguration(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}

	public enum ELoginDialog {
		width("300"),
		height("200"),
		nameLabel(" ���̵�   "),
		sizeNameText("10"),
		passwordLabel("��й�ȣ"),
		sizePasswordText("10"),
		okButtonLabel("ok"),
		cancelButtonLabel("cancel"),
		noAccountInfo("ȸ�� ������ ���� ���� ����"),
		LoginFailed("���̵� ��й�ȣ�� �ٸ��ϴ�.");
		
		private String text;
		
		private ELoginDialog(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}

	
	public enum EMainFrame {
		width("600"),
		height("800");
		
		private String text;
		
		private EMainFrame(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
	
	public enum EMenuBar {
		FILE("����"),
		EDIT("����");
		
		private String text;
		
		private EMenuBar(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EFileMenu {
		NEW("����"),
		OPEN("����"),
		SAVE("����"),
		SAVEAS("�ٸ��̸�����"),
		PRINT("����Ʈ"),
		EXIT("����");
		
		private String text;
		
		private EFileMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EEditMenu {
		COPY("����"),
		CUT("�ڸ���"),
		PASTE("�ٿ��ֱ�"),
		DELETE("����");
		
		private String text;
		
		private EEditMenu(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EDirectory{
		campus("ķ�۽�"),
		college("����"),
		hakgwa("�а�");
		
		private String text;
		
		private EDirectory(String text) {
			this.text = text;
		}
		
		public String getText() {
			return this.text;
		}
	}
	
	public enum EPGangjwaSelection{
		gangjwaNo("���¹�ȣ"),
		gangjwaName("���¸�"),
		damdangGyosu("��米��"),
		hakjeom("����"),
		time("�ð�");
		
		private String text;
		
		private EPGangjwaSelection(String text) {
			this.text = text;
		}
		
		public String getText() {
			return this.text;
		}
	}
	
	public enum EPResult{
		gangjwaNo("���¹�ȣ"),
		gangjwaName("���¸�");
		
		private String text;
		
		private EPResult(String text) {
			this.text = text;
		}
		
		public String getText() {
			return this.text;
		}
	}
	
}
