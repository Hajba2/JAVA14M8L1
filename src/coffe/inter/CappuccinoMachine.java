package coffe.inter;

public class CappuccinoMachine extends AbstractCoffeeMachineWithSugar {

    @Override
    public void makeCoffee() {
        System.out.println("making Cappuccino with sugar " + sugar);
    }

    public static void main(String[] args) {
        CappuccinoMachine cm = new CappuccinoMachine();
        cm.addSugar(3);
        cm.makeCoffee();
    }

}
