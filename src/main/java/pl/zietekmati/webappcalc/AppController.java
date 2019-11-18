package pl.zietekmati.webappcalc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
    private static Logger logger = LoggerFactory.getLogger(AppController.class);

     //@GetMapping("/showForm")
    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(Model model) {
        Numbers numbers = new Numbers("t", "t");
        model.addAttribute("numbers", numbers);
        return "numbers";

    }

   // @GetMapping ("/processForm")
    @PostMapping("/processForm")
    public String processForm(@ModelAttribute Numbers numbers) {
        logger.info(numbers.getLiczbaA() + " " + numbers.getLiczbaB());
        return "result";

    }

    //
//    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
//    public String showForm(Model model) {
//        Numbers numbers = new Numbers("", "");
//
//
//        model.addAttribute("numbers", numbers);
//
//        return "StartingPage";
//    }


//    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
//    public String processForm(@ModelAttribute(value = "numbers") Numbers numbers) {
//        logger.info(numbers.getLiczbaA() + " " + numbers.getLiczbaB());
//
//        return "StartingPage";
//    }
}