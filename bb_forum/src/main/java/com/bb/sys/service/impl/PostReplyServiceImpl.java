package com.bb.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;
import com.bb.sys.dao.PostReplyDao;
import com.bb.sys.entity.Forum;
import com.bb.sys.entity.ForumReply;
import com.bb.sys.service.PostReplyService;

@Service
public class PostReplyServiceImpl implements PostReplyService {
	@Autowired
	private PostReplyDao postReplyDao;
	@Transactional(rollbackFor=Throwable.class)
	@Override
	public int postReply(ForumReply reply) {
		int	rows=postReplyDao.postReply(reply);
		return rows;
	}
	/**
	 * 获取帖子详细信息
	 */
	@Override
	public Forum doFindByForumID(String forumID) {
		Forum forum=postReplyDao.doFindByForumID(forumID);
		return forum;
	}
	/**
	 * 根据帖子id获取该帖子下的所有评论
	 */
	@Override
	public List<ForumReply> doFindReplyById(String replyportID) {
		List<ForumReply> list = postReplyDao.doFindReplyById(replyportID);
		return list;
	}
}
