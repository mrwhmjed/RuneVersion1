import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
public class RuneImproved {
    //global variable for enemy/user health
    public static int enemyHealth = 100, userHealth = 100, numOfWins = 0, numOfLoss = 0;

    public static void main (String [] args){

        //creates the game window
        JFrame gameWindow = new JFrame();
        gameWindow.setTitle("RUNE"); //title of window
        gameWindow.setSize(1100, 700); //size of window
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creates the textarea
        JTextArea text = new JTextArea(11, 20); //main textarea
        JTextArea wins = new JTextArea(1, 7); //wins textarea
        JTextArea loss = new JTextArea(1, 7); //losses textarea
        text.setEditable(false); //cannot edit while running
        wins.setEditable(false);
        loss.setEditable(false);

        //creates the font
        Font font = new Font(Font.SERIF, Font.PLAIN, 16);

        //creates the textField for user input
        JTextField input = new JTextField(10);

        //creates the colors
        Color babyBlue = new Color(137, 207, 240);
        Color lightBlue = new Color(173, 216, 230);

        //creates the panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.white, 10)); //creates panel border

        panel.setBackground(babyBlue); //applies color to panel
        text.setBackground(lightBlue); //applies color to main textarea
        wins.setBackground(lightBlue); //applies color to wins textarea
        loss.setBackground(lightBlue); //applies color to loss textarea

        //creates the labels
        JLabel intro = new JLabel("TYRION: Hello Master! My name is Tyrion, and I shall be your guide throughout your valiant journey! Before we begin, I must ask, what is your name? ");
        JLabel confirm = new JLabel("Do you wish to continue? ");
        JLabel weapon = new JLabel("Choose your weapon: ");
        JLabel restart = new JLabel("Would you like to play again? ");
        JLabel newName = new JLabel("Enter your desired name: ");
        JLabel goodbye = new JLabel("Farewell Master! It has been an honor fighting with you!");

        //creates the buttons
        JButton cont = new JButton("Continue");
        JButton yes = new JButton("Yes");
        JButton no = new JButton("No");
        JButton bow = new JButton("Bow");
        JButton sword = new JButton("Sword");
        JButton axe = new JButton("Axe");
        JButton bAttack = new JButton("Attack");
        JButton bDefend = new JButton("Defend");
        JButton sAttack = new JButton("Attack");
        JButton sDefend = new JButton("Defend");
        JButton aAttack = new JButton("Attack");
        JButton aDefend = new JButton("Defend");
        JButton yes2 = new JButton("Yes");
        JButton no2 = new JButton("No");
        JButton end = new JButton("Exit");
        JButton end2 = new JButton("Exit");
        JButton rename = new JButton("Rename");
        JButton rules = new JButton("Rules");
        JButton cont2 = new JButton("Continue");
        JButton cont3 = new JButton("Continue");
        JButton resetScore = new JButton("Reset Score");

        //applying the font
        cont.setFont(font);
        yes.setFont(font);
        no.setFont(font);
        bow.setFont(font);
        sword.setFont(font);
        axe.setFont(font);
        bAttack.setFont(font);
        bDefend.setFont(font);
        sAttack.setFont(font);
        sDefend.setFont(font);
        aAttack.setFont(font);
        aDefend.setFont(font);
        yes2.setFont(font);
        no2.setFont(font);
        end.setFont(font);
        end2.setFont(font);
        rename.setFont(font);
        rules.setFont(font);
        cont2.setFont(font);
        cont3.setFont(font);
        newName.setFont(font);
        intro.setFont(font);
        text.setFont(font);
        confirm.setFont(font);
        weapon.setFont(font);
        goodbye.setFont(font);
        restart.setFont(font);
        input.setFont(font);
        wins.setFont(font);
        loss.setFont(font);
        resetScore.setFont(font);

        //visibility of buttons/labels/textAreas
        newName.setVisible(false);
        rules.setVisible(false);
        cont2.setVisible(false);
        cont3.setVisible(false);
        newName.setVisible(false);
        confirm.setVisible(false);
        restart.setVisible(false);
        weapon.setVisible(false);
        goodbye.setVisible(false);
        text.setVisible(false);
        wins.setVisible(false);
        loss.setVisible(false);
        yes.setVisible(false);
        no.setVisible(false);
        bow.setVisible(false);
        sword.setVisible(false);
        axe.setVisible(false);
        bAttack.setVisible(false);
        bDefend.setVisible(false);
        sAttack.setVisible(false);
        sDefend.setVisible(false);
        aAttack.setVisible(false);
        aDefend.setVisible(false);
        yes2.setVisible(false);
        no2.setVisible(false);
        end.setVisible(false);
        end2.setVisible(false);
        rename.setVisible(false);
        resetScore.setVisible(false);

        //action listener for buttons
        cont.addActionListener(buttonPress -> {
            String name = (input.getText()); //users name

            text.setText("TYRION:\tIt's a pleasure to meet you, Master " + name + "! I shall now explain the details of the game.\n\tThere are THREE weapons. Each weapon delivers a different amount of damage (DMG).\n\n\t1. Bow: -15 DMG\n\t2. Sword: -25 DMG\n\t3. Axe: -20 DMG\n\n\tThe enemy, an ORC, will deliver an undetermined amount of damage.\n\tAfter every match, you will be given the choice to replay the game! You will also get the choice of renaming yourself or checking the rules again.\n\n\tNow we can begin! Your opponent will be vile, show no mercy! Good luck!\n\n\tContinue when you are ready.");

            intro.setVisible(false);
            input.setVisible(false);
            cont.setVisible(false);

            text.setVisible(true);
            confirm.setVisible(true);
            yes.setVisible(true);
            no.setVisible(true);
        });
        yes.addActionListener(buttonPress -> {
            text.setText("\n\n\n\n\n            TYRION: BEGIN!!!");

            confirm.setVisible(false);
            yes.setVisible(false);
            no.setVisible(false);

            weapon.setVisible(true);
            bow.setVisible(true);
            sword.setVisible(true);
            axe.setVisible(true);
        });
        no.addActionListener(buttonPress -> {
            text.setVisible(false);
            confirm.setVisible(false);
            yes.setVisible(false);
            no.setVisible(false);

            goodbye.setVisible(true);
            end.setVisible(true);
        });
        end.addActionListener(buttonPress -> System.exit(0));
        bow.addActionListener(buttonPress -> {
            text.setText("TYRION:\tYou have chosen a BOW!\n\n         Player\t\tEnemy \n\n\t O             O \n\t-|-             -|- \n\t/ \\              / \\ \n\nYou and your opponent are currently at 100 health.");
            weapon.setVisible(false);
            bow.setVisible(false);
            sword.setVisible(false);
            axe.setVisible(false);

            bAttack.setVisible(true);
            bDefend.setVisible(true);
        });
        bAttack.addActionListener(buttonPress -> {
            Random rand = new Random(); // random dmg generator for enemy
            int dmg = rand.nextInt(30) + 1;

            enemyHealth -= 15;
            userHealth -= dmg;

            text.setText("TYRION:\tYou have chosen Attack!\n\tYou have wounded your opponent. The enemy is now at " + enemyHealth + " health!\n\n\t         Player\t\tEnemy \n\n\t\t O        O \n\t\t-|-         -\\- \n\t\t/ \\           / \\\n\n\tThe enemy has struck you! You are now at " + userHealth + " health.\n\n\t         Player\t\tEnemy \n\n\t\t   O        O \n\t\t-/-          -|- \n\t\t/ \\           / \\ \n");

            if (enemyHealth <= 10) {
                String name = input.getText(); // user name
                numOfWins++; // adjusting amount of wins
                wins.setText("Wins = " + numOfWins); // adding it to score

                text.setText("TYRION:\tCongratulations Master " + name + "! You have defeated the enemy!\n\n\t         Player\t\tEnemy  \n\n\t\t O \n\t\t-|- \n\t\t/ \\            O-<-< \n");

                bAttack.setVisible(false);
                bDefend.setVisible(false);

                wins.setVisible(true);
                restart.setVisible(true);
                yes2.setVisible(true);
                no2.setVisible(true);
                rename.setVisible(true);
                rules.setVisible(true);
                resetScore.setVisible(true);
            }
            if (userHealth <= 0) {
                String name = input.getText(); // user name
                numOfLoss++; // adjusting amount of losses
                loss.setText("Losses = " + numOfLoss); // adding it to score

                text.setText("TRYION:\tYou fought bravely to the end. You lost Master " + name +"!\n\n\t         Player\t\tEnemy  \n\n\t\t                  O \n\t\t                  -|- \n\t\t>->-O         / \\ \n");

                bAttack.setVisible(false);
                bDefend.setVisible(false);

                loss.setVisible(true);
                restart.setVisible(true);
                yes2.setVisible(true);
                no2.setVisible(true);
                rename.setVisible(true);
                rules.setVisible(true);
                resetScore.setVisible(true);
            }
        });
        bDefend.addActionListener(buttonPress -> {
            text.setText("TYRION:\tYou have chosen Defend!\n\tThe enemy has attempted to strike you and failed!\n\tYou are currently at " + userHealth + " health. The enemy is at " + enemyHealth + " health!\n\n\t         Player\t\tEnemy  \n\n\t\t O            O \n\t\t-|-            -|- \n\t\t/ \\             / \\ \n");
        });
        sword.addActionListener(buttonPress -> {
            text.setText("TYRION:\tYou have chosen a SWORD!\n\n         Player\t\tEnemy \n\n\t O             O \n\t-|-             -|- \n\t/ \\              / \\ \n\nYou and your opponent are currently at 100 health.");

            weapon.setVisible(false);
            bow.setVisible(false);
            sword.setVisible(false);
            axe.setVisible(false);

            sAttack.setVisible(true);
            sDefend.setVisible(true);
        });
        sAttack.addActionListener(buttonPress -> {
            Random rand = new Random(); // random dmg generator for enemy
            int dmg = rand.nextInt(30) + 1;

            enemyHealth -= 25;
            userHealth -= dmg;

            text.setText("TYRION:\tYou have chosen Attack!\n\tYou have wounded your opponent. The enemy is now at " + enemyHealth + " health!\n\n\t         Player\t\tEnemy \n\n\t\t O        O \n\t\t-|-         -\\- \n\t\t/ \\           / \\\n\n\tThe enemy has struck you! You are now at " + userHealth + " health.\n\n\t         Player\t\tEnemy \n\n\t\t   O        O \n\t\t-/-          -|- \n\t\t/ \\           / \\ \n");

            if (enemyHealth <= 0) {
                String name = (input.getText()); // user name
                numOfWins++; // adjusting amount of wins
                wins.setText("Wins = " + numOfWins); // adding it to score

                text.setText("TYRION:\tCongratulations Master " + name + "! You have defeated the enemy!\n\n\t         Player\t\tEnemy  \n\n\t\t O \n\t\t-|- \n\t\t/ \\            O-<-< \n");

                sAttack.setVisible(false);
                sDefend.setVisible(false);

                wins.setVisible(true);
                restart.setVisible(true);
                yes2.setVisible(true);
                no2.setVisible(true);
                rename.setVisible(true);
                rules.setVisible(true);
                resetScore.setVisible(true);
            }
            if (userHealth <= 0) {
                String name = (input.getText());
                numOfLoss++; // adjusting amount of losses
                loss.setText("Losses = " + numOfLoss); // adding it to score

                text.setText("TRYION:\tYou fought bravely to the end. You lost Master " + name + "!\n\n\t         Player\t\tEnemy  \n\n\t\t                  O \n\t\t                  -|- \n\t\t>->-O         / \\ \n");

                sAttack.setVisible(false);
                sDefend.setVisible(false);

                loss.setVisible(true);
                restart.setVisible(true);
                yes2.setVisible(true);
                no2.setVisible(true);
                rename.setVisible(true);
                rules.setVisible(true);
                resetScore.setVisible(true);
            }
        });
        sDefend.addActionListener(buttonPress -> {
            text.setText("TYRION:\tYou have chosen Defend!\n\tThe enemy has attempted to strike you and failed!\n\tYou are currently at " + userHealth + " health. The enemy is at " + enemyHealth + " health!\n\n\t         Player\t\tEnemy  \n\n\t\t O            O \n\t\t-|-            -|- \n\t\t/ \\             / \\ \n");
        });
        axe.addActionListener(buttonPress -> {
            text.setText("TYRION:\tYou have chosen an AXE!\n\n         Player\t\tEnemy \n\n\t O             O \n\t-|-             -|- \n\t/ \\              / \\ \n\nYou and your opponent are currently at 100 health.");

            weapon.setVisible(false);
            bow.setVisible(false);
            sword.setVisible(false);
            axe.setVisible(false);

            aAttack.setVisible(true);
            aDefend.setVisible(true);
        });
        aAttack.addActionListener(buttonPress -> {
            Random rand = new Random(); // random dmg generator for enemy
            int dmg = rand.nextInt(30) + 1;

            enemyHealth -= 20;
            userHealth -= dmg;

            text.setText("TYRION:\tYou have chosen Attack!\n\tYou have wounded your opponent. The enemy is now at " + enemyHealth + " health!\n\n\t         Player\t\tEnemy \n\n\t\t O        O \n\t\t-|-         -\\- \n\t\t/ \\           / \\\n\n\tThe enemy has struck you! You are now at " + userHealth + " health.\n\n\t         Player\t\tEnemy \n\n\t\t   O        O \n\t\t-/-          -|- \n\t\t/ \\           / \\ \n");

            if (enemyHealth <= 0) {
                String name = (input.getText()); // user name
                numOfWins++; // adjusting amount of wins
                wins.setText("Wins = " + numOfWins); // adding it to score

                text.setText("TYRION:\tCongratulations Master " + name + "! You have defeated the enemy!\n\n\t         Player\t\tEnemy  \n\n\t\t O \n\t\t-|- \n\t\t/ \\            O-<-< \n");

                aAttack.setVisible(false);
                aDefend.setVisible(false);

                wins.setVisible(true);
                restart.setVisible(true);
                yes2.setVisible(true);
                no2.setVisible(true);
                rename.setVisible(true);
                rules.setVisible(true);
                resetScore.setVisible(true);
            }
            if (userHealth <= 0) {
                String name = (input.getText());
                numOfLoss++; // adjusting amount of losses
                loss.setText("Losses = " + numOfLoss); // adding it to score

                text.setText("TRYION:\tYou fought bravely to the end. You lost Master " + name + "!\n\n\t         Player\t\tEnemy  \n\n\t\t                  O \n\t\t                  -|- \n\t\t>->-O         / \\ \n");

                aAttack.setVisible(false);
                aDefend.setVisible(false);

                loss.setVisible(true);
                restart.setVisible(true);
                yes2.setVisible(true);
                no2.setVisible(true);
                rename.setVisible(true);
                rules.setVisible(true);
                resetScore.setVisible(true);
            }
        });
        aDefend.addActionListener(buttonPress -> {
            text.setText("TYRION:\tYou have chosen Defend!\n\tThe enemy has attempted to strike you and failed!\n\tYou are currently at " + userHealth + " health. The enemy is at " + enemyHealth + " health!\n\n\t         Player\t\tEnemy  \n\n\t\t O            O \n\t\t-|-            -|- \n\t\t/ \\             / \\ \n");
        });
        yes2.addActionListener(buttonPress -> {
            text.setText("\n\n\n\n\n            TYRION: BEGIN!!!");

            restart.setVisible(false);
            yes2.setVisible(false);
            no2.setVisible(false);
            rename.setVisible(false);
            rules.setVisible(false);
            resetScore.setVisible(false);

            weapon.setVisible(true);
            bow.setVisible(true);
            sword.setVisible(true);
            axe.setVisible(true);

            enemyHealth = 100;
            userHealth = 100;
        });
        no2.addActionListener(buttonPress -> {
            text.setVisible(false);
            yes2.setVisible(false);
            no2.setVisible(false);
            rename.setVisible(false);
            rules.setVisible(false);
            restart.setVisible(false);
            wins.setVisible(false);
            loss.setVisible(false);
            resetScore.setVisible(false);

            end2.setVisible(true);
        });
        end2.addActionListener(buttonPress -> { System.exit(0); });
        rename.addActionListener(buttonPress -> {
            rename.setVisible(false);
            text.setVisible(false);
            yes2.setVisible(false);
            no2.setVisible(false);
            restart.setVisible(false);
            rules.setVisible(false);
            resetScore.setVisible(false);

            newName.setVisible(true);
            input.setVisible(true);
            cont2.setVisible(true);
        });
        cont2.addActionListener(buttonPress -> {
            newName.setVisible(false);
            input.setVisible(false);
            cont2.setVisible(false);
            resetScore.setVisible(false);

            text.setText("\n\n\n\n\n            TYRION: BEGIN!!!");

            text.setVisible(true);
            weapon.setVisible(true);
            bow.setVisible(true);
            sword.setVisible(true);
            axe.setVisible(true);

            enemyHealth = 100;
            userHealth = 100;
        });
        rules.addActionListener(buttonPress -> {
            rules.setVisible(false);
            rename.setVisible(false);
            restart.setVisible(false);
            yes2.setVisible(false);
            no2.setVisible(false);
            resetScore.setVisible(false);

            String name = (input.getText());

            text.setText("TYRION:\tNeed a reminder of the rules? No problem! I am always at your service Master " + name + "!\n\tOnce again, there are THREE weapons. Each weapon delivers a different amount of damage (DMG).\n\n\t1. Bow: -15 DMG\n\t2. Sword: -25 DMG\n\t3. Axe: -20 DMG\n\n\tThe enemy, an ORC, will deliver an undetermined amount of damage.\n\tAfter every match, you will be given the choice to replay the game! You will also get the choice of renaming yourself or checking the rules again.\n\n\tNow we can begin again! As I said earlier, show no mercy! Good luck!\n\n\tContinue when you are ready.");

            cont3.setVisible(true);
        });
        cont3.addActionListener(buttonPress -> {
            cont3.setVisible(false);

            text.setText("\n\n\n\n\n            TYRION: BEGIN!!!");

            text.setVisible(true);
            weapon.setVisible(true);
            bow.setVisible(true);
            sword.setVisible(true);
            axe.setVisible(true);

            enemyHealth = 100;
            userHealth = 100;
        });
        resetScore.addActionListener(buttonPress -> {
            numOfLoss = 0;
            numOfWins = 0;

            wins.setVisible(false);
            loss.setVisible(false);
        });

        JComponent[] components = {
                wins, loss, intro, newName, input, cont, text, confirm,
                yes, no, weapon, bow, sword, axe, bAttack, bDefend,
                sAttack, sDefend, aAttack, aDefend, restart, yes2,
                no2, rename, rules, cont2, cont3, goodbye, end, end2,
                resetScore
        };

        for (JComponent component : components) {
            panel.add(component);
        }

        //adding the panel to the game window
        gameWindow.add(panel);
        gameWindow.setVisible(true);
    }
}