package ru.lsz.pswgen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lsz.pswgen.service.PswService;

import java.util.List;

@Controller
public class PswController {
    @Autowired
    PswService pswService;

    @GetMapping("/psw")
    public String getPSW(Model model) {
        List<String> psw = pswService.getPSW();
        model.addAttribute("psw", psw);
        return "psw-list";
    }
}
