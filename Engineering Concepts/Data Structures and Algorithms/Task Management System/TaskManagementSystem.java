public class TaskManagementSystem 
{
    Node head;
    public void addTask(Task task)
    {
        Node newNode=new Node(task);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public Task searchTask(int taskId)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.task.taskId==taskId)
            {
                return temp.task;
            }
            temp=temp.next;
        }
        return null;
    }

    public void traverseTasks()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.task);
            temp=temp.next;
        }
    }

    public void deleteTask(int taskId)
    {
        if(head==null)
        {
            return;
        }
        if(head.task.taskId==taskId)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.task.taskId==taskId)
            {
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }

    public static void main(String args[])
    {
        TaskManagementSystem system=new TaskManagementSystem();
        system.addTask(new Task(1,"Design UI","Pending"));
        system.addTask(new Task(2,"Develop Backend","In Progress"));
        system.addTask(new Task(3,"Testing","Pending"));

        System.out.println("All Tasks:");
        system.traverseTasks();

        System.out.println("\nSearch Result:");
        Task task=system.searchTask(2);
        if(task!=null)
        {
            System.out.println(task);
        }

        system.deleteTask(2);
        System.out.println("\nAfter Deletion:");
        system.traverseTasks();
    }
}