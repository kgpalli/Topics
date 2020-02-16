package hackerRank2.objectOrientedProgramms.overridePr;

public class Sports {

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }

}

class Soccer extends Sports{
     @Override
    String getName(){
        return "Soccer Class";
    }


    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players " + getName() );
    }


}

class Solution{
    public static void main(String[]args){

        Soccer sr = new Soccer();
        Sports sp = new Sports();

        System.out.println(sp.getName());
        sp.getNumberOfTeamMembers();
        System.out.println(sr.getName());
        sr.getNumberOfTeamMembers();



    }
}
