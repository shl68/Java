public class EvenOddJavaArray {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] num_list,int[] even_list, int[] odd_list) {

                for (int i = 0; i<num_list.length; i++)
                {
                    if (num_list[i] % 2 == 0)
                    {
                        even_list = new int [i];
                    }

                    if (num_list[i] % 2 != 0)
                    {
                        odd_list =  new int [i] ;

                    }
                }

                 int[] answer = {even_list.length, odd_list.length};

                return answer;
            }
        }
    }
}
