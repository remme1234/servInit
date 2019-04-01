package egovframework.example.welcomeWeb.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.welcomeWeb.service.WelcomeWebService;
import egovframework.example.welcomeWeb.service.WelcomeWebVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("welcomeWebService")
public class WelcomeWebServiceImpl implements WelcomeWebService {

	@Resource(name = "welcomeWebMapper")
	private WelcomeWebMapper welcomeWebMapper;
	
	@Override
	public List<EgovMap> selectWelcomeWebServiceList() throws Exception {
		return welcomeWebMapper.selectWelcomeWebServiceList();
	}

	@Override
	public List<EgovMap> selectOnTheDeskList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectOnTheDeskList(resMap);
	}

	@Override
	public List<EgovMap> selectZaigenList(WelcomeWebVO zaigenVO) throws Exception {
		return welcomeWebMapper.selectZaigenList(zaigenVO);
	}

	@Override
	public List<EgovMap> selectPenziList(EgovMap egovMap) throws Exception {
		return welcomeWebMapper.selectPenziList(egovMap);
	}

	@Override
	public List<EgovMap> selectSonySpeakerList(EgovMap egovMap) throws Exception {
		return welcomeWebMapper.selectSonySpeakerList(egovMap);
	}

	@Override
	public List<EgovMap> selectIkeaLampList(EgovMap egovMap) throws Exception {
		return welcomeWebMapper.selectIkeaLampList(egovMap);
	}

	@Override
	public List<EgovMap> selectjetStreamList(EgovMap egovMap) throws Exception {
		return welcomeWebMapper.selectjetStreamList(egovMap);
	}

	@Override
	public List<EgovMap> selectnashvilleCastList(WelcomeWebVO nashvilleCastVO) throws Exception {
		return welcomeWebMapper.selectnashvilleCastList(nashvilleCastVO);
	}

	@Override
	public List<EgovMap> selectTuscanitList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectTuscanitList(resMap);
	}

	@Override
	public List<EgovMap> selectSmileAgaintList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectSmileAgaintList(resMap);
	}

	@Override
	public List<EgovMap> selectSalesMantList(WelcomeWebVO salesManVO) throws Exception {
		return welcomeWebMapper.selectSalesMantList(salesManVO);
	}

	@Override
	public List<EgovMap> selecticeAmericanoList(WelcomeWebVO iceAmericanoVO) throws Exception {
		return welcomeWebMapper.selecticeAmericanoList(iceAmericanoVO);
	}

	@Override
	public List<EgovMap> selectLegoKeyRingList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectLegoKeyRingList(resMap);
	}

	@Override
	public List<EgovMap> selectNikeVaporMaxList(EgovMap egovMap) throws Exception {
		return welcomeWebMapper.selectNikeVaporMaxList(egovMap);
	}

	@Override
	public List<EgovMap> selectIcisList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectIcisList(resMap);
	}

	@Override
	public List<EgovMap> selectSheetMusicBestList(WelcomeWebVO sheetMusicBestVO) throws Exception {
		return welcomeWebMapper.selectSheetMusicBestList(sheetMusicBestVO);
	}

	@Override
	public List<EgovMap> selectseikoAlbaList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectseikoAlbaList(resMap);
	}

	@Override
	public List<EgovMap> selectXiaomList(String country) throws Exception {
		return welcomeWebMapper.selectXiaomList(country);
	}

	@Override
	public List<EgovMap> selectHuaweiList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectHuaweiList(resMap);
	}

	@Override
	public List<EgovMap> selectMichaelKorsList(HashMap<String, Object> resMap) throws Exception {
		return welcomeWebMapper.selectMichaelKorsList(resMap);
	}

	@Override
	public List<EgovMap> selectBalenciagaList(String userName) throws Exception {
		return welcomeWebMapper.selectBalenciagaList(userName);
	}


}
