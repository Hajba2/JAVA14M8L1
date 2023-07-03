package coffe.inter;

public abstract class AbstractCoffeeMachineWithSugar implements EspressoMachineI, AddingSugarMachine {

    int sugar;

    @Override
    public void addSugar(int sugar) {
        this.sugar = sugar;
    }

}
