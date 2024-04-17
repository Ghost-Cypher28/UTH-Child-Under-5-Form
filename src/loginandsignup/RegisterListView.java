
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.text.html.ListView;
import static javax.swing.JOptionPane.showMessageDialog;

public class RegisterListView extends javax.swing.JFrame {

    private JList<Child> listView;
    private DefaultListModel<Child> listModel;

    public RegisterListView() {
        initComponents();
        loadChildren();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        listModel = new DefaultListModel<>();
        listView = new JList<>(listModel);
        add(listView);
        pack();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Children Registration list");
        setPreferredSize(new java.awt.Dimension(900, 450));

    }

    private void loadChildren() {
        List<Child> children = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registered_child", "root", "");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM firstName")) {

            while (rs.next()) {
                String name = rs.getString("firstName");
                int age = rs.getInt("age");
                children.add(new Child(name, age, name));
            }

        } catch (Exception e) {
            showMessageDialog(this, "Error loading children: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        Collections.sort(children, new Comparator<Child>() {
            @Override
            public int compare(Child c1, Child c2) {
                return Integer.compare(c1.getAge(), c2.getAge());
            }
        });

        for (Child child : children) {
            listModel.addElement(child);
        }
    }

}
