package aula06.exer1;

import aula05.exer1.Date;

public class Aluno extends Pessoa {

	private static int nMecCount = 100;

    private final int nMec;
    private Date dataInsc;

    public Aluno(String name, int cc, Date dataNasc, Date dataInsc) {
        super(name, cc, dataNasc);
        this.nMec = nMecCount++;
        this.dataInsc = dataInsc;
    }

    public Aluno(String name, int cc, Date dataNasc) {
        super(name, cc, dataNasc);
        this.nMec = nMecCount++;
        // TODO: dataNasc should be today's date
        this.dataInsc = new Date(1, 1, 2000);
    }

    public int getNMec() {
        return nMec;
    }

    public Date getDataInsc() {
        return dataInsc;
    }

    public void setDataInsc(Date dataInsc) {
        this.dataInsc = dataInsc;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nMec=" + nMec + ", dataInsc=" + dataInsc + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Aluno other = (Aluno) obj;
        return this.nMec == other.nMec && this.dataInsc.equals(other.dataInsc) && super.equals(obj);
    }
    
}
