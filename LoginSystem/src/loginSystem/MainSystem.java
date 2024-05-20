package loginSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainSystem {
	
	public static void main(String[] args) {
		//id이라는 키값에 따라 맴버들을 map에 저장함
		Map<String, java.lang.reflect.Member> members = new HashMap()<String, Member>();
		Scanner sc = new Scanner(System.in);
		boolean systemOn = true;
		
		while(systemOn)
		{
			//기능을 선택하기 위한 입력값
			System.out.println("1.로그인, 2.회원가입, 3.끝내기");
			System.out.println("기능을 선택하세요 : ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1: 
				System.out.println("로그인할 아이디를 입력해주세요.");
				String id  = sc.next();
				//아이디에 맞는 회원 객체가 존재하지 않으면
				if(!members.containsKey(id))
				{
					System.out.println("해당 아이디는 존재하지 않습니다.");
				}
				else
				{
					System.out.println("로그인할 비밀번호를 입력해주세요.");
					int password  = sc.nextInt();
					//해당 아이디에 맞는 회원 객체를 가져옴
					Member member = members.get(id);
					//해당 아이디랑 비밀번호가 일치하는지 확인
					if(member.checkMember(password))
					{
						System.out.println("로그인 성공, 로그인 시스템을 종료합니다.");
						systemOn = false;
					}
					else
					{
						System.out.println("비밀번호가 일치하지 않습니다. 로그인 시스템을 다시 시작합니다");
					}
				}
					
				break;
			case 2:
				System.out.println("회원가입할 아이디를 입력해주세요.");
				String id  = sc.next();
				System.out.println("회원가입할 비밀번호를 입력해주세요.");
				int password = sc.nextInt();
				//회원 객체를 생성하고 해당 객체를 map에 저장함
				Member member = new member(id, password);
				members.put(id, member);
				break;
			case 3:
				System.out.println("로그인 시스템을 종료합니다.");
				systemOn = false;
				break;
			default:

			}
		}
	}

}
