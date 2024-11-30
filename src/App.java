public class App {
    public static void main(String[] args) throws Exception {

        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();

        squirtle.biteAttack();
        squirtle.attackBubble();

        charmander.scratchAttack();
        charmander.attackFlamer();

        bulbasaur.tackleAttack();
        bulbasaur.attackParalyze();

        pikachu.biteAttack();
        pikachu.attackChargeLightning();
    }
}
