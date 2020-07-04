package Tutorial.Exceptions;

public class CheckingAccount {
    private double balance; //私有
    private int number;
    // 类构造方法，构造不用balance，balance应通过接口修改
    public CheckingAccount(int number){
        this.number = number;
    }

    // 方法：存钱
    public void deposit(double amount){
        balance += amount;
    }
    // 取钱，定义throws什么类型的异常，该Exception的参数
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount <= balance){
            balance -= amount;
        }
        else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    // 返回余额
    public double getBalance(){
        return balance;
    }

    // 返回卡号
    public int getNumber(){
        return number;
    }


    public static void main(String[] args){
        CheckingAccount ca = new CheckingAccount(123456);
        ca.deposit(125.00);
        System.out.println(ca.getBalance());
        try{
            System.out.println("\n Withdrawing $100");
            ca.withdraw(100);
            System.out.println("\n Withdrawing $600");
            ca.withdraw(600);
        }catch(InsufficientFundsException e){
            System.out.println("Short $" + e.getAmount());
            e.printStackTrace();
        }
    }

}