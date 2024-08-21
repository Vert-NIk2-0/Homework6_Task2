import com.company.professions.*;
import com.company.vehicles.*;
import com.company.details.*;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Вертинский Н.А.", 20, 1);
        Engine engine1 = new Engine(800, "Volkswagen");
        System.out.println(driver1);

        Car sportCar1 = new SportCar("Audi", "S", 2000, engine1, driver1, 280);
        System.out.println(sportCar1);
    }
}