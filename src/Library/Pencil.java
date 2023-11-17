package Library;

public class Pencil extends Product{
    private String pencilColor, pencilMaterial, pencilHardness;

    public String getPencilColor() {
        return pencilColor;
    }
    public String getPencilMaterial() {
        return pencilMaterial;
    }
    public String getPencilHardness() {
        return pencilHardness;
    }

    public void setPencilColor(String pencilColor) {
        this.pencilColor = pencilColor;
    }
    public void setPencilMaterial(String pencilMaterial) {
        this.pencilMaterial = pencilMaterial;
    }
    public void setPencilHardness(String pencilHardness) {
        this.pencilHardness = pencilHardness;
    }

    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.println("Product color: " + getPencilColor());
        System.out.println("Product material: " + getPencilMaterial());
        System.out.println("Product hardness: " + getPencilHardness());
    }
    public boolean comparePencil(String info){
        return super.cmp(info) || super.compare(pencilColor, info) || super.compare(pencilMaterial, info) ||
                super.compare(pencilHardness, info);
    }

    @Override
    public void addProductInfo(){
        super.addProductInfo();
        System.out.print("Enter product color: ");
        setPencilColor(sc.nextLine());
        System.out.print("Enter product material (plastic, wood): ");
        setPencilMaterial(sc.nextLine());
        System.out.print("Enter product hardness (HB, 2B, 3B, 4B, 5B, 6B, 7B, 8B, 9B, 10B): ");
        setPencilHardness(sc.nextLine());
    }

    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getID(), getName(), getPrice(), getBrand());
        System.out.println(" Pencil color: " + getPencilColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Material: " + getPencilMaterial());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Hardness: " + getPencilHardness());
    }
}
