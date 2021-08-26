package healthScheduler;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginPage {
	Scanner sc = new Scanner(System.in);
	String id;
	String pw;
	String name;
	boolean is_login = false;
	public LoginPage() {
		System.out.println("로그인페이지");
		System.out.println("-----------");
		System.out.print("id --> ");
		id = sc.next();
		System.out.print("pw --> ");
		pw = sc.next(); 
		
		try {
			FileReader fr=new FileReader(".\\resource\\user_idpw");
			BufferedReader br=new BufferedReader(fr);
			String line = br.readLine();
			
			if (line==null) {
				System.out.println("로그인에 실패하였습니다. 아이디 혹은 비밀번호를 확인해주세요");
			}
			for(int i=0;line!=null;i++) {
				StringTokenizer st = new StringTokenizer(line, ", ");
				String id_check = st.nextToken();
				String pw_check = st.nextToken();
				String username= st.nextToken();
				if(id_check.equals(id)) {
					if(pw_check.equals(pw)) {
						System.out.println("로그인에 성공하였습니다. 환영합니다");
						is_login=true;
						name = username;
						break;
						}
				}
				line=br.readLine();
			}
			if(is_login==false) {
				System.out.println("로그인에 실패하였습니다. 아이디 혹은 비밀번호를 확인해주세요");
			}
		}catch (IOException e) {		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	boolean getIs_login() {
		return is_login;
	}
	
	String get_username() {
		return name;
	}
	
}


