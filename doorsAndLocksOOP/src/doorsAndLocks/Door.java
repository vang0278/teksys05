package doorsAndLocks;

public class Door {
	private Key key;
	private boolean isLocked;

	public Door(Key key) {
//		this.key = (key == null) ? null : (Key) key.clone();
		this.key = key;
		this.isLocked = this.key != null;
	}

	public Key key() {
//		return (Key) this.key.clone();
//		return key;
		return new Key(key);
	}

	public boolean hasKey() {
		return this.key != null;
	}

	public boolean isLocked() {
		return this.isLocked;
	}

	public boolean lock(Key key) {
		if (this.key != null && this.key.equals(key)) {
			this.isLocked = true;
		}
		return this.isLocked;
	}

	public boolean unlock(Key key) {
		if (this.key == null || this.key.equals(key)) {
			this.isLocked = false;
		}

		return !this.isLocked;
	}

}
