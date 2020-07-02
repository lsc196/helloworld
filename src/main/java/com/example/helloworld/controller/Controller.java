package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/")
    public String index(){
        return "Hello World!";
    }
    
    public void gittest(){

        String s ="idea";
        if (s.equals("idea")){
                s="asdgjadsl;ganskgl;d";
        }
}

    public void ideatest(){
        String s ="IDEA修545454改代码";

    }

     public void ideatsadfest(){
        String s ="IDEA修改代码123123";
    }

    public void ide123123atest(){
        String s ="IDEA修545454改代码";

        String s ="IDEA修改代码11111111111111111";
    }
     public void ideatsad123fest(){
        String s ="IDEA修改代码11111111111111111";
    }

}
