package pkgCore;

import java.util.LinkedList;
public class Round extends Roll{

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	

	public Round() {
		
		Roll();
		RollCount();
		if(ComeOutScore==7 || ComeOutScore==11);
		eGameResult=eGameResult.NATURAL;
		
		
		if(ComeOutScore==2||ComeOutScore==3||ComeOutScore==12);
		eGameResult=eGameResult.CRAPS;
		
		
		if(ComeOutScore==4||ComeOutScore==5||ComeOutScore==6||ComeOutScore==8||ComeOutScore==9||ComeOutScore==10)
			{
		int firstscore = ComeOutScore;
		Roll r =new Roll();
			if(r.getScore() == firstscore)
			{
			eGameResult= eGameResult.POINT;
		
			}
			if(r.getScore() == 7)
			{
			eGameResult=eGameResult.SEVEN_OUT;
			}
			}
		
		
	}

	private void Roll() {
		
		
	}
	int RC = 1;
	public int RollCount() {
	
		RC+=1;
		return RC;
	}

	public LinkedList<Roll> getRolls() {
		return rolls;
	}

	public void setRolls(LinkedList<Roll> rolls) {
		this.rolls = rolls;
	}

	public static pkgCore.eGameResult ComeOutScore(int i) {
		
		return null;
	}

}
