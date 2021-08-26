package healthScheduler;

import java.util.Scanner;

public class MenuPage {
	Scanner sc = new Scanner(System.in);
	public MenuPage() {
		StartPage sp = new StartPage();
		while(true) {
			System.out.println("-----------");
			System.out.println("1. 개인정보관리 ");
			System.out.println("2. 루틴입력 ");
			System.out.println("3. 식단추천 ");
			System.out.println("4. 스케줄 관리 및 성취도 평가 ");
			System.out.println("-----------");
			System.out.print(">>> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
	        	UserInfoPage a=new UserInfoPage();
	    		a.userInfo("usertest");
	        } 
			else if (menu == 2) {
	        	AddRoutinePage a=new AddRoutinePage();
	    		a.addRoutinePage("usertest");
	        } 
			else if (menu == 3) {
	            Food fd = new Food();
	            fd.foodRoutine("usertest") ;
	        } 
			else if (menu == 4) {
				//함수추가
	        }
			else {
				System.out.println("올바르지 않은 번호를 입력했습니다. 다시입력해주세요..");
			}
		}
	}
}
