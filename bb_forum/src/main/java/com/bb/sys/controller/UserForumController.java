package com.bb.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.common.vo.PageObject;
import com.bb.sys.entity.Forum;
import com.bb.sys.service.UserForumService;
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
	public PageObject doUserList(String forumBT,Integer pageCurrent) {
		System.out.println("pageCurrent="+pageCurrent);
		PageObject pageObject=
				userForumService.findUserForum(forumBT,pageCurrent);
		return pageObject;
	}
}
