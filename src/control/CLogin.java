package control;

import model.DataAccessObject;
import model.MLogin;
import model.MModel;
import valueObject.VLogin;

public class CLogin {

	public boolean validate(VLogin vLogin) {
		boolean bLoginSuccess = false;
		
		DataAccessObject dataAccessObject = new DataAccessObject();
		MModel mModel = dataAccessObject.getAModel("userId", MLogin.class, vLogin.getUserId()); //DAO로 가서 유저 아이디라는 파일네임을 읽어서 그 키가 브이로그인의 겟유저아이디와 같으면(입력한 아이디) 엠로그인에 담으라는 것.
		
		if (mModel != null) {
			MLogin mLogin = (MLogin) mModel;
			if (vLogin.getPassword().contentEquals(mLogin.getPassword())) {
				bLoginSuccess = true;
			} else {
				// password mismatch
			}
		} else {
			// no userId - 회원 가입 안됨 혹은 아이디 잘 못 입력
		}
		return bLoginSuccess;
	}
}
