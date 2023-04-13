package com.coresrevisao.coresrevisao;

public class Cor {

    private final int red;
    private final int green;
    private final int blue;

    public Cor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getRGB() {
        return "rgb(" + red + "," + green + ", " + blue + ")";
    }

    public int getSomaRGB() {
        return red + green + blue;
    }

}
