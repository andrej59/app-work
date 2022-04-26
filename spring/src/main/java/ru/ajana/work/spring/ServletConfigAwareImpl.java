package ru.ajana.work.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.ServletConfigAware;

import javax.servlet.ServletConfig;

/**
 * @author Andrey Kharintsev on 28.03.2018
 */
@Controller
public class ServletConfigAwareImpl implements ServletConfigAware {
    public void setServletConfig(ServletConfig servletConfig) {


    }
}
