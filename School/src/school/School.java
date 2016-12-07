/*
 * To change this template, choose Tools | Templates
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
 * @author windows
 */
@Entity
@Table (name="students")

public class School implements Serializable{
   String driver = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/sample;user=app;password=app;create=false";
   @Id @GeneratedValue
        private long id;
@Column (name="Имя")
private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public int getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(int dateBirthday) {
        this.dateBirthday = dateBirthday;
    }
@Column (name="Фамилия")
private String lastName;
@Column (name="Отчество")
private String patronymic;
@Column (name="Класс")
private String CLASS;
@Column (name="Дата рождения")
private int dateBirthday;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
