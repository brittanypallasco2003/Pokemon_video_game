public class Squirtle extends Pokemon implements IWater {

    public Squirtle() {
        super(189, "Squirtle", 10.2, "Masculino", 1);
    }

    @Override
    protected void tackleAttack() {
        System.out.println("Hello, I'm Squirtle and this is my tackle attack");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Hello, I'm Squirtle and this is my scratch attack");

    }

    @Override
    public void attackHydroPump() {
        System.out.println("Hello, I'm Squirtle and this is my Hydro Pump attack");
    }

    @Override
    public void attackHydroPulse() {
        System.out.println("Hello, I'm Squirtle and this is my Hydro Pulse attack");
    }

    @Override
    public void attackWaterGun() {
        System.out.println("Hello, I'm Squirtle and this is my Water gun attack");
    }

    @Override
    public void attackBubble() {
        System.out.println("Hello, I'm Squirtle and this is my Bubble attack");
    }

    @Override
    protected void biteAttack() {
        System.out.println("Hello, I'm Squirtle and this is my Hydro Pump attack");

    }

}
