package by.epamte.utils;

import by.epamte.entity.*;

public class ObjectFactory {

    public static Object create(String className, String[] params) {

        switch (className) {
            case "Laptop":
                return new Laptop(params);
            case "Oven":
                return new Oven(params);
            case "Refrigerator":
                return new Refrigerator(params);
            case "Speaker":
                return new Speaker(params);
            case "TabletPC":
                return new TabletPC(params);
            case "VacuumCleaner":
                return new VacuumCleaner(params);
        }
        return null;
    }

}
