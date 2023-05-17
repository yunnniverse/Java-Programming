//네트워크 및 데이터를 다룰 영역

//이곳에서 입력받은 데이터들을 저장, 관리하는 네트워크를 이용하시면 됩니다.
public class HCP_Data {
	
	boolean getId(String id) {
		//id가 존재하는지 확인
		return true;
	}
	
	HCP_User setUser(String id) {
		HCP_User user = new HCP_User();
		//정보 복사 후, 혹은 생성 후
		return user;
	}
}
