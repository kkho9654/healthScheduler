package health;
import java.util.Scanner;

public class MenuPage {
	Scanner sc = new Scanner(System.in);
	public MenuPage() {
		StartPage sp = new StartPage();
		User user = sp.getUser();
		while(true) {
			System.out.println("-----------");
			System.out.println("1. ������������ ");
			System.out.println("2. ��ƾ�Է� ");
			System.out.println("3. �Ĵ���õ ");
			System.out.println("4. ������ ���� �� ���뵵 �� ");
			System.out.println("-----------");
			System.out.print(">>> ");
			int num = sc.nextInt();
			if(num == 1) {
				PrivacyPage pp = new PrivacyPage(user);
				}
			else if(num == 2) {
				// ��ƾ�Է� �Լ�
				break;
				}
			else if(num == 3){
				// �Ĵ���õ �Լ�
			}
			else if(num==4) {
				//������ ���� �� ���뵵 �� �Լ�
			}
			else {
				System.out.println("�ùٸ��� ���� ��ȣ�� �Է��߽��ϴ�. �ٽ��Է����ּ���.");
			}
			}
	}
}
