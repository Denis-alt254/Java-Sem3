import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RadioButtonDemo extends JFrame {
    private JLabel imageLabel;

    public RadioButtonDemo() {
        setTitle("Pet Selector");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create panel for radio buttons
        JPanel radioPanel = new JPanel(new GridLayout(5, 1));
        ButtonGroup group = new ButtonGroup();

        // Image display label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Map for pet name and image path
        Map<String, String> pets = new LinkedHashMap<>();
        pets.put("Bird", "images/bird.jpg");
        pets.put("Cat", "images/cat.jpg");
        pets.put("Dog", "images/dog.jpg");
        pets.put("Rabbit", "images/rabbit.jpg");
        pets.put("Pig", "images/pig.jpg");

        for (Map.Entry<String, String> entry : pets.entrySet()) {
            String petName = entry.getKey();
            String imagePath = entry.getValue();

            JRadioButton button = new JRadioButton(petName);
            group.add(button);
            radioPanel.add(button);

            // Handle selection
            button.addActionListener(e -> handlePetSelection(petName, imagePath));
        }

        add(radioPanel, BorderLayout.WEST);
        setVisible(true);
    }

    private void handlePetSelection(String petName, String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
        JOptionPane.showMessageDialog(this, "You selected: " + petName);
    }

    public static void main(String[] args) {
        // Run app on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new RadioButtonDemo());
    }
}
