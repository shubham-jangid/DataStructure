package Algorithm.linearSearch;

public class LinearSearch {

    public static void main(String[] args) throws Exception {
        int i = System.in.read();
        System.out.println(i);

        String str ="";
        while(( i = System.in.read()) != 10){
            str=str+ (char)i;
        }
        System.out.println((String)str);
    }
}
