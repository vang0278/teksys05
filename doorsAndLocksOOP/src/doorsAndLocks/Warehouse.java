package doorsAndLocks;

public class Warehouse {
	private Door[] doors = new Door[100];

	public Warehouse() {
		// create all doors with locks
		for (int i = 0; i < doors.length; i++) {
			int s = (int) (Math.random() * 4);
			Keyshape shape = Keyshape.UNKOWN;
			switch (s) {
			case 0:
				shape = Keyshape.SQAURE;
				break;//
			case 1:
				shape = Keyshape.CIRCULAR;
				break;//
			case 2:
				shape = Keyshape.OVAL;
				break;//
			case 3:
				shape = Keyshape.TRAPAZOIDDOWN;
				break;//
			}

			// should never be Keyshape.UNKOWN;
			this.doors[i] = new Door(new Key(shape));
		}
		
//		System.out.println("Removing locks");
		
		// replace 10 doors without locks
		for (int i = 0; i < this.doors.length / 10; i++) {
			int rndDoor;
			do {
				rndDoor = (int) (Math.random() * doors.length);
			} while (!doors[rndDoor].hasKey());

			this.doors[rndDoor] = new Door(null);
		}

	}

	@Override
	public String toString() {
		int total = this.doors.length;
		int yKey = 0;
		int nKey = 0;
		int sCount = 0;
		int cCount = 0;
		int oCount = 0;
		int tCount = 0;

		for (Door d : doors) {
			if (!d.hasKey()) {
				nKey++;
				continue;
			}
			yKey++;
			switch (d.key().shape()) {
			case SQAURE:
				sCount++;
				break; //
			case CIRCULAR:
				cCount++;
				break; //
			case OVAL:
				oCount++;
				break; //
			case TRAPAZOIDDOWN:
				tCount++;
				break; //
			}
		}

		return String.format(
				"Warehouse [doors=%d, locks=%d, no locks=%d, square=%d, cicular=%d, oval=%d, trapezoidDown=%d]", total,
				yKey, nKey, sCount, cCount, oCount, tCount);
	}

}
