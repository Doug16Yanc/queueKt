package domain

class NoFila {
    private var valor: Double? = null
    private var proximo: NoFila? = null

    fun getValor(): Double? {
        return valor
    }

    fun setValor(valor: Double) {
        this.valor = valor
    }

    fun getProximo(): NoFila? {
        return proximo
    }

    fun setProximo(proximo: NoFila) {
        this.proximo = proximo
    }
}
