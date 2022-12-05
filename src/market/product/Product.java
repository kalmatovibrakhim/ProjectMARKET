package market.product;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private static int next_id =0;
    private int id ;
    private String name;
    private String company;
    private LocalDate localDate;
    private int srokGodnosti;

    public Product() {
    }

    public Product(String name, String company, LocalDate localDate, int srokGodnosti) {
        this.id = ++Product.next_id;
        this.name = name;
        this.company = company;
        this.localDate = localDate;
        this.srokGodnosti = srokGodnosti;
    }

    public static int getNext_id() {
        return next_id;
    }

    public static void setNext_id(int next_id) {
        Product.next_id = next_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getSrokGodnosti() {
        return srokGodnosti;
    }

    public void setSrokGodnosti(int srokGodnosti) {
        this.srokGodnosti = srokGodnosti;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", localDate=" + localDate +
                ", srokGodnosti=" + srokGodnosti +
                '}';
    }
}
