package com.sh.section01.dto;

public class Desktop extends Electronic{
    public static final String CPU = "intel";
    private String graphic;
    public Desktop(){}



    public Desktop(String brand, String name, int pri, String graphic) {
        super(brand, name, pri);
        this.graphic = graphic;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;

    }

    @Override
    public String toString() {
        return "Desktop{" + super.toString()+
                "graphic='" + graphic + '\'' +
                '}';
    }
}
