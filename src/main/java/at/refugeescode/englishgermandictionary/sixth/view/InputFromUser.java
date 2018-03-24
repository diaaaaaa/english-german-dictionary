package at.refugeescode.englishgermandictionary.sixth.view;


import at.refugeescode.englishgermandictionary.sixth.controller.LookUpWord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputFromUser {

    @RequestMapping("/translator")
    public String getWord(@RequestParam(value="englishWord", required=false, defaultValue=" ") String englishWord, Model model){
        LookUpWord lookUpWord = new LookUpWord();
        String germanWord = lookUpWord.lookup(englishWord);
        model.addAttribute("englishWord", englishWord);
        model.addAttribute("germanWord", germanWord);
        return "translator";
    }


}
