package healthScheduler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AddRoutinePage {
	static FixRoutinePage FixRoutinePage=new FixRoutinePage();
	
	public void addRoutinePage(String userName) {
		try {
			FileReader fr=new FileReader(".\\resource\\"+userName+"\\schedule.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println("루틴입력페이지");
			System.out.println("----------------------");
			
			String line="";
			for(int i=0;(line = br.readLine())!=null;i++) {
				System.out.println(line);
			}
			System.out.println("----------------------");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("1. 루틴수정");
		System.out.println("2. 메인메뉴");
		System.out.print(">>");
		int tmp=sc.nextInt();
		if(tmp==1)
			FixRoutinePage.fixRoutinePage(userName);
		else if(tmp==2) {
			//메인메뉴 출력
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
}
