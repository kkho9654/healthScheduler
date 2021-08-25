package healthScheduler;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("메뉴를 선택해주세요");
        int menu = sc.nextInt();
        if (menu == 1) {
        	UserInfoPage a=new UserInfoPage();
    		a.userInfo("usertest");
        } else if (menu == 2) {
        	AddRoutinePage a=new AddRoutinePage();
    		a.addRoutinePage("usertest");
        } else if (menu == 3) {
            Food fd = new Food();
            fd.foodRoutine("usertest") ;
        } else if (menu == 4) {

        } else {

        }
        
		
	}

}
