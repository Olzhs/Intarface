public class CheckingAccount extends Account {
    @Override
    public void pay(int amount){
        System.out.println(amount + "");
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



