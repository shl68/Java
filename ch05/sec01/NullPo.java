public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        String str = "null";
        System.out.println("글자의 수는 : " + str.length());

        String str1 = null;
        System.out.println("글자의 수는 : " + str1.length());


      // 자바의 참조타입에서는 기본 타입과 다르게 스택영역에서 포인터처럼 힙 영역의 객체에 접근하기 위해 주소를 이용함.
      //이 주소가 없을 경우  null오류가 나고 null 상태에서 참조 타입을 사용하기 위해 메서드를 사용하면 nullpointerexception 오류가 난다.
      //기본타입에서는 참조타입과 다르게 null값을 사용할 수 없다.


    }
}
