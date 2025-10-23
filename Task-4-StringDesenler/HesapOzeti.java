public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Kalem";
        String urun2 = "Defter";
        String urun3 = "Silgi";

        int miktar1 = 2, miktar2 = 1, miktar3 = 3;
        double fiyat1 = 5.0, fiyat2 = 15.0, fiyat3 = 3.0;

        System.out.println("Ürün\tMiktar\tFiyat\tToplam");
        System.out.println("---------------------------------");
        System.out.println(urun1 + "\t" + miktar1 + "\t" + fiyat1 + "\t" + (miktar1 * fiyat1));
        System.out.println(urun2 + "\t" + miktar2 + "\t" + fiyat2 + "\t" + (miktar2 * fiyat2));
        System.out.println(urun3 + "\t" + miktar3 + "\t" + fiyat3 + "\t" + (miktar3 * fiyat3));
    }
}
