package products;

public class Main {
    public static void main(String[] args) {
        product shava = new product("ШАурРМА",3,4,150,1);
        product borsh = new product("борщ",12,56,200,15);
        product tortik = new product ("тортик",12,68,800,399);
        product salatik = new product("оливье",128,34,500,123);
        product pivo = new product("пивас",906,80,456,2300);
        product milkshake = new product("коктейль",430,808,432,6666);
        product[] arr1 = {borsh,tortik,salatik,pivo};
        myproduct karzina0din = new myproduct(555,666,111,222,333);

        System.out.println(karzina0din.getmaxbelki()+"всего белков в одной корзине");
        System.out.println(karzina0din.getzhiri()+"всего жиров одной корзине");
        System.out.println(karzina0din.getuglevodi()+"всего углеводов в одной корзине");
        System.out.println(karzina0din.getcallories()+"всего каллориев в одной корзине");
    }
}
