thispublic class BankAccount {
private String accountNumber;
private String accountHolderName;
private double balance;
public BankAccount(String accountNumber, String accountHolderName, double balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposit successful. New balance: " + balance);
}
else {
System.out.println("Invalid amount. Deposit failed.");
}
}
public void withdraw(double amount) {
if (amount > 0) {
if (balance >= amount) {
balance -= amount;
System.out.println("Withdrawal successful. New balance: " + balance);
} else {
System.out.println("Insufficient funds. Withdrawal failed.");
}
}
else {
System.out.println("Invalid amount. Withdrawal failed.");
}
}
public void checkBalance() {
System.out.println("Current balance: " + balance);
}
public void displayAccountDetails() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Balance: " + balance);
}
public String getAccountNumber() {
return accountNumber;
}
}
