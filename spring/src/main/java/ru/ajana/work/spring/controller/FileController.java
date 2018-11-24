package ru.ajana.work.spring.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ru.ajana.work.spring.UploadedFile;
import ru.ajana.work.spring.validator.FileValidator;

/**
 * @author Andrey Kharintsev on 29.03.2018
 */
@Controller
@SessionAttributes("filename")
public class FileController {

  @Autowired
  private FileValidator fileValidator; //автосвязывание с бином FileValidator

  private static final Logger logger = LoggerFactory.getLogger(FileController.class);

  @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
  @ResponseBody
  public ModelAndView uploadFile(@ModelAttribute("uploadedFile") UploadedFile uploadedFile,
      BindingResult result)
      throws IOException {// имена параметров (тут - "uploadedFile") - из формы JSP.

    ModelAndView modelAndView = new ModelAndView();

    String fileName = null;

    MultipartFile file = uploadedFile.getFile();
    fileValidator.validate(uploadedFile, result);

    if (result.hasErrors()) {
      modelAndView.setViewName("main");
    } else {
      byte[] bytes = file.getBytes();

      fileName = file.getOriginalFilename();

      //String rootPath = "C:\\path\\"
      //File dir = new File(rootPath + File.separator + "loadFiles");
      File dir = ResourceUtils.getFile("classpath:loadFiles");

      if (!dir.exists()) {
        dir.mkdirs();
      }

      File loadFile = new File(dir.getAbsolutePath() + File.separator + fileName);

      try (BufferedOutputStream stream = new BufferedOutputStream(
          new FileOutputStream(loadFile))) {
        stream.write(bytes);
        stream.flush();
      }

      logger.info("uploaded: " + loadFile.getAbsolutePath());

      RedirectView redirectView = new RedirectView("fileuploaded");
      redirectView.setStatusCode(HttpStatus.FOUND);
      modelAndView.setView(redirectView);
      modelAndView.addObject("filename", fileName);
    }
    return modelAndView;
  }

  @RequestMapping(value = "/fileuploaded", method = RequestMethod.GET)
  public String fileUploaded() {
    return "fileuploaded";
  }
}
