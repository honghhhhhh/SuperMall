package com.example.basegradle.mapper;

import com.example.basegradle.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {

    @Select("select * from person where id = #{id}")
    public Person getPerson(Integer id);
}
