package health;

import java.util.Scanner;

public class SignupPage {
	Scanner sc = new Scanner(System.in);
	User user;
	public SignupPage() {
		System.out.println("ȸ������ ������");
		System.out.println("-----------");
		System.out.print("���ϴ� ���̵� �Է��ϼ���: ");
		String id = sc.next();
		System.out.print("���ϴ� ��й�ȣ�� �Է��ϼ���: ");
		String pw = sc.next();
		user= new User(id, pw);
	}
	User getUser() {
		return user;
	}
}
