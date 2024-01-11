package defaultpackage;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import beans.Programmer;
import beans.Project;
 
public class MainClass {
 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Programmer mypro = context.getBean("programmer",Programmer.class);
		System.out.println(mypro);
		Project myproj = context.getBean("project",Project.class);
		System.out.println("Project Details" + myproj.getProgrammer());
	}
 
}