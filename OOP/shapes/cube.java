public class cube extends recPrism {
    public cube(double width){
        super(width,width,width );
    }

    public static void main(String[] args){
        cube d = new cube(3);

        System.out.println("Area: " + d.area());
        System.out.println("Circumferance: " + d.circumferance());
        System.out.println("Volume: " + d.volume());
    }
    
}
