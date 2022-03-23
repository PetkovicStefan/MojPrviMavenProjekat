package common;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;

public class ValueChoosers {

    public static String getRandomPosition() {
        ArrayList<String> listOfPosition = new ArrayList<>();
        listOfPosition.add("QA");
        listOfPosition.add("JS dev");
        listOfPosition.add("Java dev");
        listOfPosition.add("HR");

        return listOfPosition.get(RandomUtils.nextInt(0, listOfPosition.size()));
    }
}
