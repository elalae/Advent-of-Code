import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {
    public static void main(String[] args) throws IOException {
        int depth =0;
        int horizontal =0;
        int aim=0;

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ela\\workspace\\Day2.2\\src\\input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arg = line.split(" ");
            String command = arg[0];
            int amount = Integer.parseInt(arg[1]);
            switch (command) {
                case "forward":
                    horizontal += amount;
                    depth +=aim*amount;
                    break;
                case "down":
                    aim+= amount;
                    break;
                case "up":
                    aim -= amount;
                    break;
            }
        }
        System.out.println(depth*horizontal);
    }

}
