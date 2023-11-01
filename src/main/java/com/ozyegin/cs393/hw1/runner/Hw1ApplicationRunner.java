package com.ozyegin.cs393.hw1.runner;

import com.ozyegin.cs393.hw1.beans.ProductBean;
import com.ozyegin.cs393.hw1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Hw1ApplicationRunner implements ApplicationRunner {

    @Autowired
    private ProductBean productBean;

    @Override
    public void run(ApplicationArguments args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(0, "apple", 10.10));
        productList.add(new Product(1, "banana", 11.11));
        productList.add(new Product(2, "watermelon", 12.12));
        productList.add(new Product(3, "orange", 13.13));

        productBean.setProductList(productList);

    }

}
