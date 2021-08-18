package ru.lsz.pswgen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lsz.pswgen.service.PswService;

import java.util.List;

@RestController
public class PswRestController {
    @Autowired
    PswService pswService;

    @GetMapping("/psw")
    public List<String> getPSW() {
        return pswService.getPSW();
    }
}
