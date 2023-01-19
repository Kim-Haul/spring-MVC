package com.example.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


// 어노테이션 @RestController, @Controller 차이 이해하기
@Controller
public class LoginController {
    // 어노테이션 @ResponseBody 유무에 따른 차이 이해하기
    @GetMapping("/login")
    public String htmlFile() {
        return "redirect:/login-form.html";
    }

    @PostMapping("/login")
    public String LoginParam(@RequestParam String id, @RequestParam String password, Model model) {
        if (id.equals(password)) {
            model.addAttribute("loginId", id);
            return "login-result";
        } else {
            return "login-result";
        }
    }
}
