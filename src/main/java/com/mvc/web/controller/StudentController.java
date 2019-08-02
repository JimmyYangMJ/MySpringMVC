package com.mvc.web.controller;

import com.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/stu")
public class StudentController {

    /**
     * 用于转发和重定向测试
     */
    @RequestMapping("/student")
    public String test1() {
        //不同控制器转发
        //return "forward:/user/list.do";
        //不同控制器重定向
        return "redirect:/user/registerForm02.do";
    }

    /**
     * @RequestParam(value = "uid",required = true,defaultValue = "30")
     * 表示， 需要请求参数， 如果不设置 defaultValue ，那么就会报错
     * @param uid
     * @return
     */
    @RequestMapping("/test2")
    public String test2(@RequestParam(value = "uid",required = true,defaultValue = "30") Integer uid) {
        System.out.println(uid);
        return "redirect:/user/registerForm02.do";
    }

    @RequestMapping("/toReg")
    public String toReg(){
        return "stu/register";
    }


    /**
     * 把json数据转为model（Student）对象
     * @param stu
     * @return
     */
    @RequestMapping("/save")
    public String save(@RequestBody Student stu) {
        System.out.println(stu);
        return "redirect: /stu/list.do";
    }
    /**
     * 添加学生信息
     * 一般数据提交,  接收参数要是 name=ymj&sex=male
     * @return
     */
    @RequestMapping("/savetest")
    public String saveTest(Student stu) {
        System.out.println(stu);
        return "redirect: /stu/list.do";
    }

    /**
     * 多视图
     */
    @RequestMapping("/get")
    public Student get(){
        Student student = new Student();
        student.setName("yang");
        student.setSex("male");

        return student;
    }

}