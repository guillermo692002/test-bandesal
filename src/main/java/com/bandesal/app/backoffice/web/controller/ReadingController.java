package com.bandesal.app.backoffice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/readers")
public class ReadingController {

    @GetMapping
    public String goReaderIndex(Model model){
        System.out.println("entro a reader");
        model.addAttribute("title", "Readers");

        return "/component/reader/index";
    }

}
