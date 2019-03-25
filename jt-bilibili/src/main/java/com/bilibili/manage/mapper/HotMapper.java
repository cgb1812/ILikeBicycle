package com.bilibili.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bilibili.manage.pojo.Forum;

public interface HotMapper {
	/**
	 * 显示热搜
	 * @return
	 */
	List<Forum> findHotForum(
            @Param("startIndex") Integer startIndex,
            @Param("pageSize") Integer pageSize);
	
	int getRowCount();
}
