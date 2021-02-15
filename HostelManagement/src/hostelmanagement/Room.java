
package hostelmanagement;

public class Room {

    private int room_id,capacity,no_of_beds,hostel_id;
    private String furniture_type,name_of_student;
   
    public Room(int room_id,int capacity,int no_of_beds,String furniture_type,int hostel_id,String name_of_student){
        this.room_id=room_id;
        this.capacity=capacity;
        this.no_of_beds=no_of_beds;
        this.furniture_type=furniture_type;
        this.hostel_id=hostel_id;
        this.name_of_student=name_of_student;
    }
    
    public int getroom_id(){
        return room_id;
    }
     public int getno_of_beds(){
        return no_of_beds;
    }
       public int getcapacity(){
        return capacity;
    }
      public String getfurniture_type(){
        return furniture_type;
    } 
       public String getname_of_student(){
        return name_of_student;
    }  
        public int gethostelID(){
        return hostel_id;
    }  
}


