package com.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bb.sys.entity.Forum;
import com.bb.sys.service.HotService;
import com.bb.sys.service.PostService;

public class TestPost {
	protected ClassPathXmlApplicationContext ctx;
	@Before
	public void init() {
		ctx=new ClassPathXmlApplicationContext("spring-configs.xml");
	}

	/*
	 * @Test public void testHot() { PostService postService=
	 * ctx.getBean("postServiceImpl", PostService.class); Forum forum=new Forum();
	 * List<Forum> list = postService.postForum(forum); System.out.println(list); }
	 */
	@After
	public void destory() {
		ctx.close();
	}
}
