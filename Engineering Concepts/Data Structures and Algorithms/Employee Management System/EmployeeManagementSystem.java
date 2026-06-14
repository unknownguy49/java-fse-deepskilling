public class EmployeeManagementSystem 
{
    Employee employees[];
    int count;

    public EmployeeManagementSystem(int size)
    {
        employees=new Employee[size];
        count=0;
    }

    public void addEmployee(Employee employee)
    {
        if(count<employees.length)
        {
            employees[count]=employee;
            count++;
        }
        else
        {
            System.out.println("Array Full");
        }
    }

    public Employee searchEmployee(int employeeId)
    {
        for(int i=0;i<count;i++)
        {
            if(employees[i].employeeId==employeeId)
                return employees[i];
        }
        return null;
    }

    public void traverseEmployees()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId)
    {
        int index=-1;
        for(int i=0;i<count;i++)
        {
            if(employees[i].employeeId==employeeId)
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
            for(int i=index;i<count-1;i++)
            {
                employees[i]=employees[i+1];
            }
            employees[count-1]=null;
            count--;
        }
    }

    public static void main(String args[])
    {
        EmployeeManagementSystem system=new EmployeeManagementSystem(10);
        system.addEmployee(new Employee(101,"Rahul","Manager",50000));
        system.addEmployee(new Employee(102,"Amit","Developer",40000));
        system.addEmployee(new Employee(103,"Priya","Tester",35000));

        System.out.println("All Employees:");
        system.traverseEmployees();

        System.out.println("\nSearch Result:");
        Employee employee=system.searchEmployee(102);
        if(employee!=null)
        {
            System.out.println(employee);
        }

        system.deleteEmployee(102);
        System.out.println("\nAfter Deletion:");
        system.traverseEmployees();
    }
}