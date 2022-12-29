package com.demo.CT.controller;

import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerImpl;
import com.commercetools.api.models.product.Product;
import com.demo.CT.CustomerService;
import com.demo.CT.Details;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

@Controller
public class MainController {

    static CustomerService customerService = new CustomerService();

    @RequestMapping(value="/beta")
    public String home()
    {
        System.out.println("This is home page");
        return "mr";
    }

    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String showForm(Model model)
    {
        Details details = new Details();
        model.addAttribute("form",details);
        return "form";
    }
    @RequestMapping(value = "/qwerty",method = RequestMethod.POST)
    public String saveForm(Model model,Details details)
    {

        Customer customer =  customerService.createCustomer(details);
        System.out.println(customer.getId());
//        return customer.getId();
        model.addAttribute("id",customer.getId());
        return "success";

    }

    /*@RequestMapping(value = "/index")
    public String index() {
        return "index";
    }*/
    @RequestMapping("/Product")
    public String getProduct(Model model)
    {
        Product product = customerService.getProduct("f3c3d3d7-9a0c-409a-b651-dd23231ab565");

        model.addAttribute("pd",product.getMasterData().getStaged().getAllVariants().get(0).getId());
        model.addAttribute("img",product.getMasterData().getStaged().getAllVariants().get(0).getImages().get(0));
        return "product";
//        return product.getMasterData().getCurrent().getVariants().get(0).getImages();
//        return "Hey, ComeOn to onboarding Process";
    }
}
