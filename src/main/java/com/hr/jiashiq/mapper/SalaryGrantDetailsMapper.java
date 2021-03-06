package com.hr.jiashiq.mapper;

import com.hr.entity.SalaryGrantDetails;
import com.hr.entity.SalaryGrantDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryGrantDetailsMapper {
    long countByExample(SalaryGrantDetailsExample example);

    int deleteByExample(SalaryGrantDetailsExample example);

    int deleteByPrimaryKey(Short grdId);

    int insert(SalaryGrantDetails record);

    int insertSelective(SalaryGrantDetails record);

    List<SalaryGrantDetails> selectByExample(SalaryGrantDetailsExample example);

    SalaryGrantDetails selectByPrimaryKey(Short grdId);

    int updateByExampleSelective(@Param("record") SalaryGrantDetails record, @Param("example") SalaryGrantDetailsExample example);

    int updateByExample(@Param("record") SalaryGrantDetails record, @Param("example") SalaryGrantDetailsExample example);

    int updateByPrimaryKeySelective(SalaryGrantDetails record);

    int updateByPrimaryKey(SalaryGrantDetails record);
}