package Pertemuan7;

import java.util.Scanner;

public class studiKasus225 {

    public static void main(String[] args) {

        Scanner rafif = new Scanner(System.in);

        int jmlDokumen;
        int peringkatJuara;
        int statusPkm;
        String namaMahasiswa;
        String jenisKegiatan;

        System.out.print("nama mahasiswa: ");
        namaMahasiswa = rafif.nextLine();
        System.out.print("jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/ATAU YANG LAIN: ");
        jenisKegiatan = rafif.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.println("peringkat juara 1/2/3, 0 bukan juara: ");
            peringkatJuara = rafif.nextInt();
            if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {
                System.out.println("masukan Jumlah Dokumen :");
                jmlDokumen = rafif.nextInt();

                if (jmlDokumen == 4) {
                    System.out.println("Nama Mahasiswa: " + namaMahasiswa);
                    System.out.println("memenuhi ketentuan , dana penghargaan di berikan");
                   
                   
                } else {
                    System.out.println("dokumen belum lengkap , dana penghargaan tidak di berikan");
                }

            } else {
                System.out.println("bukan juara ,  tidak memperoleh dana penghargaan ");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.println("jumlah dokumen :");
            jmlDokumen = rafif.nextInt();

            System.out.println("status pendanaan PKM :");
            statusPkm = rafif.nextInt();

            if (statusPkm == 1) {

                if (jmlDokumen == 4) {
                    System.out.println("PKM lolos berhak memperoleh dana penghargaan");

                } else {
                    System.out.println("dokumen belum lengkap, dana penghargaan tidak di berikan");
                }

            } else {
                System.out.println("tidak lolos , tidak memperoleh dana penghargaan");
            }
        } else {
            System.out.println("jenis kegiatan di luar ketentuan , tidak memperoleh dana penghargaan");
        }

        rafif.close();

    }
}
