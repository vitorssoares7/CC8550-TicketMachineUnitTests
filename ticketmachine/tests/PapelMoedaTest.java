package ticketmachine.tests;

import org.junit.Assert;
import org.junit.Test;

import ticketmachine.core.PapelMoeda;


public class PapelMoedaTest {

    @Test
    public void papelMoedaConstructorTest() {
        int valor = 50;
        int quantidade = 10;
        PapelMoeda papelMoeda = new PapelMoeda(valor, quantidade);
        Assert.assertEquals(papelMoeda.getValor(), valor);
        Assert.assertEquals(papelMoeda.getQuantidade(), quantidade);
    }


    @Test
    public void getQuantidadeTest() {
        int quantidade = 6;
        PapelMoeda papelMoeda = new PapelMoeda(10, quantidade);
        Assert.assertEquals(papelMoeda.getQuantidade(), quantidade);
    }

    @Test
    public void getValorTest() {
        int valor = 10;
        PapelMoeda papelMoeda = new PapelMoeda(valor, 6);
        Assert.assertEquals(papelMoeda.getValor(), valor);
    }

}