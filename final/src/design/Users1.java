/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.io.Serializable;

/**
 *
 * @author Asir
 */
public class Users1 implements Serializable {
    String name, phone, email,birthday_month,birthday_day,group,adress,note;

    public Users1() {
    }

    public Users1(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birthday_month=birthday_month;
        this.birthday_day=birthday_day;
        this.group=group;
        this.note=note;
        this.adress=adress;
        
    }
}
