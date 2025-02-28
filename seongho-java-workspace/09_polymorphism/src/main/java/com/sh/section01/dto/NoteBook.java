package com.sh.section01.dto;

public class NoteBook extends Electronic{
    private int usbPort;
    public NoteBook(){}



    public NoteBook(String brand, String name, int pri, int usbPort) {
        super(brand, name, pri);
        this.usbPort = usbPort;
    }

    public int getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(int usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public String toString() {
        return "NoteBook{" + super.toString()+
                "usbPort=" + usbPort +
                '}';
    }
}
