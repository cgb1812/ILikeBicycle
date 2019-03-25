package com.bb.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bb.sys.entity.Forum;

public interface HotDao {
	/**
	 * 显示热搜
	 * @return
	 */
	List<Forum> findHotForum(
			@Param("forumBT")String forumBT,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	
	int getRowCount();
}
