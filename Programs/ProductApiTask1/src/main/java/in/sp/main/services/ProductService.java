package in.sp.main.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.main.beans.Products;

@Service
public class ProductService
{
	public List<Products> getProducts() throws Exception
	{
		String url = "https://dummyjson.com/products";
		
		RestTemplate restTemplate = new RestTemplate();
		String jsonStr = restTemplate.getForObject(url, String.class);
		//System.out.println("1 : "+jsonStr);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		JsonNode rootNode = mapper.readTree(jsonStr);
		//System.out.println("2 : "+rootNode);
		
		JsonNode productsNode = rootNode.get("products");
		//System.out.println("3 : "+productsNode);
		
		List<Products> products_list = mapper.readValue(productsNode.toString(), new TypeReference<List<Products>>() {});
		//System.out.println("4 : "+products_list);
		
		return products_list;
	}
}
