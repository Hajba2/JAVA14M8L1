package coffe.abstr;

public abstract class AbstractCoffeeMachine {

    int sugarAmount;

    public abstract void makeEspresso();

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    };

    public abstract void makeCappuccino();

}
