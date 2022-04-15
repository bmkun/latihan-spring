package co.latihan.latihanspring.controller;

import co.latihan.latihanspring.dao.BukuDao;
import co.latihan.latihanspring.entity.Buku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author galang
 */
@Controller
public class BukuController {

    @Autowired
    private BukuDao bukuDao;

    @GetMapping("/buku")
    public String list(ModelMap mm) {
        Iterable<Buku> bukus = bukuDao.findAll();
        mm.addAttribute("datas", bukus);
        return "buku/list";
    }
}
