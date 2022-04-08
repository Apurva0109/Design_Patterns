package creationalDesignPatterns.BuilderPattern.OneLineStoreAccount;

public class App {
    public static void main(String[] args){
        //OnlineStoreAccount apurva = new OnlineStoreAccount(1L,"Apurva Khude","Navi Mumbai",100L,2L);
        // here we make mistake of swapping values from budget to discountRate
        // This problem can be solved using creational builder pattern -
        //OnlineStoreAccount anuj = new OnlineStoreAccount(2L,"Anuj Khude","Navi Mumbai",2L,100L);

        OnlineStoreAccount johnSmith = new OnlineStoreAccount.Builder(1L)
                .withName("JohnSmith")
                .withAddress("Oxford Lane 35A")
                .withBudget(100L)
                .withDiscountRate(2L)
                .build();

        System.out.println(johnSmith.getName());

    }
}
