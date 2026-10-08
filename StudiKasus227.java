import java.util.Scanner;

public class StudiKasus227 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();
        
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINYA): ");
        String jenisKegiatan = scanner.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
           jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
           jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen: ");
            int jumlahDokumen = scanner.nextInt();

            System.out.print("Peringkat: ");
            int peringkat = scanner.nextInt();

            if (jumlahDokumen < 4 ){
                int kurang = 4 - jumlahDokumen;
                System.out.println("Jumlah dokumen kurang " + kurang + " dokumen. Dana Penghargaan tidak diberikan.");
            } else if (peringkat >= 1 && peringkat <= 3) {
                System.out.println("Status: Berhak memperoleh dana penghargaan");
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3)");
            } 
        } else if(jenisKegiatan.equalsIgnoreCase("PKM")){
            System.out.print("Jumlah dokumen: ");
            int jumlahDokumen = scanner.nextInt();

            System.out.print("Status pendanaan PKM (1 = Lolos, 0 = Tidak Lolos): ");
            int statusPendanaan = scanner.nextInt();

            if (jumlahDokumen < 4 ){
                int kurang = 4 - jumlahDokumen;
                System.out.println("Jumlah dokumen kurang " + kurang + " dokumen. Dana Penghargaan tidak diberikan.");
            } else if (statusPendanaan == 1) {
                System.out.println("Status: Berhak memperoleh dana penghargaan (untuk PKM yang lolos pendanaan)");
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (tidak lolos pendanaan PKM)");
            }
        } else {
        System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");        
    } scanner.close();
    }
}
