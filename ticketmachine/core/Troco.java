package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {

        public boolean CountPapelMoeda(int nota, int valor) {
            int count = 0;

            while (valor % nota != 0) {
                count++;
            }

            return count;
        }

        protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};
        papeisMoeda = new PapelMoeda[6];

        for(int i=5, i>=0, i--){
            int count = CountPapelMoeda(papelMoeda[i], valor)
            papeisMoeda[i] = new PapelMoeda(papelMoeda[i], count);
        }
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = troco.papeisMoeda[5];
            for (int i = 5; i >= 0 && ret != null; i--) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
