public class CharAtExample {
    public static void main(String[] args) {

        String personnum = "97061213";

        char sex = personnum.charAt(6);

        switch (sex)
        {
            case '1':
            case '3':
                System.out.println("male");
                break;
            case '2':
            case '4':
                System.out.println("female");
                break;
        }


    }
}
