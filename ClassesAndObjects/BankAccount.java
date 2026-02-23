public class BankAccount {
    private int accNo;
    private String name;
    private int bal;

    //instance function
    public BankAccount(int accNo, String name, int bal) {
        //validations
        this.accNo = accNo;
        this.name = name;
        this.bal = bal;
    }

    //instance function
    public boolean deposit(int amt) {
        if(amt <= 0) {
            return false;
        }
        this.bal = this.bal + amt;
        return true;
    }

    //instance function
    public int withdraw(int amt) {
        if(amt <= 0 || amt > bal) {
            return 0;
        }
        bal = bal - amt;
        return amt;
    }

    //instance function
    public void display() {
        System.out.println(
                "Acc No = " + this.accNo + " name = " + this.name + " bal = " + this.bal
        );
        System.out.println("--------------------------");
    }
}
