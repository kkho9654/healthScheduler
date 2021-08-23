package health;

import java.util.Scanner;

public class SignupPage {
	Scanner sc = new Scanner(System.in);
	User user;
	public SignupPage() {
		System.out.println("회원가입 페이지");
		System.out.println("-----------");
		System.out.print("원하는 아이디를 입력하세요: ");
		String id = sc.next();
		System.out.print("원하는 비밀번호를 입력하세요: ");
		String pw = sc.next();
		user= new User(id, pw);
	}
	User getUser() {
		return user;
	}
}
