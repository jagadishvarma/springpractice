package DependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorExample {

	public static void main(String[] args) {
		
		Resource rs = new ClassPathResource("applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		
		Employee emp = (Employee)bf.getBean("e");
		emp.show();

	}

}

// id = 10 name varma
// vizag andhra india
	