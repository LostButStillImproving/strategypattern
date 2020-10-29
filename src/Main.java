public class Main {
    public static void main(String[] args) {
        FlyBehavior flyWithWings = new FlyWithWings();
        FlyBehavior flyWithoutWings = new FlyWithoutWings();
        Duck mallardDuck = new MallardDuck(flyWithWings);
        Duck redDuck = new RedDuck(flyWithoutWings);
        mallardDuck.performFly();
        redDuck.performFly();
    }
}
