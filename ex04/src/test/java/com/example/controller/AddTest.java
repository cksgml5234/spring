package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.Criteria;
import com.example.mapper.AddMapper;

@RunWith(SpringJUnit4ClassRunner.class) //먼저 SpringJUnit4ClassRunner.class import한다.
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class AddTest {
	@Autowired
	private AddMapper mapper;
	
	@Test
	public void list(){
		Criteria cri=new Criteria();
		cri.setPerPageNum(3);
		cri.setPage(2);
		cri.setSearchType("addr");
		cri.setKeyword("남동");
		mapper.list(cri);
		mapper.totalCount(cri);
	}
}
