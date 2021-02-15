
package hostelmanagement;

public class Visitor {

    private int visitor_id,student_id;
    private String visitor_name,time_in,time_out,date;
    
    public Visitor(int visitor_id,int student_id,String visitor_name,String time_in,String time_out,String date ){
        this.visitor_id=visitor_id;
        this.student_id=student_id;
        this.visitor_name=visitor_name;
        this.time_in=time_in;
        this.time_out=time_out;
        this.date=date;
    }
    
    public int getvisitor_id(){
        return visitor_id;
    }
     public String gettime_in(){
        return time_in;
    }
      public String getvisitor_name(){
        return visitor_name;
    }
       public int getstudent_id(){
        return student_id;
    }
      public String gettime_out(){
        return time_out;
    }  
       public String getdate(){
        return date;
    }  
       
}


