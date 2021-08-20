package health;

import java.util.ArrayList;
import java.util.Scanner;

public class StartPage {
	Scanner sc = new Scanner(System.in);	
	ArrayList<User> users = new ArrayList<User>();    	//��ü user���� ������ ���� Arraylist
	User user = new User();								//�α����ϰ��� �ϴ� user�� ����
	public StartPage() 
	{
		while(true) {
		//showUser();
		System.out.println("-----------");
		System.out.println("1. �α��� ");
		System.out.println("2. ȸ������ ");
		System.out.println("-----------");
		System.out.print(">>> ");
		int num = sc.nextInt();
		if(num == 1) {
			LoginPage lp = new LoginPage(users);		//��ü ������ ������ �Ű������� ����
			if (lp.getIs_login()==true) {				//���� �α����� �����Ѵٸ�
				user = lp.getUser();					//�α����ϰ��� �ϴ� user�� ������ �޾Ƽ� �������� ����
				break;
			}
			else {										//�α��ο� �����ϸ� �ٽ� �ݺ�
				continue;
			}
			}
		else if(num == 2) {
			SignupPage sp = new SignupPage();
			users.add(sp.getUser());
			}
		else {
			System.out.println("�ùٸ��� ���� ��ȣ�� �Է��߽��ϴ�. �ٽ��Է����ּ���");
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
