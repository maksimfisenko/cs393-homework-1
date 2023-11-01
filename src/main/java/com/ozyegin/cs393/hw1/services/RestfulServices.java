package com.ozyegin.cs393.hw1.services;

import java.util.ArrayList;
import java.util.List;


import com.ozyegin.cs393.hw1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozyegin.cs393.hw1.beans.DailyDiscountSelector;
import com.ozyegin.cs393.hw1.beans.ProductBean;


@RestController
public class RestfulServices {
	@Autowired
	private ProductBean productBean;

	@Value("${welcomeMessage}")
	private String welcomeMessage;

	@Value("${headerMessage}")
	private String headerMessage;

	@Autowired
	private DailyDiscountSelector discountSelector;
	
	@GetMapping(value="/products")
	public List<String> listProducts() {
		List<String> messages=new ArrayList<>();

		messages.add(welcomeMessage);
		messages.add(headerMessage);

		List<Product> productList = productBean.getProductList();
		for (Product product: productList) {
			messages.add(product.toString());
		}

		messages.add("You are lucky. Today's discount rate is " +
				discountSelector.getDailyDiscountRate() + "%.");

		return messages;
	}

	
}
