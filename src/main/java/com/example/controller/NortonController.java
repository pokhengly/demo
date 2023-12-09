package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/norton/cs/")
public class NortonController {

    @GetMapping("e1")
    public String getE1() {
        return "Hello Norton E1";
    }

    @GetMapping("e2")
    public String getE2() {
        return "Hello Norton E2";
    }

    @GetMapping("e3")
    public String getE3() {
        return "Hello Norton E3";
    }

    @GetMapping("e4")
    public String getE4() {
        return "Hello Norton E4";
    }

    @GetMapping("e5")
    public String getE5() {
        return "Hello Norton E5";
    }
}
