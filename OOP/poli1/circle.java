public class circle extends shapes {

    private double radious;
    public circle(double radious){
        this.radious= radious;
    }
    
    @Override
    public double area(){
        return Math.PI*radious*radious;
    }

}
