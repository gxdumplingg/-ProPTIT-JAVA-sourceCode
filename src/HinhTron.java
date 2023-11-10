public class HinhTron extends HinhHoc{
    public HinhTron(String type, String color, double r){
        super ("Hình tròn", "đỏ");
        this.type = type;
        this.color = color;
        this.radius = r;
    }
//    public void solve(){
//        super.display();
//    }
    @Override
    public void display(){
        super.display();
        System.out.println("Bán kính: " + radius);
    }
    public static void main(String[] args) {
        HinhTron c1 = new HinhTron("Hình tròn", "trắng" , 10);
        c1.display();
    }
}
