
package project;


public class Hall {
    
    public String displaySeat()
    {
          SeatsFrame sf = new SeatsFrame();
          Seats s=new Seats();
          String line = "";
          for (int a = 2 ; a < sf.rows ; a ++){
            
            for (int b = 0 ; b < sf.cols ; b++){
              line +=  sf.s.seat[a][b]+"\t";
               
            }
            line += "\n";
            
            
    }
          return line;
    
    }

    public String assignStudent(){
          Student s = new Student();
          String Stu=" ";
            SeatsFrame sf = new SeatsFrame();
            int v = 0;
          for(int a = 2 ; a < sf.rows ; a++){
          for (int b = 0 ; b < sf.cols ; b++){
              if(v < s.name.length){
              Stu +=   s.name[v] + " " + s.id[v]+"\t";
                 v++;
              }
//              Stu += "\n";
          }
          
        }
          return Stu;
    }
    public String assignfaculty(){
         fac f = new fac();
        
         SeatsFrame sf = new SeatsFrame();
          String fa="";
         for (int a = 0 ; a < sf.cols ; a++){
          fa += f.name[a]+" " +f.id[a] +"\t";
        }
         return fa;
    }
    
      public String assignCourse(){
        Course c = new Course();
        
         SeatsFrame sf = new SeatsFrame();
          String co="";
         for (int a = 1 ; a < sf.cols ; a++){
           co += c.name[a]+" " + c.id[a] +"\t";
        }
         return co;
    }
    

}

