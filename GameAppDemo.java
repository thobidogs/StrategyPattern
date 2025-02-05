public class GameAppDemo {
    public static void main (String[] args){
        
        Character knight = new Knight();
        Character wizard = new Wizard();
        Character archer = new Archer();

        GameApp knightApp = new GameApp(knight);
        knightApp.attack(new SwingSword());
        
        GameApp wizardApp = new GameApp(wizard);
        wizardApp.attack(new CastSpell());

        GameApp archerApp = new GameApp(archer);
        archerApp.attack(new ShootArrow());

        knightApp.defend(new CreateMagic());
        knightApp.defend(new Dodge());
        knightApp.defend(new Shield());

        wizardApp.defend(new CreateMagic());

        archerApp.defend(new Shield());

        
    }
}
