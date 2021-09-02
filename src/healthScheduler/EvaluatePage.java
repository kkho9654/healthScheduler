package healthScheduler;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EvaluatePage {
	String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	static FixEvaluatePage FixEvaluatePage=new FixEvaluatePage();
	
	
	public void evaluate(String userName) {
		Scanner sc = new Scanner(System.in);
		int eval = 0;
		int count = 0;
		String check_routine;
		String check_eval;
		try {
			FileReader fr = new FileReader(".\\resource\\"+userName+"\\schedule.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println("성취도 평가 페이지");
			System.out.println("----------------------");
			String line=br.readLine();
			for(int i=0;line!=null;i++) {
				System.out.println(days[i].charAt(0) +" : " +line);
				StringTokenizer st = new StringTokenizer(line, "/");
				check_routine= st.nextToken();
				if (!check_routine.equals(" ")) 
				{
				StringTokenizer st2 = new StringTokenizer(check_routine, ",");
				count += st2.countTokens();
				check_eval= st.nextToken();
				check_eval = check_eval.replaceAll("[^0-9]", "");
				eval += Integer.parseInt(check_eval) * st2.countTokens();
				}
				line = br.readLine();
			}
			System.out.println("----------------------");
			System.out.println("이번주 달성률 : " +eval/count + "%");
			System.out.println("1. 성취도평가 2. 메인화면");
			System.out.print(">>> ");
			int tmp=sc.nextInt();
			if(tmp==1) {
				FixEvaluatePage.fixEvaluate(userName);
				}
			else if(tmp==2) {
				//메인메뉴 출력
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
