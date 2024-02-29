class Main{
	
public static void main (String [] args) {

	Team t1 = new Team("Kongerne");
	for(int i = 1; i <= 6; i++){
		Team t = new Team("Team " + i);
		t.setRank(i);
		System.out.println(t);
	}

	t1.setRank(7);
	System.out.println(t1.toString());

}
}