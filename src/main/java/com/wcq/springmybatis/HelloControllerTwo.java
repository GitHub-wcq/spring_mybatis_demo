package com.wcq.springmybatis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerTwo {

    private static final Log logger = LogFactory.getLog(HelloControllerTwo.class);

    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        logger.info("HelloControllerTwo");
        ModelAndView model = new ModelAndView();
        model.addObject("message","HelloWorld!");
        model.setViewName("/WEB-INF/content/welcome.jsp");
        return model;
    }

}
