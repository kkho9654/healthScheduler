package health;
import java.util.Scanner;

public class PrivacyPage {
	Scanner sc = new Scanner(System.in);	
	public PrivacyPage(User user) {
		while(true) {
			show_imf(user);
			System.out.println("������ �����Ϸ��� 1��, ���� ȭ������ ���ư����� 2���� �Է����ּ���");
			System.out.println("1.���� 2.����ȭ��");
			int num = sc.nextInt();
			if (num==1) {
				regist_imf(user);
			}
			else if(num==2) {
				break;
			}
			else {
				System.out.println("�ùٸ��� ���� ���ڸ� �Է��߽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	void show_imf(User user) {
		System.out.println("�������� ������");
		System.out.println("-----------");
		System.out.println("�̸� : " + user.getName());	
		System.out.println("Ű : " + user.getHeight()+ "cm");	
		System.out.println("������ : " + user.getWeight()+ "kg");	
		System.out.println("BMI : " + user.getBMI());	
		System.out.println("ü���淮 : " + user.getFat() + "%");	
		System.out.println("������ : " + user.getMuscle()+"%");	
		System.out.println("-----------");
	}
	
	void regist_imf(User user) {
		System.out.println("��� �Է��� �������� �ۼ����ֽñ� �ٶ��ϴ�.");
		System.out.println("-----------");
		System.out.print("�̸� : ");	
		user.setName(sc.next());
		System.out.print("Ű : ");	
		user.setHeight(sc.nextInt());
		System.out.print("������ : ");	
		user.setWeight(sc.nextInt());
		System.out.print("BMI: ");	
		user.setBMI(sc.nextInt());
		System.out.print("ü���淮 : ");	
		user.setFat(sc.nextInt());
		System.out.print("������ : ");	
		user.setMuscle(sc.nextInt());
		System.out.println("-----------");
	}
}
