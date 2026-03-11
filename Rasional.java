public class Rasional {
    private int pembilang, penyebut;
    public Rasional(){
        pembilang=0;
        penyebut=0;
    }
    public Rasional(int pbl , int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }
    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return(penyebut!=0);
    }
    //menyederhanakan bilangan rasional
    public void sederhana(){
        int temp, A, B;
    if(penyebut==0){
        return;
    }
    A = Math.abs(pembilang);
    B = Math.abs(penyebut);
    
    for(;B!=0;){
        temp = A % B;
        A = B;
        B = temp;
    }

    pembilang /= A;
    penyebut /= A;
    }
    public double Cast(){
        return(penyebut==0.0) ? 0.0 : (double)pembilang/penyebut;
    }
    //operator>
    public boolean moreThan(Rasional A){
        return(pembilang * A.penyebut > penyebut * A.pembilang);
    }
    //operator Unary---> A= -A
    public void negasi(){
        pembilang = -pembilang;
    }
    //operator unary +=\
    public void unaryPlus(Rasional A){
        pembilang= pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }

    //operator <
    public boolean lessThan(Rasional A){
        return(pembilang * A.penyebut < penyebut * A.pembilang);
    }
    //operator<=
    public boolean lessThanOrEqual(Rasional A){
        return(pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    //operator>=
    public boolean moreThanOrEqual(Rasional A){
        return(pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    //method untuk operasi pengurangan
    public void minus(Rasional A){
        pembilang= pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= penyebut * A.penyebut;
    }
    //method untuk operasi perkalian
    public void kali(Rasional A){
        pembilang *= pembilang * A.pembilang;
        penyebut *= penyebut * A.penyebut;
    }
    //method untuk operasi pembagian
    public void bagi(Rasional A){
        pembilang *= pembilang * A.penyebut;
        penyebut *= penyebut * A.pembilang;
    }
}
