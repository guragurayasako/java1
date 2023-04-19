/**/
//Since point,java satisfied the specification of ProblemA, only Point.java needs to be submitted for Problems A and B.
public class Point{

    static int X_MAX, X_MIN, Y_MAX, Y_MIN;

    private int x = 0;
    private int y = 0;
    //scで入力された値をsetXの引数として受け取り、Pointクラス内で宣言されたx(this.x)に格納

    public void move(int x, int y){
     	this.x += x;
	if(this.x < X_MIN || X_MAX < this.x) this.x -= x;
	this.y += y;
	if(this.y < Y_MIN || Y_MAX < this.y) this.y -= y;
    }
    //this.xに格納された値を返す
    public int getX() {
        return x;
    }
    public int  getY(){
        return y;
    }
  
} 
