package docker_java_simple_app;

public class SimpleApp {
	public static void main(String[] args) {
		String name = System.getenv("USER.NAME");
		System.out.println("Hi "+name+", How are you?");
	}
	

}
