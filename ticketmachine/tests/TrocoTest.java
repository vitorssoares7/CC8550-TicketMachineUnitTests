// Adicionado timeout ao teste para que ele não fique preso em um loop infinito uma vez que 
// o construtor da classe troco não está funcionando corretamente

package ticketmachine.tests;

import org.junit.Assert;
import org.junit.Test;


import ticketmachine.core.Troco;
public class TrocoTest {
    
    @Test(timeout = 1000)
    public void TrocoContructor() {
        int valor = 30;
        Troco troco = new Troco(valor);
        Assert.assertNotNull(troco);
    }

    @Test(timeout = 1000)
    public void TrocoIteratorConstructor() {
        int valor = 20;
        Troco troco = new Troco(valor);
        var trocoIterator = troco.getIterator();
        Assert.assertNotNull(trocoIterator);
    }
}
