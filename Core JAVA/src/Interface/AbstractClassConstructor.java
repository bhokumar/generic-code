package Interface;

public abstract class AbstractClassConstructor {

	/**
	 * You would define a constructor in an abstract class if you are in one of these situations:

you want to perform some initialization (to fields of the abstract class) before the instantiation of a subclass actually takes place
you have defined final fields in the abstract class but you did not initialize them in the declaration itself; in this case, you MUST have a constructor to initialize these fields
	 */
	public AbstractClassConstructor()
	{
		System.out.println("pppppppp");
	}
	
	protected abstract void display();
}
