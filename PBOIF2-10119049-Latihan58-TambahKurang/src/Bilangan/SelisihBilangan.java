package Bilangan;
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih(){
        int x = getX();
        int y = getY();
        int jumlah = x - y;
        System.out.printf("Hasil Selisih %d - %d = %d\n", x,y,jumlah);
    }
}
