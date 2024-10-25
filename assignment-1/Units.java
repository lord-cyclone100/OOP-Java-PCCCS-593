package pkgTwo;
import pkgOne.College;

public class Units implements College{
    public void students(){
        System.out.println("Students");
    }
    public void theoryFaculty(){
        System.out.println("Theory Faculty");
    }
    public void labFaculty(){
        System.out.println("Lab Faculty");
    }
}