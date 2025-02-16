package com.ino.practice1.run;

import com.ino.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {
        ProductDTO prod1 = new ProductDTO("i1", "ino", "paju", 200, 2.0);
        System.out.println(prod1.getInformation());
        prod1.setPrice(3000);
        System.out.println(prod1.getInformation());
        System.out.println(prod1.getPrice() * (100 + prod1.getTax()) / 100);
    }
}
