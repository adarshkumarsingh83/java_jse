package com.espark.adarsh;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class CharacterCountTest {

    @Test
    public void testCharacterCountJdk7() {
        final String data = "hi my name is adarsh and wife is radha her husband is adarsh";
        List<Map.Entry<Character, Long>> output = CharacterCountService.characterCountJdk7(data);
        System.out.println(output);
    }

    @Test
    public void testCharacterCountJdk8() {
        final String data = "hi my name is adarsh and wife is radha her husband is adarsh";
        List<Map.Entry<Character, Long>> output = CharacterCountService.characterCountJdk8(data);
        System.out.println(output);
    }
}
