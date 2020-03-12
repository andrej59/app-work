package ru.ajana.work.spring.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ajana.work.spring.model.User;

/**
 * @author Andrey Kharintsev on 31.03.2018
 */

@RestController
public class MainRestController {

  @RequestMapping(value =  "/employees", method = RequestMethod.GET)
  public @ResponseBody User getEmployee(@PathVariable("id") int empId, Pageable pageable, Sort sort) {
    //logger.info("Start getEmployee. ID="+empId);
    //return empData.get(empId);
    return null;
  }
}
