package Tarefa;

public class Wrappers {

    // Variável primitiva do tipo int
	
    private int numeroPrimitivo;

    // Construtor para inicializar a variável primitiva
    
    public Wrappers(int numeroPrimitivo) {
        this.numeroPrimitivo = numeroPrimitivo;
    }

    // Método para converter o tipo primitivo para o tipo wrapper
    
    public Integer converterParaWrapper() {
        return Integer.valueOf(numeroPrimitivo);
    }

    public static void main(String[] args) {
    	
        // Criando uma instância da classe
    	
    	Wrappers exemplo = new Wrappers(42);
        
        // Convertendo para o tipo wrapper
    	
        Integer numeroWrapper = exemplo.converterParaWrapper();
        
        // Exibindo o resultado
        
        System.out.println("Número primitivo: " + exemplo.numeroPrimitivo);
        System.out.println("Número wrapper: " + numeroWrapper);
    }
}
