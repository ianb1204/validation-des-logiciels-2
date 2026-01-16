package com.imt.mines;

import com.imt.mines.Bank;
import com.imt.mines.BankAccount;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class BankAccountTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void DespositTest()
    {
        BankAccount compteBancaire = new BankAccount();
        compteBancaire.depositMoney(100);
        assertEquals(100.0, compteBancaire.getBalance(), 0.001);
    }

    @Test
    public void DepositNegativeTest(){
        BankAccount compteBancaire = new BankAccount();
        compteBancaire.depositMoney(-100);
        assertEquals(0, compteBancaire.getBalance(), 0.001);
    }

    @Test
    public void WithdrawTooMuchMoney(){
        BankAccount compteBancaire = new BankAccount();
        compteBancaire.depositMoney(100);
        compteBancaire.withdrawMoney(200);
        assertEquals(100, compteBancaire.getBalance(), 0.001);
    }

    @Test
    public void GetBalance(){
        BankAccount compteBancaire = new BankAccount();
        compteBancaire.depositMoney(100);
        assertEquals(100, compteBancaire.getBalance(), 0.001);
    }

    @Test
    public void GetInitMoney(){
        BankAccount compteBancaire = new BankAccount();
        assertEquals(0, compteBancaire.getInitMoneyAmount(), 0.001); 
    }
}