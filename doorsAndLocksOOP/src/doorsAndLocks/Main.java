package doorsAndLocks;

public class Main {

	public static void main(String[] args) throws Exception {
		Key k1 = new Key();
		Key k2 = new Key();

		System.out.println(k1);
		System.out.println(k2);

		Key key = new Key(Keyshape.OVAL);
		Key key1 = new Key(Keyshape.SQAURE);
		Key key2 = new Key();
		Key spareKey = new Key(key);

		Key otherSpareKey = (Key) key.clone();

		System.out.println(key.shape());

		Door d1 = new Door(key);

		Keychain kc1 = new Keychain();

		System.out.println(kc1.keyCount());
		kc1.addKey(key);
		System.out.println(kc1.keyCount());
		kc1.addKey(key);
		System.out.println(kc1.keyCount());

		kc1.addKey(key1);
		System.out.println(kc1.keyCount());
		kc1.addKey(spareKey);
		System.out.println(kc1.keyCount());
		kc1.addKey(otherSpareKey);
		System.out.println(kc1.keyCount());

		kc1.addKey(key2);
		System.out.println(kc1.keyCount());

		System.out.println("creating Warehouse");
		Warehouse warehouse1 = new Warehouse();
		System.out.println("done creating Warehouse");
		System.out.println(warehouse1.toString());

		System.out.println("creating Warehouse");
		Warehouse warehouse2 = new Warehouse();
		System.out.println("done creating Warehouse");
		System.out.println(warehouse2.toString());

	}

}
