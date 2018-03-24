package at.refugeescode.englishgermandictionary.hellowordpage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
    @RequestMapping("/HelloWorld")
    public String sayHelloWorld() {
        return "HelloWorld";
    }

}
