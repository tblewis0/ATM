   import javax.swing.*;
   public class resetPIN {
      public static int chk(int chkacctnum1, int chkacctnum2, int chkacctnum3) {
         int r1 = 237 % 10;
         int tempnum = 237 / 10;
         int r2 = tempnum % 10;
         int r3 = tempnum / 10;
         int chkr4 = chkacctnum1 % 10;
         tempnum = chkacctnum1 / 10;
         int chkr5 = tempnum % 10;
         int chkr6 = tempnum / 10;
         int chkr7 = chkacctnum2 % 10;
         tempnum = chkacctnum2 / 10;
         int chkr8 = tempnum % 10;
         int chkr9 = tempnum / 10;
         int chkr10 = chkacctnum3 % 10;
         tempnum = chkacctnum3 / 10;
         int chkr11 = tempnum % 10;
         int chkr12 = tempnum / 10;
         int chksum = r1 + r2 + r3 + chkr4 + chkr5 + chkr6 + chkr7 + chkr8 + chkr9 + chkr10
            + chkr11 + chkr12;
      	 
         return chksum;
      }
      
      public static int sav(int savacctnum1, int savacctnum2, int savacctnum3) {
         int r1 = 237 % 10;
         int tempnum = 237 / 10;
         int r2 = tempnum % 10;
         int r3 = tempnum / 10;
         int savr4 = savacctnum1 % 10;
         tempnum = savacctnum1 / 10;
         int savr5 = tempnum % 10;
         int savr6 = tempnum / 10;
         int savr7 = savacctnum2 % 10;
         tempnum = savacctnum2 / 10;
         int savr8 = tempnum % 10;
         int savr9 = tempnum / 10;
         int savr10 = savacctnum3 % 10;
         tempnum = savacctnum3 / 10;
         int savr11 = tempnum % 10;
         int savr12 = tempnum / 10;
         int savsum = r1 + r2 + r3 + savr4 + savr5 + savr6 + savr7 + savr8 + savr9 + savr10
              + savr11 + savr12;
      	
         return savsum;
      }
   	
      public static Object[] reset(int log, int comfPin, int chkacctnum1, int chkacctnum2, int chkacctnum3,
       int savacctnum1, int savacctnum2, int savacctnum3) {
         Object[] values = new Object[2];
         int count = 2;
         String validPinIn = JOptionPane.showInputDialog("Enter in your PIN:");
         int validPin = 0;
            
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
               count++;
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
               int resetPin = JOptionPane.showConfirmDialog(null, "You have entered your PIN in three times"
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
                  count = 5;
                     		
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
                     
                     if (validPin == comfPin) {
                        break;
                     }
                        	
                     if (count == 10) {
                        System.out.println(log + "\t:\t\t\t" + "You MUST reset PIN or quit game!");
                        log++;
                        int finalTry = JOptionPane.showConfirmDialog(null, "You have unsuccessfully entered your PIN 10"
                                 + " " + "times. You must reset your PIN or end your game!"
                                 + "\nReset PIN?", "Reset PIN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            
                        if (finalTry == JOptionPane.NO_OPTION) {
                           System.out.println(log + "\t:\t\t\t" + "The game will now end.");
                           log++;
                           JOptionPane.showMessageDialog(null, "Game Over!"
                                          + "\nYou have had 10 unsuccessful attempts at trying to change your PIN.",
                              				 "Game Over!",
                                          JOptionPane.ERROR_MESSAGE);
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
                              
                           int chksum = resetPIN.chk(chkacctnum1, chkacctnum2, chkacctnum3);
                           int savsum = resetPIN.sav(savacctnum1, savacctnum2, savacctnum3);
                              
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
                           values = create.PIN(log);
                           comfPin = Integer.parseInt(values[0].toString());
                           log = Integer.parseInt(values[1].toString());
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
                     	
                  int chksum = resetPIN.chk(chkacctnum1, chkacctnum2, chkacctnum3);
                  int savsum = resetPIN.sav(savacctnum1, savacctnum2, savacctnum3);
                     	
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
                  values = create.PIN(log);
                  comfPin = Integer.parseInt(values[0].toString());
                  log = Integer.parseInt(values[1].toString());
               }
               count++;
            } 
            count++;	
         }
         System.out.println(log + "\t:\t\t\t" + "PIN Successfully Validated!");
         log++;
      			
         values[0] = comfPin;
         values[1] = log;
         return values;
      }
   }