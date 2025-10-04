package one.digitalinnovation.gof.strategy;


public class ComportamentoFuga implements Comportamento {

   
    @Override
    public void mover() {
        System.out.println("O robô está se movendo rapidamente para se afastar do perigo! (Modo Fuga)");
    }
}
