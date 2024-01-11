package defaultpackage;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import beans.JavaCollection;
 
public class MainClassCollections {
 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JavaCollection jc= context.getBean("javaCollection",JavaCollection.class);
 
	      System.out.println(jc.getAddressList());
	      System.out.println(jc.getAddressSet());
	      System.out.println(jc.getAddressMap());
	      System.out.println(jc.getAddressProp());
	   }
 
}