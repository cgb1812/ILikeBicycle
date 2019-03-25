package com.bilibili.manage.service.impl;

import com.bilibili.manage.mapper.PostReplyMapper;
import com.bilibili.manage.pojo.ForumReply;
import com.bilibili.manage.service.PostReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostReplyServiceImpl implements PostReplyService {
	@Autowired
	private PostReplyMapper postReplyMapper;
	@Transactional(rollbackFor=Throwable.class)
	@Override
	public int postReply(ForumReply reply) {
		int	rows=postReplyMapper.postReply(reply);
		return rows;
	}
}
