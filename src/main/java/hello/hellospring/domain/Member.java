package hello.hellospring.domain;

public class Member {
    public Long id;
    public String name;

    public void setId(long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
