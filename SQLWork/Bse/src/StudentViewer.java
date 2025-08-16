import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class StudentViewer extends JFrame {
    private JTable table;
    private DefaultTableModel model;

    public StudentViewer() {
        setTitle("Student Viewer");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        model = new DefaultTableModel();
        table = new JTable(model);

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Grade");

        add(new JScrollPane(table));
        loadData();

        setVisible(true);
    }

    private void loadData() {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";         // Replace with your DB username
        String password = "Deno8758@!"; // Replace with your DB password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("grade")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentViewer::new);
    }
}