
package Inherit;

public class MyHome {

	public static void main(String[] args) {
		SuperMan superMan = new SuperMan();
		superMan.name = "클라크";  // person 에 있던
		superMan.age = 100; // person 에 있던
		superMan.speed = 100; // man 에 있던
		superMan.high = 1000; // superMan 에 있던
		
		superMan.smile();
		superMan.run();
		superMan.fly();
		
				
	}

}
