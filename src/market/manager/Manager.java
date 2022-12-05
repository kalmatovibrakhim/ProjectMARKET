package market.manager;

public class Manager {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Manager() {
    }

    public Manager(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "manager{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
