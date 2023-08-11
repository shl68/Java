public class SubStringExample
{
    public static void main(String[] args) {

        String ssn = "1234567890";

        String firstnum = ssn.substring(0,5);
        System.out.println(firstnum);

        String secondnum = ssn.substring(5);
        System.out.println(secondnum);

    }

    //0,5  면 0부터 5 전까지 출력
}
