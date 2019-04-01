package egovframework.example.welcomeWeb.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.welcomeWeb.service.WelcomeWebService;
import egovframework.example.welcomeWeb.service.WelcomeWebVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class WelcomeWebController {

	@Resource(name = "welcomeWebService")
	private WelcomeWebService welcomeWebService;
	
	@RequestMapping("welcomeWeb.do")
	public String welcomeWeb(ModelMap model) throws Exception {
		List<EgovMap> welcomeWebList = welcomeWebService.selectWelcomeWebServiceList();
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("onTheDesk.do")
	public String onTheDesk(HttpServletRequest request,
			ModelMap model) throws Exception {
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		String seqNo = request.getParameter("seqNo");
		resMap.put("seqNO", seqNo);
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectOnTheDeskList(resMap);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("zaigen.do")
	public String zaigen(HttpServletRequest request,
			ModelMap model) throws Exception {
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		WelcomeWebVO zaigenVO = new WelcomeWebVO();
		
		resMap.put("country", request.getParameter("country"));
		zaigenVO.setCountry("country");
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectZaigenList(zaigenVO);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("penzi.do")
	public String penzi(@RequestParam Map<String,String> age,			
			ModelMap model) throws Exception {
		EgovMap egovMap = new EgovMap();
		
		egovMap.put("age", age);
									
		List<EgovMap> welcomeWebList = welcomeWebService.selectPenziList(egovMap);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("sonySpeaker.do")
	public String sonySpeaker(HttpServletRequest request,			
			ModelMap model) throws Exception {
		WelcomeWebVO sonySpeakerVO = new WelcomeWebVO();		
		EgovMap egovMap = new EgovMap();
		
		sonySpeakerVO.setEtc(request.getParameter("etc"));
		
		egovMap.put("etc",sonySpeakerVO.getEtc());
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectSonySpeakerList(egovMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebSnakeCase.tiles";
	}
	
	@RequestMapping("ikeaLamp.do")
	public String ikeaLamp(HttpServletRequest request,			
			ModelMap model) throws Exception {
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		EgovMap egovMap = new EgovMap();
		
		egovMap.put("userName", resMap.put("userName", request.getParameter("userName")));
				
		List<EgovMap> welcomeWebList = welcomeWebService.selectIkeaLampList(egovMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWebSnakeCase.tiles";
	}
	
	@RequestMapping("jetStream.do")
	public String jetStream(HttpServletRequest request,			
			ModelMap model) throws Exception {
		String age = request.getParameter("age");
		EgovMap egovMap = new EgovMap();
		
		egovMap.put("age", age);
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectjetStreamList(egovMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("nashvilleCast.do")
	public String nashvilleCast(@RequestParam String country,			
			ModelMap model) throws Exception {
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		WelcomeWebVO nashvilleCastVO = new WelcomeWebVO();
		
		resMap.put("country", country);
		nashvilleCastVO.setCountry(country);
				
		List<EgovMap> welcomeWebList = welcomeWebService.selectnashvilleCastList(nashvilleCastVO);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("tuscani.do")
	public String tuscani(@RequestParam String seqNo,
			@RequestParam String age,			
			ModelMap model) throws Exception {
		EgovMap egovMap = new EgovMap();
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		egovMap.put("seqNo", seqNo);
		egovMap.put("age", age);
		
		resMap.put("seqNo", seqNo);
		resMap.put("age", age);
		
				
		List<EgovMap> welcomeWebList = welcomeWebService.selectTuscanitList(resMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("smileAgain.do")
	public String smileAgain(@RequestParam String country,
			ModelMap model) throws Exception {
		WelcomeWebVO welcomeWebVO = new WelcomeWebVO();
		HashMap<String, Object> resMap = new HashMap<String, Object>();
		
		welcomeWebVO.setCountry("country");
		resMap.put("country", country);
		
				
		List<EgovMap> welcomeWebList = welcomeWebService.selectSmileAgaintList(resMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("salesMan.do")
	public String salesMan(HttpServletRequest request,
			ModelMap model) throws Exception {
		WelcomeWebVO salesManVO = new WelcomeWebVO();
		
		String userName = request.getParameter("userName");
		salesManVO.setUserName(userName);
		
						
		List<EgovMap> welcomeWebList = welcomeWebService.selectSalesMantList(salesManVO);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("iceAmericano.do")
	public String iceAmericano(HttpServletRequest request,
			ModelMap model) throws Exception {
		WelcomeWebVO iceAmericanoVO = new WelcomeWebVO();
		
		String country = request.getParameter("country");
		iceAmericanoVO.setCountry(country);
		iceAmericanoVO.getCountry();
				
		System.out.println("나라는!!!!!!!!!!!!!!!!!!"+country);
		
		List<EgovMap> welcomeWebList = welcomeWebService.selecticeAmericanoList(iceAmericanoVO);
		model.addAttribute("welcomeWebList", welcomeWebList);

		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("legoKeyRing.do")
	public String legoKeyRing(@RequestParam String age,
			ModelMap model) throws Exception {
		WelcomeWebVO legoKeyRingVO = new WelcomeWebVO();
		HashMap<String,Object> resMap = new HashMap<String,Object>(); 
		
		legoKeyRingVO.setCountry(age);
		resMap.put("age", legoKeyRingVO.getCountry());		
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectLegoKeyRingList(resMap);
		model.addAttribute("welcomeWebList", welcomeWebList);

		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("nikeVaporMax.do")
	public String nikeVaporMax(@RequestParam String etc,
			ModelMap model) throws Exception {
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		EgovMap egovMap = new EgovMap();

		egovMap.put("etc", resMap.put("etc", etc));
		System.out.println("etc는!!!!!!!!!!"+ etc);

		List<EgovMap> welcomeWebList = welcomeWebService.selectNikeVaporMaxList(egovMap);
		model.addAttribute("welcomeWebList", welcomeWebList);

		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("icis.do")
	public String icis(@RequestParam String seqNo,
			ModelMap model) throws Exception {
		WelcomeWebVO icisVO = new WelcomeWebVO();
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		icisVO.setSeqNo(seqNo);
		resMap.put("seqNo", seqNo);
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectIcisList(resMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("sheetMusicBest.do")
	public String sheetMusicBest(HttpServletRequest request,
			ModelMap model) throws Exception {
		EgovMap egovMap = new EgovMap();
		WelcomeWebVO sheetMusicBestVO = new WelcomeWebVO();
		
		sheetMusicBestVO.setUserName(egovMap.put("userName", request.getParameter("userName")));
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectSheetMusicBestList(sheetMusicBestVO);
		model.addAttribute("welcomeWebList", welcomeWebList);
	
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("seikoAlba.do")
	public String seikoAlba(HttpServletRequest request,
			ModelMap model) throws Exception {
		WelcomeWebVO seikoAlbaVO = new WelcomeWebVO();
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		seikoAlbaVO.setAge(request.getParameter("age"));
		String age = seikoAlbaVO.getAge();
		
		resMap.put("age", age);

		List<EgovMap> welcomeWebList = welcomeWebService.selectseikoAlbaList(resMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
	
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("xiaom.do")
	public String xiaom(HttpServletRequest request,
			ModelMap model) throws Exception {
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		resMap.put("country", request.getParameter("country"));
		
		String country = (String) resMap.get("country"); 
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectXiaomList(country);
		model.addAttribute("welcomeWebList", welcomeWebList);
	
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("huawei.do")
	public String huawei(HttpServletRequest request,
			ModelMap model) throws Exception {
		EgovMap egovMap = new EgovMap();
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		
		egovMap.put("etc", request.getParameter("etc"));
		resMap.put("etc", egovMap.get("etc"));
		
		List<EgovMap> welcomeWebList = welcomeWebService.selectHuaweiList(resMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
	
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@RequestMapping("michaelKors.do")
	public String michaelKors(@RequestParam String etc,
			ModelMap model) throws Exception {
		HashMap<String,Object> resMap = new HashMap<String,Object>();
		EgovMap egovMap = new EgovMap();
		
		resMap.put("etc", etc);
		egovMap.put("etc", resMap.get("etc"));
				
		List<EgovMap> welcomeWebList = welcomeWebService.selectMichaelKorsList(resMap);
		model.addAttribute("welcomeWebList", welcomeWebList);
	
		return "welcomeWeb/welcomeWeb.tiles";
	}

	@RequestMapping("balenciaga.do")
	public String balenciaga(HttpServletRequest request,
			ModelMap model) throws Exception {
		WelcomeWebVO balenciagaVO = new WelcomeWebVO();
			
		balenciagaVO.setUserName("userName");
		String userName = (String) balenciagaVO.getUserName();

		List<EgovMap> welcomeWebList = welcomeWebService.selectBalenciagaList(userName);
		model.addAttribute("welcomeWebList", welcomeWebList);
					
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	
}