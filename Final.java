
/*
Nama : Restu Averian
No. Bp : 1911082004
 */
package Tugas_PBOTeori;

final class Final {
    public final void Test(){
        System.out.println(" Coba-coba");
    }
}

class Testing extends Final{ //Akan menghasilkan error karena
                             //class yang di inherit/wariskan itu bersifat final
    public static void main(String[] args) {
        Final F = new Final(); //Tidak bisa gunakan method karena method & class 
                               //yg diwariskan/inherit bersifat final
        System.out.print("Sekarang saya lagi");F.Test();
    }
}