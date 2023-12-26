package com.microserviceproduit.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservice-produit")
@RefreshScope
public class ApplicationPropertiesConfigurations {
    private int limitDeProduits;
    public int getLimitDeProduits() {
        return limitDeProduits;
    }
    public void setLimitDeProduits(int limitDeProduits) {
        this.limitDeProduits = limitDeProduits;
    }
}
