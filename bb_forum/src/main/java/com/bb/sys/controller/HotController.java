package com.bb.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.common.vo.JsonResult;
import com.bb.common.vo.PageObject;
import com.bb.sys.entity.Forum;
import com.bb.sys.service.HotService;

@Controller
@RequestMapping("/")
public class HotController {
	
	@Autowired
	private HotService hotService;
	
	@RequestMapping("doHotList")
	@ResponseBody
	public PageObject doHotList(String forumBT,Integer pageCurrent) {
		System.out.println("pageCurrent="+pageCurrent);
		PageObject pageObject=
				hotService.findHotForum(forumBT,pageCurrent);
		return pageObject;
	}
}
