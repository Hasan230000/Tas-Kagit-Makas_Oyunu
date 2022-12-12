
package tas.kagit.makas;


public class TasKagitMakas {

    
    public static void main(String[] args) {
        System.out.println("seçiminizi yapın  => taş(0) kağıt(1)  makas(2)");
		Scanner input = new Scanner(System.in);
		int secimim = input.nextInt();
                System.out.println();
        int pc = (int) (Math.random() * 3);
         String sonuc="";
		if (secimim > 2)
			sonuc="hatalı seçim yaptınız";
		else if (secimim == 0 && pc == 1)
			sonuc="bilgisayar kağıdı seçti kaybettiniz";
		else if (secimim == 0 && pc == 2)
			sonuc="bilgisayar makası seçti kazandınız";
		else if (secimim == 1 && pc == 0)
			sonuc="bilgisayar taşı seçti kazandınız";
		else if (secimim == 1 && pc == 2)
			sonuc="bilgisayar makası seçti kaybettiniz";
		else if (secimim == 2 && pc == 0)
			sonuc="bilgisayar taşı seçti kaybettiniz";
		else if (secimim == 2 && pc == 1)
			sonuc="bilgisayar kağıdı seçti kazandınız";
		else if (secimim == 0 && pc == 0)
			sonuc="bilgisayar da taşı seçti berabere";
		else if (secimim == 1 && pc == 1)
			sonuc="bilgisayar da kağıdı seçti berabere";
		else if (secimim == 2 && pc == 2)
			sonuc="bilgisayar da makası seçti berabere";
                System.out.print(sonuc);
    }
    
}
