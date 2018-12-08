import java.util.ArrayList;

public class MyClass {
    public static void main(String args[]) {
       
       //System.out.print (mergeStrings("prllppd","aaeeieo"));
      System.out.print (mergeStrings("jnta","oahn"));
    }
    
    public static String mergeStrings(String a, String b) {
        
        int i, j;
        int  c = a.length() + b.length();
        int tamA = a.length();
        int tamB = b.length();
        
        char arrayA[] = a.toCharArray();
        char arrayB[] = b.toCharArray();
        ArrayList<Character> arrayRes= new ArrayList<Character> ();

    
        for (i = 0, j = 0 ; i <= c; i+=2, j++,tamA--)
            {
               if (tamA > 0)
               {
                    arrayRes.add (arrayA[j]);
               }
            }
            
        for (i = 1, j =0 ; i <= c; i+=2, j++,tamB--)
            {
               if (tamB > 0)
               {
                    arrayRes.add (i,arrayB[j]);
               }
            }    

        String resultado = new String (arrayRes.toString().replaceAll(",", "").replaceAll(" ", ""));
        return resultado;
    

    }

}