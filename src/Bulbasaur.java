public class Bulbasaur extends Pokemon implements IPlant {

    public Bulbasaur() {
        super(124, "Bulbasaur", 10.4, "Masculino", 1);
    }

    @Override
    protected void tackleAttack() {
        System.out.println("Hello, I'm " + name + "and this is my tackle attack");
    }

    @Override
    protected void scratchAttack() {
        System.out.println("Hello, I'm Bulbasaur and this is my scratch attack");

    }

    @Override
    protected void biteAttack() {
        System.out.println("Hello, I'm Bulbasaur and this is my bite attack");

    }

    @Override
    public void attackParalyze() {
        System.out.println("Hello, I'm Bulbasaur and this is my paralyze attack");
    }

    @Override
    public void attackDrain() {
        System.out.println("Hello, I'm Bulbasaur and this is my drain attack");
    }

    @Override
    public void attackSharpBlaid() {
        System.out.println("Hello, I'm Bulbasaur and this is my sharp blaid attack");
    }

    @Override
    public void attackStrainWhip() {
        System.out.println("Hello, I'm Bulbasaur and this is my strain whip attack");
    }
}
