public abstract class Duck {

    protected FlyBehavior fb;
    public Duck(FlyBehavior fb) { this.fb = fb; }
    void performFly(){ fb.fly(); }
}
