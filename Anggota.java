import java.util.Scanner;

public class Anggota {
    private int id_anggota;
    private String Nama;
    private String No_hp;
    private String Alamat;

    public void setId_anggota(int id_anggota){
        this.id_anggota = id_anggota;
    }
    public void setNama(String nama){
        this.Nama = nama;
    }
    public void setNo_hp(String no_hp){
        this.No_hp = no_hp;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }

    public void displayInfo(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan ID Anggota : ");
        setId_anggota(userinput.nextInt());
        System.out.println("Masukkan Nama : ");
        setNama(userinput.next());
        System.out.println("Masukkan No Hp: ");
        setNo_hp(userinput.next());
        System.out.println("Masukkan Alamat ");
        setAlamat(userinput.next());

        System.out.println("Masukkan ID Anggota :"+this.id_anggota);
        System.out.println("Nama Anggota        :"+this.Nama);
        System.out.println("Alamat Anggota      :"+this.Alamat);
        System.out.println("No Hp               :"+this.No_hp);
        System.out.println();

    }
}
