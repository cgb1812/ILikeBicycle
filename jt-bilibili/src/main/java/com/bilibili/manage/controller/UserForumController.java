package com.bilibili.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bilibili.manage.pojo.PageObject;
import com.bilibili.manage.pojo.Forum;
import com.bilibili.manage.service.UserForumService;
@RequestMapping("/")
@Controller
public class UserForumController {
	@Autowired
	private UserForumService userForumService;
	/**
	 * 显示用户所有帖子
	 * @param pageCurrent
	 * @return
	 */
	@RequestMapping("doUserList")
	@ResponseBody
	public PageObject doUserList(Integer pageCurrent) {
		System.out.println("pageCurrent="+pageCurrent);
		PageObject pageObject=
				userForumService.findUserForum(pageCurrent);
		return pageObject;
	}
	
	@RequestMapping("doFindByForumID")
	@ResponseBody
	public Forum doFindByForumID(Integer forumID) {
		Forum forum=userForumService.findByForumID(forumID);
		return forum;
	}
	
}
