package human;

public class Human implements HumanI {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        HumanI human = new Human();
        HumanI human2 = new Human();
        HumanI human3 = new Human();
        human.setName("asds");
        System.out.println("human.getName() = " + human.getName());

        System.out.println("HumanI.home = " + HumanI.home);
    }
}
