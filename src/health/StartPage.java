package health;

import java.util.ArrayList;
import java.util.Scanner;

public class StartPage {
	Scanner sc = new Scanner(System.in);	
	ArrayList<User> users = new ArrayList<User>();    	
	User user = new User();								
	public StartPage() 
	{
		while(true) {
		//showUser();
		System.out.println("-----------");
		System.out.println("1. 로그인 ");
		System.out.println("2. 회원가입 ");
		System.out.println("-----------");
		System.out.print(">>> ");
		int num = sc.nextInt();
		if(num == 1) {
			LoginPage lp = new LoginPage(users);		
			if (lp.getIs_login()==true) {				
				user = lp.getUser();					
				break;
			}
			else {										
				continue;
			}
			}
		else if(num == 2) {
			SignupPage sp = new SignupPage();
			users.add(sp.getUser());
			}
		else {
			System.out.println("올바르지 않은 번호를 입력했습니다. 다시입력해주세요");
		}
		}
	}
	User getUser() {
		return user;
	}

	/*void showUser() {
		for(int i=0; i<users.size(); i++) {
			users.get(i).showUser();
		}
	}*/

}
