import java.util.Arrays;

public class MultiplicationTable {
    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {

        int y = 1;
        int x = 1;
        for (int vertical = 0; vertical < MULTIPLICATION_TABLE.length; vertical++) {                   // Цикл идущий по строкам
            for (int horizontal = 0; horizontal < MULTIPLICATION_TABLE.length; horizontal++) {         // Цикл идущий по столбцам
                MULTIPLICATION_TABLE[vertical][horizontal] = x * y;                                    // x * y и присвоить значение интексам текущей итерации [vertical = 0][horizontal = 0]
                y++;                                                                                   // Каждую итерацию внутреннего цикла, прибавлять к x++; чтобы была последовательность
            }                                                                                          // умножения. [vertical = 0][horizontal = 0] - (1 * 1 = 1) ... [vertical = 0][horizontal = 5] - (1 * 6 = 3) и т.д.

            System.out.println(Arrays.toString(MULTIPLICATION_TABLE[vertical]));                       // После каждой итерации внутреннего цикла, выводим строку с результатом
            x++;                                                                                       // После каждой итерации внутреннего цикла, прибавляем к y++; чтобы была последовательность умножения.
                                                                                                       // умножения. [vertical = 4][horizontal = 0] - (5 * 1 = 5) ... [vertical = 6][horizontal = 8] - (7 * 9 = 63) и т.д.
            y = 1;                                                                                     // Присваиваем (сбрасываем) y = 1, чтобы каждую итерацию внутреннего цикла у нас умножения начиналось с 1.
        }

    }
}

