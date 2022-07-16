package valueObject;

public class VUser {
	private String userId;
	private String name;
	private String address;
	private String hakbeon;
	private String major;
	private String grade;
	
	public VUser(String userId, String name, String address, String hakbeon, String major, String grade) {
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.hakbeon = hakbeon;
		this.major = major;
		this.grade = grade;
	}

	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getHakbeon() {
		return hakbeon;
	}
	public String getMajor() {
		return major;
	}
	public String getGrade() {
		return grade;
	}
}
