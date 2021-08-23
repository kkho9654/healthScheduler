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
		System.out.println("로그인페이지");
		System.out.println("-----------");
		System.out.print("id --> ");
		id = sc.next();
		System.out.print("pw --> ");
		pw = sc.next(); 
		if (users.isEmpty()) {
			System.out.println("올바르지 않은 아이디입니다. 다시시도해주세요");
		}
		
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				if(users.get(i).getPw().equals(pw)) {
					System.out.println("로그인에 성공하였습니다. 환영합니다");
					is_login=true;
					user = users.get(i);
					break;
					}	
				else {
					System.out.println("비밀번호가 틀렸습니다. 다시시도해주세요");
				}
			}
			else {
				System.out.println("올바르지 않은 아이디입니다. 다시시도해주세요");
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
