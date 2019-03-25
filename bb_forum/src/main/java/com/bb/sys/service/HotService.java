package com.bb.sys.service;

import java.util.List;

import com.bb.common.vo.PageObject;
import com.bb.sys.entity.Forum;

public interface HotService {
	PageObject findHotForum(String forumBT,Integer pageCurrent);
}
