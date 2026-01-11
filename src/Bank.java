public enum Bank {
    INSTANCE;

    private int cash;

    Bank() {
        this.cash = 0;
    }

    public int getCash() {
        return cash;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            throw new IllegalArgumentException();
        }

        this.cash += amount;
    }

    public void withDraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be >= 0");
        }
        if (cash < amount) {
            throw new IllegalStateException("Bank has insufficient cash");
        }
        cash -= amount;
    }
}
