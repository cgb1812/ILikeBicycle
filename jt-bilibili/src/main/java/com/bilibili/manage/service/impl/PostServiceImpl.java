package com.bilibili.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;
import com.bilibili.manage.mapper.PostMapper;
import com.bilibili.manage.pojo.Forum;
import com.bilibili.manage.service.PostService;
@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostMapper postMapper;
	@Transactional(rollbackFor=Throwable.class)
	@Override
	public int postForum(Forum forum) {
		int rows;

			rows=postMapper.postForum(forum);

		return rows;
	}
}
