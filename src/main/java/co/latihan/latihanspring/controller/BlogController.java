package co.latihan.latihanspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author galang
 */
@Controller
public class BlogController {

    @GetMapping("/blog/home")
    public void home() {
    }

    @GetMapping("/about")
    public void about() {
    }

    @GetMapping("/contact")
    public void contact() {
    }

    @GetMapping("/company")
    public String company() {
        return "/blog/test";
    }
}
