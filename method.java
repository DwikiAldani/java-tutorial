package Algoritma;

public class method {
int bulat,pembilang,penyebut;

method (){
    bulat =0;pembilang=0;penyebut=1;
}
//method (int x){
//    bulat=x;pembilang=x;penyebut=1;
//}
method (int x, int y){
    bulat=x;pembilang=y;penyebut=1;
}
method (int x,int y,int z){
    bulat=x;pembilang=y;penyebut=z;
}
//method pecahan(method X){
//    method T=new method();
//    T.pembilang=bulat*penyebut+pembilang;
//    return T;
//}

method tambah(method X ){
    method T=new method();
    if (penyebut == X.penyebut){
    T.pembilang=(bulat*penyebut+pembilang)+(X.bulat*X.penyebut +X.pembilang);
    T.penyebut=X.penyebut;
  
    }
    else {
        T.pembilang = ((bulat*penyebut+pembilang)*X.penyebut) + ((X.bulat*X.penyebut+X.pembilang)*penyebut);
        T.penyebut = penyebut * X.penyebut;
    }
    
    
      return T;
}

void cetak(){
    if(penyebut==1)
        System.out.println(pembilang);
    else 
        System.out.println(bulat+" "+pembilang+"/"+penyebut);
}

public static void main(String[] args){
    method p=new method(3,1,2);
    method p1=new method();
    method p2=new method(3,1,3);
    p.cetak();
    p2.cetak();
    p1=p.tambah(p2);
    p1.cetak();
}
    
}
