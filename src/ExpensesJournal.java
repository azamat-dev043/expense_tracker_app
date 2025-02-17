public class ExpensesJournal {
    private int initial_amount;
    private String expense_name;
    private String currency;
    private boolean isImportant;

    public ExpensesJournal(int initial_amount) {
        this.initial_amount = initial_amount;
        
    }

    public int getInitialAmount() {
        return initial_amount;
    }

    public void setInitialAmount(int initial_amount) {
        this.initial_amount = initial_amount;
    }


    public void String() {
        System.out.println("Hello!");
    }

    public void decrease(int a) {
        System.out.println(a);
    }
}
