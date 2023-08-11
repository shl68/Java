public class EqualsExample {
    public static void main(String[] args) {


        String value1 = "홍길동";
        String value2 = "홍길동";
        String value3 = new String("홍길동");
        String value4 = new String("홍길동");

        if (value1 == value2){
            System.out.println("참조가 같음(string은 배열과 다르게 같은 참조)");
        }
        else {
            System.out.println("참조가 다름");
        }

        if (value3 == value4)
        {
            System.out.println("참조가 같음");
        }

        else {
            System.out.println("참조가 다름(new는 새로 만들기 때문)");
        }

        if (value3.equals(value4))
        {
            System.out.println("문자열이 같음(equals.는 문자열만 비교)");
        }

    }



}
