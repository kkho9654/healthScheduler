package health;

import java.util.ArrayList;
import java.util.Scanner;

public class StartPage {
	Scanner sc = new Scanner(System.in);	
	ArrayList<User> users = new ArrayList<User>();    	//전체 user들의 정보를 넣은 Arraylist
	User user = new User();								//로그인하고자 하는 user의 정보
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
			LoginPage lp = new LoginPage(users);		//전체 유저의 정보를 매개변수로 받음
			if (lp.getIs_login()==true) {				//만약 로그인이 성공한다면
				user = lp.getUser();					//로그인하고자 하는 user의 정보를 받아서 저장한후 정지
				break;
			}
			else {										//로그인에 실패하면 다시 반복
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
