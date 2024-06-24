package loginSystem;

public class Member {
	   // 회원정보
	   // 아이디와 비밀번호가 일치하는지 확인만 함
	   // ID, password만 저장
	   String ID;
	   int password;
	   
	   Member(String ID, int password)
	   {
	      this.ID = ID;
	      this.password = password;
	   }
	   
	   boolean checkMember(int password)
	   {
	      if(this.password == password) // 맞는 password 입력
	      {
	         return true;
	      }
	      else
	      {
	         return false;
	      }
	   }
}
