package com.example.GitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String main(){
        System.out.println("home : " + 11111);
        System.out.println("이 코드는 dev branch에서 추가함");
        return "main";
    }
}
