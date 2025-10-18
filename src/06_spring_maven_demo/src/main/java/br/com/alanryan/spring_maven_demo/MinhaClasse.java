package br.com.alanryan.spring_maven_demo;

public class MinhaClasse {
    private String atributo;

    public MinhaClasse(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((atributo == null) ? 0 : atributo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MinhaClasse other = (MinhaClasse) obj;
        if (atributo == null) {
            if (other.atributo != null)
                return false;
        } else if (!atributo.equals(other.atributo))
            return false;
        return true;
    }
    
}
