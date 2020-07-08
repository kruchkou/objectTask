package by.epamte.entity;

public class TabletPC extends ShopItem {

    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC(String[] params) {
        batteryCapacity = Integer.parseInt(params[0]);
        displayInches = Integer.parseInt(params[1]);
        memoryRom = Integer.parseInt(params[2]);
        flashMemoryCapacity = Integer.parseInt(params[3]);
        color = params[4];
    }
}
