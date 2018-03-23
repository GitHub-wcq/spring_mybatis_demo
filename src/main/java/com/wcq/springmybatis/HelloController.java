package com.wcq.springmybatis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloController是一个实现Controller接口的控制器
 * 这里只能接收 /hello 的单一请求(在spring-config.xml配置的)
 */
public class HelloController implements Controller{

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //logger.info("handleRequest被调用");
        ModelAndView mav = new ModelAndView();
        mav.addObject("message","HelloWorld!");
        mav.setViewName("/WEB-INF/content/welcome.jsp");
        return mav;
    }
}
