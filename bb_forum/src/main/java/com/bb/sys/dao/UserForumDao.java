package com.bb.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bb.sys.entity.Forum;

public interface UserForumDao {
	/**
	 * 显示用户所有帖子
	 * @return
	 */
	List<Forum> findUserForum(
			@Param("forumBT")String forumBT,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	
	int getRowCount();
	/**
	 * 根据用户点击的id查询显示浏览的帖子
	 */
	Forum findByForumID(Integer forumID);
	
}
