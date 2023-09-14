package cs544;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cs544")
public class Config {
    @Bean
    public InventoryService inventoryService() {
        return new InventoryService();
    }
}