package domain

class Fila {
    private var inicio: NoFila? = null
    private var final: NoFila? = null
    private var valorRemovido : Double? = null

    fun add(valor : Double){
        var noFila = NoFila()
        noFila.setValor(valor)

        if (inicio == null){
            inicio = noFila
            final = noFila
        }
        else{
            final?.setProximo(noFila)
            final = noFila
        }
    }
    fun remove() : Double? {
        if(inicio == null){
            return null
        }
        valorRemovido = inicio!!.getValor()
        inicio = inicio!!.getProximo()

        if (final == null){
            return null
        }

        return valorRemovido
    }

    override fun toString(): String {
        var sb = StringBuffer()
        sb.append("[")
        var p : NoFila?
        p = inicio

        while (p != null){
            sb.append("${p.getValor()} ,")
            p = p.getProximo()
        }
        sb.append("]")
        return sb.toString()
    }


}