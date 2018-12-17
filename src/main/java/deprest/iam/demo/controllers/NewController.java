package deprest.iam.demo.controllers;

import deprest.iam.demo.Product;
import deprest.iam.demo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class NewController {

    @Autowired
    private ProductRepository productRepository;

    @ModelAttribute("newProduct")
    public Product newProduct(){
        return new Product();
    }

    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String showNew(ModelMap map) {
        return "new";
    }

    @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String newProduct(@ModelAttribute("newProduct") @Valid Product newProduct, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "new";
        }productRepository.save(newProduct);
        return "redirect:/index";
    }
}
