 import jdk.internal.util.xml.impl.Input;

 import java.util.Scanner;
public class T_InputScanner {
    //membaca masukkan dari keyboard menggunakan kelas Scanner
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is yor name?");
        String name = input.nextLine();
        System.out.println("My name is = sinta");
    }

}

