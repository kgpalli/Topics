package hackerRank2;

public interface TV {

    void size();
}


class Samsung implements TV{

    @Override
    public void size() {
        System.out.println("medium");
    }
}

class LG implements TV{

    @Override
    public void size() {
        System.out.println("small");
    }
}

class Omega implements TV{

    @Override
    public void size() {
        System.out.println("large");
    }
}

class OperatingFacotry{
    public TV getINstance(String str){
        if(str.equals("70"))
            return new Samsung();
        if(str.equals("60"))
            return new LG();

          else  return new Omega();
    }
}
