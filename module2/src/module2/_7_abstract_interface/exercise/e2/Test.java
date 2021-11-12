package module2._7_abstract_interface.exercise.e2;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        Square[] squares = new Square[2];
        squares[0] = new Square(2, "blue", false);
        squares[1] = new Square(4, "green", true);
        for (int i = 0; i < squares.length; i++) {
            squares[i].howToColor();
        }
    }
}
