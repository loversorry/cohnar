package products;

public class product {
    private String name;
    private int zhiri;
    private int belki;
    private int uglevodi;
    private int callories;

    public product(String name, int zhiri, int belki, int uglevodi, int callories) {
        this.name = name;
        this.zhiri = zhiri;
        this.belki = belki;
        this.uglevodi = uglevodi;
        this.callories = callories;
    }

    public product(String name, int zhiri, int belki, int uglevodi) {
        this.name = name;
        this.zhiri = zhiri;
        this.belki = belki;
        this.uglevodi = uglevodi;

    }
    public int getCallories() {
        return callories;
    }

    public int getUglevodi() {
        return uglevodi;
    }

    public int getBelki() {
        return belki;
    }

    public int getZhiri() {
        return zhiri;
    }

    public String getName() {
        return name;
    }

    public product(int belki) {
        this.belki = belki;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setZhiri(int zhiri) {
        this.zhiri = zhiri;
    }

    public void setBelki(int belki) {
        this.belki = belki;
    }

    public void setUglevodi(int uglevodi) {
        this.uglevodi = uglevodi;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }
}





