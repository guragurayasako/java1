class TwirlingRobot{
    private int x;
    private int y;
    private int dir;

    public void initialize(int x, int y, int dir){
        this.x = x;
        this.y = x;
        this.dir = dir;
    }

    public void turnRight(){
        if(this.dir == 3) this.dir = 0;
        else this.dir++;
    }

    public void turnLeft(){
        if(this.dir == 0) this.dir = 3;
        else this.dir--;
    }

    public void move(){
        switch (this.dir) {
            case 0: this.y--;
                    if(this.y < -4) this.y++;
                    break;
            case 1: this.x++;
                    if(this.x > 4) this.x--;
                    break;
            case 2: this.y++;
                    if(this.y > 4) this.y--;
                    break;
            case 3: this.x--;
                    if(this.x < -4) this.x++;
                    break;
        }
    }

    public void printLocation(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

}