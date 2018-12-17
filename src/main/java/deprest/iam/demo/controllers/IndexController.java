package deprest.iam.demo.controllers;

import deprest.iam.demo.Product;
import deprest.iam.demo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class IndexController {

    @Autowired
    private ProductRepository productRepository;

    @ModelAttribute("all")
    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }

    @RequestMapping(value = {"/index/{id}"}, method = RequestMethod.GET)
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }
}
