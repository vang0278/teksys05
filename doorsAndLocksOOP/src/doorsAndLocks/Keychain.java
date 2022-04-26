package doorsAndLocks;

import java.util.*;

public class Keychain {
//	private Set<Key> keys = new TreeSet<Key>();
	private HashMap<Keyshape, Set<Key>> keys = new HashMap<>();

	public Keychain() {
	}

	public Keychain(Collection<Key> keys) {
//		this.keys.addAll(keys);
		for (Key k : keys) {
			this.addKey(k);
		}
	}

	public boolean addKey(Key key) {
//		return this.keys.add(key);
		if (!keys.containsKey(key.shape()))
			keys.put(key.shape(), new TreeSet<Key>());
		keys.get(key.shape()).add(key);
		return true;
	}

	public boolean removeKey(Key key) {
//		return this.keys.remove(key);
		if (keys.containsKey(key.shape()))
			return keys.get(key.shape()).remove(key);
		return false;
	}

	public int keyCount() {
//		return keys.size();
		int keyCount = 0;
		for (Keyshape keyshape : keys.keySet()) {
			keyCount += keys.get(keyshape).size();
		}
		return keyCount;
	}

	//lock/unlock
	//makes more sense to have 
	//public boolean hasKeyFor(Door door)
	//and  
	//public Key getKeyFor(Door door)
	
	public boolean lock(Door door) {
//		if (door.isLocked())
//			return true;
//		for (Key k : keys) {
//			if (door.unlock(k))
//				return true;
//		}

		if (!door.hasKey())
			return false;
		if (!keys.containsKey(door.key().shape()))
			return false;
		for (Key k : keys.get(door.key().shape())) {
			if (door.lock(k))
				return true;
		}

		return false;
	}

	public boolean unlock(Door door) {
//		if (!door.isLocked())
//			return true;
//		for (Key k : keys) {
//			if (door.unlock(k))
//				return true;
//		}

		if (!door.hasKey())
			return true;
		if (!keys.containsKey(door.key().shape()))
			return false;
		for (Key k : keys.get(door.key().shape())) {
			if (door.unlock(k))
				return true;
		}

		return false;
	}

}
