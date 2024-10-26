package bank;

import javax.swing.JOptionPane;

public class ShowMessage {

        // Custom method to display a message in a pop-up window
        public static void showMessage(String message) {
            JOptionPane.showMessageDialog(null, message);
        }

        public static void main(String[] args) {
            // Example usage of the custom method
            showMessage("Hello, World!");
        }

    }
