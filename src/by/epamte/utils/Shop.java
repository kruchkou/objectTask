package by.epamte.utils;

import by.epamte.entity.ShopItem;
import by.epamte.utils.regex.RegexUtil;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public List<String> stock;

    public Shop() {
        stock = new ArrayList<>();
        stock = fileToList();
    }

    private List<String> filterByClass(String className) {
        List<String> list = new ArrayList<>();

        for (String line : stock) {
            if (RegexUtil.className(line).equals(className)) {

                list.add(line);
            }
        }

        return list;
    }

    private List<String> filterByParams(List<String> classList, String param, String suitableValue) {
        List<String> result = new ArrayList<>();

        for (String line : classList) {
            String value = RegexUtil.paramValue(param, line);

            if (value.equals(suitableValue)) {

                result.add(line);
            }
        }
        return result;
    }

    private List<String> fileToList() {
        final String EMPTY_STRING = "";
        List<String> lineList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("/home/kruchkou/IdeaProjects/objectTask/src/by/epamte/utils/db/appliances_db.txt");
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.equals(EMPTY_STRING)) {
                    continue;
                }

                lineList.add(line);
            }

            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineList;
    }

    public List<ShopItem> filteredItems(String className, String param, String value) {
        List<ShopItem> resultList = new ArrayList<>();
        List<String> filteredList = filterByClass(className);
        filteredList = filterByParams(filteredList, param, value);

        for (String line : filteredList) {
            ShopItem shopItem = (ShopItem) ObjectFactory.create(className,RegexUtil.allParams(line));
            resultList.add(shopItem);
        }

        return resultList;
    }

}
