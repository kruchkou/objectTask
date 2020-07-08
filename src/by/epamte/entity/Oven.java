package by.epamte.entity;

public class Oven extends ShopItem {

    private int powerConsumption;
    private int weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(String[] params) {
        powerConsumption = Integer.parseInt(params[0]);
        weight = Integer.parseInt(params[1]);
        capacity = Integer.parseInt(params[2]);
        depth = Double.parseDouble(params[3]);
        height = Double.parseDouble(params[4]);
        width = Double.parseDouble(params[5]);
    }
}
