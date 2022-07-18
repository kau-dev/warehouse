package ua.kaudeveloper.warehouse.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("ua.kaudeveloper.warehouse")
public class SpringJdbcConfig {
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/warehouse?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }
}

//        spring.datasource.url=jdbc:mysql://localhost:3306/warehouse?createDatabaseIfNotExist=true
//        spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
//        spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
//        spring.datasource.username=root
//        spring.datasource.password=
//        spring.jpa.hibernate.ddl-auto=update