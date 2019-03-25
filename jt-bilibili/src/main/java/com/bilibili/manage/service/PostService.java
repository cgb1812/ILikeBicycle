package com.bilibili.manage.service;

import com.bilibili.manage.pojo.Forum;

public interface PostService {
	/**
	 * 发表
	 * @param forum
	 * @return
	 */
	int postForum(Forum forum);
}
