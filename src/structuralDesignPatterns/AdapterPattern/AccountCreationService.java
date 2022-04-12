package structuralDesignPatterns.AdapterPattern;

public class AccountCreationService {
    private int Id;
    private String name;
    private String email;
    private Long amount;

    public AccountCreationService(int id, String name, String email, Long amount) {
        Id = id;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getAmount() {
        return amount;
    }

    public void create(){
        System.out.println("Account has been created");
    }
}
