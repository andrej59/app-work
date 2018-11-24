package ru.ajana.work.spring;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Andrey Kharintsev on 29.03.2018
 */
public class UploadedFile {

  private MultipartFile file;

  public MultipartFile getFile() {
    return file;
  }

  public void setFile(MultipartFile file) {
    this.file = file;
  }
}
