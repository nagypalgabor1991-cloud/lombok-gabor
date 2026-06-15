public class MediumTask1 {
    public static void main(String[] args) {
    }

    public static boolean areAllValuesTrue(boolean[][][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        if (!array[i][j][k][l]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
