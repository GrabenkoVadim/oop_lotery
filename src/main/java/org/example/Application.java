package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        numberSupplier ballNumber = new numberSupplier();
        for (int i = 0; i < 3; i++) {
            System.out.println(ballNumber.getRandomBall());
        }
    }
}
