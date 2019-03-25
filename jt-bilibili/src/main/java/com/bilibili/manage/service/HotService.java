package com.bilibili.manage.service;

import java.util.List;

import com.bilibili.manage.pojo.PageObject;
import com.bilibili.manage.pojo.Forum;

public interface HotService {
	PageObject findHotForum(Integer pageCurrent);
}
