package com.sh.practice1.dto;

public class ProductDTO {
    private String produc;
    private String producname;
    private String producArea;
    private int pri;
    private double tax;

    public ProductDTO(){}
    public ProductDTO(String produc, String producname, String producArea, int pri, double tax){
        this.produc = produc; this.producname = producname; this.producArea= producArea; this.pri = pri;this.tax=tax;

    }
    public String getProduc() {
        return produc;
    }

    public void setProduc(String produc) {
        this.produc = produc;
    }

    public String getProducname() {
        return producname;
    }

    public void setProducname(String producname) {
        this.producname = producname;
    }

    public String getProducArea() {
        return producArea;
    }

    public void setProducArea(String producArea) {
        this.producArea = producArea;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }



    @Override
    public String toString() {
        return "ProductDTO{" +
                "produc='" + produc + '\'' +
                ", producname='" + producname + '\'' +
                ", producArea='" + producArea + '\'' +
                ", pri=" + pri +
                ", tax=" + tax +
                '}';
    }
}
