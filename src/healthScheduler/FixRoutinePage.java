package healthScheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixRoutinePage {
	static Scanner scan=new Scanner(System.in);
	static AddRoutinePage addRooutinePage=new AddRoutinePage();
	public void fixRoutinePage(String userName) {
		
		try {
			FileReader fr=new FileReader(".\\resource\\"+userName+"\\schedule.txt");
			BufferedReader br = new BufferedReader(fr);
			
			System.out.print("수정할 요일을 선택하세요 ex)월>>");
			String day=scan.next();
			System.out.print("수정할 내용을 입력하세요 ex)운동이름 00kg 0set >>");
			scan.nextLine();
			String newRoutine=scan.nextLine();
			
			String line="";
			String old="";
			
			for(int i=0;(line = br.readLine())!=null;i++) {
				if(line.startsWith(day+"요일:")) {
					line=day+"요일:"+newRoutine;
				}
				old+=line+"\r\n";
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
        System.out.println("루틴 입력 완료");
        System.out.println();
        addRooutinePage.addRoutinePage(userName);
	}
}
