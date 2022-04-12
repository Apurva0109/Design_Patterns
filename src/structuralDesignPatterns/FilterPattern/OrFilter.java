package structuralDesignPatterns.FilterPattern;

import java.util.List;

public class OrFilter implements FiltersEx{
    private FiltersEx filters;
    private FiltersEx anotherFilters;

    public OrFilter(FiltersEx filters, FiltersEx anotherFilters){
        this.filters=filters;
        this.anotherFilters=anotherFilters;
    }
    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> firstFilterResult = filters.meetFilter(purses);
        List<Purse> anotherFilterResult  = anotherFilters.meetFilter(purses);

        for(Purse purse: purses){
            if(!firstFilterResult.contains(purses))
                firstFilterResult.add(purse);
        }
        return firstFilterResult;
    }
}
