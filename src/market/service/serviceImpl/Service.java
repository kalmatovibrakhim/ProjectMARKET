package market.service.serviceImpl;

import exception.MyException;
import market.buudaiProducts.Buudai;
import market.etProducts.Et;
import market.manager.Manager;
import market.milkProducts.Sut;
import market.product.Product;
import market.service.Impl;
import market.sklad.Sklad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service implements Impl {
    Sklad sklad = new Sklad(new ArrayList<>());

    @Override
    public void addProduct(Product p) throws MyException {
        try {
            if (checkCompany(p) > 0 && checkDate10(p) > 0) {
                System.out.println(p);
                sklad.getSklad().add(p);

            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int checkCompany(Product p) throws MyException {
        int x = 0;
        String comp = p.getCompany().toUpperCase();
        if (p instanceof Buudai) {
            if (comp.equals("NUR")) {
                x++;
            } else {
                System.out.println(new MyException(p.getName() + " Bir gana 'NUR' companysy bolot"));
            }
        } else if (p instanceof Sut) {
            if (comp.equals("MILKY")) {
                x++;
            } else {
                System.out.println(new MyException(p.getName() + " Bir gana 'MILKY' companysy bolot"));
            }
        } else if (p instanceof Et) {
            if (comp.equals("MILKY")) {
                x++;
            } else {
                System.out.println(new MyException(p.getName() + " Bir gana 'TOIBOSS' companysy bolot"));
            }
        }
        return x;
    }

    @Override
    public int checkDate10(Product p) throws MyException {
        int x = 0;
        LocalDate date = p.getLocalDate().plusDays(p.getSrokGodnosti());
        if (date.isAfter(LocalDate.now().plusDays(10))) {
            x++;
        } else {
            System.out.println(new MyException("Srogu butoruno 10 kundon az kalyptyr"));
        }
        return x;
    }

    @Override
    public int checkDate7(Product p) {
        int x = 0;
        LocalDate date = p.getLocalDate().plusDays(p.getSrokGodnosti());
        if (date.isBefore(LocalDate.now().plusDays(7)) && date.isAfter(LocalDate.now())) {
            x++;
        }
        return x;
    }

    public ArrayList<Product> vitrina7Kun() {
        for (Product p : sklad.getSklad()) {
            if (checkDate7(p) > 0) {
                sklad.getKunVitrina().add(p);
            }
        }
        return sklad.getKunVitrina();
    }

    public ArrayList<Product> prosrochkalar() {
        ArrayList<Product> prosrochka = new ArrayList<>();
        for (Product p : sklad.getSklad()) {
            LocalDate date = p.getLocalDate().plusDays(p.getSrokGodnosti());
            if (date.isBefore(LocalDate.now())) {
                prosrochka.add(p);
                if (sklad.getKunVitrina().contains(p)) {
                    sklad.getKunVitrina().remove(p);
                } else if (sklad.getSklad().contains(p)) {
                    sklad.getSklad().remove(p);
                }
            }
        }
        return prosrochka;
    }

    Manager manager = new Manager();
    public void setManager(String name,String password){
        manager.setName(name) ;
        manager.setCode(password);
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void skladBaary() {
        System.out.println("enter the login");
        String login = scanner.nextLine();
        System.out.println("enter the password");
        String code = scanner.nextLine();
        if(!manager.getCode().equals(code) && !manager.getName().equals(login)){
            System.out.println("wrong password or login");
        }else {
            System.out.println(sklad);
        }

    }

}
