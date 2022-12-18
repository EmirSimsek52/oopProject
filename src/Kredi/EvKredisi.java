package Kredi;
import java.util.Scanner;
public class EvKredisi {
    Scanner scanner = new Scanner(System.in);
     public int faiz;
     public int kabul;
    public double ToplamBorc;
     public long Miktar;
     public long ay;
    public float AylikOdeme;
    public void GirdiEvKredisi(){
        System.out.println("Miktari Giriniz");
        Miktar= scanner.nextLong();
        System.out.println("Kaç Ay olcagını Giriniz");
        ay= scanner.nextLong();
    }
    public void GetData(long ay,long Miktar){
            this.ay=ay;
            this.Miktar=Miktar;
    }

        public void Odeme(){

            if(ay<48){
                faiz=2;
                AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
            }
            else if(ay>=60&& ay<72){
                faiz=3;
                AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
            }
            else if(ay>=72 && ay<84){
                faiz=4;
                AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
            }
            else if(ay>=84 && ay<96){
                faiz=5;
                AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
            }
            else if(ay>96){
                faiz=6;
                AylikOdeme=(Miktar*faiz)/100+(Miktar/ay);
            }
            ToplamBorc=AylikOdeme*ay;
            System.out.println("Aylik Odeme "+AylikOdeme);
            System.out.println("Toplam Borc: "+ToplamBorc);
            System.out.println("Kabul Ediyor musunuz?");
            System.out.println("Evet: 1, Hayır: 2 ");
            kabul=scanner.nextInt();
        }

    // Calculate the monthly payment


    // Print the result

}
