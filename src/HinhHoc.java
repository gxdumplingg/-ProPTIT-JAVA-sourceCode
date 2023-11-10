public class HinhHoc {
    public String type, color;
    public double radius;
    public HinhHoc(String type, String color){
      this.type = type;
      this.color = color;
    }
    public void display(){
        System.out.println("Loại hình: " + type + ", màu " + color);
    }
}
