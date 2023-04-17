package com.estudos.vendas.confiiguration;

import com.estudos.vendas.ConfiguracaoDesenvolvimento;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import sun.tools.jar.CommandLine;

@ConfiguracaoDesenvolvimento
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIOMENTO");
        };
    }
}
