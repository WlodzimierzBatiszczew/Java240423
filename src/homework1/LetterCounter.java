package LessonAdditional.Task3;

import java.util.HashMap;

public class LetterCounter {
        public static HashMap<Character, Integer> countLetters(String text) {
            HashMap<Character, Integer> result = new HashMap<>();
            char[] chars = text.toCharArray();
            for (char l : chars) {
                if (Character.isLetter(l)) {
                    l = Character.toLowerCase(l);
                    if (result.containsKey(l)) {
                        result.put(l, result.get(l) + 1);
                    } else {
                        result.put(l, 1);
                    }
                }
            }
            return result;
        }
        
        public static void main(String[] args) {
            String text = "Однажды с студеную зимнюю пору, я вышел и леса, был сильный мороз";
            System.out.println(countLetters(text));
        }
    }


