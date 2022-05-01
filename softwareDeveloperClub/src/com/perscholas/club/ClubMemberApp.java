package com.perscholas.club;

import java.util.Scanner;

public class ClubMemberApp {

	private static String[] menuItems = { "Display Members", "Remove Member", "Add Member", "Quit" };

	private static String getMenu() {
		String menu = "Select from the following menu:\n";

		int i = 0;
		for (String item : menuItems) {
			i++;
			menu += i + ": " + item + "\n";
		}

		return menu;
	}

	private static String takeAction(SoftwareDeveloperClub club, int choice) {
//		System.out.println("TAKE ACTION");
		switch (choice) {
		case 1:
			return displayMembers(club);
		case 2:
			return removeMember(club);
		case 3:
			return addMember(club);
		}
		return null;
	}

	private static String displayMembers(SoftwareDeveloperClub club) {
		String action = menuItems[0];
		if (club == null)
			return null;

		System.out.printf("[[ %s ]]%n%n", action);

		return club.getMembers();
	}

	private static String listMembersShort(SoftwareDeveloperClub club) {
		if (club == null)
			return null;

		String info = "";
		for (int i = 0; i < club.getSize(); i++) {
			info += (i + 1) + ": " + club.getMemberShort(i) + "\n";
		}

		return info;
	}

	private static String removeMember(SoftwareDeveloperClub club) {
		String action = menuItems[1];
		if (club == null)
			return null;

		System.out.printf("[[ %s ]]%n%n", action);

		Scanner localInput = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("[[ == Select Member to Remove == ]]");
				System.out.println("0: STOP REMOVAL");
				System.out.print(listMembersShort(club));
				int choice = localInput.nextInt();
				System.out.println();
				if (choice == 0)
					return "<< STOPPING Removal >>\n";
				if (0 < choice && choice <= club.getSize()) {
					int index = choice - 1;
					System.out.printf("<< Removing %d: %s >>%n", choice, club.getMemberShort(index));
					club.removeMember(index);
					System.out.println();
//					break;
					continue;
				}

			} catch (Exception e) {
				// don't really do anything (but also don't allow other try to catch this)
				System.out.println();
			} finally {
				localInput.nextLine();
			}
			System.out.println("--- Please make a valid selection ---");
			System.out.println();

		}

//		localInput.close();//do NOT close (will cause System.in to close)
//		return "<< Removal Completed >>\n";

	}

	private static String prompt(String prompt) {
		Scanner localInput = new Scanner(System.in);
		String value = "";
		while (value == "") {
			System.out.printf("Input %s: ", prompt);
			value = localInput.nextLine().trim();
		}
//		localInput.close();//do NOT close (will cause System.in to close)
		return value;
	}

	private static String addMember(SoftwareDeveloperClub club) {
		String action = menuItems[2];
		if (club == null)
			return null;

		System.out.printf("[[ %s ]]%n%n", action);

		String name = prompt("name");
		String city = prompt("city");
		String state = prompt("state");
		String favorite = prompt("favorite programming language");

		club.addMember(new ClubMember(name, city, state, favorite));

		String added = "\n<< Added new member %s >>\n";
		return added.formatted(club.getMemberShort(club.getSize() - 1));

	}

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String fileName = "members.txt";
		SoftwareDeveloperClub club = new SoftwareDeveloperClub(fileName);

//		System.out.println(club.getMembers());
		club.removeMember(0);// remove the titles
//		System.out.println(club.getMembers());

		while (true) {
//			System.out.println(input);
			System.out.println();
			System.out.print(getMenu());
			try {
				Scanner line = new Scanner(input.nextLine());
				System.out.println();

				if (line.hasNext()) {

					int choice = line.nextInt();

					// int choice = input.nextInt();
					// input.nextLine();

					if (choice == 4) {
						System.out.println("***  Quit  ***");
						break;
					}
					String result = takeAction(club, choice);
					if (result != null)
						System.out.print(result);
					else
						System.out.println("*** Make Another Selection ***");
				} // if
				line.close();
			} catch (Exception e) {
				// input.nextLine();
				System.out.println("*** Make Another Selection ***");
			}

		}

		input.close();
		System.out.println();
		System.out.println("Done");

	}

}
