package structuralDesignPatterns.AdapterPattern;

public class App {
    public static void main(String[] args){
        LegacyBankAccount legacyBankAccount=new LegacyBankAccount(1,"Apurva Khude");
        PersonalInfoDB personalInfoDB=new PersonalInfoDB();
        personalInfoDB.setName("Apurva Khude");
        personalInfoDB.setEmail("apurvakhude@gmail.com");
        personalInfoDB.setAmount(1000L);

        BankAccountAdapter bankAccountAdapter=new BankAccountAdapter(legacyBankAccount,personalInfoDB);
        AccountCreationService accountCreationService=new AccountCreationService(bankAccountAdapter.getId(),
                bankAccountAdapter.getName(), bankAccountAdapter.getEmail(), bankAccountAdapter.getAmount());

        accountCreationService.create();
    }
}
