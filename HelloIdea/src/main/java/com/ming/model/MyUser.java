package com.ming.model;

/*import javax.persistence.Column;
import javax.persistence.Table;*/
import java.io.Serializable;

/*@Table(name = "myuser")*/
public class MyUser implements Serializable {
    /*@Column(name = "id")*/
    private String id;

    /*@Column(name = "name")*/
    private String name;

    /*@Column(name = "password")*/
    private String password;

    /*@Column(name = "upda_date")*/
    private String updaDate;

   /* @Column(name = "insert_date")*/
    private String insertDate;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return upda_date
     */
    public String getUpdaDate() {
        return updaDate;
    }

    /**
     * @param updaDate
     */
    public void setUpdaDate(String updaDate) {
        this.updaDate = updaDate == null ? null : updaDate.trim();
    }

    /**
     * @return insert_date
     */
    public String getInsertDate() {
        return insertDate;
    }

    /**
     * @param insertDate
     */
    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate == null ? null : insertDate.trim();
    }
}