public class ReplaceExample

 {
     public static void main(String[] args) {

         String oldstr = "가나다라ㅏ바사";
         String newstr = oldstr.replace("ㅏ","마");

         System.out.println(newstr);
     }
}
