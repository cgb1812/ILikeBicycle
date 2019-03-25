package com.bilibili.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilibili.manage.pojo.PageObject;
import com.bilibili.manage.mapper.HotMapper;
import com.bilibili.manage.pojo.Forum;
import com.bilibili.manage.service.HotService;
@Service
public class HotServiceImpl implements HotService{
	@Autowired
	private HotMapper hotMapper;
	
	@Override
	public PageObject findHotForum(Integer pageCurrent) {
		int pageSize=15;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Forum> list = hotMapper.findHotForum(startIndex, pageSize);
		int rowCount=hotMapper.getRowCount();
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
