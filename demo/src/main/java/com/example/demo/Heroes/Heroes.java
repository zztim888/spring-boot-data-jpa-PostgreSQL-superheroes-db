package com.example.demo.Heroes;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name ="Superheroes")
@Table(
        name = "heroes"
)
public class Heroes {
    @Id
    @SequenceGenerator(
            name = "heroes_sequence",
            sequenceName = "heroes_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "heroes_sequence"
    )
    @Column(
            name = "Id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "Alter Ego",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String alterEgo;
    @Column(
            name = "ability1",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String ability1;
    @Column(
            name = "ability2",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String ability2;
    @Column(
            name = "ability3",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String ability3;
    @Column(
            name = "level",
            nullable = false
    )
    private Integer level;

    public Heroes ( String alterEgo,
                    String ability1,
                    String ability2,
                    String ability3,
                    Integer level ) {
        this.alterEgo = alterEgo;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.ability3 = ability3;
        this.level = level;
    }

    //getters and setters

    public Long getId ( ) {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }

    public String getAlterEgo ( ) {
        return alterEgo;
    }

    public void setAlterEgo ( String alterEgo ) {
        this.alterEgo = alterEgo;
    }

    public String getAbility1 ( ) {
        return ability1;
    }

    public void setAbility1 ( String ability1 ) {
        this.ability1 = ability1;
    }

    public String getAbility2 ( ) {
        return ability2;
    }

    public void setAbility2 ( String ability2 ) {
        this.ability2 = ability2;
    }

    public String getAbility3 ( ) {
        return ability3;
    }

    public void setAbility3 ( String ability3 ) {
        this.ability3 = ability3;
    }

    public Integer getLevel ( ) {
        return level;
    }

    public void setLevel ( Integer level ) {
        this.level = level;
    }

    // toString

    @Override
    public String toString ( ) {
        return "Heroes{" +
                "id=" + id +
                ", alterEgo='" + alterEgo + '\'' +
                ", ability1='" + ability1 + '\'' +
                ", ability2='" + ability2 + '\'' +
                ", ability3='" + ability3 + '\'' +
                ", level=" + level +
                '}';
    }
}
