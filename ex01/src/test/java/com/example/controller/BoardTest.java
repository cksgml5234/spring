package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.BoardVO;
import com.example.mapper.BoardMapper;
import com.example.mapper.MysqlMapper;

@RunWith(SpringJUnit4ClassRunner.class) //���� SpringJUnit4ClassRunner.class import�Ѵ�.
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class BoardTest {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void list() {
		mapper.list(); 
	}
	
	@Test
	public void insert(){
		BoardVO vo = new BoardVO();
		vo.setTitle("�Խñ��� �߰�");
		vo.setContent("������ �߰�");
		vo.setWriter("user02");
		mapper.insert(vo);
	}
	@Test
	public void read(){
		mapper.read(4);
	}
	@Test
	public void update(){
		BoardVO vo = new BoardVO();
		vo.setTitle("�Խñ��� �߰�.����1");
		vo.setContent("������ �߰�.����1");
		vo.setWriter("user04");
		vo.setBno(6);
		mapper.update(vo);
	}
	@Test
	public void delete(){
		mapper.delete(5);
	}
	
}
