import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("|                            |");
        System.out.println("|   KOPERASI SIMPAN PINJAM   |");
        System.out.println("|                            |");
        System.out.println("------------------------------");
        System.out.println();


        Anggota pelanggan = new Anggota();
        Transaksi transaksi = new Transaksi();
        BuktiPinjaman bktipnjman = new BuktiPinjaman();
        BuktiAngsuran ba = new BuktiAngsuran();
        int pilih;

        pelanggan.displayInfo();
        transaksi.displayInfo();
        bktipnjman.displayInfo();
        ba.displayInfo();

        System.out.println();
        Scanner input = new Scanner(System.in);
        IsiTabungan x = new IsiTabungan();
        System.out.println("Masukan Isi Tabungan : ");
        int a;
        a = input.nextInt();
        System.out.println("Isi Tabungan Adalah   : "+x.isi_tabungan(a));


    }
}