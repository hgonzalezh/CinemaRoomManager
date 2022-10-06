
class ArrayOperations {
    public static int[][][] createCube() {
        final int size = 3;
        int[][][] cubeArray = new int[size][size][size];
        for (int i = 0; i < size; i++) {
            int value = 0;
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    cubeArray[i][j][k] = value++;
                }
            }
        }
        return cubeArray;

    }
}