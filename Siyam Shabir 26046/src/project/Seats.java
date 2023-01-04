
package project;

import java.util.Scanner;


public class Seats  {
   
   public static String seat[][] ;
 
   
  public void seats()
  {
      SeatsFrame sf=new SeatsFrame();
         seat = new String[sf.rows][sf.cols];
          for(int a = 2 ; a < sf.rows ; a++){
          for (int b = 0 ; b <sf.cols ; b++){
                seat[a][b] = "*";
            }
        }
  }
  




//        rows = r;
//        cols = c;
//        total = rows * cols;
//        seat = new String[r][c];
//    }
//    
//    
//    public void AssignSeats(){
//        System.out.println("Enter seats number");
//        Scanner input = new Scanner(System.in);
//        for(int a = 0 ; a < rows ; a++){
//            for (int b = 0 ; b < cols ; b++){
//                seat[a][b] = "*";
//            }
//        }
//    }
//    
//    public void DisplaySeats(){
//        for(int a = 0 ; a < rows ; a++){
//            for (int b = 0 ; b < cols ; b++){
//                System.out.println(seat[a][b]);
//            }
//           
//        }
//    }
//    
////    public void StudentSeat(){
////         for(int a = 0 ; a < rows ; a++){
////            for (int b = 0 ; b < cols ; b++){
////               name[b] = seat[a][b];
////               System.out.println("Student " + name[b] + " will have seat " + seat[a][b]);
////            }
////        }
////    }
//    
//    public void StudentSeat(){
//        int stu = 0;
//        for (int a = 0 ; a < rows ; a++){
//            for (int b = 0 ; b < cols ; b++){
//                if (stu < name.length){
//                     System.out.println("Student " + name[stu] + "(" + id[stu] + ")" + " will have seat " + seat[a][b]);
//                     stu++;
//                }
//            }
//        }
//    }
//
//    
////    public void EnterNames() {
////        Scanner input = new Scanner(System.in);
////        System.out.print("Enter student");
////        for (int a = 0 ; a < (rows * cols) ; a++ ){
////            name[a] = input.nextLine();
////            id[a] = input.nextLine();
////        }
////    }
//    public void Display(){
//        for (int a = 0 ; a < (rows * cols) ; a++ ){
//            System.out.println(name[a]);
//        }
//    }
    
    
    
    
    
}
