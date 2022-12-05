package market.buudaiProducts;

import market.product.Product;

import java.time.LocalDate;

public class Buudai extends Product {
    private String type;

    public Buudai(String type) {
        this.type = type;
    }

    public Buudai(String type , String name, String company, LocalDate localDate, int srokGodnosti) {
        super(name, company, localDate, srokGodnosti);
        this.type = type;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCompany() {
        return super.getCompany();
    }

    @Override
    public void setCompany(String company) {
        super.setCompany(company);
    }

    @Override
    public LocalDate getLocalDate() {
        return super.getLocalDate();
    }

    @Override
    public void setLocalDate(LocalDate localDate) {
        super.setLocalDate(localDate);
    }

    @Override
    public int getSrokGodnosti() {
        return super.getSrokGodnosti();
    }

    @Override
    public void setSrokGodnosti(int srokGodnosti) {
        super.setSrokGodnosti(srokGodnosti);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BuudaiProduct{" +
                "id=" + getId() +'\'' +
                ", Type=" + getType() +'\'' +
                ", name='" + getName() + '\'' +
                ", company='" + getCompany() +
//                ", localDate=" + getLocalDate() +
                '}';
    }
}
