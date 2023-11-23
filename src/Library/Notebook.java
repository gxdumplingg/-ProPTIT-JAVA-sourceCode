package Library;

public class Notebook extends Product{
    private String pageNumbers, notebookType, notebookColor, paperMaterials, notebookSize;

    public String getPageNumbers() {
        return pageNumbers;
    }
    public String getType() {
        return notebookType;
    }
    public String getColor() {
        return notebookColor;
    }
    public String getPaperMaterials() {
        return paperMaterials;
    }
    public String getSize() {
        return notebookSize;
    }

    public void setPageNumbers(String pageNumbers) {
        this.pageNumbers = pageNumbers;
    }
    public void setType(String type) {
        this.notebookType = type;
    }
    public void setColor(String notebookColor) {
        this.notebookColor = notebookColor;
    }
    public void setPaperMaterials(String paperMaterials) {
        this.paperMaterials = paperMaterials;
    }
    public void setSize(String notebookSize) {
        this.notebookSize = notebookSize;
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
        System.out.print("Enter product page number: ");
        setPageNumbers(sc.nextLine());
        System.out.print("Enter product type (line, grid, plain) : ");
        setType(sc.nextLine());
        System.out.print("Enter product color: ");
        setColor(sc.nextLine());
        System.out.print("Enter product paper material: ");
        setPaperMaterials(sc.nextLine());
        System.out.print("Enter product size (A4, A5, A6): ");
       setSize(sc.nextLine());
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
