package structuralDesignPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args){
        Purse bluePurse1 = new Purse(new Red());
        Purse bluePurse2 = new Purse(new Blue());
        Purse bluePurse3 = new Purse(new Blue());
        Purse bluePurse4 = new Purse(new Blue());

        List<Purse> purses = new ArrayList<>();
        purses.add(bluePurse1);
        purses.add(bluePurse2);
        purses.add(bluePurse3);
        purses.add(bluePurse4);

        FiltersEx blueFilter = new BlueFilter();
        List<Purse> bluePurses =blueFilter.meetFilter(purses);
        for(Purse purse:bluePurses)
            System.out.println("Color of purse is "+purse.getColour());
    }
}
