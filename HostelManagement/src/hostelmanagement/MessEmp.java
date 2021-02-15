
package hostelmanagement;


public class MessEmp {

     private int emp_id,salary,emp_phone,hostel_id,mess_incharge_id;
    private String emp_name,emp_address,emp_designation;
    
    public MessEmp(int emp_id,String emp_name,String emp_address,int salary,int emp_phone,int hostel_id ,String emp_designation,int mess_incharge_id){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_address=emp_address;
        this.salary=salary;
        this.emp_phone=emp_phone;
        this.hostel_id=hostel_id;
        this.emp_designation=emp_designation;
        this.mess_incharge_id=mess_incharge_id;
    }
    
    public int gethostel_id(){
        return hostel_id;
    }
     public int getemp_phone(){
        return emp_phone;
    }
      public int getsalary(){
        return salary;
    }
       public String getemp_address(){
        return emp_address;
    }
      public int getemp_id(){
        return emp_id;
    }  
       public String getemp_name(){
        return emp_name;
    }  
        public String getemp_designation(){
        return emp_designation;
    }  
         public int getmess_incharge_id(){
        return mess_incharge_id;
    }  
}


