//Simple subclass to allow for a name
public class NamedPlayer extends Player{ // extends from Player superclass
    private String name;

    //new constructor to give the player a name
    public NamedPlayer(char mark, String name) {
    	super(mark);
        this.name = name;
    }

    //return the name
   	public String getName() { return name;}
}
