package oop_project;
class Trichy_bus {
    String Driver_name;
    int bus_no;
    boolean ac;
    boolean availability;
    boolean sleeper;
    boolean restroom;
 final private float price=799.0f;
    Trichy_bus( String Driver_name,int bus_no,boolean ac,boolean availability,boolean sleeper,boolean restroom){
        this.Driver_name=Driver_name;
        this.bus_no=bus_no;
        this.ac=ac;
        this.availability=availability;
        this.sleeper=sleeper;
        this.restroom=restroom;
    }
    void setPrice(){
        System.out.println("PRICE OF THE ONE PERSON TICKET FOR THE TRICHY BUS:"+this.price);
    }
    float final_price(){
        return this.price;
    }

}
class Thanjavur_bus{
    String Driver_name;
    int bus_no;
    boolean ac;
    boolean availability;
    boolean sleeper;
    boolean restroom;
    final private float price=799.0f;
    Thanjavur_bus( String Driver_name,int bus_no,boolean ac,boolean availability,boolean sleeper,boolean restroom){
        this.Driver_name=Driver_name;
        this.bus_no=bus_no;
        this.ac=ac;
        this.availability=availability;
        this.sleeper=sleeper;
        this.restroom=restroom;
    }
    void setprice(){
        System.out.println("PRICE OF THE ONE PERSON TICKET FOR THE THANJAVUR BUS: "+this.price);
    }
    float final_price(){
        return this.price;
    }
}
class Chennai_bus{ String Driver_name;
    int bus_no;
    boolean ac;
    boolean availability;
    boolean sleeper;
    boolean restroom;
    final private float price=899.0f;
    Chennai_bus( String Driver_name,int bus_no,boolean ac,boolean availability,boolean sleeper,boolean restroom){
        this.Driver_name=Driver_name;
        this.bus_no=bus_no;
        this.ac=ac;
        this.availability=availability;
        this.sleeper=sleeper;
        this.restroom=restroom;
    }
    void setPrice(){
        System.out.println("PRICE OF THE ONE PERSON TICKET FOR THE CHENNAI BUS:");
    }
    float final_price(){
        return this.price;
    }
}
