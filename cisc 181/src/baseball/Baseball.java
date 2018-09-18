package baseball;

import java.util.Scanner;
 
public class Baseball{
	
	private int AB, H, _2B, _3B, HR, BB, R, HBP, SF;

	public int getAB() {
		return AB;
	}

	public void setAB(int AB) {
		this.AB = AB;
	}


	public int getH() {
		return H;
	}



	public void setH(int H) {
		this.H = H;
	}



	public int getDoubles() {
		return _2B;
	}



	public void setDoubles(int Doubles) {
		this._2B = Doubles;
	}



	public int getTriples() {
		return _3B;
	}



	public void setTriples(int Triples) {
		this._3B = Triples;
	}



	public int getHR() {
		return HR;
	}



	public void setHR(int HR) {
		this.HR = HR;
	}
	

	public int getRuns() {
		return BB;
	}

	public void setRuns(int Runs) {
		this.BB = Runs;
	}

	public int getWalks() {
		return R;
	}

	public void setWalks(int Walks) {
		this.R = Walks;
	}
	public int getHBP() {
		return HBP;
	}

	public void setHBP(int HBP) {
		this.HBP = HBP;
	}

	public int getSF() {
		return SF;
	}

	public void setSF(int sF) {
		SF = sF;
	}
	
	public static double battingAverage(int H, int AB )
	{
		return ((double)  H/AB);
		
	}
	public static double onBase(int H, int BB, int AB, int HPB, int SF)
	{
		return ((double) (H + BB + HPB) / (AB + BB + HPB + SF));
		
	}
	public static double sluggingPercentage (int R, int _2B, int _3B, int HR, int AB)
	{ 
		return ((double) (R + 2 * _2B + 3 * _3B + 4 * HR) / (AB));
		
	}
	public static double oPS(int H, int HBP, int AB, int BB, int SF, int R, int _2B, int _3B, int HR)
	{

		return ((double) ((H + BB + HBP) / AB + BB + HBP + SF) +  (R + 2 * _2B + 3 * _3B + 4 * HR) / (AB));
		
	}
	public static int totalBases(int R, int _2B, int _3B, int HR)
	{
		return (R + 2 * _2B + 3 * _3B + 4 * HR);
		
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main (String[] args){
		
		int AB; 
		int H; 
		int _2B;
		int _3B;
		int HR; 
		int BB;
		int R;
		int HBP;
		int SF;
		double battingAverage, OBP, SLG, OPS, TB; 
		
		System.out.println("Enter Player's Name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("" + name);
		
		Baseball player = new Baseball();
		
		System.out.println("Enter the following data for the player in the following order AB, H, _2B, _3B, HR, BB, R, HPB");
		
		player.setAB(scanner.nextInt());
		System.out.println(player.getAB());
		player.setH(scanner.nextInt());
		System.out.println(player.getH());
		player.setDoubles(scanner.nextInt());
		System.out.println(player.getDoubles());
		player.setTriples(scanner.nextInt());
		System.out.println(player.getTriples());
		player.setHR(scanner.nextInt());
		System.out.println(player.getHR());
		player.setRuns(scanner.nextInt());
		System.out.println(player.getRuns());
		player.setWalks(scanner.nextInt());
		System.out.println(player.getWalks());
		player.setHBP(scanner.nextInt());
		System.out.println(player.getHBP());
		player.setSF(scanner.nextInt());
		System.out.println(player.getSF());
		
		System.out.print("BattingAverage is:");
		System.out.println(battingAverage (player.H, player.AB));
		System.out.print("On Base Percentage is:");
		System.out.println(onBase (player.H, player.BB, player.AB, player.HBP, player.SF));
		System.out.print("Slugging Percentage is:");
		System.out.println(sluggingPercentage (player.R, player._2B, player._3B, player.HR, player.AB)); 
		System.out.print("OPS is:");            
		System.out.println(oPS (player.H, player.HBP, player.AB, player.BB, player.SF, player.R, player._2B, player._3B, player.HR));
		System.out.print("Total Bases is:");
		System.out.println(totalBases (player.R, player._2B, player._3B, player.HR));
		
/* 
 * Babe Ruth (Test Numbers)
 * 10 - AB
 * 2 - H
 * 1 - _2B
 * 0 - _3B                       
 * 0 - _HR
 * 0 - BB
 * 1 - R
 * 0 - HBP
 * 0 - SF
 * 
 */
		
		


	}
	
}