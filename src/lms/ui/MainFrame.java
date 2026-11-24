package lms.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {

        setTitle("Library Management System");

        setSize(820, 460);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel heading = new JLabel(
                "Library Management System",
                SwingConstants.CENTER
        );

        heading.setFont(new Font("Arial", Font.BOLD, 22));

        add(heading, BorderLayout.NORTH);

        setVisible(true);
        add(createForm(),BorderLayout.CENTER);
        add(createBottomPanel(), BorderLayout.SOUTH);
    }

    private JPanel createForm() {

        JPanel form = new JPanel(
                new GridLayout(0, 2, 6, 8)
        );

        form.setBorder(
                BorderFactory.createTitledBorder("New Item")
        );

        JComboBox<String> typeBox = new JComboBox<>(
                new String[]{"Book", "DVD", "Magazine"}
        );

        JTextField idField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField detailField = new JTextField();

        JButton addButton = new JButton("Add Item");

        form.add(new JLabel("Type:"));
        form.add(typeBox);

        form.add(new JLabel("ID:"));
        form.add(idField);

        form.add(new JLabel("Title:"));
        form.add(titleField);

        form.add(new JLabel("Detail:"));
        form.add(detailField);

        form.add(new JLabel(""));
        form.add(addButton);

        return form;
    }


    private JPanel createBottomPanel() {

        JPanel bottom = new JPanel(new BorderLayout());

        JLabel status = new JLabel("Ready");

        JPanel buttons = new JPanel(
                new FlowLayout(FlowLayout.RIGHT)
        );

        JButton borrowButton = new JButton("Borrow");
        JButton returnButton = new JButton("Return");

        buttons.add(borrowButton);
        buttons.add(returnButton);

        bottom.add(status, BorderLayout.WEST);
        bottom.add(buttons, BorderLayout.EAST);

        return bottom;
    }
}
