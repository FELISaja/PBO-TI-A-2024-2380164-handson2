package brancing;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);

        System.out.println("masukkan nomor hari (1-7) : ");
        int nomorHari = input.nextInt();

        String namaHari = " ";

        if (nomorHari == 1){
            namaHari= "minggu";
        } else if (nomorHari == 2) {
            namaHari = "senin";
        } else if (nomorHari == 3) {
            namaHari = "selasa";
        } else if (nomorHari == 4) {
            namaHari ="rabu";
        } else if (nomorHari == 5) {
            namaHari ="kamsi";
        } else if (nomorHari == 6) {
            namaHari= "jumat";
        } else if (nomorHari == 7) {
            namaHari ="sabtu";
        } else {
            System.out.println("masukkan nomor antara 1-7");
            System.exit(0);
        }
        System.out.println("hari : " + namaHari);
    }
}
