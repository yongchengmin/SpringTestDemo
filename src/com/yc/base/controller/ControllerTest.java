package com.yc.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * ���Կ�����
 */
@Controller
@RequestMapping("/webPage/")
public class ControllerTest {
    
    /**
     * ���Է���
     * 
     * @return ModelAndView
     */
	//http://127.0.0.1:8080/SpringTestDemo/webPage/test.do ʱ����ʾtest.jspҳ��,����ֵ��ҳ��.
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView testMVC() {
        System.out.println("invoke.....");
        ModelAndView modelAndView = new ModelAndView("demo/page/test.jsp");
        modelAndView.addObject("info", "test info");
        return modelAndView;
    }
}
