/*
Nama : Restu Averian
No. Bp : 1911082004
 */
package Tugas_PBOTeori;


public class WrapperClass {
    public static void main(String args[]) {

    Integer integerObjek1 = new Integer(1234); 
    Integer integerObjek2 = new Integer("1234");


    Double doubleObjek1 = new Double(12.34); 
    Double double0bjek2 = new Double("12.34");
    
    Boolean boolean0bjek1 = new Boolean(true);
    Boolean boolean0bjek2 = new Boolean("true");

    Character character0bjek1 = new Character('0');
    
    System.out.println("Output Nilai Integer Class : " +integerObjek1 + " dan "
            + integerObjek2 + " sama."+"Max Nilai Integer : "+Integer.MAX_VALUE);
    
    //output nilai Wrapper Class Integer
    System. out. println("Output Nilai Double Class : " + doubleObjek1 + " dan " 
            + double0bjek2 + " sama."+
            "Max Nilai Double :"+ Double. MAX_VALUE);
    
    //output Wrapper Class Double
    System. out. println("Output Nilai Boolean Class : "+ boolean0bjek1+ " dan "
            +boolean0bjek2+" sama.");
    
    //output nilai Wrapper Class Boolean
    System. out. println("Output Nilai Character Class : " +character0bjek1);

    //output nilai Wrapper Class Character

    }
}