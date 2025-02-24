package com.sh.section04.dto;

public class CosmeticDTO {
    private String name;
    private String pri;
    private  String kat;
    private boolean dc;

public CosmeticDTO(){}
    public CosmeticDTO (String name, String pri , String kat, boolean dc){
    this.name=name;
    this.pri=pri;
    this.kat=kat;
    this.dc=dc;
    }
    public String getname(){return name;}

    public void setName(String name){this.name=name;}

    public String getpri(){return pri;}

    public void setpri(String pri){this.pri=pri;}

    public String getkat(){return kat;    }

    public void setkat(String kat){this.kat = kat;    }

    public boolean isDc() {return dc;    }

    public void setDc(boolean dc) {this.dc = dc;}

    public String getIF(){
        return "name: "+name+ ", pri: "+pri+", kat: "+kat+", dc: "+dc;
    }


}
