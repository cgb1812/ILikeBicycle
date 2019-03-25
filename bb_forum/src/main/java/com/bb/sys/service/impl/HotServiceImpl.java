package com.bb.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.common.vo.PageObject;
import com.bb.sys.dao.HotDao;
import com.bb.sys.entity.Forum;
import com.bb.sys.service.HotService;
@Service
public class HotServiceImpl implements HotService{
	@Autowired
	private HotDao hotDao;
	
	@Override
	public PageObject findHotForum(String forumBT,Integer pageCurrent) {
		int pageSize=15;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Forum> list = hotDao.findHotForum(forumBT,startIndex, pageSize);
		int rowCount=hotDao.getRowCount();
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

}
