import javax.swing.tree.FixedHeightLayoutCache;
import java.io.IOException;
import java.util.Scanner;
public class U_InputTypeScanerA {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama: ");
        String nama = input.nextLine();
        System.out.println("masukkan umur : ");
        String age = input. nextLine();
        System.out.println("Sudah menikah(true/false): ");
        String married = input.nextLine();
        System.out.println(" Tinggi badan: ");
        String height = input.nextLine();

        System.out.println("Nama :"+ nama);
        System.out.println("umur :"+ Integer.parseInt(age));
        System.out.print("tinggi badan :"+ Double.parseDouble (height));
        System.out.println("sudah menikah :"+ Boolean.parseBoolean(married));


    }
}
