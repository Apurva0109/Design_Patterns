package structuralDesignPatterns.AdapterPattern;

public class LegacyBankAccount {
    private int Id;
    private String name;

    public LegacyBankAccount(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}
