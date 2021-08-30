package healthScheduler;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixEvaluatePage {
	static EvaluatePage evaluate=new EvaluatePage();
	String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	
	public void fixEvaluate(String userName) {
		Scanner sc = new Scanner(System.in);
		String check_routine;
		String get_eval;
		String old="";
		int eval_sum = 0;
		int count;
		System.out.println("----------------------");
		System.out.print("성취도평가 하고자 하는 요일을 선택해주세요(ex. 화요일) : ");
		String day =sc.next();
		try {
			FileReader fr = new FileReader(".\\resource\\"+userName+"\\schedule.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			for(int i=0; line!=null; i++) {
				if(day.equals(days[i])) {
					StringTokenizer st = new StringTokenizer(line, "/");
					check_routine= st.nextToken();
					if (check_routine.equals(" ")) 
					{
						System.out.println("등록된 루틴이 존재하지 않습니다. 루틴을 추가해주세요.");
						old+=line+"\r\n";
					}
					else {
						old += check_routine;
						StringTokenizer st2 = new StringTokenizer(check_routine, ",");
						count = st2.countTokens();
						while(st2.hasMoreTokens()) {
							System.out.print("\""+st2.nextToken()+"\"의 성취도를 평가해주세요(ex. 70%) : ");
							get_eval = sc.next();
							get_eval = get_eval.replaceAll("[^0-9]", "");
							eval_sum += Integer.parseInt(get_eval); 
						}
						System.out.println("----------------------");
						System.out.println(day+" 달성률 : " + eval_sum/count);
						old+="/"+ (eval_sum/count) +"%\r\n";
						System.out.println("루틴 입력 완료");
					}
				}
				else 
				{
					old+=line+"\r\n";
				}
				line = br.readLine();
			}
			br.close();
			
			FileWriter fw = new FileWriter(".\\resource\\"+userName+"\\schedule.txt");
			BufferedWriter write = new BufferedWriter(fw);
			
			write.write(old);
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        evaluate.evaluate(userName);
        
	}
}
