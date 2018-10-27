package com.wind.controller.api;

import com.wind.entity.Plan;
import com.wind.service.PlanService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/plan")
public class PlanController {
    @Resource(name = "PlanServiceImpl")
    private PlanService planService;

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(@Param("id") Integer id, @Param("plan") String plan, @Param("date") String date, @Param("checked") boolean checked) {
        Plan plan1 = new Plan(date, plan, id, checked);
        planService.insert(plan1);
        return "200";
    }

    @RequestMapping("/update")
    @ResponseBody
    public void update(@Param("id") Integer id, @Param("plan") String plan, @Param("date") String date, @Param("checked") boolean checked) {
        Plan plan1 = new Plan(date, plan, id, checked);
        planService.update(plan1);
    }

    @ResponseBody
    @RequestMapping(value = "/updatePlanById", method = RequestMethod.GET)
    public void updatePlanById(@RequestParam(value = "id", required = true) Integer id, @RequestParam(value = "plan") String plan) {
        planService.updatePlanById(id, plan);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public List<Plan> delete(@RequestParam(value = "id", required = true) Integer id) {
        planService.delete(id);
        return planService.getPlans();
    }

    @RequestMapping("/getPlans")
    @ResponseBody
    public List<Plan> getPlans() {
        return planService.getPlans();
    }
}
