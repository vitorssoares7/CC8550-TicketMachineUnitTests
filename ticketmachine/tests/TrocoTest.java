package ticketmachine.tests;

import org.junit.Assert;
import org.junit.Test;


import ticketmachine.core.Troco;
public class TrocoTest {
    
    public void TrocoContructor() {
        int valor = 30;
        Troco troco = new Troco(valor);
        Assert.assertNotNull(troco);
    }

    
    public void TrocoIteratorConstructor() {
        int valor = 20;
        Troco troco = new Troco(valor);
        var trocoIterator = troco.getIterator();
        Assert.assertNotNull(trocoIterator);
    }
}
