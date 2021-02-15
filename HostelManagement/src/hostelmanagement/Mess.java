
package hostelmanagement;

public class Mess {

     private int mess_incharge_id,monthly_expenses,hostel_id ;
    private String mess_timing;
    
    
    public Mess(int mess_incharge_id,int monthly_expenses ,String mess_timing, int hostel_id){
        this.mess_incharge_id=mess_incharge_id;
        this.monthly_expenses=monthly_expenses;
        this.mess_timing=mess_timing;
        this.hostel_id=hostel_id;
    }
    
    public int getmess_incharge_id(){
        return mess_incharge_id;
    }
     public int getmonthly_expences(){
        return monthly_expenses;
    }
      public String getmess_timing(){
        return mess_timing;
    }
       public int gethostel_id(){
        return hostel_id;
    }
 }
  

