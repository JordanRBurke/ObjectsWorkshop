package com.company;

public class Pencil {

    private double pencilLead;
    private String pencilBrand;
    private boolean hasPencilEraser;
    private String pencilColor;
    private boolean isMechanical;

    public double getPencilLead() {
        return pencilLead;
    }

    public void setPencilLead(double pencilLead) {
        this.pencilLead = pencilLead;
    }

    public String getPencilBrand() {
        return pencilBrand;
    }

    public void setPencilBrand(String pencilBrand) {
        this.pencilBrand = pencilBrand;
    }

    public boolean isHasPencilEraser() {
        return hasPencilEraser;
    }

    public void setHasPencilEraser(boolean hasPencilEraser) {
        this.hasPencilEraser = hasPencilEraser;
    }

    public String getPencilColor() {
        return pencilColor;
    }

    public void setPencilColor(String pencilColor) {
        this.pencilColor = pencilColor;
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean mechanical) {
        isMechanical = mechanical;
    }
}
