package deprest.iam.demo.controllers;

import deprest.iam.demo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String showAbout(ModelMap map) {
        return "about";
    }
}
