package com.bb.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bb.common.vo.JsonResult;
import com.bb.sys.entity.Forum;
import com.bb.sys.entity.ForumReply;
import com.bb.sys.service.PostReplyService;

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
	public Forum doFindByForumID(String forumID,Integer pageCurrent){
		Forum forum = postReplyService.doFindByForumID(forumID);
		System.out.println(forum);
		return forum;
	}
	
	@RequestMapping("doFindReplyById")
	@ResponseBody
	public List<ForumReply> doFindReplyById(String replyportID){
		List<ForumReply> list = postReplyService.doFindReplyById(replyportID);
		System.out.println("list="+list);
		return list;
	}
}
