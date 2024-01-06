package Library;

public class Pencil extends Product{
    private String pencilColor, pencilMaterial, pencilHardness;

    public String getPencilColor() {
        return "Product color: " + pencilColor;
    }
    public String getPencilMaterial() {
        return "Product material: " + pencilMaterial;
    }
    public String getPencilHardness() {
        return "Product hardness: " + pencilHardness;
    }

    public void setPencilColor() {
        System.out.print("Enter product color: ");
        pencilColor = sc.nextLine();
    }
    public void setPencilMaterial() {
        System.out.print("Enter product material (plastic, wood): ");
        pencilMaterial = sc.nextLine();
    }
    public void setPencilHardness() {
        System.out.print("Enter product hardness (HB, 2B, 3B, 4B, 5B, 6B, 7B, 8B, 9B, 10B): ");
        pencilHardness = sc.nextLine();
    }

    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.println("Product color: " + getPencilColor());
        System.out.println("Product material: " + getPencilMaterial());
        System.out.println("Product hardness: " + getPencilHardness());
    }
    @Override
    public boolean cmp(String info){
        return super.cmp(info) || super.compare(pencilColor, info) || super.compare(pencilMaterial, info) ||
                super.compare(pencilHardness, info);
    }

    @Override
    public void addProductInfo(){
        super.addProductInfo();
        setPencilColor();
        setPencilMaterial();
        setPencilHardness();
    }

    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getID(), getName(), getPrice(), getBrand());
        System.out.println(" Pencil color: " + getPencilColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Material: " + getPencilMaterial());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Hardness: " + getPencilHardness());
    }
}
