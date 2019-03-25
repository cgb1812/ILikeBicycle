package com.bb.sys.service;

import com.bb.sys.entity.Forum;

public interface PostService {
	/**
	 * 发表
	 * @param forum
	 * @return
	 */
	int postForum(Forum forum);
}
