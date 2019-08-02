package com.mvc.web.controller;


import com.mvc.model.User;
import com.mvc.model.UserExt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String list(){
        return "user/userlist";
    }
//    @Override  不用再 实现 Controller 类
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//
//        ModelAndView mav = new ModelAndView("user/userlist");
//        mav.addObject("name","gyf");
//        return mav;
//    }
    /** 进入注册界面 */
    @RequestMapping("/toRegister")
    public String toRegister(){

        return "user/register";
    }

    /**
     * 第一种接收表单参数的方式:
     * 默认日期格式 月/日/年 10/10/2016
     * @return
     */
    @RequestMapping("/registerForm01")
    public String register(String username, String password,
                           String gender, int age,  Date birthday,
                           String[] hobbyIds){
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(birthday);
        System.out.println(Arrays.toString(hobbyIds));
        return "user/info";
    }

    /**
     * 第二种接收表单参数的方式:
     * 默认日期格式 月/日/年 10/10/2016
     * @return
     */
    @RequestMapping("/registerForm02")
    public String register2(User user){
        System.out.println(user);
        return "user/info";
    }

    /**
     * 第三种接收表单参数的方式:
     * @return
     * 相当于模型里有模型
     * 此时html/jsp 界面的表单，要进行修改
     * 用户名:<input type="text" name="username"><br>
     *     改为
     * 用户名:<input type="text" name="user.username"><br>
     *
     */
    @RequestMapping("/register3")
    public String register3(UserExt userExt){
        //BindingAwareModelMap m;
        System.out.println(userExt);
        return "user/info";
    }


    /**
     * 转发和重定向
     * @return
     */
    public String test(){
        return null;
    }
}
