package Kredi;

public class ArabaKredi extends EvKredisi {

    int faiz;
    public double ToplamBorc;
    public float AylikOdeme;
    public long ay;
    public long Miktar;
    public int kabul;

    public void GirdiArabaKredisi(){
        System.out.println("Miktari Giriniz");
        Miktar= scanner.nextLong();
        System.out.println("Kaç Ay olcagını Giriniz");
        ay= scanner.nextLong();
    }

    @Override
    public void GetData(long ay, long Miktar) {
        super.GetData(ay, Miktar);
    }

    public void OdemeAraba(){

        if(ay<12){
            faiz=2;
            AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
        }
        else if(ay>=18&& ay<24){
            faiz=3;
            AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
        }
        else if(ay>=30 && ay<36){
            faiz=4;
            AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
        }
        else if(ay>=42 && ay<48){
            faiz=5;
            AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
        }
        else if(ay>48){
            faiz=7;
            AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
        }
        ToplamBorc=AylikOdeme*ay;
        System.out.println("Aylik Odeme "+AylikOdeme);
        System.out.println("Toplam Borc: "+ToplamBorc);
        System.out.println("Kabul Ediyor musunuz?");
        System.out.println("Evet: 1, Hayır: 2 ");
        kabul=scanner.nextInt();
    }

}
