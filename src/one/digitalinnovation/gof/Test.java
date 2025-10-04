package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
// IMPORTANTE: Adiciona a sua nova classe ComportamentoFuga
import one.digitalinnovation.gof.strategy.ComportamentoFuga;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        
        // --- PADRÃO CRIACIONAL: Singleton ---
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        // --- PADRÃO COMPORTAMENTAL: Strategy (Comportamentos do Robô) ---
        
        System.out.println("\n--- TESTE DO PADRÃO STRATEGY (Demonstração Expandida) ---");
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        // NOVO: Instanciação da sua nova estratégia
        Comportamento fuga = new ComportamentoFuga();
        
        Robo robo = new Robo();
        
        // 1. Normal
        robo.setComportamento(normal);
        robo.mover();

        // 2. Agressivo
        robo.setComportamento(agressivo);
        robo.mover();
        
        // 3. NOVO CENÁRIO: Fuga
        robo.setComportamento(fuga);
        robo.mover();
        
        // 4. Defensivo
        robo.setComportamento(defensivo);
        robo.mover();
        
        System.out.println("--- FIM DO STRATEGY ---\n");
        
        // --- PADRÃO ESTRUTURAL: Facade ---
        
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
}