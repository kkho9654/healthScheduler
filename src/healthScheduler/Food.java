package healthScheduler;

import java.util.Scanner;

public class Food {
    Scanner sc = new Scanner(System.in);
    int body_fat;
    int muscle;
    int lost_fat;
    int add_mus;

    public Food(int body_fat, int muscle) {
        this.body_fat = body_fat;
        this.muscle = muscle;
    }

    public int getAdd_mus() {
        return add_mus;
    }

    public int getLost_fat() {
        return lost_fat;
    }

    public void current() {
        System.out.println("체지방량 : " + this.body_fat);
        System.out.println("골격근량 :" + this.muscle);
    }

    public void target() {
        System.out.println("원하시는 목표치를 설정해주세요");
        System.out.print("1.체지방량 감소 :");
        int bf = sc.nextInt();
        lost_fat = bf;
        System.out.print("2.골격근량 증가 :");
        int ms = sc.nextInt();
        add_mus = ms;
    }

    public void print() {
        System.out.println("---------------------------------------------");
        System.out.println("\t현재\t\t목표 ");
        System.out.println("골격근량 :" + this.body_fat + "---->" + (this.body_fat - getLost_fat()));
        System.out.println("체지방량 :" + this.muscle + "---->" + (this.muscle + getAdd_mus()));
    }

    public int food_time() {
        System.out.println("언제 식사를 하는지 선택해주세요 (3번 이상 필수) ");
        System.out.println("1.아침 2.늦은 아침 3.점심 4.늦은 점심 5.저녁 6.늦은 저녁");
        // parsing 작업
        String siksa = sc.next();
        siksa = siksa.replaceAll(" ", "");
        return siksa.length();
    }

    public void sikdan(int num, float weight) {
        System.out.println("본인의 활동량은 어떻습니까?(1.거의 앉아있음 2.회사원(활동 보통) 3.활동을 많이함)");
        float work = sc.nextFloat();
        System.out.println();
        float day_kcal = weight * 24 * work;
        float one_meal = day_kcal / num;
        System.out.println("일일 칼로리량 : " + day_kcal + "kcal=" + one_meal + "kcal X " + num);
    }
}

