package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "This ball's color is " + color.name() + " and its number is " + number;
    }
}