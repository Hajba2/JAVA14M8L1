package coffe.abstr;

public class EspressoMachine extends AbstractCoffeeMachine {

    @Override
    public void makeEspresso() {
        System.out.println("making espresso with " + sugarAmount + " amount of sugar");
    }

    @Override
    public void makeCappuccino() {

    }

    public static void main(String[] args) {
        EspressoMachine em = new EspressoMachine();
        em.setSugarAmount(5);
        em.makeEspresso();
    }
}
