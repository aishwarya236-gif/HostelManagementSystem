
package hostelmanagement;

public class Hostel {
   
    private int hostel_id,no_of_students,no_of_rooms;
    private String location;
    private int annual_fees;
    
    public Hostel(int hostel_id,int no_of_students,String location,int annual_fees,int no_of_rooms){
        this.hostel_id=hostel_id;
        this.no_of_students=no_of_students;
        this.location=location;
        this.annual_fees=annual_fees;
        this.no_of_rooms=no_of_rooms;
    }
    
    public int gethostel_id(){
        return hostel_id;
    }
     public int getno_of_students(){
        return no_of_students;
    }
      public String getlocation(){
        return location;
    }
       public int getannual_fees(){
        return annual_fees;
    }
      public int getno_of_rooms(){
        return no_of_rooms;
    }  
       
}


