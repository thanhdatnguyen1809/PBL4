package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.DateController;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import javax.swing.JButton;

public class Calendar implements ActionListener {

	private JFrame frame;
	public List<JLabel> startDate = new ArrayList<JLabel>();
	public List<JLabel> startLunar = new ArrayList<JLabel>();
	private JButton btnLeft,btnRight;
	private JLabel lblMonth;
	private int month = 1;
	private int year = 2022;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar window = new Calendar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calendar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(816, 536);
		frame.setTitle("My Calendar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblMonth = new JLabel("Tháng 1");
		lblMonth.setForeground(Color.RED);
		lblMonth.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblMonth.setBounds(290, 10, 384, 26);
		frame.getContentPane().add(lblMonth);

		JPanel panel = new JPanel();
		panel.setBounds(100, 50, 581, 417);
		frame.getContentPane().add(panel);
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

		JLabel sun1 = new JLabel("New label");
		panel.add(sun1);

		JLabel mon1 = new JLabel("New label");
		panel.add(mon1);

		JLabel tue1 = new JLabel("New label");
		panel.add(tue1);

		JLabel wed1 = new JLabel("New label");
		panel.add(wed1);

		JLabel thu1 = new JLabel("New label");
		panel.add(thu1);

		JLabel fri1 = new JLabel("New label");
		panel.add(fri1);

		JLabel sat1 = new JLabel("New label");
		panel.add(sat1);

		JLabel sun2 = new JLabel("New label");
		panel.add(sun2);

		JLabel mon2 = new JLabel("New label");
		panel.add(mon2);

		JLabel tue2 = new JLabel("New label");
		panel.add(tue2);

		JLabel wed2 = new JLabel("New label");
		panel.add(wed2);

		JLabel thu2 = new JLabel("New label");
		panel.add(thu2);

		JLabel fri2 = new JLabel("New label");
		panel.add(fri2);

		JLabel sat2 = new JLabel("New label");
		panel.add(sat2);

		JLabel sun3 = new JLabel("New label");
		panel.add(sun3);

		JLabel mon3 = new JLabel("New label");
		panel.add(mon3);

		JLabel tue3 = new JLabel("New label");
		panel.add(tue3);

		JLabel wed3 = new JLabel("New label");
		panel.add(wed3);

		JLabel thu3 = new JLabel("New label");
		panel.add(thu3);

		JLabel fri3 = new JLabel("New label");
		panel.add(fri3);

		JLabel sat3 = new JLabel("New label");
		panel.add(sat3);

		JLabel sun4 = new JLabel("New label");
		panel.add(sun4);

		JLabel mon4 = new JLabel("New label");
		panel.add(mon4);

		JLabel tue4 = new JLabel("New label");
		panel.add(tue4);

		JLabel wed4 = new JLabel("New label");
		panel.add(wed4);

		JLabel thu4 = new JLabel("New label");
		panel.add(thu4);

		JLabel fri4 = new JLabel("New label");
		panel.add(fri4);

		JLabel sat4 = new JLabel("New label");
		panel.add(sat4);

		JLabel sun5 = new JLabel("New label");
		panel.add(sun5);

		JLabel mon5 = new JLabel("New label");
		panel.add(mon5);

		JLabel tue5 = new JLabel("New label");
		panel.add(tue5);

		JLabel wed5 = new JLabel("New label");
		panel.add(wed5);

		JLabel thu5 = new JLabel("New label");
		panel.add(thu5);

		JLabel fri5 = new JLabel("New label");
		panel.add(fri5);

		JLabel sat5 = new JLabel("New label");
		panel.add(sat5);

		JLabel sun6 = new JLabel("New label");
		panel.add(sun6);

		JLabel mon6 = new JLabel("New label");
		panel.add(mon6);

		JLabel tue6 = new JLabel("New label");
		panel.add(tue6);

		JLabel wed6 = new JLabel("New label");
		panel.add(wed6);

		JLabel thu6 = new JLabel("New label");
		panel.add(thu6);

		JLabel fri6 = new JLabel("New label");
		panel.add(fri6);

		JLabel sat6 = new JLabel("New label");
		panel.add(sat6);

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

		

		btnLeft = new JButton("<<");
		btnLeft.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnLeft.setBounds(5, 238, 85, 50);
		btnLeft.addActionListener(this);
		frame.getContentPane().add(btnLeft);
		

		btnRight = new JButton(">>");
		btnRight.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnRight.setBounds(695, 238, 85, 50);
		btnRight.addActionListener(this);
		frame.getContentPane().add(btnRight);
		frame.setLocationRelativeTo(null);

		btnLeft.setEnabled(false);
		setStartDate(1, month, year);
	}
	void setStartDate(int d, int m, int y) {

		int current = DateController.DayOfWeekByZeller(d, m, y);
		int numberDaysOfPreviousMonth = DateController.numberDaysOfMonth(m - 1, y);
		int numberDaysOfCurrentMonth = DateController.numberDaysOfMonth(m, y);
		for (int i = 0; i < current; i++) {
			startDate.get(i).setText(Integer.toString(numberDaysOfPreviousMonth - current + 1));
			startDate.get(i).setFont(new Font("arial", Font.ITALIC, 12));

			numberDaysOfPreviousMonth++;
		}
		int day = 1;
		int i;
		for (i = current; i < current + numberDaysOfCurrentMonth; i++) {

			startDate.get(i).setText(Integer.toString(day));
			startDate.get(i).setFont(new Font("arial", Font.BOLD, 12));
			if (day == numberDaysOfCurrentMonth)
				break;
			day++;
		}

		current = DateController.DayOfWeekByZeller(day, m, y); // always point to final date of the month

		i++; // jump to first day of the next month by index List<>

		int j;
		for (j = 1; j < 7 - current; j++) {
			startDate.get(i).setText(Integer.toString(j));
			startDate.get(i).setFont(new Font("arial", Font.ITALIC, 12));
			i++;

		}
		if (i != 42) {
			while (j != DateController.DayOfWeekByZeller(j, m, y)) {
				startDate.get(i).setText(Integer.toString(j));
				startDate.get(i).setFont(new Font("arial", Font.ITALIC, 12));
				i++;
				j++;
			}
		}

	}
	void setEnableButton() {
		if(month == 1) {
			btnLeft.setEnabled(false);
		}else if (month > 1) {
			btnLeft.setEnabled(true);
		}
		
		if (month == 12) {
			btnRight.setEnabled(false);
		}else if(month < 12) {
			btnRight.setEnabled(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLeft) {
			month--;
		}
		if(e.getSource() == btnRight) {
			month++;
		}
		setEnableButton();
		lblMonth.setText("Tháng "+month);
		setStartDate(1, month, year);
	}
}
