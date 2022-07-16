package model;

import java.util.ArrayList;

import valueObject.VUser;

public class MUser extends MModel {
	private String userId;
	private String name;
	private String address;
	private String Hakbeon;
	private String major;
	private String grade;
	
	public MUser() {
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
		return Hakbeon;
	}
	public String getMajor() {
		return major;
	}
	public String getGrade() {
		return grade;
	}

}
