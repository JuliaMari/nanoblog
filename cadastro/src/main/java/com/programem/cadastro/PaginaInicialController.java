package com.programem.cadastro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaInicialController {
    public String Pessoa;
    @GetMapping("/")
    public String inicial(){
        return "PaginaInicial";
    }
}
