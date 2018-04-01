package ru.ajana.work.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.WebApplicationInitializer;

/**
 * @author Andrey Kharintsev on 29.03.2018
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {


  public void onStartup(ServletContext container) throws ServletException {
//    ServletRegistration.Dynamic registration = container
//        .addServlet("dispatcher", new DispatcherServlet());
//    registration.setLoadOnStartup(1);
//    registration.addMapping("/example/*");
  }
}
