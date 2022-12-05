package market.service;

import exception.MyException;
import market.buudaiProducts.Buudai;
import market.etProducts.Et;
import market.milkProducts.Sut;
import market.product.Product;
import market.sklad.Sklad;

import java.time.LocalDate;
import java.util.ArrayList;

public interface Impl {
    void addProduct(Product p) throws MyException;


     int checkCompany(Product p) throws MyException;

    int checkDate10(Product p) throws MyException;
    int checkDate7(Product p);
    void skladBaary()    ;


}
