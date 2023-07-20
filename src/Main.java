import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Function<Integer,String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                if(integer <0){
                    return "Bul ters san";
                } else if (integer==0) {
                    return "Bul nol";
                }
                else {
                    return "Bul on san";
                }
            }
        };

        Function<Integer,String> function1 = (integer)->{//lambda
            if(integer <0){
                return "Bul ters san";
            } else if (integer==0) {
                return "Bul nol";
            }
            else {
                return "Bul on san";
            }
        };

        System.out.println(function.apply(5));
        
    }
}



