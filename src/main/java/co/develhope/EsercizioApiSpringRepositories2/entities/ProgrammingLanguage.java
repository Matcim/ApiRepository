package co.develhope.EsercizioApiSpringRepositories2.entities;


import javax.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int firstAppearance;
    @Column(nullable = false)
    private String inventor;


    private ProgrammingLanguage(Long id,String name,int firstAppearance,String inventor){
        this.id=id;
        this.name=name;
        this.firstAppearance=firstAppearance;
        this.inventor=inventor;
    }
    private ProgrammingLanguage(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(int firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
