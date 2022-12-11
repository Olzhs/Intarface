public class CreditAccount extends  Account {
    @Override
    public void pay(int amount){
        System.out.println(amount + "а че так мало задолжал а че еще не взял");
    }
    @Override
    public void transfer(String account, int amount){
        System.out.println( account +" ваша кредитная задолжность " + amount);
    }
    @Override
    public void addMoney(int amount){
        System.out.println("Плати кредит  " + amount );
    }
}
        




