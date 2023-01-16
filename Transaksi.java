import java.util.Scanner;

public class Transaksi {
    private int id_peminjaman;
    private int tgl_peminjaman;
    private int bln_peminjaman;
    private int thn_peminjaman;
    private int tgl_angsuran;
    private int tgl_haruslunas;

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }
    public void setTgl_peminjaman(int tgl_peminjaman){
        this.tgl_peminjaman = tgl_peminjaman;
    }
    public void setBln_peminjaman(int bln_peminjaman){
        this.bln_peminjaman = bln_peminjaman;
    }
    public void setThn_peminjaman(int thn_peminjaman){
        this.thn_peminjaman = thn_peminjaman;
    }
    public void setTgl_angsuran(int tgl_angsuran){
        this.tgl_angsuran = tgl_angsuran;
    }
    public void setTgl_haruslunas(int tgl_haruslunas){
        this.tgl_haruslunas = tgl_haruslunas;
    }

    public void displayInfo(){
        Scanner userinput = new Scanner(System.in);
        System.out.println(" Masukkan ID Peminjam : ");
        setId_peminjaman(userinput.nextInt());
        System.out.println("Masukkan Tanggal Peminjaman : ");
        setTgl_peminjaman(userinput.nextInt());
        System.out.println("Masukkan Bulan Peminjaman : ");
        setBln_peminjaman(userinput.nextInt());
        System.out.println("Masukkan Tahun Peminjaman : ");
        setThn_peminjaman(userinput.nextInt());
        System.out.println("Masukkan Tanggal Mulai Angsuran : ");
        setTgl_angsuran(userinput.nextInt());
        System.out.println("Masukkan Jatuh Tempo : ");
        setTgl_haruslunas(userinput.nextInt());

        System.out.println("Masukkan ID Peminjam : "+this.id_peminjaman);
        System.out.println("Masukkan Waktu Peminjaman "+ tgl_peminjaman +""+ bln_peminjaman +" "+thn_peminjaman);
        System.out.println("Masukkan Tanggal Mulai Angsuran : "+this.tgl_angsuran);
        System.out.println("Masukkan Tanggal Jatuh Tempo : "+this.tgl_haruslunas);
        System.out.println();
    }
}
