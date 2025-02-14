package com.sh.practice1.run;

import com.sh.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {
        ProductDTO pd = new ProductDTO();
        pd.setProduc("ssgnote9");
        pd.setProducname("갤럭시노트9");
        pd.setProducArea("경기도 가평");
        pd.setPri(960000);
        pd.setTax(10.0);


        ProductDTO pd2 = new ProductDTO();
        pd2.setProduc("lgxnote5");
        pd2.setProducname("LG스마트폰5");
        pd2.setProducArea("경기도  평택");
        pd2.setPri(780000);
        pd2.setTax(0.7);


        ProductDTO pd3 = new ProductDTO();
        pd3.setProduc("ktsnote3");
        pd3.setProducname("케이티노트3");
        pd3.setProducArea("서울시 강남");
        pd3.setPri(250000);
        pd3.setTax(0.3);

        System.out.println(pd.toString());
        System.out.println(pd2.toString());
        System.out.println(pd3.toString());

        System.out.println("===============");

        pd.setPri(1200000);
        pd.setTax(0.05);

        pd2.setPri(1200000);
        pd2.setTax(0.05);

        pd3.setPri(1200000);
        pd3.setTax(0.05);


        System.out.println(pd.toString());
        System.out.println(pd2.toString());
        System.out.println(pd3.toString());

        System.out.println("===============");

        int sum = (int) (pd.getPri() * pd.getTax());
        System.out.println("상품명="+pd.getProducname());
        System.out.println("부가세 포함 가격="+(pd.getPri() + (int)(pd2.getPri()*pd2.getTax())));

        System.out.println("상품명="+pd2.getProducname());
        System.out.println("부가세 포함 가격 = "+(pd2.getPri() + (int)(pd2.getPri()*pd2.getTax())));

        System.out.println("상품명="+pd3.getProducname());
        System.out.println("부가세 포함 가격="+(pd3.getPri() + (int)(pd2.getPri()*pd2.getTax())));
    }
}
