/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro Medeiros
 */
public class Node {
    String value;
    Node left;
    Node right;
 
    Node(String value) {
        this.value = value;
        right = null;
        left = null;
    }
}
