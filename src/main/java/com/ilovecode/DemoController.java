package com.ilovecode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class DemoController {

  @GetMapping
  public String hello(Model model) {
    model.addAttribute("message", "Hello world");
    return "hello";
  }
}
