import exception.MyException;
import market.buudaiProducts.Buudai;
import market.etProducts.Et;
import market.product.Product;
import market.service.serviceImpl.Service;
import market.sklad.Sklad;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyException {

        Buudai buudai1 = new Buudai("hleb","Selyanochka","Dobrynin", LocalDate.now(),15);
        Buudai buudai2 = new Buudai("hleb","Selyanochka","Nur", LocalDate.now(),15);
        Product et = new Et("et","kolbasa","toiboss",LocalDate.now(),30);
        System.out.println(buudai1.getLocalDate());

    }
}