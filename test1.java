public class test1 {
//        public static void main(String[]args){
//            int width = 5;
//            int height = 3;
//
//            for (int i = 0; i < height; i++){
//                for (int j =0 ;j < width;j++){
//                    System.out.print("*  ");
//                }
//                System.out.println(" ");
//            }
//
//    }
//}
//

//    public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i = rows; i >= 1; --i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
////
////}
//public static void main(String[] args) {
//    int rows = 5;
//
//    for (int i = 1; i <= rows; ++i) {
//        for (int j = 1; j <= i; ++j) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//}
//}
//
//        public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i = 1; i <= rows; ++i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//


    public static void main(String[] args) {
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}