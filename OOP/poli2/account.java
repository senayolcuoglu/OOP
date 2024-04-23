public class account{
    private int accNum;
    private double accBalance;

    public account(int accNum, double accBalance){
        this.accNum=accNum;
        this.accBalance=accBalance;
    }

    public int getaccNum(){
        return accNum;
    }

    public double getaccBalance(){
        return accBalance;
    }

    public double deposit(double yourMoney){
        return accBalance += yourMoney;
    }
    public double withdrawl(double yourMoney){
        accBalance -= yourMoney;

        if(accBalance>=0){
            return accBalance;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args){
        account acc1 = new account(34567,700);
            System.out.println(acc1.getaccBalance());
            acc1.deposit(3000);
            System.out.println(acc1.getaccBalance());
    }
}