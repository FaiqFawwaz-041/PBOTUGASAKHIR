import java.util.Scanner;

public class BuktiAngsuran {
    private int jml_angsuran;
    private int thp_angsuran    ;

    public void setJml_angsuran(int jml_angsuran){
        this.jml_angsuran = jml_angsuran;
    }
    public void setThp_angsuran(int thp_angsuran){
        this.thp_angsuran = thp_angsuran;
    }

    public void displayInfo(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Total Angsuran : ");
        setJml_angsuran(userinput.nextInt());
        System.out.println("Masukkan Tahap Angsuran Ke : ");
        setThp_angsuran(userinput.nextInt());
    }
}
