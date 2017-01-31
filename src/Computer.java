/**
 * Created by meudecc on 26/01/2017.
 */
public class Computer extends Player {
    private Difficulty difficulty;

    public Computer(Difficulty difficulty) {
        setDifficulty(difficulty);
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    private void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
