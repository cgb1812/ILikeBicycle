package com.bilibili.manage.mapper;

import com.bilibili.manage.pojo.Forum;

public interface PostMapper {
	/**
	 * 发表
	 * @return
	 */
	int postForum(Forum forum);
}
