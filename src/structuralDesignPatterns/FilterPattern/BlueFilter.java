package structuralDesignPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class BlueFilter implements FiltersEx {
    List<Purse> bluePurces = new ArrayList<>();
    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        for(Purse purse:purses){
            if(purse.getColour().getClass().getName().equalsIgnoreCase("blue"))
                bluePurces.add(purse);
        }
        return bluePurces;
    }
}
