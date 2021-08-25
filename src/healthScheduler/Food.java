package healthScheduler;

import java.util.Scanner;

public class Food {
    Scanner sc = new Scanner(System.in);
    int body_fat;
    int muscle;
    int lost_fat;
    int add_mus;

    float workout;
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
        System.out.println("\t\t현재\t\t목표 ");
        System.out.println("체지방량 :" + this.body_fat + "------>" + (this.body_fat - getLost_fat()));
        System.out.println("골격근량 :" + this.muscle + "------>" + (this.muscle + getAdd_mus()));
    }
 
//    public void exercise_time() {
//    	System.out.println("일주일에 몇 번 운동할 계획이신가요");
//    }
    
    public int food_time() {
        System.out.println("언제 식사를 하는지 선택해주세요 (하루 3끼니 이상 드셔야 합니다!) ");
        System.out.println("1.아침 2.늦은 아침 3.점심 4.늦은 점심 5.저녁 6.늦은 저녁");
        // parsing 작업
        String siksa = sc.next();
        siksa = siksa.replaceAll(" ", "");
        return siksa.length();
    }

    public void sikdan(int num, float weight) {
        System.out.println("본인의 활동량은 어떻습니까?(1.매우 적은 활동(수험생) 2.가벼운 활동(사무실 직장인) 3.많은 활동)");
        int work = sc.nextInt();
        //1.3 , 1.5 , 1.7
        if(work==1) {
        	workout=(float)1.3;
        }
        else if (work==2) {
        	workout=(float) 1.5;
        }
        else if(work==3) {
        	workout=(float)1.7;
        }
        System.out.println();
		float day_kcal = weight * 24 * work;
        float one_meal = day_kcal / num;
        System.out.println("일일 칼로리량 : " + day_kcal + "kcal=" + one_meal + "kcal X " + num);
    }
}

