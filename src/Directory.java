import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showDetails() {
        for (Employee e: employeeList){
            e.showDetails();
        }
    }

    public void add (Employee e){
        employeeList.add(e);
    }

    public void remove (Employee e){
        employeeList.remove(e);
    }
}
