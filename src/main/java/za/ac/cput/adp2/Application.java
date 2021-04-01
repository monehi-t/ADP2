/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2;

/**
 *
 * @author Cameron Van Wyk 219076936
 */
public class Application {
    
    public static void main(String[] args) {
        
    }
    private String id, name, appType;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAppType() {
        return appType;
    }
     @Override
    public String toString() {
        return "Application{" + "id=" + id + ", name=" + name + ", appType=" + appType + '}';
    }
}
