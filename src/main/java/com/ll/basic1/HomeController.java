package com.ll.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    //GetMapping의 의미
    //개발자가 스프링부트에게 말한다.
    //만약 /home/main 이런 요청이 온다면 아래 메서드를 실행해줘
    @GetMapping("/home/main")
    //ResponseBody의 의미
    //아래 메서드를 실행한후 그 리턴값을 응답으로 삼아줘
    @ResponseBody
    public String showmain() {
        return "안녕하세요!!!";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String showmain2() {
        return "반갑습니다.";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String showmain3() {
        return "즐거웠습니다.";
    }
}
