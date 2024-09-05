package binaryoperator;

public class Perbandingan {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // sama dengan
        boolean HasilSamaDenagn = (a == b);
        System.out.println("a == b: " + HasilSamaDenagn);

        // tidak sama dengan
        boolean HasilTidakSamaDenagn = (a != b);

        //lebih besar dari
        boolean hasillebihbesardari = (a > b);
        System.out.println("a > b: " + hasillebihbesardari);

        // lebih kecil dari
        boolean hasilLebihKecildari = (a < b);
        System.out.println(" a < b: " + hasilLebihKecildari);

        // lebih besar atau sama denagn
        boolean hasilLEbihBesarAtauSamadenganDari = (a >= b);
        System.out.println("a >= b: " + hasilLEbihBesarAtauSamadenganDari);

        // lebih kecil atau sama dengan
        boolean hasilLebihKecilAtauSamaDenganari = (a <= b);
        System.out.println(" a <= b: " + hasilLebihKecilAtauSamaDenganari);


    }
}
