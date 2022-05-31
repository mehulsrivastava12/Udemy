package udemyapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import udemyapp.dao.CourseVideoDao;
import udemyapp.model.CourseVideo;

@Controller
public class CourseVideoController {
	@Autowired
	private CourseVideoDao courseVideoDao;
	
	@RequestMapping("/addvideo/{id}")
	public RedirectView addVideo(@ModelAttribute CourseVideo courseVideo,Model model,HttpServletRequest request) {
		courseVideoDao.createVideo(courseVideo);
		model.addAttribute("cid",courseVideo.getCid());
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/mycoursevideo/"+courseVideo.getCid());
		return redirectView;
		
	}
	
	@RequestMapping("/deletevideo/{videoId}")
	public RedirectView deleteVideo(@PathVariable("videoId") int videoId,HttpServletRequest request) {
		this.courseVideoDao.deleteVideo(videoId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/mycoursevideo/{cid}")
	public String getVideo(@PathVariable("cid") int cid,Model model) {
		List<CourseVideo> getVideo=this.courseVideoDao.getVideo(cid);
		model.addAttribute("getVideo",getVideo);
		System.out.println(getVideo);
		return "myvideos";
	}
	
	@RequestMapping("/addvideoform/{cid}")
	public String addvideoform(@PathVariable("cid") int cid,Model model) {
		
		return "addvideo";
	}
}
