/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 15 17:41:25 GMT 2024
 */

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.EstoqueDeProdutos;
import com.example.Funcionario;
import com.example.Produto;
import com.example.ProdutoUnitario;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Funcionario_ESTest extends Funcionario_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario((String) null, (String) null, (String) null);
      String string0 = funcionario0.getUserName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("40", "rZxUxa#oL]e{ ", "");
      funcionario0.setUserName("");
      String string0 = funcionario0.getUserName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("(e-N|SX@A}p=%Tv[-", "(e-N|SX@A}p=%Tv[-", "(e-N|SX@A}p=%Tv[-");
      funcionario0.setSenha((String) null);
      String string0 = funcionario0.getSenha();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", (String) null, (String) null);
      funcionario0.setNome((String) null);
      String string0 = funcionario0.getNome();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("gtZ]xX:;", "gtZ]xX:;", "gtZ]xX:;");
      EstoqueDeProdutos.estoque = null;
      // Undeclared exception!
      try { 
        funcionario0.removerProduto("com.example.Funcionario", 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.EstoqueDeProdutos", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("[=Trf\f(=[8fV", "[=Trf\f(=[8fV", "[=Trf\f(=[8fV");
      EstoqueDeProdutos.estoque = null;
      // Undeclared exception!
      try { 
        funcionario0.mostrarEstoque();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.EstoqueDeProdutos", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("523#Z$y=", "523#Z$y=", "F9cw!!2EW`<TPl");
      // Undeclared exception!
      try { 
        funcionario0.adicionarProduto((Produto) null, 86.3319121401);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.EstoqueDeProdutos", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("z7+%r<r)^qm}", "z7+%r<r)^qm}", "[WIh&hc[,");
      ProdutoUnitario produtoUnitario0 = new ProdutoUnitario("z7+%r<r)^qm}", "Quilos: ", (-1.0));
      funcionario0.adicionarProduto(produtoUnitario0, (-1.0));
      assertEquals((-1.0), produtoUnitario0.getValor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", "ToZA~5klkb", "ToZA~5klkb");
      assertEquals("", funcionario0.getNome());
      
      funcionario0.setNome("EE\"bIk]M~wv");
      funcionario0.getNome();
      assertEquals("ToZA~5klkb", funcionario0.getUserName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", "ToZA~5klkb", "ToZA~5klkb");
      String string0 = funcionario0.getNome();
      assertEquals("ToZA~5klkb", funcionario0.getSenha());
      assertEquals("ToZA~5klkb", funcionario0.getUserName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", "ToZA~5klkb", "ToZA~5klkb");
      String string0 = funcionario0.getUserName();
      assertEquals("ToZA~5klkb", funcionario0.getSenha());
      assertEquals("ToZA~5klkb", string0);
      assertEquals("", funcionario0.getNome());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", "ToZA~5klkb", "ToZA~5klkb");
      funcionario0.mostrarEstoque();
      assertEquals("ToZA~5klkb", funcionario0.getUserName());
      assertEquals("ToZA~5klkb", funcionario0.getSenha());
      assertEquals("", funcionario0.getNome());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", "ToZA~5klkb", "ToZA~5klkb");
      funcionario0.removerProduto("com.example.Funcionario", 592.9162062684);
      assertEquals("ToZA~5klkb", funcionario0.getUserName());
      assertEquals("ToZA~5klkb", funcionario0.getSenha());
      assertEquals("", funcionario0.getNome());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", "ToZA~5klkb", "ToZA~5klkb");
      assertEquals("ToZA~5klkb", funcionario0.getSenha());
      
      funcionario0.setSenha("");
      funcionario0.getSenha();
      assertEquals("", funcionario0.getNome());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Funcionario funcionario0 = new Funcionario("", "ToZA~5klkb", "ToZA~5klkb");
      String string0 = funcionario0.getSenha();
      assertEquals("ToZA~5klkb", string0);
      assertEquals("", funcionario0.getNome());
      assertEquals("ToZA~5klkb", funcionario0.getUserName());
  }
}
