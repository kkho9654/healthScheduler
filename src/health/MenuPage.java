package health;
import java.util.Scanner;

public class MenuPage {
	Scanner sc = new Scanner(System.in);
	public MenuPage() {
		StartPage sp = new StartPage();
		User user = sp.getUser();
		while(true) {
			System.out.println("-----------");
			System.out.println("1. 개인정보관리 ");
			System.out.println("2. 루틴입력 ");
			System.out.println("3. 식단추천 ");
			System.out.println("4. 스케줄 관리 및 성취도 평가 ");
			System.out.println("-----------");
			System.out.print(">>> ");
			int num = sc.nextInt();
			if(num == 1) {
				PrivacyPage pp = new PrivacyPage(user);
				}
			else if(num == 2) {
				break;
				}
			else if(num == 3){
			}
			else if(num==4) {
			}
			else {
				System.out.println("올바르지 않은 번호를 입력했습니다. 다시입력해주세요..");
			}
			}
	}
}
