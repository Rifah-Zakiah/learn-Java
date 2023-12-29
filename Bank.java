package bank;

import java.util.ArrayList;

class Account{
    private String name;
    private int acc_num;
    private double balance;

    Account(String name, int acc_num, double balance){
        this.name = name;
        this.acc_num = acc_num;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        balance -= amount;
    }

    void print_acc_info(){
        System.out.println("Name of accountholder: "+name);
        System.out.println("Account number: "+ acc_num);
        System.out.println("Balance: "+balance);
    }
}
public class Bank{
    ArrayList <Account> acc_list = new ArrayList <Account>();

    void add_acc(Account a){
        acc_list.add(a);
    }
    void remove_acc(Account a){
        acc_list.remove(a);
    }

    ArrayList <Account> get_acc_list(){
        return acc_list;
    }
    public static void main(String[] args) {
        Bank b = new Bank();

        Account a1 = new Account("Tina", 12, 10000);
        Account a2 = new Account("Rina", 66, 20090);

        b.add_acc(a1);
        b.add_acc(a2);
        b.add_acc(new Account("Mina", 77, 30020));
        ArrayList <Account> accs = b.get_acc_list();

        for(Account account: accs){
            account.print_acc_info();
        }

        a1.deposit(2000);
        a2.withdraw(3900);

        for(Account account: accs){
            account.print_acc_info();
        }
    }
}