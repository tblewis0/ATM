   import javax.swing.*;
   public class create {      
      public static Object[] PIN(int log) {
         Object[] values = new Object[2];
         String specPinIn = JOptionPane.showInputDialog("Please create a PIN within the range of 1000 to 9999"
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
            System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1000 to 9999.");
            log++;  	
            specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
               + "\nPlease create a PIN within the range of 1000 to 9999"
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
            System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1000 to 9999.");
            log++;  	
            specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
               + "\nPlease create a PIN within the range of 1000 to 9999"
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
               System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1000 to 9999.");
               log++;  	
               specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                  + "\nPlease create a PIN within the range of 1000 to 9999"
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
                                       + "\nPlease create a PIN within the range of 1000 to 9999"
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
               System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1000 to 9999.");
               log++;  	
               specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                                       + "\nPlease create a PIN within the range of 1000 to 9999"
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
               System.out.println(log + "\t:\t\t\t" + "Your PIN is too big! Please choose one from 1000 to 9999.");
               log++;  	
               specPinIn = JOptionPane.showInputDialog("PIN is too big!!"
                                       + "\nPlease create a PIN within the range of 1000 to 9999"
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
                  System.out.println(log + "\t:\t\t\t" + "Your PIN is too small! Please choose one from 1000 to 9999.");
                  log++;  	
                  specPinIn = JOptionPane.showInputDialog("PIN is too small!!"
                     + "\nPlease create a PIN within the range of 1000 to 9999"
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
      	
         values[0] = comfPin;
         values[1] = log;
         return values;
      }
   }