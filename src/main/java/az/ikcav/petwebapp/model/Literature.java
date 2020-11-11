package az.ikcav.petwebapp.model;

import ch.qos.logback.classic.db.names.TableName;

import javax.persistence.*;

@Entity
public class Literature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "littt_id")
    private Long litId;

    //adding column
    @Column(name = "littt_name")
    private String litName;

    @ManyToOne
    @JoinColumn(name = "fk_book_id")
    private Book book;


    public Literature() {
    }
}
