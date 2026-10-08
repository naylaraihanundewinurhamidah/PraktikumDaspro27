import java.util.Scanner;

public class studiKasus127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurangBayar;

        System.out.print("Masukkan jumlah cup yang ingin dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukan uang bayar:");
        uangBayar = scanner.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurangBayar = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp: " + kurangBayar);
        }

    }
}