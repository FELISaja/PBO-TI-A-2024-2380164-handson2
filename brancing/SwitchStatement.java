package brancing;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nomor hari 1-7 : ");
        int nomorHari1 = input.nextInt();

        String namaHari = "";

        switch (nomorHari1) {
            case 1:
                namaHari = "minggu";
                break;
            case 2:
                namaHari = "senin";
                break;
            case 3 :
                namaHari = "selasa";
                break;
            case 4 :
                namaHari = "rabu";
                break;
            case 5 :
                namaHari = "kamis";
                break;
            case 6 :
                namaHari = "jumat";
                break;
            case 7 :
                namaHari = "sabtu";
                break;
            default:
                System.out.println("masuka=kan nomor antara 1-7");
                System.exit(0);
        }
        System.out.println("hari : " + namaHari);
    }
}
