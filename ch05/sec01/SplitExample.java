public class SplitExample
{
    public static void main(String[] args) {

        String Student = "1670021,이학현,컴퓨터공학과,남자";

        String[] tokens = Student.split(",");

        System.out.println("학번 : " + tokens[0]);
        System.out.println("이름 : " + tokens[1]);
        System.out.println("학과 : " + tokens[2]);
        System.out.println("성별 : " + tokens[3]);

        for(int i=0; i<tokens.length; i++)

        {
            System.out.println(tokens[i]);
        }
    }
}
