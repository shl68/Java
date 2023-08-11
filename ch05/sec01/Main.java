public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String str = "abcd";
        String str1 = "abcd";
        String str2 = new String("abcd");
        String str3 = new String("abcd");

        if (str == str1)
        {
            System.out.println("true");
        }
        if (str2 != str3)
        {
            System.out.println("t");
        }

        else {
            System.out.println("f");
        }


    }
}


// 리터럴 대입시 (일반) str은 동일, new (객체 생성 연산자) 사용시 다른 객체 생성
// 문자열만 비교시에는 번 지, 객체를 비교하는 것이 아니라 문자열을 equals 메소드를 이용해 비교함.
// 비교 연산자 != , 단순대입연산자 = ! (논리 부정 연산자)
// boolean start = true;
// start = !start; // !true → false
// start = !start; // !false → true
//★ 번지(참조) 비교시 == ,  문자열(내용) 비교시 .equlas
