public class savingsAccount extends account {
    private double interestRate; 
    private int day; 
    public  double sum;

    public savingsAccount( int accNum, double accBalance,double interestRate,int day){
        super(accNum, accBalance);
        this.interestRate=interestRate;
        this.day=day;
    }

    public double getinterestRate(){
        return interestRate;
    }

    double a= getaccBalance();
    
    public double getAccBalance(){
        return a;
    }

    public double earningInterest(){
        a = a + ((a * day * interestRate)/365); 
        return a;
    }

    @Override
    public double deposit(double yourMoney){
        a= getaccBalance() +yourMoney;
        return a;
    } 


}
