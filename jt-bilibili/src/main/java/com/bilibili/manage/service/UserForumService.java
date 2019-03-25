package com.bilibili.manage.service;

import java.util.List;

import com.bilibili.manage.pojo.PageObject;
import com.bilibili.manage.pojo.Forum;

public interface UserForumService {
	PageObject findUserForum(Integer pageCurrent);
	
	Forum findByForumID(Integer forumID);
}
