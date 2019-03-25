package com.bb.sys.service;

import java.util.List;

import com.bb.common.vo.PageObject;
import com.bb.sys.entity.Forum;

public interface UserForumService {
	PageObject findUserForum(String forumBT,Integer pageCurrent);
	
	Forum findByForumID(Integer forumID);
}
