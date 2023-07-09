package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sp.main.beans.Products;
import in.sp.main.services.ProductService;

@Controller
public class ProductController
{
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public String getProductsList(Model model) throws Exception
	{
		List<Products> products_list = productService.getProducts();
		model.addAttribute("model_productsList", products_list);
		
		return "index";
	}
}
