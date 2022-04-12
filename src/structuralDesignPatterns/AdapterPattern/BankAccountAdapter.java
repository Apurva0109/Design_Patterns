package structuralDesignPatterns.AdapterPattern;

public class BankAccountAdapter implements BankAccountInfo{
    LegacyBankAccount legacyBankAccount;
    PersonalInfoDB personalInfoDB;

    public BankAccountAdapter(LegacyBankAccount legacyBankAccount, PersonalInfoDB personalInfoDB) {
        this.legacyBankAccount = legacyBankAccount;
        this.personalInfoDB = personalInfoDB;
    }

    @Override
    public int getId() {
        return legacyBankAccount.getId();
    }

    @Override
    public String getName() {
        return legacyBankAccount.getName();
    }

    @Override
    public String getEmail() {
        return personalInfoDB.getEmail();
    }

    @Override
    public Long getAmount() {
        return personalInfoDB.getAmount();
    }
}
