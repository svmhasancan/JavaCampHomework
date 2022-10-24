public class Main {
    public static void main(String[] args) {
        sayiBulmaca(); // sayiBulmaca metodunu çağırmak!
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int []{1,2,3,4,5};
        int aranacakSayi = 2;
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi == aranacakSayi){
                varMi = true;
                break;
            }
        }

        if (varMi == true){
            mesajVer("Sayı Mevcuttur: " + aranacakSayi);
        }
        else{
            mesajVer("Sayı Mevcut Değildir: " + aranacakSayi);
        }
    }

    public static void mesajVer(String mesaj){ // Parametreli Metod
        System.out.println(mesaj);
    }
}