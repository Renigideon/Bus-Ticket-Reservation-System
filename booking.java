package oop_project;

 class user extends Trichy_bus {
    String user_name;
    long aadhar_number;
    String pan_number;
    String destination;
    user(String Driver_name,int bus_no,boolean ac,boolean availability,boolean sleeper,boolean restroom,String user_name,String destination,long aadhar_number,String pan_number){
        super(Driver_name,bus_no,ac,availability,sleeper,restroom);
        this.user_name=user_name;
        this.destination=destination;
        this.aadhar_number=aadhar_number;
        this.pan_number=pan_number;
    }
    void setDestination(){
        System.out.println("Your Destination: "+this.destination);
    }
    void user_details(){
        System.out.println("USER NAME: "+this.user_name);
        System.out.println("AADHAR NUMBER: "+this.aadhar_number);
        System.out.println("PAN NUMBER: "+this.pan_number);
    }
    void driver_details(){
        System.out.println("Driver name: "+this.Driver_name);
        System.out.println("Bus no: "+this.bus_no);
        System.out.println("AC/NON-AC: "+this.ac);
        System.out.println("Availability of seats: "+this.availability);
        System.out.println("Sleeper seats: "+this.sleeper);
        System.out.println("Restroom Availability: "+this.restroom);
    }

}
class user1 extends Thanjavur_bus {
    String user_name;
    long aadhar_number;
    String pan_number;
    String destination;
    user1(String Driver_name,int bus_no,boolean ac,boolean availability,boolean sleeper,boolean restroom,String user_name,String destination,long aadhar_number,String pan_number){
        super(Driver_name,bus_no,ac,availability,sleeper,restroom);
        this.user_name=user_name;
        this.destination=destination;
        this.aadhar_number=aadhar_number;
        this.pan_number=pan_number;
    }
    void setDestination(){
        System.out.println("Your Destination: "+this.destination);
    }
    void user_details(){
        System.out.println("USER NAME: "+this.user_name);
        System.out.println("AADHAR NUMBER: "+this.aadhar_number);
        System.out.println("PAN NUMBER: "+this.pan_number);
    }
    void driver_details(){
        System.out.println("Driver name: "+this.Driver_name);
        System.out.println("Bus no: "+this.bus_no);
        System.out.println("AC/NON-AC: "+this.ac);
        System.out.println("Availability of seats: "+this.availability);
        System.out.println("Sleeper seats: "+this.sleeper);
        System.out.println("Restroom Availability: "+this.restroom);
    }

}
class user2 extends Thanjavur_bus {
    String user_name;
    long aadhar_number;
    String pan_number;
    String destination;
    user2(String Driver_name,int bus_no,boolean ac,boolean availability,boolean sleeper,boolean restroom,String user_name,String destination,long aadhar_number,String pan_number){
        super(Driver_name,bus_no,ac,availability,sleeper,restroom);
        this.user_name=user_name;
        this.destination=destination;
        this.aadhar_number=aadhar_number;
        this.pan_number=pan_number;
    }
    void setDestination(){
        System.out.println("Your Destination: "+this.destination);
    }
    void user_details(){
        System.out.println("USER NAME: "+this.user_name);
        System.out.println("AADHAR NUMBER: "+this.aadhar_number);
        System.out.println("PAN NUMBER: "+this.pan_number);
    }
    void driver_details(){
        System.out.println("Driver name: "+this.Driver_name);
        System.out.println("Bus no: "+this.bus_no);
        System.out.println("AC/NON-AC: "+this.ac);
        System.out.println("Availability of seats: "+this.availability);
        System.out.println("Sleeper seats: "+this.sleeper);
        System.out.println("Restroom Availability: "+this.restroom);
    }

}
