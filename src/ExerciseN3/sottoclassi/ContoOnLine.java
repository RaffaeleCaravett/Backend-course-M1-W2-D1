package ExerciseN3.sottoclassi;

import ExerciseN3.ContoCorrente;
import ExerciseN3.Exceptions.BancaException;

public class ContoOnLine extends ContoCorrente {
    double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {

        System.out.println("Titolare: " + getTitolare() + " - Saldo: " + getSaldo() + " - Num movimenti: " + getnMovimenti()
            + " - Massimo movimenti: " + getMaxMovimenti() + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }else if(x > maxPrelievo){
            throw new BancaException("il prelievo non è disponibile.");
        }
    }
}
