package com.bright.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM `user` WHERE name= #{name}")
	User getByName(@Param("name") String name);
	
	@Select("SELECT * FROM `user`")
	List<User> getAll();
}
