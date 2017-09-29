package TestJtable;


import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestJTable extends JFrame {

    public static void main(String[] args) {
        new TestJTable();
    }

    public TestJTable() {

        String[] titles = new String[]{"ID", "Name", "Email", "Phone", "Birthday", "Classname"};

        Object[][] listStudent = new Object[][]{
            {1, "Hùng", "hung@gmail.com", "1234567890", "16/06/1995", "C1702G"},
            {2, "Tùng", "tung@gmail.com", "1234567890", "17/07/1995", "C1702G"},
            {3, "Nam", "nam@gmail.com", "1234567890", "18/08/1995", "C1702G"},
            {4, "Đông", "dong@gmail.com", "1234567890", "19/09/1995", "C1702G"},
            {5, "Danh", "danh@gmail.com", "1234567890", "20/10/1995", "C1702G"},
        };

        JTable jtable = new JTable(listStudent, titles);
        jtable.setName("List Student");
        this.setSize(600, 400);
        this.add(new JScrollPane(jtable));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
