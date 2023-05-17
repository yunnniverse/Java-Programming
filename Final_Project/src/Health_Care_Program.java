import java.util.Scanner;

//가장 메인 클래스
public class Health_Care_Program {
	public static void main(String args[]) {
		
		//gui 창 생성
		HCP_Gui gui = new HCP_Gui();
		HCP_Data data = new HCP_Data();
		
		//id 확인해보기
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		if(data.getId(id)) {
			//id가 있으면 해당 내용불러옴
			HCP_User user = data.setUser(id);
			//불러온 class를 받음!
		}else {
			//아이디 없음
			//이때는 1. 회원가입 2. 그냥 다시하기 중에 선택해야될 것 같습니다.
		}
		
		//기능1 : 운동 기록
		//gui먼저 구현하고 해야할 듯 합니다!
		//운동 받기 -> 저장
		
		
		
		//기능2 : 운동 추천
		//통계 내기(?) -> 필요한 운동 추천
		
		
		
		//그간의 통계 보여주기
		//gui 구현 필수..!
		
		
		
		
	}
}