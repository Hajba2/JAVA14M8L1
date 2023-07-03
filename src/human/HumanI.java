package human;

public interface HumanI {

    static final String home = "Earth";

    String getName();

    default void setName(String name) {
        System.out.println("Can`t set name because I this method is not overwritten");
    };

}
