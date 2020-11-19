package Bilangan;
public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah(){
        int x = getX();
        int y = getY();
        int jumlah = x + y;
        System.out.printf("Hasil Perjumlahan %d + %d = %d\n",x, y, jumlah);
    }
}
