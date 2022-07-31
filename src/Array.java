public class Array {

    public static void main(String[] args) {


        //공간과 값을 할당하는 법
        int[] arr = {1, 2, 3, 4};
        //다른표기법
        int[] arr1 = new int[]{1, 2, 3, 4};

        // 공간만 할당 후 이후에 값을 저장
        String[] textArray = new String[4];
        textArray[0] = "안녕1";
        textArray[2] = "안녕3";
        textArray[3] = "안녕4";

        //배열 크기 확인하기
        System.out.println(arr.length); //4

        //배열에 값이 없다면?
        System.out.println(textArray[1]);

        //2차원 배열 만드는법
        //공간과 값을 할당하는 법
        int[][] twoarr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        //공간과 값을 할당하는법 (다른 표기법)
        char[][] two = new char[][]{
                {'아', '에', '이', '오'},
                {'가', '게', '기', '고'},
                {'나', '네', '니', '노'}
        };

        //공간 할당 후 값 할당
        char[][] twotwo = new char[3][5];
        twotwo[0][0] = '가';
        twotwo[0][1] = '나';
        twotwo[0][2] = '다';
        twotwo[0][3] = '라';
        twotwo[0][4] = '마';
        twotwo[0][5] = '바';

        twotwo[1][0] = '사';
        twotwo[1][1] = '아';
        twotwo[1][2] = '자';
        twotwo[1][3] = '차';
        twotwo[1][4] = '카';
        twotwo[1][5] = '타';

        twotwo[2][0] = '파';
        twotwo[2][1] = '하';
        twotwo[2][2] = '거';
        twotwo[2][3] = '너';
        twotwo[2][4] = '더';
        twotwo[2][5] = '러';
    }

    ;
}