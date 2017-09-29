/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class JMenuBar1 extends JFrame {

    private JMenuBar menuBar = new JMenuBar();
    private JMenu mStudent = new JMenu("Student Manager");
    private JMenu mClass = new JMenu("Class room manager");
    private JMenuItem mAbout = new JMenuItem("About me");
    private JMenuItem itemAddstudent = new JMenuItem("Add Student");
    private JMenuItem itemListStudent = new JMenuItem("List Student");

    private JMenuItem itemListClass = new JMenuItem("List Class");
    private JMenuItem itemAddClass = new JMenuItem("Add Class room");

    public JMenuBar1() {

        mStudent.add(itemAddstudent);
        mStudent.add(itemListStudent);
        mClass.add(itemListClass);
        mClass.add(itemAddClass);

        menuBar.add(mStudent);
        menuBar.add(mClass);
        menuBar.add(mAbout);
        this.setJMenuBar(menuBar);
        this.setSize(400, 300);
        this.setVisible(true);
        itemAddstudent.addActionListener(new StudentHandle());
        itemListStudent.addActionListener(new StudentHandle());
        itemListClass.addActionListener(new ClassHandle());
        itemAddClass.addActionListener(new ClassHandle());
       mAbout.addActionListener(new AboutHandle());

//    private JMenuItem itemAddstudent = new JMenuItem("Infomation Student");
    }

    class StudentHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == itemAddstudent) {
                JOptionPane.showMessageDialog(null, "Bạn vừa chọn them moi sinh vien", "Thông báo", JOptionPane.CLOSED_OPTION);
            }

            if (e.getSource() == itemListStudent) {
                JOptionPane.showMessageDialog(null, "Bạn vừa chọn hien thi danh sach SV ", "Thông báo", JOptionPane.CLOSED_OPTION);
            }

        }
    }

    class ClassHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == itemAddClass) {
                JOptionPane.showMessageDialog(null, "Bạn vừa chọn them moi class", "Thông báo", JOptionPane.CLOSED_OPTION);
            }

            if (e.getSource() == itemListClass) {
                JOptionPane.showMessageDialog(null, "Bạn vừa chọn hien thi danh sach class ", "Thông báo", JOptionPane.CLOSED_OPTION);
            }

        }
    }

    class AboutHandle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            JOptionPane.showMessageDialog(null, "Hiển thị thông tin sinh viên Ronaldo", "Thông báo", JOptionPane.CLOSED_OPTION);

        }
    }

    public static void main(String[] args) {
        new JMenuBar1();
    }

}
