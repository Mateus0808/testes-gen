import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.example.EstoqueDeProdutos.mostrarEstoque((int) '4');
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.example.EstoqueDeProdutos.mostrarEstoque((int) (byte) 100);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.example.EstoqueDeProdutos.mostrarEstoque(0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.example.EstoqueDeProdutos.mostrarEstoque((int) (short) 100);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.example.EstoqueDeProdutos.mostrarEstoque((int) (short) 10);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.example.EstoqueDeProdutos.mostrarEstoque((int) (short) 0);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.example.EstoqueDeProdutos.mostrarEstoque((int) (short) -1);
    }
}

