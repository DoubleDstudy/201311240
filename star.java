import ch.aplu.turtle.*;
Turtle t1=new Turtle();
void drawStarAt(int Ssize,double x,double y){
  t1.setPos (x,y);
  for (int i=0;i <5;i++){
    t1.forward (Ssize);
    t1.right (144);
  }
}
drawStarAt(50,0,10);