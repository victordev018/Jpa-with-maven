package domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity     // indica que deve criar uma tabela no banco de dados com este nome da classe
public class Person implements Serializable {

    private static final long serialVersionUUID = 1L;

    @Id         // indica que este atributo será o Id e chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o id será gerado automaticamente pelo banco de dados
    private Integer id;
    private String name;
    private String email;

    public Person(){
    }

    public Person(Integer id, String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ " + id + ", " + name + ", " + email + "}";
    }
}
