package structuralDesignPatterns.FilterPattern;

import java.util.List;

public class AndFilter implements FiltersEx{
    private FiltersEx filters;
    private FiltersEx anotherFilters;

    public AndFilter(FiltersEx filters, FiltersEx anotherFilters){
        this.filters=filters;
        this.anotherFilters=anotherFilters;
    }
    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> filter=filters.meetFilter(purses);
        return anotherFilters.meetFilter(filter);
    }
}
