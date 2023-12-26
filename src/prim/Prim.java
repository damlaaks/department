package prim;

public class Prim {
    int gunSayisi;
    int maas;
    public Prim (int gunSayisi, int maas){
        this.maas = maas;
        this.gunSayisi = gunSayisi;

    }
    public void primHesaplama () {
        int primliMaas = maas;
        if (gunSayisi > 25 ){
           primliMaas = primliMaas + ((gunSayisi-25)*1000) ;

        }

        System.out.println("Maasiniz:" + primliMaas);
    }

}
