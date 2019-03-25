package com.bb.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;
import com.bb.sys.dao.PostDao;
import com.bb.sys.entity.Forum;
import com.bb.sys.service.PostService;
@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostDao postDao;
	@Transactional(rollbackFor=Throwable.class)
	@Override
	public int postForum(Forum forum) {
		int rows=postDao.postForum(forum);
		return rows;
	}
}
