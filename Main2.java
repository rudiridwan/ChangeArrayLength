package nomer1;

public class Main2 {
    public static void main(String[] args) {
        
        Object [][] data ={
            {"Rudi"   ,"1997" ,"Laki"     }, // baris ke-0
            {"Ridwan" ,"1995" ,"Laki"     }, // baris ke-1
            {"Ilham"  ,"1996" ,"Laki"     }, // baris ke-2
            {"Boy"    ,"1997" ,"Laki"     }, // baris ke-3
            {"Jihan"  ,"1997" ,"Perempuan"}  // baris ke-4
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 3);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}
