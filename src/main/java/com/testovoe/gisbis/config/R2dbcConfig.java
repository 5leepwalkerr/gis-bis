package com.testovoe.gisbis.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.r2dbc.core.DatabaseClient;

import javax.xml.crypto.Data;

public class R2dbcConfig extends AbstractR2dbcConfiguration {
    @Override
    public ConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(PostgresqlConnectionConfiguration
                .builder()
                .host("localhost")
                .port(5432)
                .username("gis_bis_test")
                .password("maxim277")
                .database("gis_bis_test")
                .build());
    }
    @Bean
    public DatabaseClient databaseClient(){
        return DatabaseClient.create(connectionFactory());
    }
}
