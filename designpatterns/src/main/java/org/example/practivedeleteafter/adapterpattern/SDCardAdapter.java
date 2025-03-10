package org.example.practivedeleteafter.adapterpattern;

public class SDCardAdapter implements  USB{
    private  SDCard card;
    public SDCardAdapter(SDCard sdCard)
    {
        this.card=sdCard;
    }

    @Override
    public void usbCardReader() {
        card.sdCardReader();
        System.out.println("Readed threw SD card");
    }
}
