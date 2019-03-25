package com.bilibili.manage.mapper;

import com.bilibili.manage.pojo.Forum;
import com.bilibili.manage.pojo.ForumReply;

import java.util.List;

public interface PostReplyMapper {
	/**
	 * 发表
	 * @return
	 */
	int postReply(ForumReply reply);

	List<ForumReply> findReplyById();


}
