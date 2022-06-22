package de.buw.se4de;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.*;


public class AppTest {
	
	login login;
	home home;
	NewBook nb;
	NewStudent ns;
	ActionEvent evt;
		

	
	  @BeforeEach
	  void setup() { 
		  login = new login();
		  nb = new NewBook(); 
		  ns = new NewStudent();
		  home = new home();
	  }
	  
	  @Test
	  void checkLogin() {
		  try {
			login.main(null);
			login.initComponents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  login.userNameTextField.setText("admin");
		  login.passwordTextField.setText("admin");
		  login.loginBtnActionPerformed(evt);
		  assertEquals(login.getLoginCheck(),true,"Login works if the credentials are same, login working as expected !");
	  }
	  
	  @Test
	  void checkClickFunctionalityWithStudent() {
		  try {
			ns.main(null);
			ns.initComponents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  ns.studentIDTextBox.setText("87");
	      ns.nameTextBox.setText("Anusha");
	      ns.familynameTextBox.setText("oorugunda");
		  ns.saveBtnActionPerformed(evt);
		  assertEquals(ns.studentIDTextBox.getText(),!ns.studentIDTextBox.getText().isEmpty(),"The value should not be empty, as the form should be submitted !");
	  }
	  
	  @Test
	  void checkClickFunctionalityWithBook() {
		  try {
			nb.main(null);
			nb.initComponents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  nb.bookIDTextField.setText("");
	      nb.bookTitleTextField.setText("");
	      nb.authorTextField.setText("");
	      nb.priceTextField.setText("");
	      nb.publishingYearTextField.setText("");
	      DBConnection.setBook(nb.bookIDTextField.getText(), nb.bookTitleTextField.getText(), nb.authorTextField.getText(), nb.priceTextField.getText(), nb.publishingYearTextField.getText()); 
	      
	      Assertions.assertThrows(IOException.class, () ->  DBConnection.writeBookInDB(), "Expecting no exception from the outcome, if empty, the functionalty works !");
      }
	  
	  @Test
	  void checkDataRetrieval() {
		  String[] columNames = {"Book ID", "Book Title", "Author Name", "Price", "Publishing Year"};
		  Object[][] dataBase = DBConnection.booksDB;
		  DefaultTableModel defTableModel = new DefaultTableModel(dataBase, columNames);
		  int rowCount = defTableModel.getRowCount();
		  boolean isGreater = rowCount > 0;
		  assertEquals(isGreater,true ,"The value should be greater than zero, expecting retrieval properly !");
	  }
	  
	  @Test
	  void checkLogoutFunctionality() {
		  try {
			login.main(null);
			login.initComponents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  login.userNameTextField.setText("admin");
		  login.passwordTextField.setText("admin");
		  login.loginBtnActionPerformed(evt);
		  home.main(null);
		  home.initComponents();
		  home.logoutBtnActionPerformed(evt);
		  boolean isUserActive = home.isActiveSession;
		  assertEquals(isUserActive,false ,"The user should be able to logout properly !");
	  }
	  
	 
}
