package com.wind.service;

import com.wind.entity.Plan;

import java.util.List;

public interface PlanService {
    void update(Plan plan);
    void updatePlanById(Integer id, String plan);
    void insert(Plan plan);
    void delete(Integer id);
    List<Plan> getPlans();
}
