
package project;


public class fac {
    
    public static int size = 0;
    
   
     public static String   name[] = new String[100];
     public static String   id[] = new String[100];
    
    
     
    
     public void getName(String na , String i){
        name[size] = na;
        id[size] = i;
        size++;
    }
}
