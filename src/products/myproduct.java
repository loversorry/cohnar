package products;

public class myproduct {
    private int maxzhiri;
    private int maxbelki;
    private int maxuglevodi;
    private int maxcallories;
    private int productcounter = 10;
    private product[] spisok = new product[10];

    public myproduct(int productcounter, product[] spisok) {
        this.productcounter = productcounter;
        this.spisok = spisok;

        for (int i = 0; i < productcounter; ++i) {
            this.maxzhiri += spisok[i].getZhiri();
            this.maxbelki += spisok[i].getBelki();
            this.maxuglevodi += spisok[i].getUglevodi();
            this.maxcallories += spisok[i].getCallories();
        }
    }

    public int getMaxZhiri() {
        return maxzhiri;
    }

    public void setMaxZhiri(int maxZhiri) {
        this.maxzhiri = maxZhiri;
    }

    public int getMaxBelki() {
        return maxbelki;
    }

    public void setMaxBelki(int maxBelki) {
        this.maxbelki = maxBelki;
    }

    public int getMaxUglovode() {
        return maxuglevodi;
    }

    public void setMaxUglovode(int maxUglovode) {
        this.maxuglevodi = maxUglovode;
    }

    public int getMaxCallories() {
        return maxcallories;
    }

    public void setMaxCallories(int maxCallories) {
        this.maxcallories = maxCallories;
    }

    public int getProductcounter() {
        return productcounter;
    }

    public void setProductcounter(int productcounter) {
        this.productcounter = productcounter;
    }

    public product[] getSpisok() {
        return spisok;
    }

    public void setSpisok(product[] spisok) {
        this.spisok = spisok;
    }
}

