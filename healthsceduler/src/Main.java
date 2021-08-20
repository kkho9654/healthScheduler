import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Profile person = new Profile();
        System.out.println("메뉴를 입력해주세요");
        int menu = sc.nextInt();
        if (menu == 1) {

        } else if (menu == 2) {

        } else if (menu == 3) {
            Food fd = new Food(person.getMuscle(), person.getBody_fat());
            fd.print();
            fd.target();
            fd.print();
        } else if (menu == 4) {

        } else {

        }
    }
}
