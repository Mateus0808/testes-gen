import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.example.Balanca balanca0 = new com.example.Balanca();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.ProdutoQuilo produtoQuilo1 = com.example.EstoqueDeProdutos.ObtenhaProdutoQuiloTemporario(produto0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map<java.lang.String, java.util.List<com.example.Produto>> strMap0 = com.example.EstoqueDeProdutos.estoque;
        java.lang.Class<?> wildcardClass1 = strMap0.getClass();
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.example.EstoqueDeProdutos.mostrarEstoque(1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        double double2 = com.example.Balanca.calcularValorPorPeso((double) (short) 100, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        double double2 = com.example.Balanca.calcularValorPorPeso(0.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("", (double) (short) 1, (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.example.EstoqueDeProdutos estoqueDeProdutos0 = new com.example.EstoqueDeProdutos();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double1 = com.example.EstoqueDeProdutos.precoPorCodigo("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.example.EstoqueDeProdutos.copiarEstoque();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        double double2 = com.example.Balanca.calcularValorPorPeso((double) 0.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.CarrinhoDeCompras carrinhoDeCompras1 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras2 = cliente0.getCarrinho();
        com.example.Caixa caixa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cliente0.realizarCompra(caixa3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(carrinhoDeCompras1);
        org.junit.Assert.assertNotNull(carrinhoDeCompras2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.example.EstoqueDeProdutos.exibirEstoqueCliente();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.example.Produto produto1 = com.example.EstoqueDeProdutos.seekProduto("");
        org.junit.Assert.assertNull(produto1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        double double2 = com.example.Balanca.calcularValorPorItem((-1.0d), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-32.0d) + "'", double2 == (-32.0d));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.example.EstoqueDeProdutos.Feed();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.example.Produto produto1 = com.example.EstoqueDeProdutos.seekProduto("hi!");
        org.junit.Assert.assertNull(produto1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "hi!", "");
        com.example.Produto produto4 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto4, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map<java.lang.String, java.util.List<com.example.Produto>> strMap0 = com.example.EstoqueDeProdutos.estoque;
        com.example.EstoqueDeProdutos.estoque = strMap0;
        com.example.EstoqueDeProdutos.estoque = strMap0;
        com.example.EstoqueDeProdutos.estoque = strMap0;
        com.example.EstoqueDeProdutos.estoque = strMap0;
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "hi!", "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.example.EstoqueDeProdutos.removerProduto("hi!", (double) (short) -1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        double double2 = com.example.Balanca.calcularValorPorItem((double) 10L, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000.0d + "'", double2 == 1000.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.CarrinhoDeCompras carrinhoDeCompras1 = cliente0.getCarrinho();
        com.example.Caixa caixa2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cliente0.realizarCompra(caixa2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(carrinhoDeCompras1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        double double2 = com.example.Balanca.calcularValorPorItem((-32.0d), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.example.EstoqueDeProdutos.removerProduto("", (double) 100);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.example.EstoqueDeProdutos.removerProduto("", (double) 100L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        double double2 = com.example.Balanca.calcularValorPorItem(0.0d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("", 1.0d, (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.example.EstoqueDeProdutos.removerProduto("", (double) '#');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
        funcionario3.mostrarEstoque();
        com.example.Produto produto13 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto13, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        double double1 = com.example.EstoqueDeProdutos.precoPorCodigo("hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        com.example.Produto produto4 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto4, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.example.EstoqueDeProdutos.removerProduto("", (-32.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "", "hi!");
        com.example.Produto produto4 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto4, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.mostrarEstoque();
        funcionario3.setUserName("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("");
        com.example.Produto produto8 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto8, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("hi!", (double) 100.0f, (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.CarrinhoDeCompras carrinhoDeCompras1 = cliente0.getCarrinho();
        java.lang.Class<?> wildcardClass2 = carrinhoDeCompras1.getClass();
        org.junit.Assert.assertNotNull(carrinhoDeCompras1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "", "hi!");
        funcionario3.removerProduto("hi!", (double) '4');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.example.EstoqueDeProdutos.exibirCopiaInicialDoEstoque();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        double double2 = com.example.Balanca.calcularValorPorPeso((double) 100, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000.0d + "'", double2 == 1000.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        double double2 = com.example.Balanca.calcularValorPorItem((double) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10000.0d + "'", double2 == 10000.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("hi!", (double) 1, (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("");
        java.lang.String str8 = funcionario3.getUserName();
        funcionario3.setUserName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        double double2 = com.example.Balanca.calcularValorPorItem((double) 1.0f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "hi!", "");
        funcionario3.mostrarEstoque();
        funcionario3.setUserName("hi!");
        funcionario3.removerProduto("hi!", (double) (short) 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setUserName("");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
        funcionario3.mostrarEstoque();
        funcionario3.removerProduto("hi!", (-100.0d));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.example.EstoqueDeProdutos.removerProduto("", (double) (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("", 1000.0d, (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setSenha("");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        double double2 = com.example.Balanca.calcularValorPorItem(100.0d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
        funcionario3.mostrarEstoque();
        funcionario3.setNome("");
        com.example.Produto produto15 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto15, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        java.lang.String str7 = funcionario3.getNome();
        funcionario3.mostrarEstoque();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.example.EstoqueDeProdutos.removerProduto("hi!", (double) 1.0f);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("hi!", 10.0d, (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("hi!", (double) (short) 1, (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("");
        java.lang.String str8 = funcionario3.getUserName();
        funcionario3.setSenha("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "hi!", "");
        java.lang.String str4 = funcionario3.getUserName();
        java.lang.String str5 = funcionario3.getUserName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        java.lang.String str7 = funcionario3.getNome();
        com.example.Produto produto8 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto8, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
        funcionario3.mostrarEstoque();
        funcionario3.setNome("");
        java.lang.String str15 = funcionario3.getNome();
        funcionario3.mostrarEstoque();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.example.EstoqueDeProdutos.removerProduto("", (double) 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.example.EstoqueDeProdutos.removerProduto("", 1.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "hi!", "");
        funcionario3.setUserName("hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        double double2 = com.example.Balanca.calcularValorPorItem((double) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.example.EstoqueDeProdutos.removerProduto("", (double) (short) 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
        funcionario3.mostrarEstoque();
        java.lang.String str13 = funcionario3.getNome();
        com.example.Produto produto14 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto14, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.mostrarEstoque();
        funcionario3.removerProduto("", (double) (byte) 10);
        java.lang.String str14 = funcionario3.getNome();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        funcionario3.setSenha("hi!");
        funcionario3.setNome("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.mostrarEstoque();
        funcionario3.setUserName("hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        double double2 = com.example.Balanca.calcularValorPorItem((double) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 520.0d + "'", double2 == 520.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        java.lang.String str4 = funcionario3.getUserName();
        funcionario3.mostrarEstoque();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setNome("hi!");
        java.lang.Class<?> wildcardClass10 = funcionario3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.CarrinhoDeCompras carrinhoDeCompras1 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras2 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras3 = cliente0.getCarrinho();
        cliente0.consultarValor("hi!");
        com.example.CarrinhoDeCompras carrinhoDeCompras6 = cliente0.getCarrinho();
        org.junit.Assert.assertNotNull(carrinhoDeCompras1);
        org.junit.Assert.assertNotNull(carrinhoDeCompras2);
        org.junit.Assert.assertNotNull(carrinhoDeCompras3);
        org.junit.Assert.assertNotNull(carrinhoDeCompras6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "", "");
        funcionario3.setNome("");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setUserName("");
        java.lang.String str8 = funcionario3.getUserName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        double double2 = com.example.Balanca.calcularValorPorPeso((double) (byte) -1, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0d) + "'", double2 == (-10.0d));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        java.lang.String str7 = funcionario3.getNome();
        funcionario3.setSenha("");
        java.lang.Class<?> wildcardClass10 = funcionario3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "hi!", "");
        funcionario3.mostrarEstoque();
        java.lang.String str5 = funcionario3.getSenha();
        funcionario3.mostrarEstoque();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("");
        java.lang.String str8 = funcionario3.getUserName();
        funcionario3.setSenha("");
        funcionario3.setUserName("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.removerProduto("hi!", 1.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.example.EstoqueDeProdutos.removerProduto("hi!", (double) 100.0f);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.CarrinhoDeCompras carrinhoDeCompras1 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras2 = cliente0.getCarrinho();
        cliente0.consultarValor("");
        com.example.Caixa caixa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cliente0.realizarCompra(caixa5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(carrinhoDeCompras1);
        org.junit.Assert.assertNotNull(carrinhoDeCompras2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("", (double) (-1.0f), (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        java.lang.String str7 = funcionario3.getNome();
        funcionario3.setUserName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.Class<?> wildcardClass6 = funcionario3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getNome();
        java.lang.String str7 = funcionario3.getSenha();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "", "hi!");
        funcionario3.removerProduto("hi!", 1.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "hi!", "");
        funcionario3.mostrarEstoque();
        funcionario3.setUserName("hi!");
        java.lang.Class<?> wildcardClass7 = funcionario3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.Caixa caixa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cliente0.realizarCompra(caixa1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.example.EstoqueDeProdutos.removerProduto("hi!", (double) '4');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("");
        funcionario3.removerProduto("", (-1.0d));
        funcionario3.mostrarEstoque();
        java.lang.String str12 = funcionario3.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double double2 = com.example.Balanca.calcularValorPorItem(1000.0d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52000.0d + "'", double2 == 52000.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        double double2 = com.example.Balanca.calcularValorPorPeso((double) (byte) 100, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3200.0d + "'", double2 == 3200.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        double double2 = com.example.Balanca.calcularValorPorPeso((double) 1L, (-10.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0d) + "'", double2 == (-10.0d));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("");
        java.lang.String str8 = funcionario3.getSenha();
        java.lang.String str9 = funcionario3.getSenha();
        com.example.Produto produto10 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto10, 3200.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.CarrinhoDeCompras carrinhoDeCompras1 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras2 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras3 = cliente0.getCarrinho();
        com.example.Caixa caixa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cliente0.realizarCompra(caixa4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(carrinhoDeCompras1);
        org.junit.Assert.assertNotNull(carrinhoDeCompras2);
        org.junit.Assert.assertNotNull(carrinhoDeCompras3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        double double2 = com.example.Balanca.calcularValorPorItem(52000.0d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52000.0d + "'", double2 == 52000.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setNome("");
        java.lang.String str8 = funcionario3.getUserName();
        funcionario3.setSenha("");
        funcionario3.setSenha("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("", (double) 0.0f, (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        double double2 = com.example.Balanca.calcularValorPorItem(1.0d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        funcionario3.setSenha("hi!");
        funcionario3.mostrarEstoque();
        funcionario3.setSenha("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.example.EstoqueDeProdutos.removerProduto("", (double) (byte) 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
        funcionario3.setSenha("");
        funcionario3.setNome("");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.mostrarEstoque();
        java.lang.String str5 = funcionario3.getSenha();
        com.example.Produto produto6 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto6, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.example.EstoqueDeProdutos.removerProduto("hi!", (double) 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        funcionario3.setSenha("");
        com.example.Produto produto8 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionario3.adicionarProduto(produto8, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        boolean boolean3 = com.example.EstoqueDeProdutos.produtoParaCompra("hi!", (double) 0, (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        double double2 = com.example.Balanca.calcularValorPorItem((double) (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-52.0d) + "'", double2 == (-52.0d));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        funcionario3.mostrarEstoque();
        funcionario3.setSenha("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setNome("hi!");
        funcionario3.setSenha("");
        funcionario3.mostrarEstoque();
        funcionario3.setNome("hi!");
        funcionario3.setNome("");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setUserName("hi!");
        java.lang.String str6 = funcionario3.getUserName();
        funcionario3.setSenha("hi!");
        java.lang.String str9 = funcionario3.getSenha();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "hi!", "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setSenha("");
        funcionario3.mostrarEstoque();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.example.Cliente cliente0 = new com.example.Cliente();
        com.example.CarrinhoDeCompras carrinhoDeCompras1 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras2 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras3 = cliente0.getCarrinho();
        com.example.CarrinhoDeCompras carrinhoDeCompras4 = cliente0.getCarrinho();
        com.example.Caixa caixa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cliente0.realizarCompra(caixa5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(carrinhoDeCompras1);
        org.junit.Assert.assertNotNull(carrinhoDeCompras2);
        org.junit.Assert.assertNotNull(carrinhoDeCompras3);
        org.junit.Assert.assertNotNull(carrinhoDeCompras4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        funcionario3.setNome("");
        funcionario3.setSenha("hi!");
        funcionario3.setUserName("");
        funcionario3.setSenha("");
        funcionario3.setUserName("");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.example.Cliente cliente0 = new com.example.Cliente();
        cliente0.consultarValor("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("", "", "");
        java.lang.String str4 = funcionario3.getUserName();
        funcionario3.setNome("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.example.Produto produto0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.EstoqueDeProdutos.adicionarProduto(produto0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.example.Funcionario funcionario3 = new com.example.Funcionario("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = funcionario3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}