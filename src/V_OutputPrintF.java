public class V_OutputPrintF {
    public static void main(String[]args) {
        String nama = "Anton";
        int umur = 21;
        float tinggiBadan = 170.4f;
        double beratBadan = 71.78;
        boolean kawin = true;
        char jenisKelamin = 'P';
        int okta112 = 014;
        System.out.printf("Nama :%s\n",	nama);
        System.out.printf("Umur : %d\n", umur);
        System.out.printf("Tinggi Badan : %f\n", tinggiBadan);
        System.out.printf("Berat Badan : %lfln", beratBadan);
        System.out.printf("Sudah Menikah :%b\n", tinggiBadan);
        System.out.printf("Jenis Kelamin :%c\n", jenisKelamin);
        System.out.printf("Bilangan Oktal 12 : %o\n", okta112);

    }
}
