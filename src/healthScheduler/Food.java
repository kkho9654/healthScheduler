package healthScheduler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Food {
    Scanner sc = new Scanner(System.in);
    double height; //키
    double weight; //몸무게
    double body_fat; //체지방
    double muscle; //근육량
    
    double lose_fat;
    double add_mus;
    int meal_time; //식사 횟수
    double daily_k; //하루 칼로리
    public void  foodRoutine(String userName) {
		try {
			FileReader fr;
			fr = new FileReader(".\\resource\\"+userName+"\\user-info.txt");
			BufferedReader br=new BufferedReader(fr);
			String line="";
			for(int i=0;(line = br.readLine())!=null;i++) {
				if(line.startsWith("키:")) {
					String[] temp = line.split(":");
					height=Double.parseDouble(temp[1]);
				}
				else if(line.startsWith("몸무게:")) {
					String[] temp=line.split(":");
					weight=Double.parseDouble(temp[1]);
				}
				else if(line.startsWith("체지방량:")) {
					String[] temp=line.split(":");
					body_fat=Double.parseDouble(temp[1]);
				}
				else if(line.startsWith("골격근량:")) {
					String[] temp=line.split(":");
					muscle=Double.parseDouble(temp[1]);
				}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		current(); // 현재 상태
		target(); // 목표
		System.out.println();
		food_time(); // 식사 횟수
		work(); // 활동량 계산
		sikdan(); // 식단
    }

    public void current() {
        System.out.println("체지방량 : " + this.body_fat);
        System.out.println("골격근량 :" + this.muscle);
    }

    public void target() {
        System.out.println("원하시는 목표치를 설정해주세요");
        // 체지방량, 골격근량 예시 보여주기
        System.out.print("1.체지방량 감소 :");
        double bf = sc.nextDouble();
        lose_fat = bf;
        System.out.print("2.골격근량 증가 :");
        double ms = sc.nextDouble();
        add_mus = ms;
        System.out.println("---------------------------------------------");
        System.out.println("\t\t 현재\t\t목표 ");
        System.out.println("체지방량 :" + this.body_fat + "------>" + (this.body_fat - lose_fat));
        System.out.println("골격근량 :" + this.muscle + "------>" + (this.muscle + add_mus));
        System.out.println("---------------------------------------------");
    }
    
    public void ideal() {
    	// 이상적인 키, 몸무게에 따른 골격근량과 체지방량 계산
    }
    
    public void exercise_time() {
    	// System.out.println("일주일에 몇 번 운동할 계획이신가요?");
    	// schedule 표의 line수만큼 가져온다?
    }
    
    public void food_time() {
        System.out.println("언제 식사를 하는지 선택해주세요 (하루 3끼니 이상 드셔야 합니다!) ");
        System.out.println("1.아침 2.늦은 아침 3.점심 4.늦은 점심 5.저녁 6.늦은 저녁");
        // parsing 작업 -> 숫자로 그냥 받을것인가, 문자열로?
        String buffer = sc.nextLine();
        String temp = sc.nextLine();
        String[] siksa = temp.split(" ");
        meal_time=siksa.length;
    }

    public void work() { // 활동량에 따른 식단
        System.out.println("본인의 활동량은 어떻습니까? (1.매우 적은 활동(수험생) 2.가벼운 활동(사무실 직장인) 3.많은 활동)");
        int work = sc.nextInt(); // 활동계수
        if(work==1) {
        	daily_k=weight*1.3*24;
        }
        else if (work==2) {
        	daily_k=weight*1.5*24;
        }
        else if(work==3) {
        	daily_k=weight*1.7*24;
        }
        System.out.println();
    }
    public void sikdan() {
    	double num = meal_time;
        double one_meal = daily_k / meal_time;
        System.out.println("일일 칼로리량 : " + daily_k + " kcal=" + one_meal + "kcal X " + meal_time);
        System.out.println();
        // 탄수화물, 단백질, 지방 몇g 필요한지 계산....
        System.out.println("탄수화물 119g 섭취 필요");
        System.out.println("(사과 , 고구마,  바나나 )");
        System.out.println("단백질 42g 섭취 필요");
        System.out.println("(연어,  닭가슴살, 계란)");
        System.out.println("지방 23g 섭취 필요");
        System.out.println("(아몬드, 올리브유)");
    }
}

