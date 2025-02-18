package com.sotogito.practice1.run;

import com.sotogito.practice1.dto.ProductDTO;

public class Application2 {

    public static void main(String[] args) {
        ProductDTO[] dtos = new ProductDTO[3];

        dtos[0] = new ProductDTO(
                "ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0
        );
        dtos[1] = new ProductDTO(
                "lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7
        );
        dtos[2] = new ProductDTO(
                "ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3
        );

        for (ProductDTO dto : dtos) {
            System.out.println(dto.getInformation());
        }

        dtos[0].setPrice(1200000);
        dtos[0].setTax(0.05);
        dtos[1].setPrice(1200000);
        dtos[1].setTax(0.05);
        dtos[2].setPrice(1200000);
        dtos[2].setTax(0.05);

        for (ProductDTO dto : dtos) {
            System.out.println(dto.getInformation());
        }

        for (ProductDTO dto : dtos) {
            System.out.println(
                    (int) (dto.getPrice() + (dto.getPrice() * dto.getTax()))
            );
        }
    }

}
