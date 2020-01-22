package ua.lviv.lgs.first;

import java.io.ObjectInputStream.GetField;
import java.time.Month;
import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Press 1 to check if there is a month");
		System.out.println("Press 2 to print all the months with the same time of year");
		System.out.println("Press 3 to print all months that have the same number of days");
		System.out.println("Press 4 to print all months that have fewer days");
		System.out.println("Press 5 to print all months that have more days");
		System.out.println("Press 6 to print next season");
		System.out.println("Press 7 to print previous season");
		System.out.println("Press 8 to print all months that have an even number of days");
		System.out.println("Press 9 to print all months that have an odd number of days");
		System.out.println("Press 10 to print the month entered from the console has an even number of days");
	}

	public static void main(String[] args) {
		Months[] mas = Months.values();
		Seasons[] smas = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = false;

				for (Months m : mas) {
					if (m.name().equalsIgnoreCase(month)) {
						System.out.println("Month exist");
						flag = true;
					}
				}

				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;
			}
			case "2": {
				System.out.println("Enter Season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Months m : mas) {
					if (m.getSeasons().name().equals(seasonSc)) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;
			}
			case "3": {
				System.out.println("Enter the number of days per month");
				sc = new Scanner(System.in);
				int daySc = sc.nextInt();

				boolean flag = false;

				for (Months m : mas) {
					if (m.getDays() == daySc) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;
			}
			case "4": {
				System.out.println("Enter the number of days per month");
				sc = new Scanner(System.in);
				int daySc = sc.nextInt();

				boolean flag = false;

				for (Months m : mas) {
					if (m.getDays() < daySc) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;
			}
			case "5": {
				System.out.println("Enter the number of days per month");
				sc = new Scanner(System.in);
				int daySc = sc.nextInt();

				boolean flag = false;

				for (Months m : mas) {
					if (m.getDays() > daySc) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
				}
				break;
			}
			case "6": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : smas) {
					if (s.name().equals(seasonSc)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons s = Seasons.valueOf(seasonSc);
					int ordinal = s.ordinal();

					if (ordinal == smas.length - 1) {
						ordinal = 0;
						System.out.println(smas[ordinal]);
					} else {
						System.out.println(smas[ordinal + 1]);
					}
				}
				if (!flag) {
					System.out.println("Season doesnt exist");
				}
				break;
			}
			case "7": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : smas) {
					if (s.name().equals(seasonSc)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons s = Seasons.valueOf(seasonSc);
					int ordinal = s.ordinal();

					if (ordinal == 0) {
						ordinal = smas.length - 1;
						System.out.println(smas[ordinal]);
					} else {
						System.out.println(smas[ordinal - 1]);
					}
				}
				if (!flag) {
					System.out.println("Season doesnt exist");
				}
				break;
			}
			case "8": {
				for (Months m : mas) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m);
					}
				}
				break;
			}
			case "9": {
				for (Months m : mas) {
					if (m.getDays() % 2 == 1) {
						System.out.println(m);
					}
				}
				break;
			}
			case "10": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String mSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Months m : mas) {
					if (m.name().equalsIgnoreCase(mSc)) {
						if (m.getDays() % 2 == 0) {
							System.out.println("The month has an even number of days");
							flag = true;
						} else {
							System.out.println("The month does not have an even number of days");
						}
					}
				}
				if (!flag) {
					System.out.println("Month does not exist");
				}
				break;
			}

			}
		}
	}

}
