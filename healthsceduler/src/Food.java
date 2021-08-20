import java.util.Scanner;

public class Food { // 식단 추천 페이지
    Scanner sc = new Scanner(System.in);
    int body_fat;
    int muscle;

    public Food(int body_fat, int muscle) {
        this.body_fat = body_fat;
        this.muscle = muscle;
    }

    public void current() {
        System.out.println("현재 체지방량 : " + this.body_fat);
        System.out.println("현재 근육량 :" + this.muscle);
    }

    public void target() {
        System.out.println("원하는 목표를 설정해주세요");
        System.out.print("1.체지방량 감소 :");
        int bf = sc.nextInt();
        body_fat = bf;
        System.out.print("2.골격근량 증가 :");
        int ms = sc.nextInt();
        muscle = ms;
    }

    public void print() {
        System.out.println("체지방량 :" + this.body_fat);
        System.out.println("골격근량 :" + this.muscle);
    }
}
