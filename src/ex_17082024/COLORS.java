package ex_17082024;

public enum COLORS {
    Red("#ff0000"),
    Green("#f0d0d0");


    private final String hexValue;

    COLORS(String hexValue){
        this.hexValue=hexValue;
    }

    public String getValue(){
        return hexValue;
    }

}
