package by.epamte.entity;

public class Speaker extends ShopItem{

    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speaker(String[] params) {
        powerConsumption = Integer.parseInt(params[0]);
        numberOfSpeakers = Integer.parseInt(params[1]);
        frequencyRange = params[2];
        cordLength = Integer.parseInt(params[3]);
    }
}
