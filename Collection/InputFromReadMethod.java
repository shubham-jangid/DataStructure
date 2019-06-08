package Collection;

public class InputFromReadMethod {
    public static void main(String[] args) throws Exception {
        int i=System.in.read();
        System.out.println((char)i);

        // read method only takes one character as input as ASCII value .

        // to read the string of character we need to use the loop
        String str = "";

        while((i=System.in.read())!=10){
            // 10 here is the ASCII value of enter
            str = str + (char)i;
        }
        System.out.println(i);


    }
}
