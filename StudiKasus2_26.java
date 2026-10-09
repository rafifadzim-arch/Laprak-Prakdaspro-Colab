package Pertemuan7;
import java.util.Scanner;

public class StudiKasus2_26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = risqi.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = risqi.nextLine().trim();

        boolean lomba = jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI");
        boolean pkm = jenis.equalsIgnoreCase("PKM");

        // Data hanya diminta sesuai jenis kegiatan
        if (lomba) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = risqi.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = risqi.nextInt();

            // Tingkat 1: lomba
            if (juara >= 1 && juara <= 3) { 
                // Tingkat 2: juara 1-3
                if (dokumen >= 4) { 
                // Tingkat 3: dokumen lengkap
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        } else if (pkm) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = risqi.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int status = risqi.nextInt();

            // Tingkat 1: PKM
            if (status == 1) {                               
                // Tingkat 2: lolos pendanaan
                if (dokumen >= 4) {                          
                // Tingkat 3: dokumen lengkap
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan Lainnya tidak memperoleh dana penghargaan.");
        }

        risqi.close();
    }
}
