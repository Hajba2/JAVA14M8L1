package coffe.inter;

public class EspressoMachine extends AbstractCoffeeMachineWithSugar {

    @Override
    public void makeCoffee() {
        System.out.println("Making espresso with sugar " + sugar);
    }

    public static void main(String[] args) {
        EspressoMachine em = new EspressoMachine();
        em.addSugar(3);
        em.makeCoffee();
    }

}
