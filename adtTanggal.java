package tugas;

class tanggal {

    void valid (int hari,int bulan,int tahun){
        String namabl = "";
        int tanggal = 0;
        switch (bulan) {
            case 1 :
                namabl = "januari";
                tanggal = 31 ;
                break;
            case 2 :
                namabl = "februari";
                if (tahun%2 == 0) {
                    tanggal = 28;
                    if (tahun%4 == 0){
                        tanggal = 29;
                        if (tahun%100 == 0){
                            tanggal = 28;
                            if (tahun%400 == 0){
                                tanggal = 29;
                            }
                            else {
                                tanggal  = 28; 
                            }
                        }
                        else{
                            tanggal = 29;
                        }
                    }
                    else {
                        tanggal = 28;
                    }
                }
                else {
                    tanggal = 29;
                }
                break;
            case 3 :
                namabl = "maret" ;
                tanggal = 31;
                break;
            case 4 :
                namabl = "april" ;
                tanggal = 30;    
                break;
            case 5 :
                namabl = "mei" ;
                tanggal = 31;
                break;
            case 6 :
                namabl = "juni" ;
                tanggal = 30;
                break;
            case 7 :
                namabl = "juli" ;
                tanggal = 31;
                break;
            case 8 :
                namabl = "agustus" ;
                tanggal = 31;
                break;
            case 9 :
                namabl = "september" ;
                tanggal = 30;
                break;
            case 10 :
                namabl = "november" ;
                tanggal = 31;
                break;
            case 11 :
                namabl = "oktober" ;
                tanggal = 30;
                break;
            case 12 :
                namabl = "desember" ;
                tanggal = 31;
                break;
        }
    if (hari > 0 && hari <= tanggal ){
        if (bulan > 0 && bulan <= 12){
            System.out.println("Data yang anda masukan benar :");
            System.out.println(hari+" "+namabl+" "+tahun);
        }
    }
    else {
        System.out.println("Data yang anda masukan salah :");
        System.out.println(hari+" "+namabl+" "+tahun);
    }
    }
    
}

public class adtTanggal {
    public static void main (String[] args){
        tanggal data = new tanggal();
        data.valid(32,11, 2000);
    }
}
