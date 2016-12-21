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
@Table (name="Objects")
public class Objects {
     @Id @GeneratedValue
        private long id;
       @Column (name="Код предмета")
    private String CodeOfTheSubject;
    
    @Column (name="Название предмета")
    private String NameOfTheSubject;
    
    @Column (name="Код преподавателя")
    private String CodOfTheTeacher;

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

    public String getNameOfTheSubject() {
        return NameOfTheSubject;
    }

    public void setNameOfTheSubject(String NameOfTheSubject) {
        this.NameOfTheSubject = NameOfTheSubject;
    }

    public String getCodOfTheTeacher() {
        return CodOfTheTeacher;
    }

    public void setCodOfTheTeacher(String CodOfTheTeacher) {
        this.CodOfTheTeacher = CodOfTheTeacher;
    }
}
