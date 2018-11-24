package ru.ajana.work.spring.controller;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.ajana.work.spring.model.User;

/**
 * @author Andrey Kharintsev on 29.03.2018
 */
@Controller
public class MainController {

  @Autowired
  private MessageSource messageSource;

  /*First method on start application*/
    /*Попадаем сюда на старте приложения (см. параметры аннотации и настройки пути после деплоя) */
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView main(Locale locale) {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("userJSP", new User());

    modelAndView.setViewName("main");
    return modelAndView;
  }

  /*как только на index.jsp подтвердится форма
  <spring:form method="post"  modelAttribute="userJSP" action="check-user">,
  то попадем вот сюда
   */
  @RequestMapping(value = "/check-user")
  public ModelAndView checkUser(Locale locale, @ModelAttribute("userJSP") User user) {
    ModelAndView modelAndView = new ModelAndView();

    //имя представления, куда нужно будет перейти
    modelAndView.setViewName("second-page");
    //записываем в атрибут userJSP (используется на странице *.jsp объект user
    modelAndView.addObject("userJSP", user);
    modelAndView.addObject("locale", messageSource.getMessage("locale", new String[]{locale.getDisplayName(locale)}, locale));
    return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
  }
}