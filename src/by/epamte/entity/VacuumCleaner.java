package by.epamte.entity;

public class VacuumCleaner extends ShopItem {

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(String[] params) {
        powerConsumption = Integer.parseInt(params[0]);
        filterType = params[1];
        bagType = params[2];
        wandType = params[3];
        motorSpeedRegulation = Integer.parseInt(params[4]);
        cleaningWidth = Integer.parseInt(params[5]);
    }
}
