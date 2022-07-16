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
//				System.out.println(field.getName());//�� ��ü���� Ŭ������ ���� �� �ʵ忡 ���� ���� �����;��� 
			}	
			key = (String) fields[0].get(this); //�� ��ü�� 0��° �ʵ� ���� �����Ͷ�
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
//				System.out.println(field.getName());//�� ��ü���� Ŭ������ ���� �� �ʵ忡 ���� ���� �����;��� 
			}
			fileWriter.write("\n");
			
		}catch (IllegalArgumentException | IllegalAccessException | IOException e) {
				e.printStackTrace();
		}
	}
}
