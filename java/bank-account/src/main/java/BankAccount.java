public class BankAccount {

    private int balance;
    boolean isOpen = false;

    public BankAccount() {
    }


    public int getBalance() throws BankAccountActionInvalidException {
        if (isOpen)
            return balance;
        else
            throw new BankAccountActionInvalidException("Account closed");
    }

    public void open() throws BankAccountActionInvalidException {
        if (isOpen)
            throw new BankAccountActionInvalidException("Account already open");
        else
            isOpen = true;
    }

    public synchronized void deposit(int i) throws BankAccountActionInvalidException {
        if (i > 0)
            balance = getBalance() + i;
        else
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
    }

    public synchronized void withdraw(int i) throws BankAccountActionInvalidException {
        if (!isOpen)
            throw new BankAccountActionInvalidException("Account closed");
        else if (balance == 0)
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        else if (i > balance)
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        else if (i < 0)
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        else
            balance = getBalance() - i;
    }

    public void close() throws BankAccountActionInvalidException {
        if (!isOpen)
            throw new BankAccountActionInvalidException("Account not open");
        else {
            isOpen = false;
            balance = 0;
        }

    }
}
