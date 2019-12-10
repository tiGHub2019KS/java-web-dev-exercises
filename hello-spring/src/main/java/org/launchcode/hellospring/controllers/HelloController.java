package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello,Spring!";
//    }
    //lives /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //Handles request of the form /hello?name=launchCode
   @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
//        String message = createMessage(name, language);
//        return "Hello, " + name + "!";
         return HelloController.createMessage(name, language);
        }

    //lives /hello/hello
    //handles request of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) { return "Hello, " + name + "!"; }

    // /hello/form
    @GetMapping("form")
    public String helloForm() {

        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" + //submit a request to /hello
                "<select name = 'language'>" +
                  "<option value='En' selected>English</option>" +
                  "<option value='Ger'>German</option>" +
                  "<option value='Fr'>French</option>" +
                  "<option value='It'>Italian</option>" +
                  "<option value='Sp'>Spanish</option>" +
                  "<option value='Hi'>Hindi</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'/>" +
                "</form>" + "</body>" + "<html>";

    }
    public static String createMessage(String name, String language) {
        String salutation = "Hello ";

        if (language.equals("Ger")) {
            salutation = "Guten Tag";

        } else if(language.equals("Fr")) {
            salutation = "Bonjour";

        } else if(language.equals("It")) {
            salutation = "Ciao";

        } else if(language.equals("Sp")) {
            salutation = "Hola";

        } else if(language.equals("Hi")) {
            salutation = "Namaste";
        }
        return salutation + name;

    }

}
