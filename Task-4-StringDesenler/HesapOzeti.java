public class AlisverisListesi {
    public static void main(String[] args) {

        String[] urunler = {"Elma", "Ekmek", "Süt", "Peynir"};
        int[] miktar = {2, 1, 3, 1};
        double[] fiyat = {15.0, 10.0, 12.5, 45.0};

        System.out.println("=========================================");
        System.out.printf("%-15s %-10s %-10s\n", "Ürün", "Miktar", "Fiyat (₺)");
        System.out.println("=========================================");

        double toplam = 0;

        for (int i = 0; i < urunler.length; i++) {
            System.out.printf("%-15s %-10d %-10.2f\n", urunler[i], miktar[i], fiyat[i]);
            toplam += miktar[i] * fiyat[i];
        }

        System.out.println("=========================================");
        System.out.printf("%-15s %-10s %-10.2f\n", "Toplam", "", toplam);
        System.out.println("=========================================");
    }
}
