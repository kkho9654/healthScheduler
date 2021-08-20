package health;
import java.util.Scanner;

public class PrivacyPage {
	Scanner sc = new Scanner(System.in);	
	public PrivacyPage(User user) {
		while(true) {
			show_imf(user);
			System.out.println("정보를 수정하려면 1번, 메인 화면으로 돌아가려면 2번을 입력해주세요");
			System.out.println("1.수정 2.메인화면");
			int num = sc.nextInt();
			if (num==1) {
				regist_imf(user);
			}
			else if(num==2) {
				break;
			}
			else {
				System.out.println("올바르지 않은 숫자를 입력했습니다. 다시 입력해주세요");
			}
		}
	}
	
	void show_imf(User user) {
		System.out.println("개인정보 페이지");
		System.out.println("-----------");
		System.out.println("이름 : " + user.getName());	
		System.out.println("키 : " + user.getHeight()+ "cm");	
		System.out.println("몸무게 : " + user.getWeight()+ "kg");	
		System.out.println("BMI : " + user.getBMI());	
		System.out.println("체지방량 : " + user.getFat() + "%");	
		System.out.println("근육량 : " + user.getMuscle()+"%");	
		System.out.println("-----------");
	}
	
	void regist_imf(User user) {
		System.out.println("모든 입력은 단위없이 작성해주시기 바랍니다.");
		System.out.println("-----------");
		System.out.print("이름 : ");	
		user.setName(sc.next());
		System.out.print("키 : ");	
		user.setHeight(sc.nextInt());
		System.out.print("몸무게 : ");	
		user.setWeight(sc.nextInt());
		System.out.print("BMI: ");	
		user.setBMI(sc.nextInt());
		System.out.print("체지방량 : ");	
		user.setFat(sc.nextInt());
		System.out.print("근육량 : ");	
		user.setMuscle(sc.nextInt());
		System.out.println("-----------");
	}
}
