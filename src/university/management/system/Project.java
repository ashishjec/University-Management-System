package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/uni.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 740, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();

        // New Information
        JMenu newInformation = new JMenu("New Information  ");
        newInformation.setForeground(Color.BLUE);
        newInformation.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(newInformation);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.setFont(new Font("Arial", Font.PLAIN, 24));
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.setFont(new Font("Arial", Font.PLAIN, 24));
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        // Details
        JMenu details = new JMenu("View Details  ");
        details.setForeground(Color.RED);
        details.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.setFont(new Font("Arial", Font.PLAIN, 24));
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.setFont(new Font("Arial", Font.PLAIN, 24));
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        // Leave
        JMenu leave = new JMenu("Apply Leave  ");
        leave.setForeground(Color.BLUE);
        leave.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.setFont(new Font("Arial", Font.PLAIN, 24));
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.setFont(new Font("Arial", Font.PLAIN, 24));
        studentleave.addActionListener(this);
        leave.add(studentleave);

        // Leave Details
        JMenu leaveDetails = new JMenu("Leave Details  ");
        leaveDetails.setForeground(Color.RED);
        leaveDetails.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(leaveDetails);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.setFont(new Font("Arial", Font.PLAIN, 24));
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.setFont(new Font("Arial", Font.PLAIN, 24));
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);

        // Exams
        JMenu exam = new JMenu("Examination  ");
        exam.setForeground(Color.BLUE);
        exam.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(exam);

        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.setFont(new Font("Arial", Font.PLAIN, 24));
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.setFont(new Font("Arial", Font.PLAIN, 24));
        entermarks.addActionListener(this);
        exam.add(entermarks);

        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details  ");
        updateInfo.setForeground(Color.RED);
        updateInfo.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.setFont(new Font("Arial", Font.PLAIN, 24));
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.setFont(new Font("Arial", Font.PLAIN, 24));
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        // fee
        JMenu fee = new JMenu("Fee Details  ");
        fee.setForeground(Color.BLUE);
        fee.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.setFont(new Font("Arial", Font.PLAIN, 24));
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.setFont(new Font("Arial", Font.PLAIN, 24));
        feeform.addActionListener(this);
        fee.add(feeform);

        // Utility
        JMenu utility = new JMenu("Utility  ");
        utility.setForeground(Color.RED);
        utility.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.setFont(new Font("Arial", Font.PLAIN, 24));
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.setFont(new Font("Arial", Font.PLAIN, 24));
        calc.addActionListener(this);
        utility.add(calc);

        // about
        JMenu about = new JMenu("About  ");
        about.setForeground(Color.BLUE);
        about.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.setFont(new Font("Arial", Font.PLAIN, 24));
        ab.addActionListener(this);
        about.add(ab);

        // exit
        JMenu exit = new JMenu("  Exit");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("Arial", Font.BOLD, 24));
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.setFont(new Font("Arial", Font.PLAIN, 24));
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);
        
        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {

            }
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
