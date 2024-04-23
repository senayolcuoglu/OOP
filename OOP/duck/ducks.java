public class ducks {
    public static void main (String[] args){
        RedHeadDuck cam = new RedHeadDuck();
        tDuck alex = new tDuck();
        mulardDuck james = new mulardDuck();

        System.out.println("******************");
        cam.Fly();
        cam.Quack();
        cam.Swim();

        System.out.println("\n");
        
        alex.Fly();
        alex.Quack();

        System.out.println("\n");

        james.Fly();
        james.Quack();
        james.Swim();
        System.out.println("******************");
    }
}
