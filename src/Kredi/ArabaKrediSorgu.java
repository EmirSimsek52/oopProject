package Kredi;

public class ArabaKrediSorgu extends ArabaKredi{
    public long Gelir;
    public int BorcVarmi=0;
    public long Gider;
    public double Guc;
    public int Sonuc=1;
    public double ToplamBorc;

    public void GelirBilgi(){

        System.out.println("Aylik Geliriniz Giriniz: ");
        Gelir=scanner.nextLong();
        System.out.println("Aylik Giderinizi Giriniz: ");
        Gider=scanner.nextLong();
    }

    public void Sorgu(float AylikOdeme){
        this.AylikOdeme=AylikOdeme;
        Guc=Gelir-(AylikOdeme+Gider);
        if(BorcVarmi==1){
            Sonuc=0;

        } else {
            if (Guc < 0) {
                Sonuc = 0;
            } else if (Guc > 0) {
                Sonuc = 1;
                ToplamBorc=AylikOdeme*ay;
            }
        }
        if(Sonuc==1){
            System.out.println("Kredi Basvurunuz Kabul Edildi");
            System.out.println("Toplam Borc: "+ToplamBorc);
            System.out.println("Aylik Ödemeniz: "+AylikOdeme);
        }else {
            System.out.println("Kredi Basvurunz Reddedildi");
        }
    }


}
