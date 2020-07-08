package by.epamte.entity;

public class Laptop extends ShopItem {
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInchs;

    public Laptop(String[] params) {
        batteryCapacity = Double.parseDouble(params[0]);
        os = params[1];
        memoryRom = Integer.parseInt(params[2]);
        systemMemory = Integer.parseInt(params[3]);
        cpu = Double.parseDouble(params[4]);
        displayInchs = Integer.parseInt(params[5]);
    }
}
