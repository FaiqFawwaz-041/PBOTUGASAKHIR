public class PembayaranBunga extends Bunga{
    PembayaranBunga(int bunga) {super(bunga);
    }

    @Override
    int Bunga(){
        return super.getBungaPinjaman();
    }

}
