/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author AUGUST
 */
    public class XuLyTen {

    public String chuanHoa(String name) {
        name = name.trim();
        while (-1 != name.indexOf("  ")) {
            name = name.replaceAll("  ", " ");
        }
        return name;
    }
 
    private String tachHoTen(String name) {
        if(!name.contains(" ")) {
            return name;
        }
        int pos = name.lastIndexOf(" ");
        String firstName = name.substring(pos + 1);
        String familyName = name.substring(0, pos);
        name = firstName.concat(" ").concat(familyName);
        return name;
    }
 
    public int sapXep(String name1, String name2) {
        String n1 = tachHoTen(name1);
        String n2 = tachHoTen(name2);
        return n1.compareTo(n2);
    }
}
