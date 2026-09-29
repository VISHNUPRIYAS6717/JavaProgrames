import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankFX extends Application {

    TextField nameField;
    TextField accountField;
    TextField amountField;

    Label resultLabel;

    BankAccount account;

    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Customer Name:");

        nameField = new TextField();

        Label accountLabel = new Label("Account Number:");

        accountField = new TextField();

        Label amountLabel = new Label("Amount:");

        amountField = new TextField();

        Button createButton =
                new Button("Create Account");

        Button depositButton =
                new Button("Deposit");

        Button withdrawButton =
                new Button("Withdraw");

        Button balanceButton =
                new Button("Check Balance");

        resultLabel =
                new Label("Result will appear here");

        // Create account
        createButton.setOnAction(e -> {

            try {

                String name = nameField.getText();

                int accountNumber =
                        Integer.parseInt(accountField.getText());

                account =
                        new SavingsAccount(
                                accountNumber,
                                name,
                                0
                        );

                resultLabel.setText(
                        "Account created successfully!"
                );

            }
            catch (NumberFormatException ex) {

                resultLabel.setText(
                        "Enter a valid account number."
                );
            }
        });

        // Deposit
        depositButton.setOnAction(e -> {

            if (account == null) {

                resultLabel.setText(
                        "Create an account first."
                );

                return;
            }

            try {

                double amount =
                        Double.parseDouble(
                                amountField.getText()
                        );

                account.deposit(amount);

                resultLabel.setText(
                        "Deposited ₹" + amount +
                        "\nBalance: ₹" +
                        account.balance
                );

            }
            catch (NumberFormatException ex) {

                resultLabel.setText(
                        "Enter a valid amount."
                );
            }
        });

        // Withdraw
        withdrawButton.setOnAction(e -> {

            if (account == null) {

                resultLabel.setText(
                        "Create an account first."
                );

                return;
            }

            try {

                double amount =
                        Double.parseDouble(
                                amountField.getText()
                        );

                account.withdraw(amount);

                resultLabel.setText(
                        "Withdrawn ₹" + amount +
                        "\nBalance: ₹" +
                        account.balance
                );

            }
            catch (NumberFormatException ex) {

                resultLabel.setText(
                        "Enter a valid amount."
                );

            }
            catch (InsufficientBalanceException ex) {

                resultLabel.setText(
                        ex.getMessage()
                );
            }
        });

        // Balance
        balanceButton.setOnAction(e -> {

            if (account == null) {

                resultLabel.setText(
                        "Create an account first."
                );

                return;
            }

            resultLabel.setText(
                    "Current Balance: ₹" +
                    account.balance
            );
        });

        VBox root = new VBox(
                10,
                nameLabel,
                nameField,
                accountLabel,
                accountField,
                amountLabel,
                amountField,
                createButton,
                depositButton,
                withdrawButton,
                balanceButton,
                resultLabel
        );

        Scene scene =
                new Scene(root, 400, 500);

        stage.setTitle("Bank Management System");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}