package com.bb.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.common.vo.JsonResult;
@RequestMapping("/")
@Controller
public class PageController {
	/**
	 * 跳转主页
	 * @return
	 */
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "index";
	}
	/**
	 * 跳转热搜
	 * @return
	 */
	@RequestMapping("doHot.do")
	public String doHot() {
		return "hot";
	}
	/**
	 * 跳转用户界面
	 * @return
	 */
	@RequestMapping("doUser")
	public String doUser() {
		return "user";
	}
	/**
	 * 跳转发布页面
	 * @return
	 */
	@RequestMapping("doPost")
	public String doPost() {
		return "post";
	}
	/**
	 * 跳转用户帖子具体显示页面
	 * @return
	 */
	@RequestMapping("doSelect")
	public String doselect() {
		return "select";
	}

	
}
