package com.espark.adarsh.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Adarsh on 7/4/15.
 */
public class ReferenceToInstanceMethodOfArbitraryObjectExample {

    public static void main(String[] args) {
        final List<Color> colorList = Arrays.asList(new Color("RED"), new Color("WHITE"), new Color("BLUE"), new Color("GREEN"), new Color("YELLOW"), new Color("BLACK"));

        final List<String> colorNameList1=ReferenceToInstanceMethodOfArbitraryObjectExample
                .applyFunction(colorList,new Function<Color, String>() {
                    @Override
                    public String apply(Color colorValue) {
                        return colorValue.getName().toLowerCase();
                    }
                } );
        System.out.println(colorNameList1);

        final List<String> colorNameList2=ReferenceToInstanceMethodOfArbitraryObjectExample
                .applyFunction(colorList,(colorValue) -> { return colorValue.getName().toLowerCase(); } );
        System.out.println(colorNameList2);

        final List<String> colorNameList3=ReferenceToInstanceMethodOfArbitraryObjectExample
                .applyFunction(colorList,(colorValue) -> colorValue.getName().toLowerCase());
        System.out.println(colorNameList3);

        final List<String> colorNameList4=ReferenceToInstanceMethodOfArbitraryObjectExample
                .applyFunction(colorList,colorValue -> colorValue.getName().toLowerCase());
        System.out.println(colorNameList4);

        final List<String> colorNameList5=ReferenceToInstanceMethodOfArbitraryObjectExample
                .applyFunction(colorList, Color::getName);
        System.out.println(colorNameList5);
    }

    public static List<String> applyFunction(List<Color> colorList, Function<Color, String> colorStringFunction) {
        final List<String> outputList = new ArrayList<>();
        colorList.forEach(colorValue -> outputList.add(colorStringFunction.apply(colorValue)));
        return outputList;
    }
}

class Color {

    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
