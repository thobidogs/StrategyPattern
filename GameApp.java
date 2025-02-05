public class GameApp {
    private Character chr;
    private AttackStrategy atk;
    private DefenseStrategy def;

    public GameApp(){
    }

    public void attack(){
        System.out.println(this.chr.type() + atk.attack());
    }

    public void defend(){
        System.out.println(def.defend());
    }

    public Character getChr() {
        return chr;
    }

    public void setChr(Character chr) {
        this.chr = chr;
    }

    public AttackStrategy getAtk() {
        return atk;
    }

    public void setAtk(AttackStrategy atk) {
        this.atk = atk;
    }

    public DefenseStrategy getDef() {
        return def;
    }

    public void setDef(DefenseStrategy def) {
        this.def = def;
    }
}
