open dice;
class Dice{
private int number = 0 ;
public int roll(){
number = (int) (Math.random() * 6)+1;
System.out.println("turns on" + number);
return number;
}
}
public class Player{
private String name =null;
int num = 0;
public Player(String _name){
name = _name;
}
public void play(){
Dice d = new Dice();
num =  d.roll();
}
public String getName(){
return this.name;
}
public int getNum(){
return this.num;
}
}
Player p = new Player("asd");
p.play();
p.play();
p.play();
p.play();
p.play();
p.play();
p.play();
p.play();
p.play();
p.play();
p.play();
p.play();
p.getName();
class DiceGame{
Player p1;
Player p2;
public void startGame(){
p1 = new Player("JSJ");
p2 = new Player("JSL");
p1.play();
p2.play();
if(p1.getNum()>p2.getNum()){
System.out.println(p1.getName()+"win");
}
else if(p1.getNum() == p2.getNum()){
System.out.println("draw");
}
else
System.out.println(p2.getName()+"win");
}
}
DiceGame d = new DiceGame();
d.startGame();