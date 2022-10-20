import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
	// variables
	private int custNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	public Account() {
	}

	public Account(int custNumber, int pinNumber) {
		this.custNumber = custNumber;
		this.pinNumber = pinNumber;
	}

	public Account(int custNumber, int pinNumber, double checkingBalance, double savingBalance) {
		this.custNumber = custNumber;
		this.pinNumber = pinNumber;
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
	}

	public int setcustNumber(int custNumber) {
		this.custNumber = custNumber;
		return custNumber;
	}

	public int getcustNumber() {
		return custNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public double calculateulateCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calculateulateSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}

	public double calculateCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	public double calculateSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}

	public void calculateCheckTransfer(double amount) {
		checkingBalance = checkingBalance - amount;
		savingBalance = savingBalance + amount;
	}

	public void calculateSavingTransfer(double amount) {
		savingBalance = savingBalance - amount;
		checkingBalance = checkingBalance + amount;
	}

	public void getCheckingWithdrawInput() {
		
		//yet to be implemented
	}

	public void getsavingWithdrawInput() {

		//yet to be implemented
	}

	public void getCheckingDepositInput() {
		
		//yet to be implemented
	}

	public void getSavingDepositInput() {
		
	boolean end = false;
		while (!end) {
			try {
				System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
				System.out.print("\nAmount you want to deposit into your Savings Account: ");
				double amount = input.nextDouble();

				if ((savingBalance + amount) >= 0 && amount >= 0) {
					calcSavingDeposit(amount);
					System.out.println("\nCurrent Savings Account Balance: " + moneyFormat.format(savingBalance));
					end = true;
				} else {
					System.out.println("\nBalance Cannot Be Negative.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid Choice.");
				input.next();
			}
		}
	}

	public void getTransferInput(String accType) {
		
		//yet to be implemented
	}
}
