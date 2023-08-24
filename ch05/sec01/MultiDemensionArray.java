public class MultiDemensionArray {
    public static void main(String[] args) {
        int [] [] scores = { {100, 90 , 80}, {86 , 55, 95}}; //1학년 1반, 2반

        System.out.println("1차원 배열의 길이 : " + scores.length);
        System.out.println("2차원 배열의 0인덱스 길이 :"+scores[0].length);
        System.out.println("2차원 배열의 1인덱스 길이 : " + scores[1].length);
        System.out.println( "1학년 1반의 3번 학생 성적 : "+scores[0][2]);
        System.out.println("2차원 배열의 2번째 인덱스 : "+ scores[1][1]);
        System.out.println(scores[0]); //실제로는 (참조 변수) 해시 값이 나옴


        int sumclass1 = 0;
        double everageclass1 = 0;

        for (int i = 0; i< scores[0].length; i++){
            sumclass1 += scores[0][i];
        }

        everageclass1 = sumclass1 / scores[0].length;

        System.out.println("1반의 평균 : " + everageclass1);

        int sumgrade = 0;
        double everagegrade = 0;

        for(int i = 0; i<scores.length; i++){
            for(int j = 0; j<scores[i].length; j++){
                sumgrade += scores[i][j];
            }
            //everagegrade = sumgrade / (scores[0].length + scores[1].length) ;
            everagegrade = (double)sumgrade / (scores[0].length + scores[1].length) ;

        }

        System.out.println("전체 학년 평균 : " + everagegrade);


        // 위 전체 학년 평균 코드처럼 작성시 84.333이 아닌 84가 출력됨.
        // int sumgrade를 double sumgrade로 변환해야 함
    }
}
