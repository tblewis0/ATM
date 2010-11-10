//----------------------------------------
// To Do List
//----------------------------------------
// - Finish PIN Inquiry System
// -- Prompt PIN for payday and
// 	account main menu.
// -- Prompt PIN for withdraw confirmation
// -- Add change PIN menu options
// - Setup Change PIN System
// - Change Account Number
//----------------------------------------

   import javax.swing.*;
   import java.util.Random;
   public class origAdvancedATM {
      public static void main(String[] args) {
         int log = 1, tempnum;
         double balance, balanceRegSav;
         String balInput, balRegSavInput;
      	
         System.out.println("***************************************************************************************"
             + "**********************************"
             + "\nTransaction Log"
             + "\n**************************************************************************************************"
             + "***********************"
             + "\nID\t:\t\t\tMessage"
             + "\n--------------------------------------------------------------------------------------------------"
             + "-----------------------");
         
         Random generator = new Random();
      		 
         String specPinIn = JOptionPane.showInputDialog("Please create a PIN within the range of 1,000 to 9,999"
            + "\nCreate a PIN:");
         int specPin = 0;
      	
         try {
            specPin = Integer.parseInt(specPinIn);
         }
            catch (NumberFormatException ex) {
               System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
               log++;
            }
            catch (NullPointerException ex) {
               System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
               log++;
            }
      	
         while (specPin < 1000) {
            System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
            log++;  	
            specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
               + "\nPlease create a PIN within the range of 1,000 to 9,999"
               + "\nCreate a PIN:");
            specPin = 0;
         
            try {
               specPin = Integer.parseInt(specPinIn);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
         }
      	
         while (specPin > 9999) {
            System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
            log++;  	
            specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
               + "\nPlease create a PIN within the range of 1,000 to 9,999"
               + "\nCreate a PIN:");
            specPin = 0;
         
            try {
               specPin = Integer.parseInt(specPinIn);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
            while (specPin < 1000) {
               System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
               log++;  	
               specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                  + "\nPlease create a PIN within the range of 1,000 to 9,999"
                  + "\nCreate a PIN:");
               specPin = 0;
            
               try {
                  specPin = Integer.parseInt(specPinIn);
               }
                  catch (NumberFormatException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                     log++;
                  }
                  catch (NullPointerException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                     log++;
                  }
            }
         }
      	
         String comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
         int comfPin = 0;
      	
         try {
            comfPin = Integer.parseInt(comfPinIn);
         }
            catch (NumberFormatException ex) {
               System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
               log++;
            }
            catch (NullPointerException ex) {
               System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
               log++;
            }
      	
         while (specPin != comfPin) {
            System.out.println(log + "\t:\t\t\t" + "Your PINs do NOT MATCH!");
            log++;  	
            specPinIn = JOptionPane.showInputDialog("The PIN entered does NOT Match!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
            specPin = 0;
            
            try {
               specPin = Integer.parseInt(specPinIn);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
                        
            while (specPin < 1000) {
               System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
               log++;  	
               specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
               specPin = 0;
            
               try {
                  specPin = Integer.parseInt(specPinIn);
               }
                  catch (NumberFormatException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                     log++;
                  }
                  catch (NullPointerException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                     log++;
                  }
            }
                              
            while (specPin > 9999) {
               System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
               log++;  	
               specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
               specPin = 0;
            
               try {
                  specPin = Integer.parseInt(specPinIn);
               }
                  catch (NumberFormatException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                     log++;
                  }
                  catch (NullPointerException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                     log++;
                  }
               while (specPin < 1000) {
                  System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                  log++;  	
                  specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                     + "\nPlease create a PIN within the range of 1,000 to 9,999"
                     + "\nCreate a PIN:");
                  specPin = 0;
               
                  try {
                     specPin = Integer.parseInt(specPinIn);
                  }
                     catch (NumberFormatException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                        log++;
                     }
                     catch (NullPointerException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                        log++;
                     }
               }
            }
                     	
            comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
            comfPin = 0;
         
            try {
               comfPin = Integer.parseInt(comfPinIn);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
         }
      	
         JOptionPane.showMessageDialog(null, "You have successfully created a PIN!"
            + "\n\nYour pin is:" + " " + comfPin
            + "\nWrite this down in a safe location! It will not be displayed again!");
      	
         String pin = "0000".replaceAll("[0]", "*");
         System.out.println(log + "\t:\t\t\t" + "You have successfully set your PIN:" + " " + pin);
         log++;  	
      	
         int r1 = 237 % 10;
         tempnum = 237 / 10;
         int r2 = tempnum % 10;
         int r3 = tempnum / 10;
      	
         int chkacctnum1 = generator.nextInt(999) + 100;
         if (chkacctnum1 > 999) {
            chkacctnum1 -= 1000;
         }
         if (chkacctnum1 < 100) {
            chkacctnum1 += 100;
         }
         int chkr4 = chkacctnum1 % 10;
         tempnum = chkacctnum1 / 10;
         int chkr5 = tempnum % 10;
         int chkr6 = tempnum / 10;
         int chkacctnum2 = generator.nextInt(999) + 100;
         if (chkacctnum2 > 999) {
            chkacctnum2 -= 1000;
         }
         if (chkacctnum2 < 100) {
            chkacctnum2 += 100;
         }
         int chkr7 = chkacctnum2 % 10;
         tempnum = chkacctnum2 / 10;
         int chkr8 = tempnum % 10;
         int chkr9 = tempnum / 10;
         int chkacctnum3 = generator.nextInt(999) + 100;
         if (chkacctnum3 > 999) {
            chkacctnum3 -= 1000;
         }
         if (chkacctnum3 < 100) {
            chkacctnum3 += 100;
         }
         int chkr10 = chkacctnum3 % 10;
         tempnum = chkacctnum3 / 10;
         int chkr11 = tempnum % 10;
         int chkr12 = tempnum / 10;
      	
         balInput = JOptionPane.showInputDialog("Enter the inital deposit for checking account."
            + "\nMinimum of $25 to open account" + " " + "(237" + chkacctnum1 + chkacctnum2
            + chkacctnum3 + ").");
         balance = 0;
            
         try {
            balance = Double.parseDouble(balInput);
         }
            catch (NumberFormatException ex) {
               System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
               log++;
            }
            catch (NullPointerException ex) {
               System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
               log++;
            }
      	
         while (balance < 25) {
            System.out.println(log + "\t:\t\t\t" + "Error! Invalid checking account initial deposit of" + " " + "$"
               + String.format("%.2f", balance) + " " + "was entered! Minimum of $25!");
            log++; 
            balInput = JOptionPane.showInputDialog("Invalid Entry!!"
                + "\nEnter the inital deposit for checking account. Minimum of $25 to open account"
                + " " + "(237" + chkacctnum1 + chkacctnum2 + chkacctnum3 + ").");
            balance = 0;
         	
            try {
               balance = Double.parseDouble(balInput);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
               }
         }
      	
         System.out.println(log + "\t:\t\t\t" + "Checking account number:" + " " + "237" + chkacctnum1
            + chkacctnum2 + chkacctnum3);
         log++;
         System.out.println(log + "\t:\t\t\t" + "You have made a initial deposit of" + " " + "$"
            + String.format("%.2f", balance) + " " + "into your checking" + " " + "account.");
         log++;
      	
         int savacctnum1 = generator.nextInt(999) + 100;
         if (savacctnum1 > 999) {
            savacctnum1 -= 1000;
         }
         if (savacctnum1 < 100) {
            savacctnum1 += 100;
         }
         int savr4 = savacctnum1 % 10;
         tempnum = savacctnum1 / 10;
         int savr5 = tempnum % 10;
         int savr6 = tempnum / 10;
         int savacctnum2 = generator.nextInt(999) + 100;
         if (savacctnum2 > 999) {
            savacctnum2 -= 1000;
         }
         if (savacctnum2 < 100) {
            savacctnum2 += 100;
         }
         int savr7 = savacctnum2 % 10;
         tempnum = savacctnum2 / 10;
         int savr8 = tempnum % 10;
         int savr9 = tempnum / 10;
         int savacctnum3 = generator.nextInt(999) + 100;
         if (savacctnum3 > 999) {
            savacctnum3 -= 1000;
         }
         if (savacctnum3 < 100) {
            savacctnum3 += 100;
         }
         int savr10 = savacctnum3 % 10;
         tempnum = savacctnum3 / 10;
         int savr11 = tempnum % 10;
         int savr12 = tempnum / 10;
      	
         balRegSavInput = JOptionPane.showInputDialog("Enter the inital deposit for regular savings account."
            + "\nMinimum of $5 to open account" + " " + "(237" + savacctnum1 + savacctnum2 + savacctnum3 + ").");
         balanceRegSav = 0;
      	
         try {
            balanceRegSav = Double.parseDouble(balRegSavInput);
         }
            catch (NumberFormatException ex) {
               System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
               log++;
            }
            catch (NullPointerException ex) {
               System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
               log++;
            }
      	
         while (balanceRegSav < 5) {
            System.out.println(log + "\t:\t\t\t" + "Error! Invalid regular savings account initial deposit of" + " "
               + "$" + String.format("%.2f", balanceRegSav) + " " + "was entered! Minimum of $5!");
            log++; 
            balRegSavInput = JOptionPane.showInputDialog("Enter the inital deposit for regular savings account."
               + "\nMinimum of $5 to open account" + " " + "(237" + savacctnum1 + savacctnum2 + savacctnum3 + ").");
            balanceRegSav = 0;
         
            try {
               balanceRegSav = Double.parseDouble(balRegSavInput);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
         }
      	
         System.out.println(log + "\t:\t\t\t" + "Regular Savings account number:" + " " + "237" + savacctnum1
            + savacctnum2 + savacctnum3);
         log++;
         System.out.println(log + "\t:\t\t\t" + "You have made a initial deposit of" + " " + "$"
            + String.format("%.2f", balanceRegSav) + " " + "into your regular savings account.");
         log++;
      		
         String cashInput = JOptionPane.showInputDialog("Enter the amount of money you have on-hand."
            + "\nMinimum $100.");
         double cash = 0;
      	
         try {
            cash = Double.parseDouble(cashInput);
         }
            catch (NumberFormatException ex) {
               System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
               log++;
            }
            catch (NullPointerException ex) {
               System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
               log++;
            }
         
         while (cash < 100) {
            System.out.println(log + "\t:\t\t\t" + "Error! Invalid on-hand cash amountof" + " " + "$"
               + String.format("%.2f", cash) + " " + "was entered! Minimum of $100!");
            log++; 
            cashInput = JOptionPane.showInputDialog("Enter the amount of money you have on-hand."
               + "\nMinimum $100.");
            cash = 0;
         
            try {
               cash = Double.parseDouble(cashInput);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
         }
      	
         System.out.println(log + "\t:\t\t\t" + "You have" + " " + "$" + String.format("%.2f", cash) + " "
            + "on-hand.");
         log++;
      	         
         int day = 1;
      	
         System.out.println(log + "\t:\t\t\t" + "It is day" + " " + day + ".");
         log++;
         
         double pay, mBonus, sBonus;
         
         do { 
            String accountMenu_input, menuInput, menuRegSavInput, dirdep_cashInput, toAccountInput, validPinIn;
            int accountMenu, menu, menuRegSav, dirdep_cash, confirm, toAccount, resetPin, finalTry, validPin, count = 2;
         	
            if (day % 7 == 0) {
               System.out.println("\nID\t:\t\t\tMessage"
                  + "\n--------------------------------------------------------------------------------------------------"
                  + "-----------------------");
               pay = generator.nextInt(777) + 77;
               if (day % 14 == 0) {
                  mBonus = generator.nextInt(25) + 1;
                  System.out.println(log + "\t:\t\t\t" + "Your check is" + " " + "$"
                     + String.format("%.2f", pay) + "!");
                  log++;
                  System.out.println(log + "\t:\t\t\t" + "You recieved a minor bonus of" + " " + "$"
                     + String.format("%.2f", mBonus) + "!");
                  log++;
                  pay += mBonus;
                  System.out.println(log + "\t:\t\t\t" + "Your checks' total was" + " " + "$"
                     + String.format("%.2f", pay) + "!");
                  log++;
               }
               if (day % 49 == 0) {
                  sBonus = generator.nextInt(77) + 50;
                  System.out.println(log + "\t:\t\t\t" + "Your check is" + " " + "$"
                     + String.format("%.2f", pay) + "!");
                  log++;
                  System.out.println(log + "\t:\t\t\t" + "You recieved a significant bonus of" + " " + "$"
                     + String.format("%.2f", sBonus) + "!");
                  log++;
                  pay += sBonus;
                  System.out.println(log + "\t:\t\t\t" + "Your checks' total was" + " " + "$"
                     + String.format("%.2f",  pay) + "!");
                  log++;
               }
               JOptionPane.showMessageDialog(null, "Congrats!!!"
                  + "\nIt's payday! You have recieved" + " " + "$" + String.format("%.2f", pay) + "!!",
                  "Payday", JOptionPane.INFORMATION_MESSAGE);
            		
               validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
               validPin = 0;
            
               try {
                  validPin = Integer.parseInt(validPinIn);
               }
                  catch (NumberFormatException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                     log++;
                  }
                  catch (NullPointerException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                     log++;
                  }
               System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
               log++;  	
            
               while (validPin != comfPin) {
                  System.out.println(log + "\t:\t\t\t" + "Validation FAILED!");
                  log++;
                  validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
                  validPin = 0;
               
                  try {
                     validPin = Integer.parseInt(validPinIn);
                  }
                     catch (NumberFormatException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                        log++;
                     }
                     catch (NullPointerException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                        log++;
                     }
                  System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
                  log++;
               	
                  if (count == 3) {
                     System.out.println(log + "\t:\t\t\t" + "You have entered your PIN in three times wrong!");
                     log++;
                     resetPin = JOptionPane.showConfirmDialog(null, "You have entered your PIN in three times"
                        	+ " " + "incorrectly!"
                        	+ "\nWould you like to reset your PIN?"
                        	+ "\n\nNote: After 10 unsuccessful attempts, you are forced to either"
                        	+ " " + "reset PIN, or quit game.", "Reset PIN", JOptionPane.YES_NO_OPTION,
                        	JOptionPane.QUESTION_MESSAGE);
                     if (resetPin == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Please try your PIN again.");
                        validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
                        validPin = 0;
                     
                        try {
                           validPin = Integer.parseInt(validPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                        System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
                        log++;
                     		
                        while (validPin != comfPin) {
                           System.out.println(log + "\t:\t\t\t" + "Validation FAILED!");
                           log++;
                           validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
                           validPin = 0;
                        
                           try {
                              validPin = Integer.parseInt(validPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                           System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
                           log++;
                        	
                           if (count == 8) {
                              System.out.println(log + "\t:\t\t\t" + "You MUST reset PIN or quit game!");
                              log++;
                              finalTry = JOptionPane.showConfirmDialog(null, "You have unsuccessfully entered your PIN 10"
                                 + " " + "times. You must reset your PIN or end your game!"
                                 + "\nReset PIN?", "Reset PIN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            
                              if (finalTry == JOptionPane.NO_OPTION) {
                                 System.exit(0);
                              }
                              else if (finalTry == JOptionPane.YES_OPTION) {
                                 int resetCount = 1;
                                 System.out.println(log + "\t:\t\t\t" + "Attempting to reset PIN...");
                                 log++;
                                 String resetIn = JOptionPane.showInputDialog("To reset your PIN, enter the sum of the digits of"
                                    + " " + "either account's account number."
                                    + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                                    + chkacctnum3
                                    + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                                    + savacctnum3);
                                 int reset = 0;
                              
                                 try {
                                    reset = Integer.parseInt(resetIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              
                                 System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                                 log++;
                              
                                 int chksum = r1 + r2 + r3 + chkr4 + chkr5 + chkr6 + chkr7 + chkr8 + chkr9 + chkr10
                                    + chkr11 + chkr12;
                                 int savsum = r1 + r2 + r3 + savr4 + savr5 + savr6 + savr7 + savr8 + savr9 + savr10
                                    + savr11 + savr12;
                              
                                 while (reset != chksum && reset != savsum) {
                                    resetIn = JOptionPane.showInputDialog("Try Again!"
                                       + "\n\nTo reset your PIN, enter the sum of the digits of either account's account number."
                                       + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                                       + chkacctnum3
                                       + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                                       + savacctnum3);
                                    reset = 0;
                                 
                                    try {
                                       reset = Integer.parseInt(resetIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                 
                                    System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                                    log++;
                                 
                                    if (resetCount == 10) {
                                       JOptionPane.showMessageDialog(null, "Game Over!"
                                          + "\nYou have had 10 unsuccessful attempts at trying to reset your PIN.", "Game Over!",
                                          JOptionPane.ERROR_MESSAGE);
                                       System.exit(0);
                                    }
                                    resetCount++;
                                 }
                                 specPinIn = JOptionPane.showInputDialog("Please create a PIN within the range of 1,000 to 9,999"
                                    + "\nCreate a PIN:");
                                 specPin = 0;
                              
                                 try {
                                    specPin = Integer.parseInt(specPinIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              
                                 while (specPin < 1000) {
                                    System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                    log++;  	
                                    specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                                    specPin = 0;
                                 
                                    try {
                                       specPin = Integer.parseInt(specPinIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                 }
                              
                                 while (specPin > 9999) {
                                    System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                                    log++;  	
                                    specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                                    specPin = 0;
                                 
                                    try {
                                       specPin = Integer.parseInt(specPinIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                    while (specPin < 1000) {
                                       System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                       log++;  	
                                       specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                          + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                          + "\nCreate a PIN:");
                                       specPin = 0;
                                    
                                       try {
                                          specPin = Integer.parseInt(specPinIn);
                                       }
                                          catch (NumberFormatException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                             log++;
                                          }
                                          catch (NullPointerException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                             log++;
                                          }
                                    }
                                 }
                              
                                 comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                                 comfPin = 0;
                              
                                 try {
                                    comfPin = Integer.parseInt(comfPinIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              
                                 while (specPin != comfPin) {
                                    System.out.println(log + "\t:\t\t\t" + "Your PINs do NOT MATCH!");
                                    log++;  	
                                    specPinIn = JOptionPane.showInputDialog("The PIN entered does NOT Match!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                                    specPin = 0;
                                 
                                    try {
                                       specPin = Integer.parseInt(specPinIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                 
                                    while (specPin < 1000) {
                                       System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                       log++;  	
                                       specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                          + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                          + "\nCreate a PIN:");
                                       specPin = 0;
                                    
                                       try {
                                          specPin = Integer.parseInt(specPinIn);
                                       }
                                          catch (NumberFormatException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                             log++;
                                          }
                                          catch (NullPointerException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                             log++;
                                          }
                                    }
                                 
                                    while (specPin > 9999) {
                                       System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                                       log++;  	
                                       specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                          + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                          + "\nCreate a PIN:");
                                       specPin = 0;
                                    
                                       try {
                                          specPin = Integer.parseInt(specPinIn);
                                       }
                                          catch (NumberFormatException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                             log++;
                                          }
                                          catch (NullPointerException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                             log++;
                                          }
                                       while (specPin < 1000) {
                                          System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                          log++;  	
                                          specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                             + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                             + "\nCreate a PIN:");
                                          specPin = 0;
                                       
                                          try {
                                             specPin = Integer.parseInt(specPinIn);
                                          }
                                             catch (NumberFormatException ex) {
                                                System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                                log++;
                                             }
                                             catch (NullPointerException ex) {
                                                System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                                log++;
                                             }
                                       }
                                    }
                                 
                                    comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                                    comfPin = 0;
                                 
                                    try {
                                       comfPin = Integer.parseInt(comfPinIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                 }
                              
                                 JOptionPane.showMessageDialog(null, "Your PIN was successfully changed!!"
                                    + "\n\nYour pin is:" + " " + comfPin
                                    + "\nWrite this down in a safe location! It will not be displayed again!");
                              
                                 pin = "0000".replaceAll("[0]", "*");
                                 System.out.println(log + "\t:\t\t\t" + "PIN Successfully Changed:" + " " + pin);
                                 log++;
                              }
                           }
                           count++;
                        }
                     }
                     else if (resetPin == JOptionPane.YES_OPTION) {
                        int resetCount = 0;
                        System.out.println(log + "\t:\t\t\t" + "Attempting to reset PIN...");
                        log++;
                        String resetIn = JOptionPane.showInputDialog("To reset your PIN, enter the sum of the digits of"
                           + " " + "either account's account number."
                           + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                           + chkacctnum3
                           + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                           + savacctnum3
                           + "\n\nNote: 10 unsuccessful attempts to reset will force you to quit game.");
                        int reset = 0;
                                 
                        try {
                           reset = Integer.parseInt(resetIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                     	
                        System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                        log++;
                     	
                        int chksum = r1 + r2 + r3 + chkr4 + chkr5 + chkr6 + chkr7 + chkr8 + chkr9 + chkr10
                           		 + chkr11 + chkr12;
                        int savsum = r1 + r2 + r3 + savr4 + savr5 + savr6 + savr7 + savr8 + savr9 + savr10
                           		 + savr11 + savr12;
                     	
                        while (reset != chksum && reset != savsum) {
                           resetIn = JOptionPane.showInputDialog("Try Again!"
                              + "\n\nTo reset your PIN, enter the sum of the digits of either account's account number."
                              + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                              + chkacctnum3
                              + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                              + savacctnum3
                              + "\n\nNote: 10 unsuccessful attempts to reset will force you to quit game.");
                           reset = 0;
                                 
                           try {
                              reset = Integer.parseInt(resetIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                        	
                           System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                           log++;
                        	
                           if (resetCount == 8) {
                              JOptionPane.showMessageDialog(null, "Game Over!"
                                 + "\nYou have had 10 unsuccessful attempts at trying to reset your PIN.", "Game Over!",
                                 JOptionPane.ERROR_MESSAGE);
                              System.exit(0);
                           }
                           resetCount++;
                        }
                        specPinIn = JOptionPane.showInputDialog("Please create a PIN within the range of 1,000 to 9,999"
                           + "\nCreate a PIN:");
                        specPin = 0;
                                    
                        try {
                           specPin = Integer.parseInt(specPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                              
                        while (specPin < 1000) {
                           System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                           log++;  	
                           specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                           specPin = 0;
                                    
                           try {
                              specPin = Integer.parseInt(specPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                        }
                              
                        while (specPin > 9999) {
                           System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                           log++;  	
                           specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                           specPin = 0;
                                    
                           try {
                              specPin = Integer.parseInt(specPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                           while (specPin < 1000) {
                              System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                              log++;  	
                              specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                 + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                 + "\nCreate a PIN:");
                              specPin = 0;
                                    
                              try {
                                 specPin = Integer.parseInt(specPinIn);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                        }
                              
                        comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                        comfPin = 0;
                                 
                        try {
                           comfPin = Integer.parseInt(comfPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                              
                        while (specPin != comfPin) {
                           System.out.println(log + "\t:\t\t\t" + "Your PINs do NOT MATCH!");
                           log++;  	
                           specPinIn = JOptionPane.showInputDialog("The PIN entered does NOT Match!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                           specPin = 0;
                                    
                           try {
                              specPin = Integer.parseInt(specPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                        
                           while (specPin < 1000) {
                              System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                              log++;  	
                              specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                              specPin = 0;
                                    
                              try {
                                 specPin = Integer.parseInt(specPinIn);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                              
                           while (specPin > 9999) {
                              System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                              log++;  	
                              specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                              specPin = 0;
                                    
                              try {
                                 specPin = Integer.parseInt(specPinIn);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                              while (specPin < 1000) {
                                 System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                 log++;  	
                                 specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                    + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                    + "\nCreate a PIN:");
                                 specPin = 0;
                                    
                                 try {
                                    specPin = Integer.parseInt(specPinIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              }
                           }
                        
                           comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                           comfPin = 0;
                                 
                           try {
                              comfPin = Integer.parseInt(comfPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                        }
                     
                        JOptionPane.showMessageDialog(null, "Your PIN was successfully changed!!"
                           + "\n\nYour pin is:" + " " + comfPin
                           + "\nWrite this down in a safe location! It will not be displayed again!");
                     
                        pin = "0000".replaceAll("[0]", "*");
                        System.out.println(log + "\t:\t\t\t" + "PIN Successfully Changed:" + " " + pin);
                        log++;
                     }
                     count++;
                  } 
                  count++;	
               }
               System.out.println(log + "\t:\t\t\t" + "PIN Successfully Validated!");      
            	      	 
               dirdep_cashInput = JOptionPane.showInputDialog("Would you like to direct-deposit it or cash it?"
                  + " " + "Enter 1 to direct-deposit or 2 to cash check.");
               dirdep_cash = 0;
                                 
               try {
                  dirdep_cash = Integer.parseInt(dirdep_cashInput);
               }
                  catch (NumberFormatException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Unable to determine selection: "+ex.getMessage());
                     log++;
                  }
                  catch (NullPointerException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                     log++;
                  }
            	
               while (dirdep_cash != 1 && dirdep_cash != 2) {
                  System.out.println(log + "\t:\t\t\t" + "Invalid choice! Please select whether you would like to"
                     + " " + "direct deposit your check or cash it with option 1 or 2.");
                  log++; 
                  dirdep_cashInput = JOptionPane.showInputDialog("Invalid Entry!!"
                     + "\nWould you like to direct-deposit it or cash it?"
                     + "\nEnter 1 to direct-deposit or 2 to cash check.");
                  dirdep_cash = 0;
                                 
                  try {
                     dirdep_cash = Integer.parseInt(dirdep_cashInput);
                  }
                     catch (NumberFormatException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Unable to determine selection: "+ex.getMessage());
                        log++;
                     }
                     catch (NullPointerException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                        log++;
                     }
               }
            	
               switch (dirdep_cash) {
                  case 1:
                     System.out.println(log + "\t:\t\t\t" + "You have chosen to direct deposit your check of"
                        + " " + "$" + String.format("%.2f", pay) + ".");
                     log++;
                     toAccountInput = JOptionPane.showInputDialog("To which account would you like to"
                        + " " + "direct-deposit your check to?"
                        + "\n\nChecking (237" + chkacctnum1 + chkacctnum2 + chkacctnum3 + ") :: 1"
                        + "\nRegular Savings (237" + savacctnum1 + savacctnum2 + savacctnum3 + ") :: 2");
                     toAccount = 0;
                                 
                     try {
                        toAccount = Integer.parseInt(toAccountInput);
                     }
                        catch (NumberFormatException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Unable to determine selection: "+ex.getMessage());
                           log++;
                        }
                        catch (NullPointerException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                           log++;
                        }
                     switch (toAccount) {
                        case 1:
                           System.out.println(log + "\t:\t\t\t" + "You have chosen to direct deposit your check of"
                              + " " + "$" + String.format("%.2f", pay) + " " + "into your checking account.");
                           log++;
                           balance += pay;
                           System.out.println(log + "\t:\t\t\t" + "Your new checking account balance is" + " " + "$"
                              + String.format("%.2f", balance) + ".");
                           log++;
                           break;
                        case 2:
                           System.out.println(log + "\t:\t\t\t" + "You have chosen to direct deposit your check of"
                              + " " + "$" + String.format("%.2f", pay) + " "
                              + "into your regular savings account.");
                           log++;
                           balanceRegSav += pay;
                           System.out.println(log + "\t:\t\t\t" + "Your new regular savings account balance is"
                              + " " + "$" + String.format("%.2f", balanceRegSav) + ".");
                           log++;
                           break;
                     }
                     break;
                  case 2:
                     System.out.println(log + "\t:\t\t\t" + "You have chosen to cash your check of"
                        + " " + "$" + String.format("%.2f", pay) + ".");
                     log++;
                     cash += pay;
                     System.out.println(log + "\t:\t\t\t" + "Your new on-hand cash balance is" + " " + "$"
                        + String.format("%.2f", cash) + ".");
                     log++; 
                     break;
                  default:
                     JOptionPane.showMessageDialog(null, "Invalid Entry! Please choose either option 1-2.");
                     break;
               }
            }
         	
            System.out.println(log + "\t:\t\t\t" + "Display Account Main Menu...");
            log++;
         	
            validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
            validPin = 0;
                     
            try {
               validPin = Integer.parseInt(validPinIn);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
            System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
            log++;  	
            
            while (validPin != comfPin) {
               System.out.println(log + "\t:\t\t\t" + "Validation FAILED!");
               log++;
               validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
               validPin = 0;
                     
               try {
                  validPin = Integer.parseInt(validPinIn);
               }
                  catch (NumberFormatException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                     log++;
                  }
                  catch (NullPointerException ex) {
                     System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                     log++;
                  }
               System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
               log++;
               	
               if (count == 3) {
                  System.out.println(log + "\t:\t\t\t" + "You have entered your PIN in three times wrong!");
                  log++;
                  resetPin = JOptionPane.showConfirmDialog(null, "You have entered your PIN in three times"
                        	+ " " + "incorrectly!"
                        	+ "\nWould you like to reset your PIN?"
                        	+ "\n\nNote: After 10 unsuccessful attempts, you are forced to either"
                        	+ " " + "reset PIN, or quit game.", "Reset PIN", JOptionPane.YES_NO_OPTION,
                        	JOptionPane.QUESTION_MESSAGE);
                  if (resetPin == JOptionPane.NO_OPTION) {
                     JOptionPane.showMessageDialog(null, "Please try your PIN again.");
                     validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
                     validPin = 0;
                     
                     try {
                        validPin = Integer.parseInt(validPinIn);
                     }
                        catch (NumberFormatException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                           log++;
                        }
                        catch (NullPointerException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                           log++;
                        }
                     System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
                     log++;
                     		
                     while (validPin != comfPin) {
                        System.out.println(log + "\t:\t\t\t" + "Validation FAILED!");
                        log++;
                        validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
                        validPin = 0;
                     
                        try {
                           validPin = Integer.parseInt(validPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                        System.out.println(log + "\t:\t\t\t" + "Validating PIN...");
                        log++;
                        	
                        if (count == 8) {
                           System.out.println(log + "\t:\t\t\t" + "You MUST reset PIN or quit game!");
                           log++;
                           finalTry = JOptionPane.showConfirmDialog(null, "You have unsuccessfully entered your PIN 10"
                                 + " " + "times. You must reset your PIN or end your game!"
                                 + "\nReset PIN?", "Reset PIN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            
                           if (finalTry == JOptionPane.NO_OPTION) {
                              System.exit(0);
                           }
                           else if (finalTry == JOptionPane.YES_OPTION) {
                              int resetCount = 1;
                              System.out.println(log + "\t:\t\t\t" + "Attempting to reset PIN...");
                              log++;
                              String resetIn = JOptionPane.showInputDialog("To reset your PIN, enter the sum of the digits of"
                                    + " " + "either account's account number."
                                    + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                                    + chkacctnum3
                                    + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                                    + savacctnum3);
                              int reset = 0;
                                 
                              try {
                                 reset = Integer.parseInt(resetIn);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                              
                              System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                              log++;
                              
                              int chksum = r1 + r2 + r3 + chkr4 + chkr5 + chkr6 + chkr7 + chkr8 + chkr9 + chkr10
                                    + chkr11 + chkr12;
                              int savsum = r1 + r2 + r3 + savr4 + savr5 + savr6 + savr7 + savr8 + savr9 + savr10
                                    + savr11 + savr12;
                              
                              while (reset != chksum && reset != savsum) {
                                 resetIn = JOptionPane.showInputDialog("Try Again!"
                                       + "\n\nTo reset your PIN, enter the sum of the digits of either account's account number."
                                       + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                                       + chkacctnum3
                                       + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                                       + savacctnum3);
                                 reset = 0;
                                 
                                 try {
                                    reset = Integer.parseInt(resetIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                                 
                                 System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                                 log++;
                                 
                                 if (resetCount == 10) {
                                    JOptionPane.showMessageDialog(null, "Game Over!"
                                          + "\nYou have had 10 unsuccessful attempts at trying to reset your PIN.", "Game Over!",
                                          JOptionPane.ERROR_MESSAGE);
                                    System.exit(0);
                                 }
                                 resetCount++;
                              }
                              specPinIn = JOptionPane.showInputDialog("Please create a PIN within the range of 1,000 to 9,999"
                                    + "\nCreate a PIN:");
                              specPin = 0;
                                    
                              try {
                                 specPin = Integer.parseInt(specPinIn);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                              
                              while (specPin < 1000) {
                                 System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                 log++;  	
                                 specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                                 specPin = 0;
                                    
                                 try {
                                    specPin = Integer.parseInt(specPinIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              }
                              
                              while (specPin > 9999) {
                                 System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                                 log++;  	
                                 specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                                 specPin = 0;
                                    
                                 try {
                                    specPin = Integer.parseInt(specPinIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                                 while (specPin < 1000) {
                                    System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                    log++;  	
                                    specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                          + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                          + "\nCreate a PIN:");
                                    specPin = 0;
                                    
                                    try {
                                       specPin = Integer.parseInt(specPinIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                 }
                              }
                              
                              comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                              comfPin = 0;
                                 
                              try {
                                 comfPin = Integer.parseInt(comfPinIn);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                              
                              while (specPin != comfPin) {
                                 System.out.println(log + "\t:\t\t\t" + "Your PINs do NOT MATCH!");
                                 log++;  	
                                 specPinIn = JOptionPane.showInputDialog("The PIN entered does NOT Match!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                                 specPin = 0;
                                    
                                 try {
                                    specPin = Integer.parseInt(specPinIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                                 
                                 while (specPin < 1000) {
                                    System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                    log++;  	
                                    specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                          + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                          + "\nCreate a PIN:");
                                    specPin = 0;
                                    
                                    try {
                                       specPin = Integer.parseInt(specPinIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                 }
                                 
                                 while (specPin > 9999) {
                                    System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                                    log++;  	
                                    specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                          + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                          + "\nCreate a PIN:");
                                    specPin = 0;
                                    
                                    try {
                                       specPin = Integer.parseInt(specPinIn);
                                    }
                                       catch (NumberFormatException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                          log++;
                                       }
                                       catch (NullPointerException ex) {
                                          System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                          log++;
                                       }
                                    while (specPin < 1000) {
                                       System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                                       log++;  	
                                       specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                             + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                             + "\nCreate a PIN:");
                                       specPin = 0;
                                    
                                       try {
                                          specPin = Integer.parseInt(specPinIn);
                                       }
                                          catch (NumberFormatException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                             log++;
                                          }
                                          catch (NullPointerException ex) {
                                             System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                             log++;
                                          }
                                    }
                                 }
                                 
                                 comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                                 comfPin = 0;
                                 
                                 try {
                                    comfPin = Integer.parseInt(comfPinIn);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              }
                              
                              JOptionPane.showMessageDialog(null, "Your PIN was successfully changed!!"
                                    + "\n\nYour pin is:" + " " + comfPin
                                    + "\nWrite this down in a safe location! It will not be displayed again!");
                              
                              pin = "0000".replaceAll("[0]", "*");
                              System.out.println(log + "\t:\t\t\t" + "PIN Successfully Changed:" + " " + pin);
                              log++;
                           }
                        }
                        count++;
                     }
                  }
                  else if (resetPin == JOptionPane.YES_OPTION) {
                     int resetCount = 0;
                     System.out.println(log + "\t:\t\t\t" + "Attempting to reset PIN...");
                     log++;
                     String resetIn = JOptionPane.showInputDialog("To reset your PIN, enter the sum of the digits of"
                           + " " + "either account's account number."
                           + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                           + chkacctnum3
                           + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                           + savacctnum3
                        	+ "\n\nNote: 10 unsuccessful attempts to reset will force you to quit game.");
                     int reset = 0;
                  	
                     try {
                        reset = Integer.parseInt(resetIn);
                     }
                        catch (NumberFormatException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                           log++;
                        }
                        catch (NullPointerException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                           log++;
                        }
                     	
                     System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                     log++;
                     	
                     int chksum = r1 + r2 + r3 + chkr4 + chkr5 + chkr6 + chkr7 + chkr8 + chkr9 + chkr10
                           		 + chkr11 + chkr12;
                     int savsum = r1 + r2 + r3 + savr4 + savr5 + savr6 + savr7 + savr8 + savr9 + savr10
                           		 + savr11 + savr12;
                     	
                     while (reset != chksum && reset != savsum) {
                        resetIn = JOptionPane.showInputDialog("Try Again!"
                              + "\n\nTo reset your PIN, enter the sum of the digits of either account's account number."
                              + "\nChecking Account Number:" + " " + "237" + chkacctnum1 + chkacctnum2
                              + chkacctnum3
                              + "\nRegular Savings Account Number:" + " " + "237" + savacctnum1 + savacctnum2
                              + savacctnum3
                           	+ "\n\nNote: 10 unsuccessful attempts to reset will force you to quit game.");
                        reset = 0;
                     
                        try {
                           reset = Integer.parseInt(resetIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                        	
                        System.out.println(log + "\t:\t\t\t" + "Validating Entry...");
                        log++;
                        	
                        if (resetCount == 8) {
                           JOptionPane.showMessageDialog(null, "Game Over!"
                                 + "\nYou have had 10 unsuccessful attempts at trying to reset your PIN.", "Game Over!",
                                 JOptionPane.ERROR_MESSAGE);
                           System.exit(0);
                        }
                        resetCount++;
                     }
                     specPinIn = JOptionPane.showInputDialog("Please create a PIN within the range of 1,000 to 9,999"
                           + "\nCreate a PIN:");
                     specPin = 0;
                                    
                     try {
                        specPin = Integer.parseInt(specPinIn);
                     }
                        catch (NumberFormatException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                           log++;
                        }
                        catch (NullPointerException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                           log++;
                        }
                              
                     while (specPin < 1000) {
                        System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                        log++;  	
                        specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                        specPin = 0;
                                    
                        try {
                           specPin = Integer.parseInt(specPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                     }
                              
                     while (specPin > 9999) {
                        System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                        log++;  	
                        specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                        specPin = 0;
                                    
                        try {
                           specPin = Integer.parseInt(specPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                        while (specPin < 1000) {
                           System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                           log++;  	
                           specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                 + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                 + "\nCreate a PIN:");
                           specPin = 0;
                                    
                           try {
                              specPin = Integer.parseInt(specPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                        }
                     }
                              
                     comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                     comfPin = 0;
                                 
                     try {
                        comfPin = Integer.parseInt(comfPinIn);
                     }
                        catch (NumberFormatException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                           log++;
                        }
                        catch (NullPointerException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                           log++;
                        }
                              
                     while (specPin != comfPin) {
                        System.out.println(log + "\t:\t\t\t" + "Your PINs do NOT MATCH!");
                        log++;  	
                        specPinIn = JOptionPane.showInputDialog("The PIN entered does NOT Match!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                        specPin = 0;
                                    
                        try {
                           specPin = Integer.parseInt(specPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                        
                        while (specPin < 1000) {
                           System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                           log++;  	
                           specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                           specPin = 0;
                                    
                           try {
                              specPin = Integer.parseInt(specPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                        }
                              
                        while (specPin > 9999) {
                           System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1,000 to 9,999.");
                           log++;  	
                           specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                       + "\nCreate a PIN:");
                           specPin = 0;
                                    
                           try {
                              specPin = Integer.parseInt(specPinIn);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                           while (specPin < 1000) {
                              System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1,000 to 9,999.");
                              log++;  	
                              specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                    + "\nPlease create a PIN within the range of 1,000 to 9,999"
                                    + "\nCreate a PIN:");
                              specPin = 0;
                                    
                              try {
                                 specPin = Integer.parseInt(specPinIn);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                        }
                        
                        comfPinIn = JOptionPane.showInputDialog("Comfirm PIN:");
                        comfPin = 0;
                                 
                        try {
                           comfPin = Integer.parseInt(comfPinIn);
                        }
                           catch (NumberFormatException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Unable to create PIN as decimal: "+ex.getMessage());
                              log++;
                           }
                           catch (NullPointerException ex) {
                              System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                              log++;
                           }
                     }
                     
                     JOptionPane.showMessageDialog(null, "Your PIN was successfully changed!!"
                           + "\n\nYour pin is:" + " " + comfPin
                           + "\nWrite this down in a safe location! It will not be displayed again!");
                     
                     pin = "0000".replaceAll("[0]", "*");
                     System.out.println(log + "\t:\t\t\t" + "PIN Successfully Changed:" + " " + pin);
                     log++;
                  }
                  count++;
               } 
               count++;	
            }
            System.out.println(log + "\t:\t\t\t" + "PIN Successfully Validated!");         
         
            accountMenu_input = JOptionPane.showInputDialog("Welcome! It is day" + " " + day + "."
               + "\nWhich account would you like to access?"
               + "\nEnter the transaction number of the account you would like to access."
               + "\n****************************************************************************"
               + "\n\nChecking (237" + chkacctnum1 + chkacctnum2 + chkacctnum3 + " " + ") :: 1"
               + "\nRegular Savings (237" + savacctnum1 + savacctnum2 + savacctnum3 + ") :: 2"
               + "\nMake Transfer :: 3"
               + "\nLeave Bank :: 4");
            accountMenu = 0;
         	
            try {
               accountMenu = Integer.parseInt(accountMenu_input);
            }
               catch (NumberFormatException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Unable find transaction ID: "+ex.getMessage());
                  log++;
               }
               catch (NullPointerException ex) {
                  System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                  log++;
               }
         
            switch (accountMenu) {
               case 1:
               
                  System.out.println(log + "\t:\t\t\t" + "Displaying Checking Account" + " " + "(237" + chkacctnum1
                     + chkacctnum2 + chkacctnum3 + ") Main Menu...");
                  log++; 
                  menuInput = JOptionPane.showInputDialog("Checking  (237" + chkacctnum1 + chkacctnum2
                     + chkacctnum3 + ")"
                     + "\n****************************************************************************"
                     + "\nWelcome! It is day" + " " + day + "."
                     + "\nEnter the number of your transaction."
                     + "\n****************************************************************************"
                     + "\n\nWithdraw :: 1"
                     + "\nDeposit :: 2"
                     + "\nCheck Balance :: 3"
                     + "\nLeave Bank :: 4");
                  menu = 0;
               
                  try {
                     menu = Integer.parseInt(menuInput);
                  }
                     catch (NumberFormatException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Unable find transaction ID: "+ex.getMessage());
                        log++;
                     }
                     catch (NullPointerException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                        log++;
                     }
               
                  switch (menu) {
                     case 1:
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to make a withdrawal.");
                        log++; 
                        JOptionPane.showMessageDialog(null, "You have chosen to make a withdrawal.", "Withdrawal",
                           JOptionPane.INFORMATION_MESSAGE);
                     
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Withdraw",
                           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                           
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have cancelled your withdrawal transaction.");
                           log++;
                           JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed your withdrawal transaction.");
                           log++; 
                           String withdrawInput;
                           double withdraw;
                           
                           withdrawInput = JOptionPane.showInputDialog("How much would you like to withdraw?"
                                 + "\nNote: You cannot withdraw more than" + " " + "$"
                                 + String.format("%.2f", balance));
                           withdraw = 0;
                        
                           try {
                              withdraw = Double.parseDouble(withdrawInput);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                           
                           while (withdraw > balance) {
                              System.out.println(log + "\t:\t\t\t" + "Overdraft Protection Activated! You cannot"
                                 + " " + "withdraw $" + String.format("%.2f", withdraw) + ", you only have $"
                                 + String.format("%.2f", balance) + " " + "to withdraw!");
                              log++;
                              withdrawInput = JOptionPane.showInputDialog("Overdraft Protection!!"
                                    + "\nThe amount you are attempting to withdraw will put you at a negative"
                                    + " " + "balance."
                                    + "\n\nHow much would you like to withdraw?"
                                    + "\nNote: You cannot withdraw more than" + " " + "$"
                                    + String.format("%.2f", balance));
                              withdraw = 0;
                           
                              try {
                                 withdraw = Double.parseDouble(withdrawInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                           
                           balance -= withdraw;
                           System.out.println(log + "\t:\t\t\t" + "You have successfully made a withdrawal of $"
                              + String.format("%.2f", withdraw) + " " + ".");
                           log++;
                           System.out.println(log + "\t:\t\t\t" + "Your new balance is $"
                              + String.format("%.2f", balance) + ".");
                           log++;
                           cash += withdraw;
                           System.out.println(log + "\t:\t\t\t" + "You now have $" + String.format("%.2f", cash) + " "
                              + "on-hand.");
                           log++;
                           day++;
                           System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                           log++;
                           
                           JOptionPane.showMessageDialog(null, "You have withdrawn" + " " + "$"
                                 + String.format("%.2f", withdraw) + "."
                                 + "\nYour new balance is:" + " " + "$" + String.format("%.2f", balance) + "."
                                 + "\nYour new on-hand cash balance is" + " " + "$"
                                 + String.format("%.2f", cash) + "."
                                 + "\nIt is now day" + " " + day + ".");
                        }
                        break;
                     case 2:
                        JOptionPane.showMessageDialog(null, "You have chosen to make a deposit.", "Deposit",
                           JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to make a deposit.");
                        log++; 
                     
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Deposit",
                           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                           
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have cancelled your deposit transaction.");
                           log++;
                           JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed your deposit transaction.");
                           log++; 
                           String depositInput;
                           double deposit;
                           
                           depositInput = JOptionPane.showInputDialog("How much would you like to deposit?"
                                 + "\nNote: You cannot deposit less than $0 or more than" + " " + "$"
                                 + String.format("%.2f", cash) + ".");
                           deposit = 0;
                        
                           try {
                              deposit = Double.parseDouble(depositInput);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                           
                           while (deposit < 0) {
                              System.out.println(log + "\t:\t\t\t" + "Invalid deposit amount! You cannot deposit $"
                                 + String.format("%.2f", deposit) + "!");
                              log++;
                              depositInput = JOptionPane.showInputDialog("Invalid Deposit!"
                                    + "\nThe amount you are attempting to deposit will put you at a negative"
                                    + " " + "balance."
                                    + "\n\nHow much would you like to deposit?"
                                    + "\nNote: You cannot deposit less than $0 or more than" + " " + "$"
                                    + String.format("%.2f", cash) + ".");
                              deposit = 0;
                           
                              try {
                                 deposit = Double.parseDouble(depositInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                           while (deposit > cash) {
                              System.out.println(log + "\t:\t\t\t" + "Invalid deposit amount! You cannot deposit $"
                                 + String.format("%.2f", deposit) + ", you only have $"
                                 + String.format("%.2f", cash) + " " + "on-hand to deposit!");
                              log++;
                              depositInput = JOptionPane.showInputDialog("Not Enough on-hand Cash!!"
                                    + "\nThe amount you are attempting to deposit will put you at a negative"
                                    + " " + "balance."
                                    + "\n\nHow much would you like to deposit?"
                                    + "\nNote: You cannot deposit less than $0 or more than" + " " + "$"
                                    + String.format("%.2f", cash) + ".");
                              deposit = 0;
                           
                              try {
                                 deposit = Double.parseDouble(depositInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                           
                           balance += deposit;
                           System.out.println(log + "\t:\t\t\t" + "You have successfully made a deposit of $"
                              + String.format("%.2f", deposit) + " " + ".");
                           log++;
                           System.out.println(log + "\t:\t\t\t" + "Your new balance is $"
                              + String.format("%.2f", balance) + ".");
                           log++;
                           cash -= deposit;
                           System.out.println(log + "\t:\t\t\t" + "You now have $" + String.format("%.2f", cash) + " "
                              + "on-hand.");
                           log++;
                           day++;                          
                           System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                           log++;
                           
                           JOptionPane.showMessageDialog(null, "You have deposited" + " " + "$"
                                 + String.format("%.2f", deposit) + "."
                                 + "\nYour new balance is:" + " " + "$" + String.format("%.2f", balance) + "."
                                 + "\n Your new on-hand cash balance is" + " " + "$" + String.format("%.2f", cash)
                                 + "."
                                 + "\nIt is now day" + " " + day + ".");
                        }
                        break;
                     case 3:
                        JOptionPane.showMessageDialog(null, "You have chosen to check your balance.",
                           "Check Balance", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to make a check your balance.");
                        log++; 
                     
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Check Balance",
                           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                           
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have cancelled your inquiry transaction.");
                           log++;
                           JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed your inquiry transaction.");
                           log++;
                           day++;
                           System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                           log++;
                           JOptionPane.showMessageDialog(null, "Your balance is:" + " " + "$"
                                 + String.format("%.2f", balance) + "."
                                 + "\nYour on-hand cash balance is:" + " " + "$" + String.format("%.2f", cash)
                                 + "."
                                 + "\nIt is now day" + " " + day + ".");
                        }
                        break;
                     case 4:
                     
                        JOptionPane.showMessageDialog(null, "Leaving so soon?", "Leave?",
                                 JOptionPane.WARNING_MESSAGE);
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to leave the bank.");
                        log++; 
                           
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Leaving?",
                              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                              
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have decided to stay here at the bank.");
                           log++;
                           JOptionPane.showMessageDialog(null, "Thanks for deciding to stay with us!"
                               + " " + "We are delighted with your business!");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed you will be leaving us for now.");
                           log++;
                           JOptionPane.showMessageDialog(null, "Do come and visit us again! We will miss you!"
                                       + "\nGoodbye!"
                              			+ "\n\nYou played for" + " " + day + " " + "days.",
                              			"Until Next Time!", JOptionPane.INFORMATION_MESSAGE);
                           System.exit(0);
                        }
                        break;
                     default:
                        System.out.println(log + "\t:\t\t\t" + "Invalid selection. Please choose option 1-4.");
                        log++;
                        JOptionPane.showMessageDialog(null, "Invalid Entry! Please choose either option 1-4.");
                        break;
                  }
                  break;
               case 2:
                  System.out.println(log + "\t:\t\t\t" + "Displaying Regular Savings Account" + " "
                     + "(237" + savacctnum1 + savacctnum2 + savacctnum3 + ") Main Menu...");
                  log++; 
                  menuRegSavInput = JOptionPane.showInputDialog("Regular Savings (237" + savacctnum1
                     + savacctnum2 + savacctnum3 + ")"
                     + "\n*****************************************************************"
                     + "\nWelcome! It is day" + " " + day + "."
                     + "\nEnter the number of your transaction"
                     + "\n*****************************************************************"
                     + "\n\nWithdraw :: 1"
                     + "\nDeposit :: 2"
                     + "\nCheck Balance :: 3"
                     + "\nLeave Bank :: 4");
                  menuRegSav = 0;
               	
                  try {
                     menuRegSav = Integer.parseInt(menuRegSavInput);
                  }
                     catch (NumberFormatException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Unable find transaction ID: "+ex.getMessage());
                        log++;
                     }
                     catch (NullPointerException ex) {
                        System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                        log++;
                     }
               
                  switch (menuRegSav) {
                     case 1:
                        JOptionPane.showMessageDialog(null, "You have chosen to make a withdrawal.", "Withdrawal",
                           JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to make a withdrawal.");
                        log++; 
                     
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Withdraw",
                           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                           
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have cancelled your withdrawal transaction.");
                           log++;
                           JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed your withdrawal transaction.");
                           log++; 
                           String withdrawInput;
                           double withdraw;
                           
                           withdrawInput = JOptionPane.showInputDialog("How much would you like to withdraw?"
                                 + "\nNote: You cannot withdraw more than" + " " + "$"
                                 + String.format("%.2f", balanceRegSav));
                           withdraw = 0;
                           
                           try {
                              withdraw = Double.parseDouble(withdrawInput);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                           
                           while (withdraw > balanceRegSav) {
                              System.out.println(log + "\t:\t\t\t" + "Overdraft Protection Activated! You cannot"
                                 + " " + "withdraw $" + String.format("%.2f", withdraw) + ", you only have $"
                                 + String.format("%.2f", balanceRegSav) + " " + "to withdraw!");
                              log++;
                              withdrawInput = JOptionPane.showInputDialog("Overdraft Protection!!"
                                    + "\nThe amount you are attempting to withdraw will put you at a negative"
                                    + " " + "balance."
                                    + "\n\nHow much would you like to withdraw?"
                                    + "\nNote: You cannot withdraw more than" + " " + "$"
                                    + String.format("%.2f", balanceRegSav));
                              withdraw = 0;
                           
                              try {
                                 withdraw = Double.parseDouble(withdrawInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                           
                           balanceRegSav -= withdraw;
                           System.out.println(log + "\t:\t\t\t" + "You have successfully made a withdrawal of $"
                              + String.format("%.2f", withdraw) + " " + ".");
                           log++;
                           System.out.println(log + "\t:\t\t\t" + "Your new balance is $"
                              + String.format("%.2f", balanceRegSav) + ".");
                           log++;
                           cash += withdraw;
                           System.out.println(log + "\t:\t\t\t" + "You now have $" + String.format("%.2f", cash) + " "
                              + "on-hand.");
                           log++;
                           day++;
                           System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                           log++;       
                        	                                            
                           JOptionPane.showMessageDialog(null, "You have withdrawn" + " " + "$"
                                 + String.format("%.2f", withdraw) + "."
                                 + "\nYour new balance is:" + " " + "$" + String.format("%.2f", balanceRegSav)
                                 + "."
                                 + "\nYour new on-hand cash balance is" + " " + "$" + String.format("%.2f", cash)
                                 + "."
                                 + "\nIt is now day" + " " + day + ".");
                        }
                        break;
                     case 2:
                        JOptionPane.showMessageDialog(null, "You have chosen to make a deposit.", "Deposit",
                           JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to make a deposit.");
                        log++; 
                     
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Deposit",
                           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                           
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have cancelled your deposit transaction.");
                           log++;
                           JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed your deposit transaction.");
                           log++; 
                           String depositInput;
                           double deposit;
                           
                           depositInput = JOptionPane.showInputDialog("How much would you like to deposit?"
                                 + "\nNote: You cannot deposit less than $0 or more than" + " " + "$"
                                 + String.format("%.2f", cash) + ".");
                           deposit = 0;
                           
                           try {
                              deposit = Double.parseDouble(depositInput);
                           }
                              catch (NumberFormatException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                 log++;
                              }
                              catch (NullPointerException ex) {
                                 System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                 log++;
                              }
                           
                           while (deposit < 0) {
                              System.out.println(log + "\t:\t\t\t" + "Invalid deposit amount! You cannot deposit $"
                                 + String.format("%.2f", deposit) + "!");
                              log++;
                              depositInput = JOptionPane.showInputDialog("Invalid Deposit!"
                                    + "\nThe amount you are attempting to deposit will put you at a negative"
                                    + " " + "balance."
                                    + "\n\nHow much would you like to deposit?"
                                    + "\nNote: You cannot deposit less than $0 or more than" + " " + "$"
                                    + String.format("%.2f", cash) + ".");
                              deposit = 0;
                           
                              try {
                                 deposit = Double.parseDouble(depositInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                           while (deposit > cash) {
                              System.out.println(log + "\t:\t\t\t" + "Invalid deposit amount! You cannot deposit $"
                                 + String.format("%.2f", deposit) + ", you only have $"
                                 + String.format("%.2f", cash) + " " + "on-hand to deposit!");
                              log++;
                              depositInput = JOptionPane.showInputDialog("Not Enough on-hand Cash!!"
                                    + "\nThe amount you are attempting to deposit will put you at a negative"
                                    + " " + "balance."
                                    + "\n\nHow much would you like to deposit?"
                                    + "\nNote: You cannot deposit less than $0 or more than" + " " + "$"
                                    + String.format("%.2f", cash) + ".");
                              deposit = 0;
                           
                              try {
                                 deposit = Double.parseDouble(depositInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                           }
                           
                           balanceRegSav += deposit;
                           System.out.println(log + "\t:\t\t\t" + "You have successfully made a deposit of $"
                              + String.format("%.2f", deposit) + " " + ".");
                           log++;
                           System.out.println(log + "\t:\t\t\t" + "Your new balance is $"
                              + String.format("%.2f", balanceRegSav) + ".");
                           log++;
                           cash -= deposit;
                           System.out.println(log + "\t:\t\t\t" + "You now have $" + String.format("%.2f", cash) + " "
                              + "on-hand.");
                           log++;
                           day++;                          
                           System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                           log++;                          
                           
                           JOptionPane.showMessageDialog(null, "You have deposited" + " " + "$"
                                 + String.format("%.2f", deposit) + "."
                                 + "\nYour new balance is:" + " " + "$" + String.format("%.2f", balanceRegSav)
                                 + "."
                                 + "\n Your new on-hand cash balance is" + " " + "$" + String.format("%.2f", cash)
                                 + "."
                                 + "\nIt is now day" + " " + day + ".");
                        }
                        break;
                     case 3:
                        JOptionPane.showMessageDialog(null, "You have chosen to check your balance.",
                           "Check Balance", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to make a check your balance.");
                        log++; 
                     
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Check Balance",
                           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                           
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have cancelled your inquiry transaction.");
                           log++;
                           JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed your inquiry transaction.");
                           log++;
                           day++;
                           System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                           log++;
                           JOptionPane.showMessageDialog(null, "Your balance is:" + " " + "$"
                                 + String.format("%.2f", balanceRegSav) + "."
                                 + "\nYour on-hand cash balance is:" + " " + "$" + String.format("%.2f", cash)
                                 + "."
                                 + "\nIt is now day" + " " + day + ".");
                        }
                        break;
                     case 4:
                        JOptionPane.showMessageDialog(null, "Leaving so soon?", "Leave?",
                                 JOptionPane.WARNING_MESSAGE);
                        System.out.println(log + "\t:\t\t\t" + "You have chosen to leave the bank.");
                        log++; 
                           
                        confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Leaving?",
                              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                              
                        if (confirm == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have decided to stay here at the bank.");
                           log++;
                           JOptionPane.showMessageDialog(null, "Thanks for deciding to stay with us!"
                               + " " + "We are delighted with your business!");
                        }
                        else if (confirm == JOptionPane.YES_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "You have confirmed you will be leaving us for now.");
                           log++;
                           JOptionPane.showMessageDialog(null, "Do come and visit us again! We will miss you!"
                                       + "\nGoodbye!"
                              			+ "\n\nYou played for" + " " + day + " " + "days.",
                              			"Until Next Time!", JOptionPane.INFORMATION_MESSAGE);
                           System.exit(0);
                        }
                        break;
                     default:
                        System.out.println(log + "\t:\t\t\t" + "Invalid selection. Please choose option 1-4.");
                        log++;
                        JOptionPane.showMessageDialog(null, "Invalid Entry! Please choose either option 1-4.");
                        break;
                  }
                  break;
               case 3:
                  System.out.println(log + "\t:\t\t\t" + "You have chosen to conduct a transfer.");
                  log++;
                  JOptionPane.showMessageDialog(null, "You have chosen to make a transfer.", "Transfer",
                           JOptionPane.WARNING_MESSAGE);
                     
                  confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Transfer",
                         JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                     	 
                  if (confirm == JOptionPane.NO_OPTION) {
                     System.out.println(log + "\t:\t\t\t" + "You have cancelled the transfer.");
                     log++;
                     JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                  }
                  else if (confirm == JOptionPane.YES_OPTION) {
                     System.out.println(log + "\t:\t\t\t" + "You have confirmed your transfer transaction.");
                     log++;
                     System.out.println(log + "\t:\t\t\t" + "Display Transfer Main Menu...");
                     log++;
                     String transferMenuInput = JOptionPane.showInputDialog("Make Transfer"
                           + "\n*****************************************************************"
                           + "\nWelcome! It is day" + " " + day + "."
                           + "\nEnter the account number you would like to transfer from"
                           + "\n*****************************************************************"
                           + "\n\nChecking (237" + chkacctnum1 + chkacctnum2 + chkacctnum3
                           + ") to Regular Savings (237" + savacctnum1 + savacctnum2 + savacctnum3 + " "
                        	+ ") Balance is: $" + String.format("%.2f", balance) + " " 
                           + ":: 1" + "\nRegular Savings (237" + savacctnum1 + savacctnum2 + savacctnum3
                        	+ ") to Checking (237" + chkacctnum1 + chkacctnum2 + chkacctnum3
                        	+ ")" + " " + "Balance is: $" + String.format("%.2f", balanceRegSav)
                           + " " + ":: 2" + "\nLeave Bank :: 3");
                     int transferMenu = 0;
                  	
                     try {
                        transferMenu = Integer.parseInt(transferMenuInput);
                     }
                        catch (NumberFormatException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Unable find transaction ID: "+ex.getMessage());
                           log++;
                        }
                        catch (NullPointerException ex) {
                           System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                           log++;
                        }
                     
                     switch (transferMenu) {
                        case 1:
                           JOptionPane.showMessageDialog(null, "You have chosen to transfer from the"
                                 + " " + "checking account.",
                                 "Transfer from Checking -" + " " + "(237" + chkacctnum1 + chkacctnum2
                              	+ chkacctnum3, JOptionPane.WARNING_MESSAGE);
                           System.out.println(log + "\t:\t\t\t" + "You have chosen to transfer from the checking"
                              + " " + "account to the regular savings account.");
                           log++;
                           
                           confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Checking to Savings",
                              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                              
                           if (confirm == JOptionPane.NO_OPTION) {
                              System.out.println(log + "\t:\t\t\t" + "You have cancelled the transfer transaction.");
                              log++;
                              JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                           }
                           else if (confirm == JOptionPane.YES_OPTION) {
                              System.out.println(log + "\t:\t\t\t" + "You have confirmed you would like to carry-out this"
                                 + " " + "transfer.");
                              log++;
                              String fromCheckingInput = JOptionPane.showInputDialog("How much would you"
                                       + " " + "like to transfer from the checking?"
                                       + "\nNote: You cannot transfer more than" + " " + "$" + String.format("%.2f", balance) + ".");
                              double fromChecking = 0;
                           
                              try {
                                 fromChecking = Double.parseDouble(fromCheckingInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                                 
                              while (fromChecking > balance) {
                                 System.out.println(log + "\t:\t\t\t" + "Overdraft Protection! You cannot transfer more"
                                    + " " + "than $" + String.format("%.2f", balance) + ".");
                                 log++;
                                 fromCheckingInput = JOptionPane.showInputDialog("How much would you"
                                          + " " + "like to transfer from the checking?"
                                          + "\nNote: You cannot transfer more than" + " " + "$"
                                          + String.format("%.2f", balance) + ".");
                                 fromChecking = 0;
                              
                                 try {
                                    fromChecking = Double.parseDouble(fromCheckingInput);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              }
                           	
                              balance -= fromChecking;
                              System.out.println(log + "\t:\t\t\t" + "You have successfully made a transfer from the"
                                 + " " + "checking account of $" + String.format("%.2f", fromChecking) + " " + ".");
                              log++;
                              System.out.println(log + "\t:\t\t\t" + "Your new checking account balance is $"
                                 + String.format("%.2f", balance) + ".");
                              log++;
                              balanceRegSav += fromChecking;
                              System.out.println(log + "\t:\t\t\t" + "Your new regular savings account balance is $"
                                 + String.format("%.2f", balanceRegSav) + ".");
                              log++;
                              day++;
                              System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                              log++;
                                 
                              JOptionPane.showMessageDialog(null, "You have transfered" + " "
                                       + "$" + String.format("%.2f", fromChecking) + " " + "from your"
                                       + " " + "checking account."
                                       + "\nYour new checking account balance is" + " " + "$"
                                       + String.format("%.2f", balance) + "."
                                       + "\nYour new regular savings account balance is" + " "
                                       + "$" + String.format("%.2f", balanceRegSav) + "."
                                 		+ "\nIt is now day" + " " + day + ".",
                                       "Checking -" + " " + "(237" + chkacctnum1 + chkacctnum2 + chkacctnum3,
                                 		JOptionPane.INFORMATION_MESSAGE);
                           }
                           break;
                        case 2:
                           JOptionPane.showMessageDialog(null, "You have chosen to transfer from the regular"
                                 + " " + "savings account.",
                                 "Transfer from Regular Savings -" + " " + "(237" + savacctnum1 + savacctnum2
                              	+ savacctnum3, JOptionPane.WARNING_MESSAGE);
                           System.out.println(log + "\t:\t\t\t" + "You have chosen to transfer from the regular savings"
                              + " " + "account to the checking account.");
                           log++;
                           
                           confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Savings to Checking",
                              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                              
                           if (confirm == JOptionPane.NO_OPTION) {
                              System.out.println(log + "\t:\t\t\t" + "You have cancelled the transfer transaction.");
                              log++;
                              JOptionPane.showMessageDialog(null, "You have cancelled the transaction.");
                           }
                           else if (confirm == JOptionPane.YES_OPTION) {
                              System.out.println(log + "\t:\t\t\t" + "You have confirmed you would like to carry-out this"
                                 + " " + "transfer.");
                              log++;
                              String fromRegSavInput = JOptionPane.showInputDialog("How much would you like"
                                       + " " + "to transfer from the regular savings?"
                                       + "\nNote: You cannot transfer more than" + " " + "$"
                                       + String.format("%.2f", balanceRegSav) + ".");
                              double fromRegSav = 0;
                           
                              try {
                                 fromRegSav = Double.parseDouble(fromRegSavInput);
                              }
                                 catch (NumberFormatException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                    log++;
                                 }
                                 catch (NullPointerException ex) {
                                    System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                    log++;
                                 }
                                 
                              while (fromRegSav > balanceRegSav) {
                                 System.out.println(log + "\t:\t\t\t" + "Overdraft Protection! You cannot transfer more"
                                    + " " + "than $" + String.format("%.2f", balanceRegSav) + ".");
                                 log++;
                                 fromRegSavInput = JOptionPane.showInputDialog("How much would you like"
                                          + " " + "to transfer from the regular savings?"
                                          + "\nNote: You cannot transfer more than" + " " + "$"
                                          + String.format("%.2f", balanceRegSav) + ".");
                                 fromRegSav = 0;
                              
                                 try {
                                    fromRegSav = Double.parseDouble(fromRegSavInput);
                                 }
                                    catch (NumberFormatException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Error: " +ex.getMessage() + " " + "entered!");
                                       log++;
                                    }
                                    catch (NullPointerException ex) {
                                       System.out.println(log + "\t:\t\t\t" + "Nothing was entered: " +ex.getMessage());
                                       log++;
                                    }
                              }
                              balanceRegSav -= fromRegSav;
                              System.out.println(log + "\t:\t\t\t" + "You have successfully made a transfer from the"
                                 + " " + "regular savings account of $" + String.format("%.2f", fromRegSav) + " "
                                 + ".");
                              log++;
                              System.out.println(log + "\t:\t\t\t" + "Your new regular savings account balance is $"
                                 + String.format("%.2f", balanceRegSav) + ".");
                              log++;
                              balance += fromRegSav;
                              System.out.println(log + "\t:\t\t\t" + "Your new checking account balance is $"
                                 + String.format("%.2f", balance) + ".");
                              log++;
                              day++;
                              System.out.println(log + "\t:\t\t\t" + "It is now day" + " " + day + ".");
                              log++;                              
                                 
                              JOptionPane.showMessageDialog(null, "You have transfered" + " "
                                       + "$"+ String.format("%.2f", fromRegSav) + " " + "from your regular"
                                       + " " + "savings account."
                                       + "\nYour new regular savings account balance is" + " " + "$"
                                       + String.format("%.2f", balanceRegSav) + "."
                                       + "\nYour new checking account balance is" + " "
                                       + "$"+ String.format("%.2f", balance) + "."
                                 		+ "\nIt is now day" + " " + day + ".",
                                       "Regular Savings -" + " " + "(237" + savacctnum1 + savacctnum2
                                 		+ savacctnum3 + ")", JOptionPane.INFORMATION_MESSAGE);
                           }
                           break;
                        case 3:
                           JOptionPane.showMessageDialog(null, "Leaving so soon?", "Leave?",
                                 JOptionPane.WARNING_MESSAGE);
                           System.out.println(log + "\t:\t\t\t" + "You have chosen to leave the bank.");
                           log++; 
                           
                           confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Leaving?",
                              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                              
                           if (confirm == JOptionPane.NO_OPTION) {
                              System.out.println(log + "\t:\t\t\t" + "You have decided to stay here at the bank.");
                              log++;
                              JOptionPane.showMessageDialog(null, "Thanks for deciding to stay with us!"
                                 + " " + "We are delighted with your business!");
                           }
                           else if (confirm == JOptionPane.YES_OPTION) {
                              System.out.println(log + "\t:\t\t\t" + "You have confirmed you will be leaving us for now.");
                              log++;
                              JOptionPane.showMessageDialog(null, "Do come and visit us again! We will miss you!"
                                       + "\nGoodbye!"
                                 		+ "\n\nYou played for" + " " + day + " " + "days.",
                                 		"Until Next Time!", JOptionPane.INFORMATION_MESSAGE);
                              System.exit(0);
                           }
                           break;
                        default:
                           JOptionPane.showMessageDialog(null, "Invalid Entry! Please choose either option"
                                 + " " + "1-3.");
                           break;
                     }
                  }
                  break;
               case 4:
                  JOptionPane.showMessageDialog(null, "Leaving so soon?", "Leave?",
                                 JOptionPane.WARNING_MESSAGE);
                           
                  confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Leaving?",
                              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                              
                  if (confirm == JOptionPane.NO_OPTION) {
                     System.out.println(log + "\t:\t\t\t" + "You have decided to stay here at the bank.");
                     log++;
                     JOptionPane.showMessageDialog(null, "Thanks for deciding to stay with us!"
                               + " " + "We are delighted with your business!");
                  }
                  else if (confirm == JOptionPane.YES_OPTION) {
                     System.out.println(log + "\t:\t\t\t" + "You have confirmed you will be leaving us for now.");
                     log++;
                     JOptionPane.showMessageDialog(null, "Do come and visit us again! We will miss you!"
                                       + "\nGoodbye!"
                        					+ "\n\nYou played for" + " " + day + " " + "days.",
                        					"Until Next Time!", JOptionPane.INFORMATION_MESSAGE);
                     System.exit(0);
                  }
                  break;
               default:
                  System.out.println(log + "\t:\t\t\t" + "Invalid selection. Please choose option 1-4.");
                  log++;
                  JOptionPane.showMessageDialog(null, "Invalid Entry! Please choose either option 1-4.");
                  break;
            }
         } while (true);
      }
   }