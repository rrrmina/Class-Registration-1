package model;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class MModel {

	public MModel() {
		
	}
	public String read(Scanner scanner) {
		String key = null;
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for(Field field: fields) {
				String fieldValue = scanner.next();
				field.setAccessible(true);
				field.set(this, fieldValue);
//				System.out.println(field.getName());//내 객체에서 클래스에 관한 이 필드에 관한 값을 가져와야함 
			}	
			key = (String) fields[0].get(this); //내 객체의 0번째 필드 값을 가져와라
		}catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
		}
		return key;
	}

	public void save(FileWriter fileWriter) {
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for(Field field: fields) {
				field.setAccessible(true);
				fileWriter.write(field.get(this) +" ");
//				System.out.println(field.getName());//내 객체에서 클래스에 관한 이 필드에 관한 값을 가져와야함 
			}
			fileWriter.write("\n");
			
		}catch (IllegalArgumentException | IllegalAccessException | IOException e) {
				e.printStackTrace();
		}
	}
}
