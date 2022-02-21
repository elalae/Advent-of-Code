import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {
    public static void main(String[] args) throws IOException {
        int depth =0;
        int horizontal =0;

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ela\\workspace\\AdeventCode\\src\\input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arg = line.split(" ");
            String command = arg[0];
            int amount = Integer.parseInt(arg[1]);
            switch (command) {
                case "forward":
                    horizontal += amount;
                    break;
                case "down":
                    depth += amount;
                    break;
                case "up":
                    depth -= amount;
                    break;
            }
        }
        System.out.println(depth*horizontal);
    }

}
