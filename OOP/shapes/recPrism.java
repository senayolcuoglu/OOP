public class recPrism extends rectangle {
    private double depth;

    public recPrism(double length, double width, double depth){
        super(width,length);
        this.depth=depth;
    }

    public double getDepth(){
        return depth;
    }
    public void setLength(double depth){
        this.depth=depth;
    }

    public double volume(){
        return depth*super.area();
    }
    public double circumferance(){
        return (2*super.circumference())+4*depth;
    }
    @Override
    public double area(){
        return (super.area()*2)+(2*depth*getLength())+(2*depth*getWidth());
    }

    public static void main(String[] args){
        recPrism a = new recPrism(3, 2, 4);

        System.out.println("Area: " + a.area());
        System.out.println("Circumferance: " + a.circumferance());
        System.out.println("Volume: " + a.volume());
    }
}
