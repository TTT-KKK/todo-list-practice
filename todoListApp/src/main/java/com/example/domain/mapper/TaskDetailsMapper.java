package com.example.domain.mapper;

import com.example.domain.entity.TaskDetails;
import com.example.domain.entity.TaskDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TaskDetailsMapper {
    long countByExample(TaskDetailsExample example);

    int deleteByExample(TaskDetailsExample example);

    int deleteByPrimaryKey(Long taskDetailId);

    int insert(TaskDetails record);

    int insertSelective(TaskDetails record);

    List<TaskDetails> selectByExample(TaskDetailsExample example);

    TaskDetails selectByPrimaryKey(Long taskDetailId);

    int updateByExampleSelective(@Param("record") TaskDetails record, @Param("example") TaskDetailsExample example);

    int updateByExample(@Param("record") TaskDetails record, @Param("example") TaskDetailsExample example);

    int updateByPrimaryKeySelective(TaskDetails record);

    int updateByPrimaryKey(TaskDetails record);
}