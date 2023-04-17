package com.estudos.vendas.confiiguration;

import com.estudos.vendas.model.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

    @Bean(name = "cachorro")
    public Animal cachorro(){
        return new Animal() {
            @Override
            public void fazerBerulho() {
                System.out.println("Au Au");
            }
        };
    }

    @Bean(name = "gato")
    public Animal gato(){
        return new Animal() {
            @Override
            public void fazerBerulho() {
                System.out.println("Minhau Minhau");
            }
        };
    }
}
