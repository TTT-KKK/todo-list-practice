package com.example.domain.mapper;

import com.example.domain.entity.MPriority;
import com.example.domain.entity.MPriorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MPriorityMapper {
    long countByExample(MPriorityExample example);

    int deleteByExample(MPriorityExample example);

    int deleteByPrimaryKey(Integer priorityId);

    int insert(MPriority record);

    int insertSelective(MPriority record);

    List<MPriority> selectByExample(MPriorityExample example);

    MPriority selectByPrimaryKey(Integer priorityId);

    int updateByExampleSelective(@Param("record") MPriority record, @Param("example") MPriorityExample example);

    int updateByExample(@Param("record") MPriority record, @Param("example") MPriorityExample example);

    int updateByPrimaryKeySelective(MPriority record);

    int updateByPrimaryKey(MPriority record);
}