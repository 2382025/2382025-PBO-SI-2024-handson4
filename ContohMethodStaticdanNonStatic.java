public class ContohMethodStaticdanNonStatic {

    public static double hitungLuasPersegi(double sisi){
        return sisi * sisi;
    }
    public void tampilkanPesanSelamatDatang(String nama){
        System.out.println("Selamat Datang, " + nama + "!");
    }

    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticdanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas Persegi dengan sisi 5: " + luasPersegi);

        ContohMethodStaticdanNonStatic objek = new ContohMethodStaticdanNonStatic();
        objek.tampilkanPesanSelamatDatang("Eunice");
        objek.hitungLuasPersegi(5);
    }

}
