   import javax.swing.*;
   public class change {
      public static Object[] PIN(int log, int comfPin, int chkacctnum1, int chkacctnum2, int chkacctnum3,
       int savacctnum1, int savacctnum2, int savacctnum3) {
         Object[] values = new Object[2];
         int count = 0;
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
         }
         System.out.println(log + "\t:\t\t\t" + "PIN Successfully Validated!");
         log++;
         
         int changeCount = 0;
         System.out.println(log + "\t:\t\t\t" + "Attempting to change PIN...");
         log++;
         
         values = create.PIN(log);
         comfPin = Integer.parseInt(values[0].toString());
         log = Integer.parseInt(values[1].toString());
      			
         values[0] = comfPin;
         values[1] = log;
         return values;
      }
   }