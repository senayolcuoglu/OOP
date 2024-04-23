public class square extends rectangle {

    public square(double width){
        super(width,width);
    }

    public static void main(String[] args){
        square b = new square(4);

        System.out.println("Area: " + b.area());
        System.out.println("Circumferance: " + b.circumference());
    }
}

