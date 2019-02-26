package chapter.one.strategy;

import chapter.one.strategy.FlyRocketPowered;
import chapter.one.strategy.Duck;
import chapter.one.strategy.MallardDuck;
import chapter.one.strategy.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("MallardDuck: ");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\nModelDuck: ");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
