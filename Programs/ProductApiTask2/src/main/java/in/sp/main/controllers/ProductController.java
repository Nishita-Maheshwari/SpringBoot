package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.beans.Products;
import in.sp.main.services.ProductService;

@Controller
public class ProductController
{
	private static final int PAGE_SIZE = 10;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public String getProductsList(Model model, @RequestParam(defaultValue = "1") int page) throws Exception
	{
		List<Products> products_list = productService.getProducts();
		int total_products = products_list.size();
		int total_pages = total_products / PAGE_SIZE;
		int start_index = (page-1)*PAGE_SIZE;			//0		- 	10	-	20
		int end_index = start_index+PAGE_SIZE;			//9		-	19	-	29
		
		model.addAttribute("model_productsList", products_list.subList(start_index, end_index));
		model.addAttribute("model_totalPages", total_pages);
//		model.addAttribute("model_currentPage", page);
		
		return "index";
	}
}
