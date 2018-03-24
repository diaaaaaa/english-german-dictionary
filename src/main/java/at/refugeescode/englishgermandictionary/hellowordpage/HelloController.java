package at.refugeescode.englishgermandictionary.hellowordpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello-world")
    public String hello (@RequestParam(value="user", required=false, defaultValue="Mr") String user, Model model) {

        model.addAttribute("user", user);
        return "hello-world"; // web page's name, it is like render template in Python

    }
}

