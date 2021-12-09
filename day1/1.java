import java.util.ArrayList;
import java.util.Arrays;

public class Day1 {

    public static void run() {
        int output = 0;
        // example (paste here your puzzle input)
        String input =
                """
6445
6451
6453
6454
6459
6460
6461
6471
6467
6447
6449
                """;

        ArrayList<String> number = new ArrayList<>(Arrays.asList(input.split("\n")));

        for(int i = 1; i < number.size(); i++) {
            if(Integer.valueOf(number.get(i)) > Integer.valueOf(number.get(i - 1))) {
                output++;
            }
        }
        System.out.println(output);
    }


}
