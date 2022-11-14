package Task_1_2_3;

import java.util.Scanner;

public class Drivers {
    static ConvertProcess cn = new ConvertProcess();
    static Scanner c = new Scanner(System.in);

    private static int Hari;
    public static int getHari() {
        return Hari;
    }

    public static void setHari(int hari) {
        Hari = hari;
    }

    public static void main(String[] args) {
        Input();
        Output();
    }

    static void Input(){
        System.out.print("Masukkan Hari: ");
        Hari = c.nextInt();
    }
    public static void Output(){
        System.out.print(Hari+" Hari : " +cn.ConvertTahun(Hari)+" Tahun " +cn.ConvertBulan(Hari)+" Bulan "+cn.ConvertHari(Hari)+ " Hari");
    }
}
