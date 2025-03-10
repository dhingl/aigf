package org.example.practivedeleteafter.adapterpattern;

public class Client {
    public static void main(String[] args) {
        USB usb=new SDCardAdapter(new SDCard());
        usb.usbCardReader();

    }
}
