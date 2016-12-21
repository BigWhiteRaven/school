/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Raven1
 */
@Entity
@Table (name="Marks")
public class Marks {
         @Id @GeneratedValue
        private long id;
       @Column (name="Код предмета")
    private String CodeOfTheSubject;
     
    @Column (name="Оценка")
    private String Mark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodeOfTheSubject() {
        return CodeOfTheSubject;
    }

    public void setCodeOfTheSubject(String CodeOfTheSubject) {
        this.CodeOfTheSubject = CodeOfTheSubject;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String Mark) {
        this.Mark = Mark;
    }
                public Marks() {
    }

    public Marks(long id, String CodeOfTheSubject, String Mark) {
        this.id = id;
        this.CodeOfTheSubject = CodeOfTheSubject;
        this.Mark = Mark;
    }
}
