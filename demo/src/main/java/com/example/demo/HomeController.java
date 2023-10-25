package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "home";
  }

  @GetMapping("/testscore")
  public String testscore() {
    return "testscore";
  }

  @GetMapping("/testcomplete")
  public String testcomplete() {
    return "testcomplete";
  }

}