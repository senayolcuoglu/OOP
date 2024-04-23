public class rectangle extends shapes {
    private double width;
    private double length;

    public rectangle(double w,double l){
        this.width=w;
        this.length=l;
    }

    @Override
    public double area(){
        return width*length;
    }
}
