package health;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {
	Scanner sc = new Scanner(System.in);
	String id;
	String pw;
	User user;
	boolean is_login = false;
	public LoginPage(ArrayList<User> users) {
		// TODO Auto-generated constructor stub
		System.out.println("�α���������");
		System.out.println("-----------");
		System.out.print("id --> ");
		id = sc.next();
		System.out.print("pw --> ");
		pw = sc.next(); 
		if (users.isEmpty()) {
			System.out.println("�ùٸ��� ���� ���̵��Դϴ�. �ٽýõ����ּ���");
		}
		
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				if(users.get(i).getPw().equals(pw)) {
					System.out.println("�α��ο� �����Ͽ����ϴ�. ȯ���մϴ�");
					is_login=true;
					user = users.get(i);
					break;
					}	
				else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽýõ����ּ���");
				}
			}
			else {
				System.out.println("�ùٸ��� ���� ���̵��Դϴ�. �ٽýõ����ּ���");
			}
		}

	}
	boolean getIs_login() {
		return is_login;
	}
	
	User getUser() {
		return user;
	}
	
}
