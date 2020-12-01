package jx.tour.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jx.tour.service.TravelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jx.tour.pojo.TravelsWithBLOBs;
import jx.tour.pojo.User;
import jx.tour.service.UploadFileService;import java.util.List;

@Controller
public class FileUpLoadController {
	@Autowired
	private UploadFileService uploadService;
	@Autowired
	private TravelsService travelsService;

	@RequestMapping("/uploadTravel")
	public String uploadTravel(@RequestParam("file") MultipartFile[] files, TravelsWithBLOBs travel,
			HttpSession session,Model model) throws Exception {
		List<String> savePath = uploadService.uploadFile(files);
        for(int i=0;i<savePath.size();i++){
        	if(i==0){
        		travel.setPic1(savePath.get(i));
        	}
        	if(i==1){
        		travel.setPic2(savePath.get(i));
        	}
        	if(i==2){
        		travel.setPic3(savePath.get(i));
        	}
        }
        travel.setPtime(new Date());
        User user = (User)session.getAttribute("user");
        if(user!=null){
        	travel.setUsernum(user.getUserid());
        }
        travel.setReadnum(0);
        travelsService.saveTravel(travel);
		model.addAttribute("travel", travel);
		return "write_note";// 跳转的页面
	}

}
