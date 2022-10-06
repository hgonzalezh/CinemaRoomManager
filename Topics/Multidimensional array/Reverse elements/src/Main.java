
class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        int[][] copyArray = new int[twoDimArray.length][];
        for (int i = 0; i < twoDimArray.length; i++) {
            copyArray[i] = new int[twoDimArray[i].length];
            for (int j = 0; j < twoDimArray[i].length; j++) {
                copyArray[i][j] = twoDimArray[i][j];
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = copyArray[i][copyArray[i].length - j - 1];
            }
        }
    }
}