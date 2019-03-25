package com.bilibili.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bilibili.manage.pojo.JsonResult;
import com.bilibili.manage.pojo.PageObject;
import com.bilibili.manage.pojo.Forum;
import com.bilibili.manage.service.HotService;

@Controller
@RequestMapping("/")
public class HotController {
	
	@Autowired
	private HotService hotService;
	
	@RequestMapping("doHotList")
	@ResponseBody
	public PageObject doHotList(Integer pageCurrent) {
		System.out.println("pageCurrent="+pageCurrent);
		PageObject pageObject=
				hotService.findHotForum(pageCurrent);
		return pageObject;
	}
}
