package matrix;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class MatrixMultiplicationTest {
    //TODO Implement, apply your test cases here
    private static String genericMatrixPath = "plainTextDirectory/input/matrixProblem";
    private static String pathFileMatrix1 = genericMatrixPath + "A/matrixProblemSet1.txt";
    private static String pathFileMatrix2 = genericMatrixPath + "A/matrixProblemSet2.txt";

    private double[][] nonSquareMtx;
    private double[][] runTestMtx1;
    private double[][] runTestMtx2;

    @Before
    public void setUp() throws IOException {
        nonSquareMtx = new double[][]{{56, 23, 43, 53, 54}, {98, 2, 34, 32, 54}};
        runTestMtx1 = Main.convertInputFileToMatrix(pathFileMatrix1, 50, 50);
        runTestMtx2 = Main.convertInputFileToMatrix(pathFileMatrix2, 50, 50);
    }

    @Test
    public void checkMainMethodWorksProperly() {
        assertTrue(mainRunner());
    }

    @Test
    public void illegalMultiplicationTest() {
        boolean illegal = false;
        try {
            MatrixOperation.basicMultiplicationAlgorithm(nonSquareMtx, nonSquareMtx);
        } catch (InvalidMatrixSizeForMultiplicationException e) {
            illegal = true;
        } finally {
            assertTrue(illegal);
        }
    }

    @Test
    public void benchmarkTest() throws InvalidMatrixSizeForMultiplicationException {
        for (int i = 0;i < 100;i++) {
            MatrixOperation.basicMultiplicationAlgorithm(runTestMtx1, runTestMtx2);
        }
        long timeBasicOp = System.nanoTime();
        for (int i = 0;i < 1000;i++) {
            MatrixOperation.basicMultiplicationAlgorithm(runTestMtx1, runTestMtx2);
        }
        timeBasicOp = (System.nanoTime() - timeBasicOp) / 1000;
        for (int i = 0;i < 100;i++) {
            MatrixOperation.strassenMatrixMultiForNonSquareMatrix(runTestMtx1, runTestMtx2);
        }
        long timeStrassensOp = System.nanoTime();
        for (int i = 0;i < 1000;i++) {
            MatrixOperation.strassenMatrixMultiForNonSquareMatrix(runTestMtx1, runTestMtx2);
        }
        timeStrassensOp = (System.nanoTime() - timeStrassensOp) / 1000;
        System.out.println("Benchmark Report : Basic Operation");
        System.out.println("Warmup Iterations : 100 times");
        System.out.println("Testing iterations : 1000 times");
        System.out.println("Average execution time : " + timeBasicOp + " ns");
        System.out.println();
        System.out.println("Benchmark Report : Strassen Operation");
        System.out.println("Warmup Iterations : 100 times");
        System.out.println("Testing iterations : 1000 times");
        System.out.println("Average execution time : " + timeStrassensOp + " ns");
    }

    private static boolean mainRunner() {
        boolean isOk = true;
        try {
            Main.main(null);
        } catch (Exception e) {
            isOk = false;
        } finally {
            return isOk;
        }
    }

}
