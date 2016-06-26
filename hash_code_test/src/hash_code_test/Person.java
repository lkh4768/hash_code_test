package hash_code_test;

public class Person {
	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this)
			return true;
		if(!(obj instanceof Person))
			return false;
		Person person = (Person)obj;
		return (person.id == id && name.equals(person.name) && person.age == age);
	}

	/*
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 17;
		result = 31 * result + id;
		result = 31 * result + name.hashCode();
		result = 31 * result + age;
		return result;
	}
	*/
}
