import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class S_InputBufferedReader {
    public static void main(String argsfl) throws IOException {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.print("what is yur nanme?:");
        String name = input.readLine();
        System.out.println("my name is" + name);

    }
}





