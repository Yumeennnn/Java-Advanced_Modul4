package Task_1_2_3;

public class ConvertProcess {

    void Process(Drivers a){
        int ConvertTahunn = a.getHari();
        ConvertTahun(ConvertTahunn);

        int ConvertBulan = a.getHari();
        ConvertBulan(ConvertTahunn);

        int ConvertHari = a.getHari();
        ConvertHari(ConvertBulan);

    }

    public static int ConvertTahun(int ConvertTahunn) {
        int ConvertTahun;
        return ConvertTahun = ConvertTahunn / 365;
    }

    public static int ConvertBulan(int ConvertTahunn) {
        int ConvertBulan;
        return ConvertBulan = (ConvertTahunn % 365) / 30;
    }

    public static int ConvertHari(int ConvertBulan) {
        int ConvertHari;
        return ConvertHari = (ConvertBulan % 365) % 30;
    }

}
