public class test {
    public static void main(String[] args){
    shapes[] shape = new shapes[3];
    int j=0;

        shape[0]=  new circle(4);
        shape[1]=  new rectangle(4, 3);
        shape[2]=  new triangle(4,3);

        while(j<3){
            System.out.println(j+1+ ") "  +shape[j].area());
            j++;
        }
    }
}

