package set.Pesquisa;

import java.util.Objects;

public class Tarefas {

    private String desc;
    private Boolean concluida;

    public Tarefas(String desc, Boolean concluida) {
        this.desc = desc;
        this.concluida = concluida;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public String getDesc() {
        return desc;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefas)) return false;
        Tarefas tarefas = (Tarefas) o;
        return Objects.equals(getDesc(), tarefas.getDesc()) && Objects.equals(getConcluida(), tarefas.getConcluida());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDesc(), getConcluida());
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "desc='" + desc + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
