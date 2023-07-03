package coffe.inter;

public interface AddingSugarMachine {

    void addSugar(int sugar);

    default void addVanillaSugar() {

    }

}
