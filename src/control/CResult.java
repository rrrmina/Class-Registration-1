package control;

import java.util.Vector;

import model.DataAccessObject;
import model.MGangjwa;
import model.MModel;
import valueObject.VGangjwa;

public class CResult {

	public CResult() {	
	}
	
	public void save(String fileName, Vector<VGangjwa> vGangjwas) {
		Vector<MModel> mGangjwas = new Vector<MModel>();
		for(VGangjwa vGangjwa : vGangjwas) {
			MGangjwa mGangjwa = new MGangjwa();
			mGangjwa.setId(vGangjwa.getId());
			mGangjwa.setName(vGangjwa.getName());
			mGangjwa.setLecturer(vGangjwa.getLecturer());
			mGangjwa.setCredit(vGangjwa.getCredit());
			mGangjwa.setTime(vGangjwa.getTime());
			
			mGangjwas.add(mGangjwa);
			
		}
		DataAccessObject dataAccessObject = new DataAccessObject();
		dataAccessObject.save(fileName, mGangjwas);
	}

	public Vector<VGangjwa> get(String fileName){
		DataAccessObject dataAccessObject = new DataAccessObject();
		Vector<MModel> mModels = dataAccessObject.getModels(fileName, MGangjwa.class);

		Vector<VGangjwa> vGangjwas = new Vector<VGangjwa>();
		for(MModel mModel : mModels) {
			MGangjwa mGangjwa = (MGangjwa) mModel;
			VGangjwa vGangjwa = new VGangjwa(
					mGangjwa.getId(),
					mGangjwa.getName(),
					mGangjwa.getLecturer(),
					mGangjwa.getCredit(),
					mGangjwa.getTime()
			);
			vGangjwas.add(vGangjwa);
		}		
		return vGangjwas;
	}

}
