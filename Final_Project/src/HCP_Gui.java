import java.awt.Frame;
//Gui를 총괄하는 클래스

//아직 Gui를 배우지 않았으니 우선 간단한 창만 생성해두고 비워두겠습니다.

//여기가 메인 페이지라고 생각하고 Gui를 디자인하면 될 듯 합니다.

public class HCP_Gui extends Frame{
	
	public HCP_Gui(){
		super("Test window");
		setBounds(100,100,300,300);
		setVisible(true);
	}
	
}


//Gui에 필요한 다른 클래스 들은 이 밑에 써주시거나 다른 java파일로 만들어서 써주셔도 상관 없을 것 같아요/