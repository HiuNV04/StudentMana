/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package constant;

/**
 *
 * @author ADMIN
 */
public interface IConstant {
    String REGEX_NAME = "^[A-Za-z ]+$";
    String REGEX_ID = "^[a-zA-Z]{2}[0-9]{6}$";
    String REGEX_COURSE = "^(?i)java|c/c\\+\\+|\\.net$";
    String REGEX_SEMESTER = "^(?i)(Spring|Fall|Summer)[1-9][0-9]$";
    String REGEX_YES_NO = "^[yYnN]$";
    String REGEX_UPDATE_DELETE = "^[uUdD]$";
    String YES ="y";
    String NO="n";
    String UPDATE = "update";
    String DELETE ="delete";
}
