package film;

public class Director {
    String name;
    int code;
    int rating;

    public Director(String name, int code, int rating) {
        this.name = name;
        this.code = code;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
