package nomer1;

import java.lang.reflect.Array;

public class ChangeArrayLength {
    public static Object[][] changeLength2D(Object [][] a, int n, int m, int newLength, int newLength2){
        
        if (n> newLength){
            throw new IllegalArgumentException("length baru terlalu kecil");
        }
        if(m>newLength2){
            throw new IllegalArgumentException("length ke-2 terlalu kecil");
        }

        Object [][] newArray = (Object [][]) Array.newInstance(a.getClass().getComponentType(), newLength, newLength2);

        newArray = (Object[][])a.clone(); 
        
        return newArray;
    }
    
    
    public static Object [][] changeLength2D(Object[][] a, int newLength, int newLength2){// semua array di copy ke array yg baru
        return changeLength2D(a, a.length, a[0].length, newLength, newLength2);
    }
}
