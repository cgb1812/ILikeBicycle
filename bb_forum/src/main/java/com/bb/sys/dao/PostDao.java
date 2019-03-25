package com.bb.sys.dao;

import com.bb.sys.entity.Forum;

public interface PostDao {
	/**
	 * 发表
	 * @return
	 */
	int postForum(Forum forum);
}
