//Since point,java satisfied the specification of ProblemA, only Point.java needs to be submitted for Problems A and B.
public class Point {
    private int x = 0;
    private int y = 0;
    //scで入力された値をsetXの引数として受け取り、Pointクラス内で宣言されたx(this.x)に格納
    public void setX(int x) {
	this.x = x;
    }
    public void setY(int y) {
	this.y = y;
    }
    //this.xに格納された値を返す
    public int getX() {
	return x;
    }
    public int  getY(){
	return y;
    }

    //問題Bでつかう。入力された値を足し合わせていく
    public void move(int dx, int dy){
	this.x += dx;
	this.y += dy;
    }
}
