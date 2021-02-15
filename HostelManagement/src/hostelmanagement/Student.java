
package hostelmanagement;

public class Student {
 
    private int student_id,room_id,age;
    private String address,student_name,parent_name,department,date_of_birth;
    private int phone;
    
    public Student(int student_id,String student_name,String parent_name,String department,String address,int phone,int age,String date_of_birth ,int room_id){
        this.student_id=student_id;
        this.room_id=room_id;
        this.phone=phone;
        this.date_of_birth=date_of_birth;
        this.address=address;
        this.student_name=student_name;
        this.age=age;
        this.parent_name=parent_name;
        this.department=department;
    }
    
    public int getstudent_id(){
        return student_id;
    }
     public int getroom_id(){
        return room_id;
    }
      public String getaddress(){
        return address;
    }
       public int getphone_no(){
        return phone;
    }
      public int getage(){
        return age;
    }  
       public String getdepartment(){
        return department;
    }
       public String getstudent_name(){
        return student_name;
    }
       public String getparent_name(){
        return parent_name;
    }
       public String getdate_of_birth(){
        return date_of_birth;
    }
}




