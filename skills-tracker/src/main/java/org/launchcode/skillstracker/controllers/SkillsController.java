package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody()
public class SkillsController {

       @GetMapping("")
       public String titlePage() {
           return "<html>" + "<head>" +
                   "<h1>Skills Tracker</h1>" +
                   "</head>" +
                   "<body>" +
                   "<h2>We have a few Skills we would like to learn. Here is the List!</h2>" +
                   "<ol>" +
                       "<li>Python</li>" +
                       "<li>Java</li>" +
                       "<li>JavaScript</li>" +
                   "</ol>" + "</body>" + "</html>";
       }

       @GetMapping("form")
        public String showForm() {
           return "<html>" + "<body>" +
                   "<form method = 'post' action ='/form'>" +
                   "<label for='name'>Name:</label>" + "<br>" +
                   "<input type = 'text' name='name'/>" + "<br>" +
                   "<label for='Favorite'>My Favorite Language:</label>" + "<br>" +
                   "<select name='Favorite'>" +
                   "<option value='Python'>Python</option>" +
                   "<option value='Java'>Java</option>" +
                   "<option value='JavaScript'>JavaScript</option>" + "</select>" + "<br>" +
                   "<label for='Second'>My Second Favorite Language:</label>" + "<br>" +
                   "<select name='Second'>" +
                   "<option value = 'Python'>Python</option>" +
                   "<option value ='Java'>Java</option>" +
                   "<option value = 'JavaScript'>JavaScript</option>" + "</select>" + "<br>" +
                    "<label for='Last'>My Least Favorite Language:</label>" + "<br>" +
                   "<select name='Last'>" +
                   "<option value= 'Python'>Python</option>" +
                   "<option value= 'Java'>Java</option>" +
                   "<option value= 'JavaScript'>JavaScript</option>" + "</select>" + "<br>" +
                   "<input type = 'submit' value= 'submit'/>" +
                   "</form>" + "</body>" + "</html>";

       }
       @PostMapping("form")
       public String displayForm(@RequestParam String name, @RequestParam String Favorite, @RequestParam String Second, @RequestParam String Last) {
           return "<html>" + "<body>" + "<h1>" + name + "</h1>" +
                   "<ol>" +
                   "<li>" + Favorite + "</li>" +
                   "<li>" + Second + "</li>" +
                   "<li>" + Last + "</li>" +
                   "</ol>" + "</body>" + "</html>";
       }
}
