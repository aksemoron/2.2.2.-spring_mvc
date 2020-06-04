package web.service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarService{

    public  List<Car> getCars(){
        List<Car> carList = new ArrayList();
        for (int a=0; a<10; a++){
            carList.add(new Car("model"+a,"brand"+a,5+a*2));
        }
       return carList;
    }
}
