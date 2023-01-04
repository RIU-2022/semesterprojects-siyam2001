package project;


public class Course extends Student {
     public static String name[] = new String[100];
     public static String id[] = new String[100];
      public static int size = 0;
      
     @Override
       public void getName(String na , String i){
        name[size] = na;
        id[size] = i;
        size++;
    }

}

