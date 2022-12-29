package com.bandesal.app.backoffice.web.controller;

import com.bandesal.app.backoffice.domain.service.ReaderService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/readers")
public class ReaderController {

    private final ReaderService readerService;

    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @GetMapping
    public String goReaderIndex(Model model, Pageable pageable){
        model.addAttribute("title", "Readers");
        model.addAttribute("readers", readerService.findAll(pageable));
        return "/component/reader/index";
    }

}
