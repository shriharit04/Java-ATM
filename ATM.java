import java.util.HashMap;

public class ATM {
    float bal;
    HashMap<Integer,Float> log = new HashMap<Integer,Float>();
    public float getBal() {
        return bal;
    }
    public void AddMoney(float bal) {
        this.bal += bal;
    }
    public HashMap<Integer, Float> getLog() {
        return log;
    }



    <T extends Account > void StartTransaction(T acc){ //TODO:create account abstract class

    }

}
