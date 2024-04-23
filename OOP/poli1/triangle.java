public class triangle extends shapes{
    private double height;
    private double base;

    public triangle(double height, double base){
        this.base=base;
        this.height=height;
    }

    @Override
    public double area(){
        return (0.5)*height*base;
    }
    
}
