package doorsAndLocks;

import java.util.UUID;

enum Keyshape {
	SQAURE, RECTANGULAR, CIRCULAR, OVAL, TRAPZOIDUP, TRAPAZOIDDOWN, IRREGULAR, UNKOWN
}

public class Key implements Cloneable, Comparable<Key> {

	private UUID key;// = UUID.randomUUID();
	private Keyshape shape = Keyshape.UNKOWN;

	public Key() {
		this.key = UUID.randomUUID();
	}

	public Key(Keyshape shape) {
		this();
		this.shape = shape;
	}

	public Key(Key original) {
		this.key = original.key;
		this.shape = original.shape;
	}

	public Keyshape shape() {
		return this.shape;
	}

	@Override
	public String toString() {
//		return "Key [key=" + key + "]";
		return key.toString();
	}

	@Override
	public int hashCode() {
		return key.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!this.getClass().isInstance(obj))
			return false;
		Key other = (Key) obj;
		return key.equals(other.key);
	}

	@Override
	public int compareTo(Key o) {
		return this.key.compareTo(o.key);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Key(this);
	}

}
