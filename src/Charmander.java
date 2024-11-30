public class Charmander extends Pokemon implements IFire {

    public Charmander() {
        super(123, "Charmander", 12.3, "Masculino", 1);

    }

    @Override
    protected void tackleAttack() {
        System.out.println("Hello, I'm " + name + " Charmander and this is my tackle attack");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Hello, I'm Charmander and this is my scratch attack");

    }

    @Override
    protected void biteAttack() {
        System.out.println("Hello, I'm Charmander and this is my bite attack");

    }

    @Override
    public void attackFirePunch() {
        System.out.println("Hello, I'm Charmander and this is my fire punch attack");

    }

    @Override
    public void attackFlamer() {
        System.out.println("Hello, I'm Charmander and this is my flamer attack");

    }

    @Override
    public void attackEmbers() {
        System.out.println("Hello, I'm Charmander and this is my embers attack");

    }
}
