public abstract class Pokemon {
    protected int pokedex_num;
    protected String name;
    protected double weight;
    protected String gender;
    protected int season;

    public Pokemon(int pokedex_num, String name, double weight, String gender, int season) {
        this.pokedex_num = pokedex_num;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.season = season;
    }

    protected abstract void tackleAttack();

    protected abstract void scratchAttack();

    protected abstract void biteAttack();

}
