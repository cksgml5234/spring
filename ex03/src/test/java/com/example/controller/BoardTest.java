package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.BoardVO;
import com.example.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class) //���� SpringJUnit4ClassRunner.class import�Ѵ�.
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class BoardTest {
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void list(){
		mapper.list();
	}
	
	@Test
	public void read(){
		mapper.read(3);
	}
	
	@Test
	public void insert(){
		BoardVO vo=new BoardVO();
		vo.setTitle("�ǿ����� t��Ƽ");
		vo.setContent("�� ����");
		vo.setWriter("user02");
		mapper.insert(vo);
		mapper.list();
	}
	
	@Test
	public void update(){
		BoardVO vo=new BoardVO();
		vo.setTitle("�ǿ����� t��Ƽ ����");
		vo.setContent("���� ����");
		vo.setWriter("user02");
		vo.setBno(2);
		mapper.update(vo);
		mapper.list();
	}
	
	@Test
	public void delete(){
		mapper.delete(1);
		mapper.list();
	}
}
