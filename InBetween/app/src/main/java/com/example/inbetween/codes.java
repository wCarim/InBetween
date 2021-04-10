package com.example.inbetween;
/*
import javax.swing.*;
import java.awt.*;
import java.util.Random;
*/


public class codes {
    /*    private JLabel lblFirstCard;    private JLabel lblHiddenCard;    private JLabel lblSecondCard;
  private JLabel lblMoney;    private JLabel lblText;    private JLabel lblCredits;
    private JButton btnBet;      private JButton btnFold;   private JButton btnHigh;    private JButton btnLow;
    private JButton btnRound;    private JButton btnStart;  private JButton btnReveal;
    private JPanel pnlOpen;    private JPanel pnlGame;    private JPanel pnlFull;
    private JTextField txtBet;
    int money = 1000;       int firstCard;      int secondCard;

    public InBetweenGui() {
        lblCredits.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\Ideats\\InBetweProjecenGui\\twitter.png")
                .getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        pnlGame.setVisible(false);
        btnStart.addActionListener(e -> {
            pnlOpen.setVisible(false);
            pnlGame.setVisible(true);
            lblHiddenCard.setIcon(backCard());
            lblFirstCard.setIcon(backCard());
            lblSecondCard.setIcon(backCard());
        });
        btnRound.addActionListener(e -> {
            firstCard = randomInt();
            secondCard = randomInt();
            lblText.setVisible(true);
            lblMoney.setText(String.valueOf(money));
            btnRound.setEnabled(false);
            btnBet.setVisible(true);
            btnFold.setVisible(true);
            btnHigh.setVisible(false);
            btnLow.setVisible(false);
            txtBet.setEnabled(true);
            txtBet.setVisible(true);
            btnRound.setText("Next Round");
            txtBet.setText("");
            lblFirstCard.setIcon(frontCard(firstCard));
            lblSecondCard.setIcon(frontCard(secondCard));
            lblHiddenCard.setIcon(backCard());
        });
        btnBet.addActionListener(e14 -> {
            try {
                int bet = Integer.parseInt(txtBet.getText());
                if (bet > money) {
                    JOptionPane.showMessageDialog(pnlGame, "You can't bet more than what you have.");
                    txtBet.setText("");
                } else {
                    btnBet.setVisible(false);
                    btnFold.setVisible(false);
                    if (firstCard != secondCard) {
                        btnReveal.setVisible(true);
                        txtBet.setEnabled(false);
                        btnReveal.setVisible(true);
                    } else {
                        btnHigh.setVisible(true);
                        btnLow.setVisible(true);
                    }
                }
            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, " Input a valid number.");
                lblHiddenCard.setIcon(backCard());
            }
        });
        btnHigh.addActionListener(e141 -> {
            int hiddenCard = randomInt();
            int bet = Integer.parseInt(txtBet.getText());
            btnHigh.setVisible(false);
            btnLow.setVisible(false);
            btnRound.setEnabled(true);
            lblHiddenCard.setIcon(frontCard(hiddenCard));
            if (hiddenCard > firstCard) {
                money += bet;
                JOptionPane.showMessageDialog(null, "You've won!!");
            } else {
                JOptionPane.showMessageDialog(null, "You've lost!!");
                money -= bet;
            }
            if (money < 1) {
                JOptionPane.showMessageDialog(null, "Bankrupt!!! Good Game.");
                btnRound.setEnabled(false);
                pnlFull.setVisible(false);
            } else {
                lblMoney.setText(String.valueOf(money));
            }
        });
        btnLow.addActionListener(e13 -> {
            int hiddenCard = randomInt();
            int bet = Integer.parseInt(txtBet.getText());

            btnHigh.setVisible(false);
            btnLow.setVisible(false);
            btnRound.setEnabled(true);
            lblHiddenCard.setIcon(frontCard(hiddenCard));
            if (hiddenCard < firstCard) {
                money += bet;
                JOptionPane.showMessageDialog(null, "You've won!!");
            } else {
                JOptionPane.showMessageDialog(null, "You've lost!!");
                money -= bet;
                if (money < 1) {
                    JOptionPane.showMessageDialog(null, "Bankrupt!!! Good Game.");
                    btnRound.setEnabled(false);
                    pnlFull.setVisible(false);
                }
                lblMoney.setText(String.valueOf(money));
            }
        });
        btnFold.addActionListener(e1 -> {
            btnRound.setEnabled(true);
            btnFold.setVisible(false);
            btnBet.setVisible(false);
            btnHigh.setVisible(false);
            btnLow.setVisible(false);
            txtBet.setVisible(false);
            money -= 30;
            JOptionPane.showMessageDialog(null, "Folded (-30)");
            lblMoney.setText(String.valueOf(money));
        });
        btnReveal.addActionListener(e -> {
            int hiddenCard = randomInt();
            int bet = Integer.parseInt(txtBet.getText());
            lblHiddenCard.setIcon(frontCard(hiddenCard));
            if (hiddenCard > firstCard && hiddenCard < secondCard ||
                    hiddenCard < firstCard && hiddenCard > secondCard) {
                money += bet;
                JOptionPane.showMessageDialog(null, "You've won!!");
            } else {
                money -= bet;
                if (money < 1) {
                    btnRound.setEnabled(false);
                    pnlFull.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Bankrupt!!! Good Game.");
                }
            }
            lblMoney.setText(String.valueOf(money));
            btnRound.setEnabled(true);
            btnReveal.setVisible(false);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("In Between Card Game");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);   // Exit the program after closing
        frame.setSize(new Dimension(700, 520));
        frame.setLocation(new Point(500, 50));// Setting the frame to a specific location
        frame.setContentPane(new InBetweenGui().pnlFull);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static ImageIcon backCard() {
        return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\Back.png")
                .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
    }
    public static ImageIcon frontCard(int n) {
        if (n == 1) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\one.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 2) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\two.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 3) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\three.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 4) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\four.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 5) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\five.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 6) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\six.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 7) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\seven.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 8) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\eight.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 9) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\nine.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 10) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\ten.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 11) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\eleven.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else if (n == 12) {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\twelve.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        } else {
            return new ImageIcon(new ImageIcon("C:\\Users\\jadoo\\IdeaProjects\\InBetweenGui\\thirteen.png")
                    .getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
        }
    }
    public static int randomInt() {
        Random rand = new Random();
        return rand.nextInt(13) + 1;
    }*/
}