package spring_basic.part3_membership_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //동일한 링크에 대한 html 파일이 static과 templates에 존재할 경우, Controller 내 링크를 우선한다.
    @GetMapping("/")
    public String home() {
        return "home";
    }

}