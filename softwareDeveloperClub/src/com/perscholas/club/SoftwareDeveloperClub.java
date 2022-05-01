package com.perscholas.club;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareDeveloperClub {
	ArrayList<ClubMember> members;

	public SoftwareDeveloperClub(String fromFileName) throws Exception {
		this.members = new ArrayList<ClubMember>();

		File file = new File(fromFileName);
		if (!file.exists())
			return;
		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {
			String[] tokens = input.nextLine().split("[*][*]");
			ClubMember m = new ClubMember( //
					tokens[0].trim(), //
					tokens[1].trim(), //
					tokens[2].trim(), //
					tokens[3].trim());
			this.members.add(m);
//			System.out.println("Reading In ...");
//			System.out.println(this.printMember(m));
		}
//		System.out.println("... Done Reading In");
		input.close();

	}

	private String printMember(ClubMember m) {
		return String.format("Member Name: %s%nLocation: %s, %s%nFavorite Language: %s%n", //
				m.getName(), m.getCity(), m.getState(), m.getFavorite());
	}

	private String printMemberShort(ClubMember m) {
		return String.format("%s | %s, %s | %s", //
				m.getName(), m.getCity(), m.getState(), m.getFavorite());
	}

	public String getMembers() {
		String info = "";
		for (ClubMember m : members) {
			info += this.printMember(m) + "\n";
		}
		return info;
	}

	public String getMember(int index) {
		if (index < 0)
			return null;
		if (this.members.size() <= index)
			return null;
		return this.printMember(this.members.get(index));
	}

	public String getMemberShort(int index) {
		if (index < 0)
			return null;
		if (this.members.size() <= index)
			return null;
		return this.printMemberShort(this.members.get(index));
	}

	public boolean removeMember(int index) {
		if (index < 0)
			return false;
		if (this.members.size() <= index)
			return false;
		return this.members.remove(index) != null;
	}

	public boolean addMember(ClubMember m) {
		return this.members.add(new ClubMember(m));
	}

	public int getSize() {
		return this.members.size();
	}

}
