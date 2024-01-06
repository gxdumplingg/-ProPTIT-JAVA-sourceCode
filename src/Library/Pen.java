package Library;

public class Pen extends Product{
    private String penColor, penMaterial, penInkType, penFineness;

    public String getPenColor() {
        return "Product color: " + penColor;
    }
    public String getPenMaterial() {
        return "Product material: " + penMaterial;
    }
    public String getPenInkType() {
        return "Product ink type: " + penInkType;
    }
    public String getPenFineness() {
        return "Product fineness: " + penFineness;
    }

    public void setPenColor() {
        System.out.print("Enter product color: ");
        penColor = sc.nextLine();
    }
    public void setPenMaterial() {
        System.out.print("Enter product material (plastic, metal): ");
        penMaterial = sc.nextLine();
    }
    public void setPenInkType() {
        System.out.print("Enter product ink type (oil, water-based): ");
        penInkType = sc.nextLine();
    }
    public void setPenFineness() {
        System.out.print("Enter product fineness (0.5mm, 0.7mm, 1mm, 1.5mm, " +
                "2mm, 2.5mm, 3mm, 3.5mm, 4mm, 4.5mm, 5mm): ");
        penFineness = sc.nextLine();
    }

    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.println("Product color: " + getPenColor());
        System.out.println("Product material: " + getPenMaterial());
        System.out.println("Product ink type: " + getPenInkType());
        System.out.println("Product fineness: " + getPenFineness());
    }
    @Override
    public boolean cmp(String info){
        return super.cmp(info) || super.compare(penColor, info) || super.compare(penMaterial, info) ||
                super.compare(penInkType, info) || super.compare(penFineness, info) ;
    }
    @Override
    public void addProductInfo(){
        super.addProductInfo();
        setPenColor();
        setPenMaterial();
        setPenInkType();
        setPenFineness();
    }

    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getID(), getName(), getPrice(), getBrand());
        System.out.println(" Pen color: " + getPenColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Pen material: " + getPenMaterial());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Pen ink type: " + getPenInkType());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Pen fineness: " + getPenFineness());
    }
}
