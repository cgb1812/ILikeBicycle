package com.bb.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.common.vo.JsonResult;
import com.bb.sys.entity.Forum;
import com.bb.sys.service.PostService;
@RequestMapping("/")
@Controller
public class PostController {
	@Autowired
	private PostService postService;
	
	@RequestMapping("doPostForum")
	@ResponseBody
	public String doPostForum(Forum forum) {
		//假数据,整合时删除
		forum.setForumAmount("5000");
		forum.setForumAvatar("666");
		forum.setCreatedUser("admin");
		forum.setModifiedUser("admin");
		
		postService.postForum(forum);
		return "it is a good bb";
	}
}
