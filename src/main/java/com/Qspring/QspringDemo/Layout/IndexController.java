package com.Qspring.QspringDemo.Layout;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Qualifier("mapper")
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }



    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }

}
