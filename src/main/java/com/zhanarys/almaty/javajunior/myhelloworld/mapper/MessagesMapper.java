package com.zhanarys.almaty.javajunior.myhelloworld.mapper;



import com.zhanarys.almaty.javajunior.myhelloworld.model.Messages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessagesMapper {

    @Select("select * from messages")
    List<Messages> findAll();
}
