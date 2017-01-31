/**
 * Created by meudecc on 26/01/2017.
 */
public class Human extends Player {
    private String name;

    Human(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
