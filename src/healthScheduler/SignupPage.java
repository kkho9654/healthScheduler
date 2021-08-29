package healthScheduler;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SignupPage {
	Scanner sc = new Scanner(System.in);
	boolean is_ok = true;
	public SignupPage() {
		System.out.println("회원가입 페이지");
		System.out.println("-----------");
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("원하는 아이디를 입력하세요: ");
		String id = sc.next();
		System.out.print("원하는 비밀번호를 입력하세요: ");
		String pw = sc.next();
		try {
			while(true) {
				FileReader fr = new FileReader(".\\resource\\user_idpw");
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				for(int i=0;line!=null;i++) {
					is_ok = true;
					StringTokenizer st = new StringTokenizer(line, ", ");
					String id_check = st.nextToken();
					if(id_check.equals(id)) {
						is_ok = false;
						System.out.println("동일한 아이디가 존재합니다. 다른 아이디를 사용해주세요");
						System.out.print("원하는 아이디를 입력하세요: ");
						id = sc.next();
						break;
					}
					line=br.readLine();
				}
				if(is_ok) {
					FileWriter fw = new FileWriter(".\\resource\\user_idpw", true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(id + ", " + pw + ", " + name+"\n");
					bw.close();
					File dir=new File(".\\resource",id);
					dir.mkdir();
					
					File scheduleF=new File(".\\resource\\"+id,"schedule.txt");
					scheduleF.createNewFile();
					
					File infoF=new File(".\\resource\\"+id,"user-info.txt");
					infoF.createNewFile();
					FileWriter fw1 = new FileWriter(".\\resource\\"+id+"\\user-info.txt");
					BufferedWriter bw1 = new BufferedWriter(fw1);
					bw1.write("이름:"+"\r\n" + "키:"+"\r\n" + "몸무게:"+"\r\n" + "체지방량:"+"\r\n" + "골격근량:"+"\r\n" );
					bw1.close();
					
					break;
				}
				br.close();
			}

		}catch (IOException e) {		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

