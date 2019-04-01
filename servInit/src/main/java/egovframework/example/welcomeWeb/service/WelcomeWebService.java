package egovframework.example.welcomeWeb.service;

import java.util.HashMap;
import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface WelcomeWebService {

	List<EgovMap> selectWelcomeWebServiceList() throws Exception;

	List<EgovMap> selectOnTheDeskList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectZaigenList(WelcomeWebVO zaigenVO) throws Exception;

	List<EgovMap> selectPenziList(EgovMap egovMap)throws Exception;

	List<EgovMap> selectSonySpeakerList(EgovMap egovMap)throws Exception;

	List<EgovMap> selectIkeaLampList(EgovMap egovMap)throws Exception;

	List<EgovMap> selectjetStreamList(EgovMap egovMap)throws Exception;

	List<EgovMap> selectnashvilleCastList(WelcomeWebVO nashvilleCastVO)throws Exception;

	List<EgovMap> selectTuscanitList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectSmileAgaintList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectSalesMantList(WelcomeWebVO salesManVO)throws Exception;

	List<EgovMap> selecticeAmericanoList(WelcomeWebVO iceAmericanoVO)throws Exception;

	List<EgovMap> selectLegoKeyRingList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectNikeVaporMaxList(EgovMap egovMap)throws Exception;

	List<EgovMap> selectIcisList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectSheetMusicBestList(WelcomeWebVO sheetMusicBestVO)throws Exception;

	List<EgovMap> selectseikoAlbaList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectXiaomList(String country)throws Exception;

	List<EgovMap> selectHuaweiList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectMichaelKorsList(HashMap<String, Object> resMap)throws Exception;

	List<EgovMap> selectBalenciagaList(String userName)throws Exception;

}
