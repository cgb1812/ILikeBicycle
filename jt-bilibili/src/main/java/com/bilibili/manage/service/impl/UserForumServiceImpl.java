package com.bilibili.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilibili.manage.pojo.PageObject;
import com.bilibili.manage.mapper.UserForumMapper;
import com.bilibili.manage.pojo.Forum;
import com.bilibili.manage.service.UserForumService;
@Service
public class UserForumServiceImpl implements UserForumService{
	@Autowired
	private UserForumMapper userForumMapper;
	@Override
	public PageObject findUserForum(Integer pageCurrent) {
		int pageSize=15;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Forum> list = userForumMapper.findUserForum(startIndex, pageSize);
		int rowCount=userForumMapper.getRowCount();
		int pageCount=rowCount/pageSize;
		if(rowCount%pageSize!=0) {
			pageCount++;
		}
		PageObject pageObject = new PageObject();
		pageObject.setRecords(list);
		pageObject.setRowCount(rowCount);
		pageObject.setPageCount(pageCount);
		pageObject.setPageCurrent(pageCurrent);
		return pageObject;
	}
	@Override
	public Forum findByForumID(Integer forumID) {
		Forum forum=userForumMapper.findByForumID(forumID);
		return forum;
	}

}
