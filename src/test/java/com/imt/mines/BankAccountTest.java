package com.imt.mines;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        // Initialisation d'un nouveau compte avant chaque test
        account = new BankAccount();
    }

    @Test
    public void testDepositMoney_PositiveAmount() {
        account.depositMoney(100.0);
        assertEquals("Le solde devrait être de 100 après le dépôt", 100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDepositMoney_NegativeAmount() {
        account.depositMoney(-100.0);
        assertEquals("Un dépôt négatif ne devrait pas modifier le solde", 0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawMoney_InsufficientFunds() {
        account.depositMoney(100.0);
        account.withdrawMoney(200.0);
        assertEquals("Le retrait devrait être refusé si le solde est insuffisant", 100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testGetBalance_CheckCurrentBalance() {
        account.depositMoney(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testGetInitMoneyAmount_InitialState() {
        assertEquals("Le montant initial par défaut doit être 0", 0.0, account.getInitMoneyAmount(), 0.001);
    }

    @Test
    public void testLoadFromText_FileNotFound() {
        int result = account.loadFromText("non_existent_file.txt");
        
        assertEquals("Le nombre de comptes chargés devrait être 0 pour un fichier inexistant", 0, result);
    }
}