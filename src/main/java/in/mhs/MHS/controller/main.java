package in.mhs.MHS.controller;
// import in.mhs.MHS.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.qos.logback.core.model.Model;
import in.mhs.MHS.model.*;
import in.mhs.MHS.service.*;

@Controller
public class main {

    @Autowired
    private UserService userService;
    @Autowired
    private UService uService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
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

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute p_details user, Model model, RedirectAttributes redirectAttributes) {
        // Log the user details to see if they are being populated

        System.out.println("User Details: " + user);

        p_details userDtls = userService.createUser(user);

        if (userDtls != null) {
            System.out.println("Signup Successful");
            redirectAttributes.addFlashAttribute("successMessage", "Signup Successful");
            return "redirect:/login";
        } else {
            System.out.println("Something went wrong on the server");
            // model.addAttribute("message", "Something went wrong on the server");
            return "register_p";
        }
    }

    @PostMapping("/createCounsellor")
    public String createCounsellor(@ModelAttribute c_details counsellor,Model model, RedirectAttributes redirectAttributes) {
        // Log the counsellor details to see if they are being populated
        System.out.println("Counsellor Details: " + counsellor);

        c_details counsellorDtls = uService.createCounsellor(counsellor);

        if (counsellorDtls != null) {
            System.out.println("Signup Successful");
            redirectAttributes.addFlashAttribute("successMessage", "Signup Successful");
            return "redirect:/login";
        } else {
            System.out.println("Something went wrong on the server");
            // You can use RedirectAttributes to add error messages if needed
            redirectAttributes.addFlashAttribute("errorMessage", "Something went wrong on the server");
            return "redirect:/register_c";
        }

    }

}
