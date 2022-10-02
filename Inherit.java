class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inherit {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(8);
        Derived d = new Derived();
        d.setY(9);
        System.out.println(b.getX());
        System.out.println(d.getY());
    }
    
}
