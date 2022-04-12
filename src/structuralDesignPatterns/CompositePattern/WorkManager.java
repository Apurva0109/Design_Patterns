package structuralDesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class WorkManager implements Worker{
    private List<Human> humanList= new ArrayList<>();
    private List<Robot> robotList=new ArrayList<>();

    public void addWorker(Worker worker){
        if(worker.getClass().getSimpleName().equalsIgnoreCase("human"))
            humanList.add((Human)worker);
        else robotList.add((Robot)worker);
    }

    public void removeWorker(Worker worker){
        if(worker.getClass().getSimpleName().equalsIgnoreCase("human"))
            humanList.remove((Human)worker);
        else robotList.remove((Robot)worker);
    }

    @Override
    public String toString() {
        return "Human workers are " + humanList +
                ", Robot workers are " + robotList;
    }

    @Override
    public void performTask() {
        System.out.println(getClass().getSimpleName()+" is performing the task");
    }
}
