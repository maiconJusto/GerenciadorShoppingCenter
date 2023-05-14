public class Data {
    private int dia;
    private int mes;
    private int ano;

    //construtor com método de decisão 
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Alterando para data padrão 01/01/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    
    //métodos de acesso (get e set)
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if (validaData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido! Alterando para data padrão 01");
            this.dia = 1;
        }
    }   

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (validaData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido! Alterando para data padrão 01");
            this.mes = 1;
        }
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (validaData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! Alterando para data padrão 2000");
            this.ano = 2000;
        }
    }

    //método toString
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    //método verificação ano bissexto
    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0))
            return true;
        return false;
    }

    //validando data
    private boolean validaData(int dia, int mes, int ano) {
        if (ano < 1) {
            return false;
        }

        //validando mês
        if (mes < 1 || mes > 12) {
            return false;
        }

        //validando dias de cada mês
        int ultimoDiaDoMes = 31;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (verificaAnoBissexto()) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }

        if (dia < 1 || dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }


    public int compareTo(Data dataValidade) {
        return 0;
    }
}