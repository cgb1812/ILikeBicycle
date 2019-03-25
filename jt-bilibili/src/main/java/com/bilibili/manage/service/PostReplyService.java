package com.bilibili.manage.service;

import com.bilibili.manage.pojo.Forum;
import com.bilibili.manage.pojo.ForumReply;

public interface PostReplyService {
	/**
	 * 发表
	 * @param reply
	 * @return
	 */
	int postReply(ForumReply reply);
}
