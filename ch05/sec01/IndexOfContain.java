public class IndexOfContain
{
    public static void main(String[] args) {

        String str = "충청북도청주시서현로68";

        int location = str.indexOf("서현로");
        System.out.println(location);

        int indexof = str.indexOf("서현로");
        int indexof1 = str.indexOf("충주시");

        System.out.println(indexof);
        System.out.println(indexof1);

        boolean contains = str.contains("청주");

        System.out.println(contains);

    }
}

// indexOf = 없으면 -1 , 있으면 인덱스의 위치 반환
// contains = 단순히 포함됐는지 여부 있으면 true 없으면 false
// contains 는  boolean과 함께 사용
