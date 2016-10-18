import ch.aplu.turtle.*;
Turtle t1=new Turtle();
void drawTriangleAt(int Tsize,double x,double y){
t1.setPos(x,y);
for(int j=0;j<3;j++){
        t1.right(120);
        t1.forward(Tsize);
        }
}