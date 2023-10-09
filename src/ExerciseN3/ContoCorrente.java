package ExerciseN3;

import ExerciseN3.Exceptions.BancaException;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti)
            saldo = saldo - x;
        else
            saldo = saldo - x - 0.50;
        nMovimenti++;
        if (saldo < 0) {
            throw new BancaException("Il conto è in rosso.");
        }
    }

    double restituisciSaldo() {
        return saldo;
    }
    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public void setnMovimenti(int nMovimenti) {
        this.nMovimenti = nMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
