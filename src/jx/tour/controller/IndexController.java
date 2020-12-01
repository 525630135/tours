package jx.tour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jx.tour.pojo.Ads;
import jx.tour.pojo.Content;
import jx.tour.pojo.Information;
import jx.tour.pojo.TravelsVo;
import jx.tour.service.IndexService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;

	// 打开前台首页
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	// 首页的广告轮播图
	@RequestMapping("/requestAds")
	@ResponseBody
	public Object requestAds(Model model) throws Exception {
		List<Ads> adList = indexService.getAdsList();
		/*model.addAttribute("adList",adList);*/
		return adList;
	}

	// 首页的美景、特产显示
	@RequestMapping("/requestScenic")
	public @ResponseBody List<Content> requestScenic() throws Exception {
		List<Content> contentList = indexService.getContentScenic();
		return contentList;
	}

	// 首页的美景、特产显示
	@RequestMapping("/requestSpecialty")
	public @ResponseBody List<Content> requestSpecialty() throws Exception {
		List<Content> contentList = indexService.getContentSpecialty();
		return contentList;
	}

	// 首页资讯信息显示
	@RequestMapping("/requestInformation")
	public @ResponseBody List<Information> requestInformation(int value) throws Exception {
		List<Information> informationList = indexService.getInformationList(value);
		return informationList;
	}

	// 首页显示四个热门的游记
	@RequestMapping("/requestTravels")
	public @ResponseBody List<TravelsVo> requestTravels() throws Exception {
		List<TravelsVo> TravelList = indexService.getTravelVoList();
		for (TravelsVo t : TravelList) {
			System.out.println(t.getUserimag());
		}
		return TravelList;
	}
}
