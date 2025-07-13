package oop_project;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter your destination: ");
        String bus=in.next();
        if(bus.equals("trichybus")){
            user reni=new user("Muthuvel Pandiyan",232,true,true,true,false,"ALWIN","Trichy",442584165,"ABC78D67");
            reni.setPrice();
            reni.user_details();
            System.out.println("*********************************************************** DRIVER DETAILS 000000000000***************************************************************************************");
            reni.driver_details();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Happy Travelling");
        }
        else if(bus.equals("thanjavurbus")){
            user1 santhosh=new user1("Pandiya Raj",242,false,true,true,false,"JESHA","Trichy",442584165,"ABC78D67");
            santhosh.setprice();
            santhosh.user_details();
            System.out.println("*********************************************************** DRIVER DETAILS 000000000000***************************************************************************************");
            santhosh.driver_details();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Happy Travelling");
        }
        else if(bus.equals("chennaibus")){
            user1 shoban=new user1("Arumugam",213,true,true,true,true,"VIRAT KOHLI","Trichy",442584165,"ABC78D67");
            shoban.setprice();
            shoban.user_details();
            System.out.println("*********************************************************** DRIVER DETAILS 000000000000***************************************************************************************");
            shoban.driver_details();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Happy Travelling");
        }
        else{
            System.out.println("SORRY!!! WE DONT HAVE THE SERVICE ON THIS LOCATION");
        }

    }
}
