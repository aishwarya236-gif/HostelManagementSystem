
package hostelmanagement;


public class Fees {
    
     private String fees_month,fees_status,student_name;
    private int student_id;
    
    public Fees(String fees_month,String fees_status,int student_id,String student_name){
        this.fees_month=fees_month;
        this.fees_status=fees_status;
        this.student_id=student_id;
        this.student_name=student_name;
    }
    
    public int getstud_id(){
        return student_id;
    }
     public String getstud_name(){
        return student_name;
    }
      public String getfees_month(){
        return fees_month;
    }
       public String getfees_status(){
        return fees_status;
    }   
}


