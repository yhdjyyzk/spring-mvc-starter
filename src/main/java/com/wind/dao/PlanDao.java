package com.wind.dao;

import com.wind.entity.Plan;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("PlanDao")
public interface PlanDao {
    void update(Plan plan);
    void updateById(@Param("id") Integer id, @Param("plan") String plan, @Param("date") String date, @Param("checked") Boolean checked);
    void insert(Plan plan);
    void delete(@Param("id") Integer id);
    List<Plan> getPlans();
}
