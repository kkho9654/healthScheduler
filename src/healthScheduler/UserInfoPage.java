package healthScheduler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInfoPage {
	static FixUserInfoPage FixUserInfoPage=new FixUserInfoPage();
	
	public void userInfo(String userName) {
		try {
			FileReader fr = new FileReader(".\\resource\\"+userName+"\\user-info.txt");
			BufferedReader br=new BufferedReader(fr);
			
			System.out.println("User-information");
			System.out.println("----------------------");
			String line="";
			for(int i=0;(line =br.readLine() )!=null;i++) {
				System.out.println(line);
			}
			System.out.println("----------------------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("1. 개인정보수정");
		System.out.println("2. 메인메뉴");
		System.out.print(">>");
		int tmp=sc.nextInt();
		if(tmp==1)
			FixUserInfoPage.fixUserInfoPage(userName);
		else if(tmp==2) {
			//메인메뉴 출력
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
}
