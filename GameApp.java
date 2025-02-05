public class GameApp {
    private  Character chr;
    private AttackStrategy atk;
    private DefenseStrategy def;

    public GameApp(Character chr){
        this.chr = chr;
    }

    public void attack(AttackStrategy atk){
        this.atk = atk;
        System.out.println(this.chr.type() + this.atk.attack());
    }

    public void defend(DefenseStrategy def){
        this.def = def;
        System.out.println(this.def.defend());
    }
}
