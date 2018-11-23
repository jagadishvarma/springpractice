package DependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorList {
	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory b = new XmlBeanFactory(r);
		
		Question em =  (Question)b.getBean("emp");
		em.displayInfo();
	}
}


//20 alluri
//answers are:
//1 telangana india
//2 ap india