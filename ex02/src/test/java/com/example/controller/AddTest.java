package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.AddVO;
import com.example.mapper.AddMapper;

@RunWith(SpringJUnit4ClassRunner.class) //먼저 SpringJUnit4ClassRunner.class import한다.
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class AddTest {
	@Autowired
	private AddMapper mapper;
	
	@Test
	public void list(){
		mapper.list();
	}
	
	@Test
	public void insert(){
		AddVO vo=new AddVO();
		vo.setName("전영진");
		vo.setAddr("인천 2호선");
		vo.setTel("010-1212-1212");
		mapper.insert(vo);
	}
	
	@Test
	public void read(){
		mapper.read(3);
	}
	
	@Test
	public void delete(){
		mapper.delete(5);
	}
	
	@Test
	public void update(){
		AddVO vo=new AddVO();
		vo.setName("전진 수정");
		vo.setAddr("인천 2호선 수정");
		vo.setTel("010-1212-5512 수정");
		mapper.update(vo);
	}
}
