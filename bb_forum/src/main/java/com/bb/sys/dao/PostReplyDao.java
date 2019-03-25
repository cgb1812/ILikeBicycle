package com.bb.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bb.sys.entity.Forum;
import com.bb.sys.entity.ForumReply;

public interface PostReplyDao {
	/**
	 * 发表
	 * @return
	 */
	int postReply(ForumReply reply);

	/**
	 * 根据id查询帖子数据显示
	 */
	Forum doFindByForumID(@Param("forumID")String forumID);
	/**
	 * 根据帖子Id查询该帖子下的所有评论
	 */
	List<ForumReply> doFindReplyById(@Param("replyportID")String replyportID);
}
