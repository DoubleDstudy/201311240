
public class Dicegame{
	
	Player p1 = new Player("JSJ");

	Player p2 = new Player("someone");
	
	int p1res = p1.play();
	int p2res = p2.play();
	public void showresult(){
		if(p1.getNum()>p2.getNum()){
			p1.score++;
			System.out.println(p1.getName()+"'s score:"+p1.score);
			System.out.println(p2.getName()+"'s score:"+p2.score);
		}
		else if(p1.getNum() == p2.getNum()){
			System.out.println(p1.getName()+" , "+p2.getName() + " draw");
		}
		else{
			p2.score++;
			System.out.println(p2.getName()+"'s score:"+p2.score);
			System.out.println(p1.getName()+"'s score:"+p1.score);
		}
	}
	
}

