package con.generics.UpperBound;

public class LimitCharacter<T> {
	private T number;

	public T getNumber() {
		return number;
	}

	public void setNumber(T c) {
		this.number = c;
	}
	
	public <U extends Number > void inspect(U u){
		System.out.println("T: "+number.getClass());
		System.out.println("U: "+u.getClass());
	}
	
}
