package con.generics.UpperBound;import com.github.fge.jsonschema.core.keyword.syntax.checkers.draftv3.ExtendsSyntaxChecker;

public class CheckUpperBound {

	public static void main(String[] args) {
		LimitCharacter<Number> object = new LimitCharacter();
		object.setNumber(3);
		System.out.println(object.getNumber());
		object.inspect(6);
	}

}
