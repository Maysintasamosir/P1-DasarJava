public class Q_CastingPromotion {
    public static void main(String[] args) {
        // konversi tipe data
        long varLong = 1000000L;
        int varlnt = 23456;
        varlnt = (int) varLong;
        varLong = varlnt;
        varLong = ('t' + varLong); System.out.println("Nilai varlnt = " + varlnt);   char varChar = 'a'; varlnt = (int) varChar;
        System.out.println("Nilai varlnt ('a') = ' + varlnt); varChar = (char) (varlnt+i");
        System.out.println("Nilai varChar = + varChar"); byte varByte = 127; varlnt = varByte;
        System.out.println("Nilai varlnt (127) = " + varlnt); short varShort = (short) varlnt; varShort =  varShort;
        varShort = varByte;
        System.out.println("NiIai varShort = " + varShort); double varDoubIe = 3.145256718992022; float varFloat = (float) varDoubIe;
        System.out.println("Nilai varDouble = " + varDoubIe);
        System.out.println("Nilai varFloat = " + varFloat);


    }
}
