public class duck {
    public QuackBehaviour quackbeh;
    public FlyBehaviour flybeh;

    public void Quack(){
        quackbeh.Quack();
    }
    public void Fly(){
        flybeh.Fly();
    }
    public void Swim(){
        System.out.println("It can swim.");
    }
}
