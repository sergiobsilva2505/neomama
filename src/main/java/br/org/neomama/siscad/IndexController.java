package br.org.neomama.siscad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping
    public String helloPage(){
        return "index";
    }
}
