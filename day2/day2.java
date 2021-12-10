import java.util.Arrays;
import java.util.List;

public class Day2 {

    public static void run() {
        int horizontal = 0;
        int depth = 0;

        // example input
        String input =
                """
                forward 5
                down 5
                forward 8
                up 3
                down 8
                forward 2 
                """;

        List<String> list = Arrays.asList(input.split("\n"));

        for(int i = 0; i < list.size(); i++) {
            var index = list.get(i).indexOf(' ');

            String instruction = list.get(i).substring(0, index);
            int size = Integer.parseInt(list.get(i).substring(index + 1));

            switch (instruction) {
                case "forward":
                    horizontal += size;
                    break;
                case "down":
                    depth += size;
                    break;
                case "up":
                    depth -= size;
                    break;
            }
        }

        System.out.print("Depth:" + depth + "\n" + "Horizontal: " + horizontal + "\n" + "Together:" + (horizontal * depth));

    }
}
