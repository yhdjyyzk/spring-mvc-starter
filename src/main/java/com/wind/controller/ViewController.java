package com.wind.controller;
import com.wind.entity.User;
import com.wind.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class ViewController {

    private Logger logger = Logger.getLogger(ViewController.class);

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/index")
    public String index(){

        return "/index";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> find(User user, HttpServletRequest request) {
        Map<String,Object> map = new HashedMap();

        User loginuser = userService.findByUsernameAndPwd(user.getUsername(),user.getPassword());
        if(loginuser != null){
            map.put("result","success");
            map.put("helloworld", "haha");
        }else {
            map.put("result","fail");
        }
        return map;
    }

    @RequestMapping("/success")
    public String success(){
        System.out.println("登录成功。。。。");
        logger.info("登录成功。。。。");

        return "success";
    }

}
