package DependencyInjection;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	
	Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	Employee(int id) {
		this.id = id;
	}
	
	Employee(String name) {
		this.name = name;
	}
	
	Employee() {
		System.out.println("values not found");
	}
	
	void show () {
		System.out.println("id = "+id+" name "+name);
		System.out.println(address.toString());
	}
	

}
