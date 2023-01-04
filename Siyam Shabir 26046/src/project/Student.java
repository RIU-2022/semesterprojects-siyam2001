
package project;


public class  Student   {
      public static int size = 0;
     
    
    public static String   name[] = new String[100];
    public static String   id[] = new String[100];
    
    public void getName(String na , String i){
        name[size] = na;
        id[size] = i;
        size++;
    }

    public static void setSize(int size) {
        Student.size = size;
    }

    public static void setName(String[] name) {
        Student.name = name;
    }

    public static void setId(String[] id) {
        Student.id = id;
    }

    public static int getSize() {
        return size;
    }

    public static String[] getName() {
        return name;
    }

    public static String[] getId() {
        return id;
    }
    
    public void add()
    {
        
        
    }

}