package core.basesyntax;

import java.util.Random;
public class numberSupplier{
    public  Ball getRandomBall(){
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(0, 101));
    }
}
