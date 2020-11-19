package com.exmaple.mapper;

import org.apache.ibatis.annotations.Select;

public interface MysqlMapper {
	@Select("select now()")
	public String getTime();
	
	public String getTime2();
}
