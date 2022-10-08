package ticketmachine.tests;

import org.junit.Assert;
import org.junit.Test;

import ticketmachine.core.TicketMachine;
import ticketmachine.exception.PapelMoedaInvalidaException;


public class TicketMachineTest {

    @Test
    public void ConstructorTest() {
        int price = 10;
        TicketMachine ticketMachine = new TicketMachine(price);
        Assert.assertEquals(ticketMachine.getSaldo(), 0);
    }

    @Test
    public void InserirNotas2Test() throws PapelMoedaInvalidaException {
        int valor = 5;
        int saldo = 2;
        TicketMachine ticketMachine = new TicketMachine(valor);
        ticketMachine.inserir(saldo);
        Assert.assertEquals(ticketMachine.getSaldo(), saldo);
    }

    @Test
    public void InserirNotas5Test() throws PapelMoedaInvalidaException {
        int valor = 5;
        int saldo = 5;
        TicketMachine ticketMachine = new TicketMachine(valor);
        ticketMachine.inserir(saldo);
        Assert.assertEquals(ticketMachine.getSaldo(), saldo);
    }

    @Test
    public void InserirNotas10Test() throws PapelMoedaInvalidaException {
        int valor = 5;
        int saldo = 10;
        TicketMachine ticketMachine = new TicketMachine(valor);
        ticketMachine.inserir(saldo);
        Assert.assertEquals(ticketMachine.getSaldo(), saldo);
    }

    @Test
    public void InserirNotas20Test() throws PapelMoedaInvalidaException {
        int valor = 5;
        int saldo = 20;
        TicketMachine ticketMachine = new TicketMachine(valor);
        ticketMachine.inserir(saldo);
        Assert.assertEquals(ticketMachine.getSaldo(), saldo);
    }

    @Test
    public void InserirNotas50Test() throws PapelMoedaInvalidaException {
        int valor = 5;
        int saldo = 50;
        TicketMachine ticketMachine = new TicketMachine(valor);
        ticketMachine.inserir(saldo);
        Assert.assertEquals(ticketMachine.getSaldo(), saldo);
    }

    @Test
    public void InserirNotas100Test() throws PapelMoedaInvalidaException {
        int valor = 5;
        int saldo = 100;
        TicketMachine ticketMachine = new TicketMachine(valor);
        ticketMachine.inserir(saldo);
        Assert.assertEquals(ticketMachine.getSaldo(), saldo);
    }
}
