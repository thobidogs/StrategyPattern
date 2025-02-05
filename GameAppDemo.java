public class GameAppDemo {
    public static void main (String[] args){
        
        GameApp knightApp = new GameApp();
        knightApp.setChr(new Knight());
        knightApp.setAtk(new SwingSword());
        knightApp.attack();

        GameApp wizardApp = new GameApp();
        wizardApp.setChr(new Wizard());
        wizardApp.setAtk(new CastSpell());
        wizardApp.attack();

        GameApp archerApp = new GameApp();
        archerApp.setChr(new Wizard());
        archerApp.setAtk(new ShootArrow());
        archerApp.attack();

        knightApp.setDef(new Shield());
        knightApp.defend();

        knightApp.setDef(new Dodge());
        knightApp.defend();

        knightApp.setDef(new CreateMagic());
        knightApp.defend();

        wizardApp.setDef(new CreateMagic());
        wizardApp.defend();

        archerApp.setDef(new Shield());
        archerApp.defend();



        
    }
}
