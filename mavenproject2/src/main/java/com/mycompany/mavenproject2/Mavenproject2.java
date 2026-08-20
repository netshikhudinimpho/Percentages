/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author mphon
 */
public class Mavenproject2 {
    

    public static void main(String[] args) {
        
        
        Scanner mpho = new Scanner(System.in);
        
        String firstname;
        System.out.println("enter your firstname");
        firstname = mpho.next();
        
        String surname;
        System.out.println("enter your surname");
        surname = mpho.next();
        
        String fullname;
        fullname = firstname +""+ surname;
        System.out.println("you are"+fullname);
    }
}
