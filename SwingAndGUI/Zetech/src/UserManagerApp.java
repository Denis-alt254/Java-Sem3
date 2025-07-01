import javax.swing.*;
import java.util.ArrayList;

public class UserManagerApp extends JFrame {
    private JTextField nameField, searchField;
    private JButton addButton, removeButton, showAllButton, searchButton;
    private DefaultListModel<String> userModel;
    private JList<String> userList;
    private ArrayList<String> allUsers;

    public UserManagerApp() {
        setTitle("User Manager");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(100, 20, 180, 25);
        add(nameField);

        addButton = new JButton("Add");
        addButton.setBounds(290, 20, 80, 25);
        add(addButton);

        userModel = new DefaultListModel<>();
        userList = new JList<>(userModel);
        JScrollPane scrollPane = new JScrollPane(userList);
        scrollPane.setBounds(20, 60, 350, 120);
        add(scrollPane);

        removeButton = new JButton("Remove");
        removeButton.setBounds(20, 190, 100, 25);
        add(removeButton);

        JLabel searchLabel = new JLabel("Search:");
        searchLabel.setBounds(20, 230, 60, 25);
        add(searchLabel);

        searchField = new JTextField();
        searchField.setBounds(80, 230, 120, 25);
        add(searchField);

        searchButton = new JButton("Find");
        searchButton.setBounds(210, 230, 80, 25);
        add(searchButton);

        showAllButton = new JButton("Show All");
        showAllButton.setBounds(300, 230, 90, 25);
        add(showAllButton);

        allUsers = new ArrayList<>();

        // Event listeners
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                userModel.addElement(name);
                allUsers.add(name);
                nameField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selectedIndex = userList.getSelectedIndex();
            if (selectedIndex != -1) {
                allUsers.remove(userModel.getElementAt(selectedIndex));
                userModel.remove(selectedIndex);
            }
        });

        searchButton.addActionListener(e -> {
            String query = searchField.getText().trim().toLowerCase();
            if (!query.isEmpty()) {
                userModel.clear();
                for (String user : allUsers) {
                    if (user.toLowerCase().contains(query)) {
                        userModel.addElement(user);
                    }
                }
            }
        });

        showAllButton.addActionListener(e -> {
            userModel.clear();
            for (String user : allUsers) {
                userModel.addElement(user);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UserManagerApp().setVisible(true);
        });
    }
}