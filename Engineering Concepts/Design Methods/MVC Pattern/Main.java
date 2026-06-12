public class Main
{
    public static void main(String args[])
    {
        Student model=new Student();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);

        controller.setStudentName("John Doe");
        controller.setStudentId("101");
        controller.setStudentGrade("A");
        controller.updateView();

        System.out.println();

        controller.setStudentGrade("A+");
        controller.updateView();
    }
}