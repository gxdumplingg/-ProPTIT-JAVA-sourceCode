package Library;

public class Pen extends Product{
    private String penColor, penMaterial, penInkType, penFineness;

    public String getPenColor() {
        return penColor;
    }
    public String getPenMaterial() {
        return penMaterial;
    }
    public String getPenInkType() {
        return penInkType;
    }
    public String getPenFineness() {
        return penFineness;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }
    public void setPenMaterial(String penMaterial) {
        this.penMaterial = penMaterial;
    }
    public void setPenInkType(String penInkType) {
        this.penInkType = penInkType;
    }
    public void setPenFineness(String penFineness) {
        this.penFineness = penFineness;
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
        System.out.print("Enter product color: ");
        setPenColor(sc.nextLine());
        System.out.print("Enter product material (plastic, metal): ");
        setPenMaterial(sc.nextLine());
        System.out.print("Enter product ink type (oil, water-based): ");
        setPenInkType(sc.nextLine());
        System.out.print("Enter product fineness (0.5mm, 0.7mm, 1mm, 1.5mm, " +
                            "2mm, 2.5mm, 3mm, 3.5mm, 4mm, 4.5mm, 5mm): ");
        setPenFineness(sc.nextLine());
    }

    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getID(), getName(), getPrice(), getBrand());
        System.out.println(" Pen color: " + getPenColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Pen material: " + getPenMaterial());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Pen ink type: " + getPenInkType());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Pen fineness: " + getPenFineness());
    }
}
