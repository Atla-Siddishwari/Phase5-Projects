package com;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public class MainController {
 @RequestMapping("/Hi")
 public String index() {
 return "index.html";
 }
}