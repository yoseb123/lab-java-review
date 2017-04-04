package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
  /* class body goes here */
    public Husky() {
        this("Fiddle");
    }

    public Husky(String name) {
        super(name, BEST_BREED);
    }

    public void pullSled() {
        System.out.println(this + " is pulling sled");
    }

    public void bark() {
        System.out.println(this+" says: Woof!");    
    }

    public void hug() {
		System.out.println(this + " is squished in a great big hug.");
	}
}
