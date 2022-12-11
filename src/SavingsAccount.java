public class SavingsAccount extends Account {
    @Override
    public void pay(int amount){
        System.out.println(amount + "dedd");
    }
    @Override
    public void transfer(String account, int amount){
        System.out.println(account + "" + amount + "");
    }
    @Override
    public void addMoney(int amount){
        System.out.println(amount + "");
    }
}


