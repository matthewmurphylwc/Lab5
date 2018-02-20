import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * The types of accounts.
     */
    public enum BankAccountType {
        /**
         * A checking account.
         */
        CHECKINGS,
        /**
         * A savings account.
         */
        SAVINGS,
        /**
         * A student  account.
         */
        STUDENT,
        /**
         * A business account.
         */
        WORKPLACE
    }

    /**
     * Account number of the specific account.
     */
    private int accountNumber;
    /**
     * The type of the specific account.
     */
    private BankAccountType accountType;
    /**
     * The amount of money stored in the account.
     */
    private double accountBalance;
    /**
     * The name of the owner of the account.
     */
    private String ownerName;
    /**
     * The interest rate assessed on the balance of the account.
     */
    private double interestRate;
    /**
     * The amount of total interest earned by the account.
     */
    private double interestEarned;

    /**
     * Creates new account with the given name and category.
     * @param name Name of the new accoutn.
     * @param accountCategory Type of the new account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Gets the balance of a specific account.
     * @return the blance of the account.
     */
    public double getBalance() {
        return this.accountBalance;
    }

    /**
     * Sets the new balance of the bank account.
     * @param newBalance The new value to set the balance to.
     */
    public void setBalance(final double newBalance) {
        this.accountBalance = newBalance;
    }

    /**
     * Changes the name of the account owner.
     * @param newOwnerName the new name to make the owner of the account.
     */
    public void setOwnerName(final String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    /**
     * Returns the name of the owner of the account.
     * @return the name of the owner account.
     */
    public String getOwnerName() {
        return this.ownerName;
    }
}