package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IProductService;
import service.ProductService;

import java.util.List;

@Controller
@RequestMapping("")
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("")
    public String getAll(Model model) {
        List<Product> productList =productService.findAll();
        model.addAttribute("products",productList);
        return "/index"
    }
}
