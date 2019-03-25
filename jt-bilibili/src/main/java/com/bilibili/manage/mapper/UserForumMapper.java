package com.bilibili.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bilibili.manage.pojo.Forum;

public interface UserForumMapper {
	/**
	 * 显示用户所有帖子
	 * @return
	 */
	List<Forum> findUserForum(
            @Param("startIndex") Integer startIndex,
            @Param("pageSize") Integer pageSize);
	
	int getRowCount();
	/**
	 * 根据用户点击的id查询显示浏览的帖子
	 */
	Forum findByForumID(Integer forumID);
	
}
