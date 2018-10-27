package com.wind.service.impl;

import com.wind.dao.PlanDao;
import com.wind.entity.Plan;
import com.wind.service.PlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("PlanServiceImpl")
public class PlanServiceImpl implements PlanService{
    @Resource(name = "PlanDao")
    PlanDao planDao;

    @Override
    public void update(Plan plan) {
        planDao.update(plan);
    }

    @Override
    public void updatePlanById(Integer id, String plan) {
        planDao.updateById(id, plan, null, null);
    }

    @Override
    public void insert(Plan plan) {
        planDao.insert(plan);
    }

    @Override
    public void delete(Integer id) {
        planDao.delete(id);
    }

    @Override
    public List<Plan> getPlans() {
        return planDao.getPlans();
    }
}
