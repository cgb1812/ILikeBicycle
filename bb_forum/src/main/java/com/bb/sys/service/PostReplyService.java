package com.bb.sys.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bb.sys.entity.Forum;
import com.bb.sys.entity.ForumReply;

public interface PostReplyService {
	/**
	 * 发表
	 * @param reply
	 * @return
	 */
	int postReply(ForumReply reply);
	
	Forum doFindByForumID(String forumID);
	
	List<ForumReply> doFindReplyById(String replyportID);
}
