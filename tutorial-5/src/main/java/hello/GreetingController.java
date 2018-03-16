package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = true)
                                       String name, Model model) {
        if(name == null || name.equals("")) {
                model.addAttribute("title", "This is my CV");
        } else {
                model.addAttribute("title", name + ", I hope you are interested to hire me");
        }

        StringBuilder cv = new StringBuilder();
        cv.append("Name: Regensa Annaafii Cahyanto\n");
        cv.append("Birthdate: 18th June 1998\n");
        cv.append("Birthplace: Manchester, England\n");
        cv.append("Address: Komp. Jatiwarna Indah B. V No. 15\n");
        cv.append("Education History:\n");
        cv.append("SMP Global Prestasi 2010-2013\n");
        cv.append("SMA 26 Tebet 2013-2016\n");
        cv.append("Faculty of Computer Science 2016-present\n");
        model.addAttribute("cv", cv.toString());

        StringBuilder desc = new StringBuilder();
        desc.append("I am majoring at computer science in University of Indonesia. ");
        desc.append("I like listening to music a lot. ");
        desc.append(" I am also have interests in the world of artificial intelligence. ");
        desc.append("I hope this description will make you know me better :).");
        model.addAttribute("desc", desc.toString());

        return "greeting";
    }

}
