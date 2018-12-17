package deprest.iam.demo.controllers;

import deprest.iam.demo.Product;
import deprest.iam.demo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailsController {

    @Autowired
    private ProductRepository productRepository;


    @RequestMapping(value = {"/details/{id}"}, method = RequestMethod.GET)
    public String showDetails(ModelMap map, @PathVariable(value = "id")int id) {
        Product product=productRepository.findById(id).get();
        map.addAttribute("product", product);
        return "details";
    }
}
