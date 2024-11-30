public class Pikachu extends Pokemon implements IElectric {

    public Pikachu() {
        super(101, "Pikachu", 15.2, "Masculino", 1);
    }

    @Override
    protected void tackleAttack() {
        System.out.println("Hello, I'm Pikachu and this is my tackle attack");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Hello, I'm Pikachu and this is my scratch attack");

    }

    @Override
    protected void biteAttack() {
        System.out.println("Hello, I'm Pikachu and this is my bite attack");

    }

    @Override
    public void attackThunderShock() {
        System.out.println("Hello, I'm Pikachu and this is my thunder shock attack");

    }

    @Override
    public void attackThunderPunch() {
        System.out.println("Hello, I'm Pikachu and this is my thunder punch attack");

    }

    @Override
    public void attackLightning() {
        System.out.println("Hello, I'm Pikachu and this is my Lightning attack");

    }

    @Override
    public void attackChargeLightning() {
        System.out.println("Hello, I'm Pikachu and this is my Charge Lightning attack");

    }

}
