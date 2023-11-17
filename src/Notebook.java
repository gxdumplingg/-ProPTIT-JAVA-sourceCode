import Library.Product;

import java.util.Scanner;
import java.util.*;
public class Notebook extends Product {
    private String notebookName, notebookBrand, notebookType, notebookColor, paperMaterial, notebookSize;
    private double notebookPrice;
    private int pageNumbers;

    public String getNotebookName() {
        return notebookName;
    }
    public String getNotebookType() {
        return notebookType;
    }
    public String getNotebookBrand() {
        return notebookBrand;
    }
    public String getNotebookColor() {
        return notebookColor;
    }
    public String getPaperMaterial() {
        return paperMaterial;
    }
    public String getNotebookSize() {
        return notebookSize;
    }
    public double getNotebookPrice() {
        return notebookPrice;
    }
    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setNotebookName(String notebookName) {
        this.notebookName = notebookName;
    }
    public void setNotebookBrand(String notebookBrand) {
        this.notebookBrand = notebookBrand;
    }
    public void setNotebookType(String notebookType) {
        this.notebookType = notebookType;
    }
    public void setNotebookColor(String notebookColor) {
        this.notebookColor = notebookColor;
    }
    public void setPaperMaterial(String paperMaterial) {
        this.paperMaterial = paperMaterial;
    }
    public void setNotebookSize(String notebookSize) {
        this.notebookSize = notebookSize;
    }
    public void setNotebookPrice(double notebookPrice) {
        this.notebookPrice = notebookPrice;
    }
    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }
}
