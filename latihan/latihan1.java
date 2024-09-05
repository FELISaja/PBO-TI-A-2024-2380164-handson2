package latihan;

public class latihan1 {
    public static void main(String[] args) {

        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukan Bilangan ke - " + i + " : ");
            bilangan[i] = input.nextInt();
        }

        int largestNum = bilangan[0];
        for (int i = 1; i < bilangan.length; i++) {
            if (largestNum < bilangan[i]) {
                largestNum = bilangan[i];
            }
        }
        System.out.println(largestNum);
    }
}
