package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import valueObject.VGangjwa;

public class MGangjwa extends MModel {

	//필드
	private String id; 
	private String name;
	private String lecturer;
	private String credit;
	private String time;
	
	public MGangjwa() {
	}
	
	
public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}


	//	
//	public String read(Scanner scanner) { //클래스가 갖고 있는 필드값을 순서대로 하나씩 집어넣고 있음(스캐너로 필드 값을 순서대로 읽음)
//		this.id = scanner.next();
//		this.name = scanner.next();
//		this.lecturer = scanner.next();
//		this.credit = scanner.next();
//		this.time = scanner.next();
//		return this.id;
//	}
//	
	
}
