package hackerRank2.objectOrientedProgramms.overridePr;

// out put - we are calling method in super class, by creating the object of child class we cannot instanitate constructor and it prints the data
/*
* Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.*/

public class SuperPr {

    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }

}

class MotorCycle extends BiCycle{

    String define_me(){
        return "a cycle with an engine.";
    }
    MotorCycle(){

        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp = super.define_me();

        System.out.println("My ancestor is a cycle who is "+ temp );


    }

}
