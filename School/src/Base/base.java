/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import school.Teachers;
import db.DBDerby;

/**
 *
 * @author windows
 */


public class base {

    public static void main(String[] args) {
        // TODO code application logic here
        DBDerby dbclient = new DBDerby();
        Teachers newteacher=new Teachers(1,"Alex","Work","Math");
        dbclient.addNameWork(newteacher);
        Teachers clientqwerty=dbclient.find(1L);
        
    }
}
