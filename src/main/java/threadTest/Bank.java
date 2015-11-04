package threadTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Bank {

	private final double[] accounts;
	private Lock bankLock;
	private Condition sufficientFunds;

	public Bank(double[] accounts, Lock bankLock, Condition sufficientFunds) {
		this.accounts = accounts;
		this.bankLock = bankLock;
		this.sufficientFunds = sufficientFunds;
	}

}
