package javasessions;

public class ObjectReferenceConcept {
	String name;
	int age;
	public void get() {
		System.out.println("get methods");
	}

	public static void main(String[] args) {
		ObjectReferenceConcept o = new ObjectReferenceConcept();
		o=null;
		o.name="manasa";
		o.age=20;
		o.get();
		new ObjectReferenceConcept().name="djsk";
		new ObjectReferenceConcept().age=20;

	}

}
