package coffe.abstr;

public class CappuccinoMachine extends AbstractCoffeeMachine {

    @Override
    public void makeEspresso() {

    }

    @Override
    public void makeCappuccino() {
        System.out.println("adding milk to espresso");
    }

    public static void main(String[] args) {
        CappuccinoMachine cm = new CappuccinoMachine();
    }

}
