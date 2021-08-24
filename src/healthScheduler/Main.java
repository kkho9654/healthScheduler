package healthScheduler;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile person = new Profile();
		Scanner sc = new Scanner(System.in);
        System.out.println("메뉴를 선택해주세요");
        int menu = sc.nextInt();
        if (menu == 1) {
        	AddRoutinePage a=new AddRoutinePage();
    		a.addRoutinePage("usertest");
        } else if (menu == 2) {
        	UserInfoPage a=new UserInfoPage();
    		a.userInfo("usertest");
        } else if (menu == 3) {
            Food fd = new Food(person.getMuscle(), person.getBody_fat());
            fd.current();
            fd.target();
            fd.print();
            fd.sikdan(fd.food_time(), person.weight);
        } else if (menu == 4) {

        } else {

        }
        
		
	}

}
