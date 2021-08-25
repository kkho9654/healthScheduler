package healthScheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixUserInfoPage {
	static Scanner scan=new Scanner(System.in);
	static UserInfoPage userInfoPage=new UserInfoPage();

	public void fixUserInfoPage(String userName) {
		try {
			FileReader fr=new FileReader(".\\resource\\"+userName+"\\user-info.txt");
			BufferedReader br = new BufferedReader(fr);


			System.out.print("수정할 정보를 선택하세요 ex)이름>>");
			String info=scan.next();
			System.out.print("수정할 내용을 입력하세요 >>");
			scan.nextLine();
			String str=scan.nextLine();

			String line="";
			String old="";

			for(int i=0;(line = br.readLine())!=null;i++) {
				if(line.startsWith(info+":")) {
					line=info+":"+str;
				}
				old+=line+"\r\n";
			}
			br.close();

			FileWriter fw = new FileWriter(".\\resource\\"+userName+"\\user-info.txt");
			BufferedWriter write = new BufferedWriter(fw);

			write.write(old);
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("루틴 입력 완료");
		System.out.println();
		userInfoPage.userInfo(userName);
	}
}


