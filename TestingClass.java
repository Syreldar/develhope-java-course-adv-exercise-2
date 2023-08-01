import java.util.*;

public class TestingClass
{
    public static void main(String[] args)
    {
        Map<Integer, String> englishNumbersMap = new HashMap<>(Map.of(1, "One", 2, "Two", 3, "Three", 4, "Four", 5, "Five"));
        Map<Integer, String> italianNumbersMap = new HashMap<>(Map.of(1, "Uno", 3, "Tre", 5, "Cinque", 7, "Sette", 9, "Nove"));

        englishNumbersMap.putAll(italianNumbersMap);
        System.out.printf("Merged HashMap: %s\n", englishNumbersMap);

        for (int i = 5; i <= 9; i++)
        {
            String value = englishNumbersMap.getOrDefault(i, "No associated value");
            System.out.printf("The value of key %d: %s\n", i, value);
        }
    }
}
