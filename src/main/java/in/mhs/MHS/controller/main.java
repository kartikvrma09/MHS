package in.mhs.MHS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class main {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login_page/index";
    }
  
    @GetMapping("/register_p")
    public String Register() {
        return "Register_form/Register_as_a_patient/register_p";
    }

    @GetMapping("/register_c")
    public String register() {
        return "Register_form/Register_as_a_counsellor/Register_C";
    }
    
    @GetMapping("/Contact_page")
    public String contact() {
        return "Contact_page/Contact";
    }
    
    
    
}
