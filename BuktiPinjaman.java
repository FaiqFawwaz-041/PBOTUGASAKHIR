import java.util.Scanner;

public class BuktiPinjaman {
    private int id_pinjam;
    private int jml_pinjam;


    public void setId_pinjam(int id_pinjam){
        this.id_pinjam = id_pinjam;
    }

    public void setJml_pinjam(int jml_pinjam){
        this.jml_pinjam = jml_pinjam;
    }
    public void displayInfo(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan ID Pinjaman : ");
        setId_pinjam(userinput.nextInt());
        System.out.println("Masukkan Jumlah Peminjaman :");
        setJml_pinjam(userinput.nextInt());

    }
}
