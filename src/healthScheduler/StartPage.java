package healthScheduler;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StartPage {
	Scanner sc = new Scanner(System.in);	
	String username;
	public StartPage() 
	{
		while(true) {
		System.out.println("-----------");
		System.out.println("1. 로그인 ");
		System.out.println("2. 회원가입 ");
		System.out.println("-----------");
		System.out.print(">>> ");
		int num = sc.nextInt();
		if(num == 1) {
			LoginPage lp = new LoginPage();		
			if (lp.getIs_login()==true) {				
				username = lp.get_username();				
				break;
			}
			else {										
				continue;
			}
			}
		else if(num == 2) {
			SignupPage sp = new SignupPage();
			
			}
		else {
			System.out.println("올바르지 않은 번호를 입력했습니다. 다시입력해주세요");
		}
		}
	}

}
