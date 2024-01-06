package Library;

public class Notebook extends Product{
    private String pageNumbers, notebookType, notebookColor, paperMaterials, notebookSize;

    public String getPageNumbers() {
        return "Product page number: " + pageNumbers;
    }
    public String getType() {
        return "Product type: " + notebookType;
    }
    public String getColor() {
        return "Product color: " + notebookColor;
    }
    public String getPaperMaterials() {
        return "Product paper material: " + paperMaterials;
    }
    public String getSize() {
        return "Product size: " + notebookSize;
    }

    public void setPageNumbers() {
        System.out.print("Enter product page number: ");
        pageNumbers = sc.nextLine();
    }
    public void setType() {
        System.out.print("Enter product type (line, grid, plain) : ");
        notebookType = sc.nextLine();
    }
    public void setColor() {
        System.out.print("Enter product color: ");
        notebookColor = sc.nextLine();
    }
    public void setPaperMaterials() {
        System.out.print("Enter product paper material: ");
        paperMaterials = sc.nextLine();
    }
    public void setSize() {
        System.out.print("Enter product size (A4, A5, A6): ");
        notebookSize = sc.nextLine();
    }

    @Override
    public void getProductInfo (){
        super.getProductInfo();
        System.out.println("Product page numbers: " + getPageNumbers());
        System.out.println("Product type: " + getType());
        System.out.println("Product color: " + getColor());
        System.out.println("Product paper material: " + getPaperMaterials());
        System.out.println("Product size: " + getSize());
    }
    @Override
    public boolean cmp(String info){
        return super.cmp(info) || super.compare(pageNumbers, info) || super.compare(notebookType, info) ||
                super.compare(notebookColor, info) || super.compare(paperMaterials, info) || super.compare(notebookSize, info);
    }
    @Override
    public void addProductInfo(){
        super.addProductInfo();
        setPageNumbers();
        setType();
        setColor();
        setPaperMaterials();
        setSize();
    }

    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getID(), getName(), getPrice(), getBrand());
        System.out.println(" Page number: " + getPageNumbers());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Type: " + getType());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Color: " + getColor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Paper material: " + getPaperMaterials());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Size: " + getSize());
    }
}
