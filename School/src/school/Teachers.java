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
@Table (name="Teacher")
public class Teachers implements Serializable {
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

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
    
    @Column (name="Фамилия")
    private String lastName;
    
    @Column (name="Предмет")
    private String object;
}
