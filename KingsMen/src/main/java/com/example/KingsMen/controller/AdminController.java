package com.example.KingsMen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
   @GetMapping("/admin")
   public String adminDashboard(){
       return "/backend-views/admin-dashboard";
   }



}