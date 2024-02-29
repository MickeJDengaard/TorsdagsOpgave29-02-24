class Team{
	
	private String teamName;
	private int rank; 
	private String names;

public Team (String teamName){
		this.teamName = teamName;

	}
public void setRank(int rank){
this.rank = rank;
}

@Override
public String toString (){
return teamName + ": " + "De u-overvindelige rang:" + rank;
}

}