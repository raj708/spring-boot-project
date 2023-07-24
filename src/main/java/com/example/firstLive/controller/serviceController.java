package com.example.firstLive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class serviceController {
   @GetMapping("/")
   public String index() {
	   return"index";
   }
}
