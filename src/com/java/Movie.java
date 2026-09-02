package com.java;

public class Movie {
	
	static String TheaterName="PVR";
	static String Location="Hyderabad";
	
	String MovieName;
	int MovieBudget;
	String ReleaseDate;

	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		m1.MovieName="Toxic";
		m1.MovieBudget=600;
		m1.ReleaseDate="28_08_2026";
		System.out.println("Theater Name: "+TheaterName);
		System.out.println("Location: "+Location);
		System.out.println("Movie Name:"+m1.MovieName);
		System.out.println("Release Date: "+m1.ReleaseDate);
		System.out.println("Movie Budget: "+m1.MovieBudget+"Cr");
		
		Movie m2 = new Movie();
		m2.MovieName="Irumudi";
		m2.MovieBudget=300;
		m2.ReleaseDate="26_08_2026";
		System.out.println("Theater Name: "+TheaterName);
		System.out.println("Location: "+Location);
		System.out.println("Movie Name:"+m2.MovieName);
		System.out.println("Release Date: "+m2.ReleaseDate);
		System.out.println("Movie Budget: "+m2.MovieBudget+"Cr");
		
		Movie m3 = new Movie();
		m3.MovieName="Viswanath & Sons";
		m3.MovieBudget=450;
		m3.ReleaseDate="21_08_2026";
		System.out.println("Theater Name: "+TheaterName);
		System.out.println("Location: "+Location);
		System.out.println("Movie Name:"+m3.MovieName);
		System.out.println("Release Date: "+m3.ReleaseDate);
		System.out.println("Movie Budget: "+m3.MovieBudget+"Cr");
		
		Movie m4 = new Movie();
		m4.MovieName="Sitaramam";
		m4.MovieBudget=250;
		m4.ReleaseDate="30_08_2024";
		System.out.println("Theater Name: "+TheaterName);
		System.out.println("Location: "+Location);
		System.out.println("Movie Name:"+m4.MovieName);
		System.out.println("Release Date: "+m4.ReleaseDate);
		System.out.println("Movie Budget: "+m4.MovieBudget+"Cr");
		
		Movie m5 = new Movie();
		m5.MovieName="Hi Nana!";
		m5.MovieBudget=400;
		m5.ReleaseDate="28_04_2025";
		System.out.println("Theater Name: "+TheaterName);
		System.out.println("Location: "+Location);
		System.out.println("Movie Name:"+m5.MovieName);
		System.out.println("Release Date: "+m5.ReleaseDate);
		System.out.println("Movie Budget: "+m5.MovieBudget+"Cr");

	}

}
