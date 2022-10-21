package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.DateController;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main2 extends JFrame {
	private JPanel contentPane;
	
	JLabel sun1;JLabel mon1;JLabel tue1;JLabel wed1;JLabel thu1;JLabel fri1;JLabel sat1;
	JLabel sun2;JLabel mon2;JLabel tue2;JLabel wed2;JLabel thu2;JLabel fri2;JLabel sat2;
	JLabel sun3;JLabel mon3;JLabel tue3;JLabel wed3;JLabel thu3;JLabel fri3;JLabel sat3;
	JLabel sun4;JLabel mon4;JLabel tue4;JLabel wed4;JLabel thu4;JLabel fri4;JLabel sat4;
	JLabel sun5;JLabel mon5;JLabel tue5;JLabel wed5;JLabel thu5;JLabel fri5;JLabel sat5;
	JLabel sun6;JLabel mon6;JLabel tue6;JLabel wed6;JLabel thu6;JLabel fri6;JLabel sat6;
	;
	/**
	 * Launch the application.
	 */
	public List<JLabel> startDate = new ArrayList<JLabel>();
	
	void initList() {
		startDate.add(sun1);
		startDate.add(mon1);
		startDate.add(tue1);
		startDate.add(wed1);
		startDate.add(thu1);
		startDate.add(fri1);
		startDate.add(sat1);
		
		startDate.add(sun2);
		startDate.add(mon2);
		startDate.add(tue2);
		startDate.add(wed2);
		startDate.add(thu2);
		startDate.add(fri2);
		startDate.add(sat2);
		
		startDate.add(sun3);
		startDate.add(mon3);
		startDate.add(tue3);
		startDate.add(wed3);
		startDate.add(thu3);
		startDate.add(fri3);
		startDate.add(sat3);
		
		startDate.add(sun4);
		startDate.add(mon4);
		startDate.add(tue4);
		startDate.add(wed4);
		startDate.add(thu4);
		startDate.add(fri4);
		startDate.add(sat4);
		
		startDate.add(sun5);
		startDate.add(mon5);
		startDate.add(tue5);
		startDate.add(wed5);
		startDate.add(thu5);
		startDate.add(fri5);
		startDate.add(sat5);
		
		startDate.add(sun6);
		startDate.add(mon6);
		startDate.add(tue6);
		startDate.add(wed6);
		startDate.add(thu6);
		startDate.add(fri6);
		startDate.add(sat6);
	}
	
	public Main2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 211, 38, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("R");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JLabel i : startDate) {
					i.setText("");
				}
				setStartDate(1, 10+1, 2022);
			}
		});
		btnNext.setBounds(649, 211, 38, 21);
		contentPane.add(btnNext);
		
		JPanel panel = new JPanel();
		panel.setBounds(58, 51, 581, 417);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(7, 7, 0, 0));
		
		JLabel su = new JLabel("Sun");
		panel.add(su);
		
		JLabel mo = new JLabel("Mon");
		panel.add(mo);
		
		JLabel tu = new JLabel("Tue");
		panel.add(tu);
		
		JLabel we = new JLabel("Wed");
		panel.add(we);
		
		JLabel th = new JLabel("Thu");
		panel.add(th);
		
		JLabel fr = new JLabel("Fri");
		panel.add(fr);
		
		JLabel sa = new JLabel("Sat");
		panel.add(sa);
		
		sun1 = new JLabel("New label");
		panel.add(sun1);
		
		mon1 = new JLabel("New label");
		panel.add(mon1);
		
		tue1 = new JLabel("New label");
		panel.add(tue1);
		
		wed1 = new JLabel("New label");
		panel.add(wed1);
		
		
		thu1 = new JLabel("New label");
		panel.add(thu1);
		
		
		fri1 = new JLabel("New label");
		panel.add(fri1);
		
		sat1 = new JLabel("New label");
		panel.add(sat1);
		
		sun2 = new JLabel("New label");
		panel.add(sun2);
		
		mon2 = new JLabel("New label");
		panel.add(mon2);
		
		tue2 = new JLabel("New label");
		panel.add(tue2);
		
		wed2 = new JLabel("New label");
		panel.add(wed2);
		
		thu2 = new JLabel("New label");
		panel.add(thu2);
		
		fri2 = new JLabel("New label");
		panel.add(fri2);
		
		sat2 = new JLabel("New label");
		panel.add(sat2);
		
		sun3 = new JLabel("New label");
		panel.add(sun3);
		
		
		
		mon3 = new JLabel("New label");
		panel.add(mon3);
		
		
		tue3 = new JLabel("New label");
		panel.add(tue3);
		
		
		wed3 = new JLabel("New label");
		panel.add(wed3);
		
		
		thu3 = new JLabel("New label");
		panel.add(thu3);
		
		
		fri3 = new JLabel("New label");
		panel.add(fri3);
		
		
		sat3 = new JLabel("New label");
		panel.add(sat3);
		
		
		sun4 = new JLabel("New label");
		panel.add(sun4);
		
		mon4 = new JLabel("New label");
		panel.add(mon4);
		
		tue4 = new JLabel("New label");
		panel.add(tue4);
		
		wed4 = new JLabel("New label");
		panel.add(wed4);
		
		thu4 = new JLabel("New label");
		panel.add(thu4);
		
		fri4 = new JLabel("New label");
		panel.add(fri4);
		
		sat4 = new JLabel("New label");
		panel.add(sat4);
		
		sun5 = new JLabel("New label");
		panel.add(sun5);
		
		
		
		mon5 = new JLabel("New label");
		panel.add(mon5);
		
		
		tue5 = new JLabel("New label");
		panel.add(tue5);
		
		
		wed5 = new JLabel("New label");
		panel.add(wed5);
		
		
		thu5 = new JLabel("New label");
		panel.add(thu5);
		
		
		fri5 = new JLabel("New label");
		panel.add(fri5);
		
		
		sat5 = new JLabel("New label");
		panel.add(sat5);
		
		sun6 = new JLabel("New label");
		panel.add(sun6);
		
		mon6 = new JLabel("New label");
		panel.add(mon6);
		
		tue6 = new JLabel("New label");
		panel.add(tue6);
		
		wed6 = new JLabel("New label");
		panel.add(wed6);
		
		thu6 = new JLabel("New label");
		panel.add(thu6);
		
		fri6 = new JLabel("New label");
		panel.add(fri6);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		sat6 = new JLabel("New label");
		panel_1.add(sat6);
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("lich am o day");
		panel_1.add(lblNewLabel);
		
		JLabel lbMonth = new JLabel("New label");
		lbMonth.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lbMonth.setBounds(273, 10, 113, 31);
		contentPane.add(lbMonth);
		initList();
		
		setStartDate(1, 10, 2022);
	}
	
	void setStartDate(int d, int m, int y) {
		
		int current = DateController.DayOfWeekByZeller(d,m,y);
		int numberDaysOfPreviousMonth = DateController.numberDaysOfMonth(m-1,y);
		int numberDaysOfCurrentMonth = DateController.numberDaysOfMonth(m, y);
		for(int i = 0; i < current; i++) {
			startDate.get(i).setText(Integer.toString(numberDaysOfPreviousMonth - current + 1));
			startDate.get(i).setFont(new Font("arial", Font.ITALIC, 12));
			
			numberDaysOfPreviousMonth++;
		}
		int day = 1;
		int i;
		for(i = current; i < current + numberDaysOfCurrentMonth; i++) {
			
			startDate.get(i).setText(Integer.toString(day));
			startDate.get(i).setFont(new Font("arial", Font.BOLD, 12));
			if(day == numberDaysOfCurrentMonth) break;
			day++;
		}
		
		current = DateController.DayOfWeekByZeller(day, m, y); //always point to final date of the month
		
		i++; // jump to first day of the next month by index List<>
		
		int j;
		for(j = 1; j < 7-current; j++) {
			startDate.get(i).setText(Integer.toString(j));
			startDate.get(i).setFont(new Font("arial", Font.ITALIC, 12));
			i++;
			
			
		}
		if(i != 42) {
			while(j != DateController.DayOfWeekByZeller(j, m, y)) {
				startDate.get(i).setText(Integer.toString(j));
				startDate.get(i).setFont(new Font("arial", Font.ITALIC, 12));
				i++;
				j++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 frame = new Main2();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
