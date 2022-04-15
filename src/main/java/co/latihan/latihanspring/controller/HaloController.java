package co.latihan.latihanspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author galang
 */
@Controller
@RequestMapping("/najis/halal")
public class HaloController {

    @GetMapping("/hello")
    public String sayHay(ModelMap modelMap) {
        String nama = "Riski";
        modelMap.addAttribute("namaDepan", nama);
        modelMap.addAttribute("menyapa", "Saya Galang");
        return "/coba/halo";
    }

    @GetMapping("/kampret")
    public String sayHayDUa(ModelMap mm) {
        return "/coba/halo";
    }
}
