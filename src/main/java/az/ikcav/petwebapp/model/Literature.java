package az.ikcav.petwebapp.model;

import ch.qos.logback.classic.db.names.TableName;

import javax.persistence.*;

@Entity
public class Literature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "littt_id")
    private Long litId;

    //adding column
    @Column(name = "littt_name")
    private String litName;

    @ManyToOne
    @JoinColumn(name = "fk_book_id")
    public Book book;


    public Literature() {
    }
}
