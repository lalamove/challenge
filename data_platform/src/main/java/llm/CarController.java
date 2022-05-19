package llm;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class CarController {
    @GetMapping(value="/cars")
    public Car[] getCars() {
        /* this is an example */
        return Database.cars;
    }

    @GetMapping(value="/car/{id}")
    public Car getCar(@PathVariable String id) {
        /* you code */
        return null;
    }

    @PostMapping(value="/car")
    public Car createCar(@RequestBody Car Car) {
        /* you code */
        return Car;
    }

    @PutMapping(value="/car")
    public Car updateCar(@RequestBody Car Car) {
        /* you code */
        return Car;
    }

    @DeleteMapping(value="/car/{id}")
    public String deleteCar(@PathVariable String id) {
        /* you code */
        return id;
    }

    @PostMapping(value="/findShortestPath")
    public String findShortestPath() {
        /* you code */
        return "";
    }
}
