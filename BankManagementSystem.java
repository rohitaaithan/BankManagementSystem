import java.util.*;
public class BankManagementSystem {
private static Map<String, BankAccount> accounts = new HashMap<>();
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (true) {
System.out.println("\nWelcome to the Bank Account Management System");
System.out.println("Please select an option:");
System.out.println("1. Create a new account");
System.out.println("2. Deposit money");
System.out.println("3. Withdraw money");
System.out.println("4. Check balance");
System.out.println("5. Display account details");
System.out.println("6. Exit");
int choice = scanner.nextInt();
scanner.nextLine();
switch (choice) {
case 1:
createAccount(scanner);
break;
case 2:
depositMoney(scanner);
break;
case 3:
withdrawMoney(scanner);
break;
case 4:
checkBalance(scanner);
break;
case 5:
displayAccountDetails(scanner);
break;
case 6:
System.out.println("Exiting the system. Goodbye!");
scanner.close();
return;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
private static void createAccount(Scanner scanner) {
System.out.println("Enter account number:");
String accountNumber = scanner.nextLine();
System.out.println("Enter account holder name:");
String accountHolderName = scanner.nextLine();
System.out.println("Enter initial balance:");
double balance = scanner.nextDouble();
scanner.nextLine();
BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
accounts.put(accountNumber, account);
System.out.println("Account created successfully!");
}
private static void depositMoney(Scanner scanner) {
System.out.println("Enter account number:");
String accountNumber = scanner.nextLine();
BankAccount account = accounts.get(accountNumber);
if (account != null) {
System.out.println("Enter amount to deposit:");
double amount = scanner.nextDouble();
scanner.nextLine();
account.deposit(amount);
}
else {
System.out.println("Account not found.");
}
}
private static void withdrawMoney(Scanner scanner) {
System.out.println("Enter account number:");
String accountNumber = scanner.nextLine();
BankAccount account = accounts.get(accountNumber);
if (account != null) {
System.out.println("Enter amount to withdraw:");
double amount = scanner.nextDouble();
scanner.nextLine(); // Consume newline
account.withdraw(amount);
} 
else {
System.out.println("Account not found.");
}
}
private static void checkBalance(Scanner scanner) {
System.out.println("Enter account number:");
String accountNumber = scanner.nextLine();
BankAccount account = accounts.get(accountNumber);
if (account != null) {
account.checkBalance();
}
else {
System.out.println("Account not found.");
}
}
private static void displayAccountDetails(Scanner scanner) {
System.out.println("Enter account number:");
String accountNumber = scanner.nextLine();
BankAccount account = accounts.get(accountNumber);
if (account != null) {
account.displayAccountDetails();
}
else {
System.out.println("Account not found.");
}
}
}
