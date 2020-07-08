package by.epamte.entity;

public class Refrigerator extends ShopItem {

    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator(String[] params) {
        powerConsumption = Integer.parseInt(params[0]);
        weight = Integer.parseInt(params[1]);
        freezerCapacity = Integer.parseInt(params[2]);
        overallCapacity = Double.parseDouble(params[3]);
        height = Integer.parseInt(params[4]);
        width = Integer.parseInt(params[5]);
    }
}
