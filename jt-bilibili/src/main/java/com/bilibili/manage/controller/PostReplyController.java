package com.bilibili.manage.controller;

import com.bilibili.manage.pojo.ForumReply;
import com.bilibili.manage.service.PostReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/")
@Controller
public class PostReplyController {
	@Autowired
	private PostReplyService postReplyService;

	/**
	 * 发表评论
	 * @param reply
	 * @return
	 */
	@RequestMapping("doPostReply")
	@ResponseBody
	public String doPostReply(ForumReply reply) {
		//假数据,整合时删除
		reply.setReplyAvatar("666");
		reply.setReplyName("admin");
		postReplyService.postReply(reply);
		return "it is a good reply";
	}

	/**
	 * 根据帖子id显示
	 * @return
	 */
	@RequestMapping("doFindByForumID")
	@ResponseBody
	public String doFindByForumID(){
		return null;
	}

	/**
	 * 显示文章下的评论
	 * @return
	 */
	@RequestMapping("doFindReplyById")
	public List<ForumReply> doFindReplyById(){
		//List<ForumReply> list = postReplyService
		return null;
	}
}
