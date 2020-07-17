package com.programem.cadastro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaController {

  @GetMapping("/pessoa")
  public String pessoaForm(Model model) {
    model.addAttribute("pessoa", new Pessoa());
    return "pessoa";
  }

  @PostMapping("/pessoa")
  public String pessoaSubmit(@ModelAttribute Pessoa pessoa) {
    return "resposta";
  }
    

}
