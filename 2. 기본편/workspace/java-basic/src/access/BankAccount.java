package access;

public class BankAccount {
    private int balance;

    //Alt + insert → Constructor(Select None 빈 기본생성자): 생성자 생성
    public BankAccount() {
        balance = 0;
    }

    // public 메서드: deposit
    //입금
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else {
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    //public 메서드: withdraw
    //출금
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }else{
            System.out.println("유효하지 않는 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드: getBalance
    //현재금액
    public int getBalance(){
        return balance;
    }


    //입금금액이 제대로된 금액인지 검증
    private boolean isAmountValid(int amount){
        //금액이 0보다 클떄 정상적인 금액
        return amount > 0;
    }
}
