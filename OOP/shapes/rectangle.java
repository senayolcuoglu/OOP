public class rectangle{
    private double width;
    private double length;

    /*public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }*/

    public double area(){
        return length * width;
    }
    public double circumference(){
        return 2*(length + width);
    }
    
    public rectangle(double w, double l){
        this.width =w;
        this.length=l;
    }

    public static void main(String[] args){
        rectangle c = new rectangle(10,20);

        System.out.println("Area: " + c.area());
        System.out.println("Circumferance: " + c.circumference());
    }


}