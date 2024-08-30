// Classe base Animal
open class Animal(val nome: String, val idade: Int) {

    // Atributos
    var peso: Double = 0.0

    // Construtor secundário
    constructor(nome: String, idade: Int, peso: Double) : this(nome, idade) {
        this.peso = peso
    }

    // Método para emitir som
    open fun emitirSom() {
        println("$nome está emitindo um som.")
    }

    // Método para exibir informações do animal
    open fun exibirInfo() {
        println("Animal: $nome, Idade: $idade anos, Peso: $peso kg")
    }
}

// Classe derivada Cachorro
class Cachorro(nome: String, idade: Int, val raca: String) : Animal(nome, idade) {

    // Override do método emitirSom
    override fun emitirSom() {
        println("$nome está latindo.")
    }

    // Override do método exibirInfo
    override fun exibirInfo() {
        println("Cachorro: $nome, Raça: $raca, Idade: $idade anos, Peso: $peso kg")
    }
}

// Classe derivada Gato
class Gato(nome: String, idade: Int) : Animal(nome, idade) {

    // Override do método emitirSom com polimorfismo
    override fun emitirSom() {
        println("$nome está miando.")
    }

    // Override do método exibirInfo
    override fun exibirInfo() {
        println("Gato: $nome, Idade: $idade anos, Peso: $peso kg")
    }
}

// Função principal para testar as classes
fun main() {
    try {
        // Instância de Animal
        val animal1 = Animal("Jaguatirica", 10, 5000.0)
        animal1.emitirSom()
        animal1.exibirInfo()

        // Instância de Cachorro
        val cachorro1 = Cachorro("Totó", 5, "Vira Lata")
        cachorro1.peso = 30.0
        cachorro1.emitirSom()
        cachorro1.exibirInfo()

        // Instância de Gato
        val gato1 = Gato("Pudim", 3)
        gato1.peso = 4.5
        gato1.emitirSom()
        gato1.exibirInfo()

        // Exemplo de tratamento de exceções
        val idadeInvalida = -1
        if (idadeInvalida < 0) {
            throw IllegalArgumentException("A idade não pode ser negativa.")
        }

    } catch (e: IllegalArgumentException) {
        println("Erro: ${e.message}")
    } catch (e: Exception) {
        println("Erro inesperado: ${e.message}")
    } finally {
        println("Execução finalizada.")
    }
}