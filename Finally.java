/*
Nama : Restu Averian
No. Bp : 1911082004
 */
package Tugas_PBOTeori;


public class Finally {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         try{  
             int a[]=new int[5];  
             a[5]=30/5;  
         }  
         catch(ArithmeticException e){
             System.out.println("Problem Aritmatika");}  
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Problem Array");}  
         catch(Exception e){
             System.out.println("Problem Lainnya");}
         finally{
             System.out.println("Problem Sudah Ditangani");}
         
         System.out.println("Akhir Program");  
    }
}