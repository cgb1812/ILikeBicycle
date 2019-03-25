package com.bb.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.common.vo.PageObject;
import com.bb.sys.dao.UserForumDao;
import com.bb.sys.entity.Forum;
import com.bb.sys.service.UserForumService;
@Service
public class UserForumServiceImpl implements UserForumService{
	@Autowired
	private UserForumDao userForumDao;
	@Override
	public PageObject findUserForum(String forumBT,Integer pageCurrent) {
		int pageSize=15;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Forum> list = userForumDao.findUserForum(forumBT,startIndex, pageSize);
		int rowCount=userForumDao.getRowCount();
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
		Forum forum=userForumDao.findByForumID(forumID);
		return forum;
	}

}
