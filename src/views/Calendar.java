package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.DateController;
import controller.LichAm;

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
	private int year = 2024;JLabel wed1;
	private JLabel lwed1;
private JPanel panel_2;
private JLabel ltue1;
private JLabel tue1;
private JPanel panel_3;
private JLabel lmon1;
private JLabel mon1;
private JPanel panel_4;
private JLabel lsun1;
private JLabel sun1;
private JPanel panel_5;
private JLabel thu1;
private JLabel lthu1;
private JPanel panel_6;
private JLabel fri1;
private JLabel lfri1;
private JPanel panel_7;
private JLabel sat1;
private JLabel lsat1;
private JPanel panel_8;
private JLabel sun2;
private JLabel lsun2;
private JPanel panel_9;
private JLabel mon2;
private JLabel lmon2;
private JPanel panel_10;
private JLabel wed2;
private JLabel lwed2;
private JPanel panel_11;
private JLabel thu2;
private JLabel lthu2;
private JPanel panel_12;
private JLabel tue2;
private JLabel ltue2;
private JPanel panel_13;
private JLabel fri2;
private JLabel lfri2;
private JPanel panel_14;
private JLabel sat2;
private JLabel lsat2;
private JPanel panel_15;
private JLabel sun3;
private JLabel lsun3;
private JPanel panel_16;
private JLabel mon3;
private JLabel lmon3;
private JPanel panel_17;
private JLabel tue3;
private JLabel ltue3;
private JPanel panel_18;
private JLabel wed3;
private JLabel lwed3;
private JPanel panel_19;
private JLabel thu3;
private JLabel lthu3;
private JPanel panel_20;
private JLabel tue5;
private JLabel ltue5;
private JPanel panel_21;
private JLabel wed5;
private JLabel lwed5;
private JPanel panel_22;
private JLabel thu5;
private JLabel lthu5;
private JPanel panel_23;
private JLabel fri5;
private JLabel lfri5;
private JPanel panel_24;
private JLabel sat5;
private JLabel lsat5;
private JPanel panel_25;
private JLabel sun6;
private JLabel lsun6;
private JPanel panel_26;
private JLabel mon6;
private JLabel lmon6;
private JPanel panel_27;
private JLabel fri6;
private JLabel lfri6;
private JPanel panel_28;
private JLabel sat6;
private JLabel lsat6;
private JPanel panel_29;
private JLabel tue6;
private JLabel ltue6;
private JPanel panel_30;
private JLabel thu6;
private JLabel lthu6;
private JPanel panel_31;
private JLabel wed6;
private JLabel lwed6;
private JPanel panel_32;
private JLabel mon5;
private JLabel lmon5;
private JPanel panel_33;
private JLabel sun5;
private JLabel lsun5;
private JPanel panel_34;
private JLabel sat4;
private JLabel lsat4;
private JPanel panel_35;
private JLabel fri4;
private JLabel lfri4;
private JPanel panel_36;
private JLabel thu4;
private JLabel lthu4;
private JPanel panel_37;
private JLabel wed4;
private JLabel lwed4;
private JPanel panel_38;
private JLabel tue4;
private JLabel ltue4;
private JPanel panel_39;
private JLabel mon4;
private JLabel lmon4;
private JPanel panel_40;
private JLabel sun4;
private JLabel lsun4;
private JPanel panel_41;
private JLabel sat3;
private JLabel lsat3;
private JPanel panel_42;
private JLabel fri3;
private JLabel lfri3;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar window = new Calendar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
	
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

	void initLunarList() {
		startLunar.add(lsun1);
		startLunar.add(lmon1);
		startLunar.add(ltue1);
		startLunar.add(lwed1);
		startLunar.add(lthu1);
		startLunar.add(lfri1);
		startLunar.add(lsat1);

		startLunar.add(lsun2);
		startLunar.add(lmon2);
		startLunar.add(ltue2);
		startLunar.add(lwed2);
		startLunar.add(lthu2);
		startLunar.add(lfri2);
		startLunar.add(lsat2);

		startLunar.add(lsun3);
		startLunar.add(lmon3);
		startLunar.add(ltue3);
		startLunar.add(lwed3);
		startLunar.add(lthu3);
		startLunar.add(lfri3);
		startLunar.add(lsat3);

		
		startLunar.add(lsun4);
		startLunar.add(lmon4);
		startLunar.add(ltue4);
		startLunar.add(lwed4);
		startLunar.add(lthu4);
		startLunar.add(lfri4);
		startLunar.add(lsat4);

		startLunar.add(lsun5);
		startLunar.add(lmon5);
		startLunar.add(ltue5);
		startLunar.add(lwed5);
		startLunar.add(lthu5);
		startLunar.add(lfri5);
		startLunar.add(lsat5);

		startLunar.add(lsun6);
		startLunar.add(lmon6);
		startLunar.add(ltue6);
		startLunar.add(lwed6);
		startLunar.add(lthu6);
		startLunar.add(lfri6);
		startLunar.add(lsat6);
	}

	
	public Calendar() {
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
		
		panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 0, 0, 0));
		
		sun1 = new JLabel("sun1");
		panel_4.add(sun1);
		
		lsun1 = new JLabel("lsun1");
		panel_4.add(lsun1);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 0, 0, 0));
		
		mon1 = new JLabel("mon1");
		panel_3.add(mon1);
		
		lmon1 = new JLabel("lmon1");
		panel_3.add(lmon1);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		tue1 = new JLabel("tue1");
		panel_2.add(tue1);
		
		ltue1 = new JLabel("ltue1");
		panel_2.add(ltue1);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		wed1 = new JLabel("wed1");
		panel_1.add(wed1);
		
		lwed1 = new JLabel("lwed1");
		panel_1.add(lwed1);
		
		panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 0, 0, 0));
		
		thu1 = new JLabel("thu1");
		panel_5.add(thu1);
		
		lthu1 = new JLabel("lthu1");
		panel_5.add(lthu1);
		
		panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(2, 0, 0, 0));
		
		fri1 = new JLabel("fri1");
		panel_6.add(fri1);
		
		lfri1 = new JLabel("lfri1");
		panel_6.add(lfri1);
		
		panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 0, 0, 0));
		
		sat1 = new JLabel("sat1");
		panel_7.add(sat1);
		
		lsat1 = new JLabel("lsat1");
		panel_7.add(lsat1);
		
		panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 0, 0, 0));
		
		sun2 = new JLabel("sun2");
		panel_8.add(sun2);
		
		lsun2 = new JLabel("lsun2");
		panel_8.add(lsun2);
		
		panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new GridLayout(2, 0, 0, 0));
		
		mon2 = new JLabel("mon2");
		panel_9.add(mon2);
		
		lmon2 = new JLabel("lmon2");
		panel_9.add(lmon2);
		
		panel_12 = new JPanel();
		panel.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));
		
		tue2 = new JLabel("tue2");
		panel_12.add(tue2);
		
		ltue2 = new JLabel("ltue2");
		panel_12.add(ltue2);
		
		panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new GridLayout(2, 0, 0, 0));
		
		wed2 = new JLabel("wed2");
		panel_10.add(wed2);
		
		lwed2 = new JLabel("lwed2");
		panel_10.add(lwed2);
		
		panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(new GridLayout(2, 0, 0, 0));
		
		thu2 = new JLabel("thu2");
		panel_11.add(thu2);
		
		lthu2 = new JLabel("lthu2");
		panel_11.add(lthu2);
		
		panel_13 = new JPanel();
		panel.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 0, 0, 0));
		
		fri2 = new JLabel("fri2");
		panel_13.add(fri2);
		
		lfri2 = new JLabel("lfri2");
		panel_13.add(lfri2);
		
		panel_14 = new JPanel();
		panel.add(panel_14);
		panel_14.setLayout(new GridLayout(2, 0, 0, 0));
		
		sat2 = new JLabel("sat2");
		panel_14.add(sat2);
		
		lsat2 = new JLabel("lsat2");
		panel_14.add(lsat2);
		
		panel_15 = new JPanel();
		panel.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 0, 0, 0));
		
		sun3 = new JLabel("sun3");
		panel_15.add(sun3);
		
		lsun3 = new JLabel("lsun3");
		panel_15.add(lsun3);
		
		panel_16 = new JPanel();
		panel.add(panel_16);
		panel_16.setLayout(new GridLayout(2, 0, 0, 0));
		
		mon3 = new JLabel("mon3");
		panel_16.add(mon3);
		
		lmon3 = new JLabel("lmon3");
		panel_16.add(lmon3);
		
		panel_17 = new JPanel();
		panel.add(panel_17);
		panel_17.setLayout(new GridLayout(2, 0, 0, 0));
		
		tue3 = new JLabel("tue3");
		panel_17.add(tue3);
		
		ltue3 = new JLabel("ltue3");
		panel_17.add(ltue3);
		
		panel_18 = new JPanel();
		panel.add(panel_18);
		panel_18.setLayout(new GridLayout(2, 0, 0, 0));
		
		wed3 = new JLabel("wed3");
		panel_18.add(wed3);
		
		lwed3 = new JLabel("lwed3");
		panel_18.add(lwed3);
		
		panel_19 = new JPanel();
		panel.add(panel_19);
		panel_19.setLayout(new GridLayout(2, 0, 0, 0));
		
		thu3 = new JLabel("thu3");
		panel_19.add(thu3);
		
		lthu3 = new JLabel("lthu3");
		panel_19.add(lthu3);
		
		panel_42 = new JPanel();
		panel.add(panel_42);
		panel_42.setLayout(new GridLayout(2, 0, 0, 0));
		
		fri3 = new JLabel("fri3");
		panel_42.add(fri3);
		
		lfri3 = new JLabel("lfri3");
		panel_42.add(lfri3);
		
		panel_41 = new JPanel();
		panel.add(panel_41);
		panel_41.setLayout(new GridLayout(2, 0, 0, 0));
		
		sat3 = new JLabel("sat3");
		panel_41.add(sat3);
		
		lsat3 = new JLabel("lsat3");
		panel_41.add(lsat3);
		
		panel_40 = new JPanel();
		panel.add(panel_40);
		panel_40.setLayout(new GridLayout(2, 0, 0, 0));
		
		sun4 = new JLabel("sun4");
		panel_40.add(sun4);
		
		lsun4 = new JLabel("lsun4");
		panel_40.add(lsun4);
		
		panel_39 = new JPanel();
		panel.add(panel_39);
		panel_39.setLayout(new GridLayout(2, 0, 0, 0));
		
		mon4 = new JLabel("mon4");
		panel_39.add(mon4);
		
		lmon4 = new JLabel("lmon4");
		panel_39.add(lmon4);
		
		panel_38 = new JPanel();
		panel.add(panel_38);
		panel_38.setLayout(new GridLayout(2, 0, 0, 0));
		
		tue4 = new JLabel("tue4");
		panel_38.add(tue4);
		
		ltue4 = new JLabel("ltue4");
		panel_38.add(ltue4);
		
		panel_37 = new JPanel();
		panel.add(panel_37);
		panel_37.setLayout(new GridLayout(2, 0, 0, 0));
		
		wed4 = new JLabel("wed4");
		panel_37.add(wed4);
		
		lwed4 = new JLabel("lwed4");
		panel_37.add(lwed4);
		
		panel_36 = new JPanel();
		panel.add(panel_36);
		panel_36.setLayout(new GridLayout(2, 0, 0, 0));
		
		thu4 = new JLabel("thu4");
		panel_36.add(thu4);
		
		lthu4 = new JLabel("lthu4");
		panel_36.add(lthu4);
		
		panel_35 = new JPanel();
		panel.add(panel_35);
		panel_35.setLayout(new GridLayout(2, 0, 0, 0));
		
		fri4 = new JLabel("fri4");
		panel_35.add(fri4);
		
		lfri4 = new JLabel("lfri4");
		panel_35.add(lfri4);
		
		panel_34 = new JPanel();
		panel.add(panel_34);
		panel_34.setLayout(new GridLayout(2, 0, 0, 0));
		
		sat4 = new JLabel("sat4");
		panel_34.add(sat4);
		
		lsat4 = new JLabel("lsat4");
		panel_34.add(lsat4);
		
		panel_33 = new JPanel();
		panel.add(panel_33);
		panel_33.setLayout(new GridLayout(2, 0, 0, 0));
		
		sun5 = new JLabel("sun5");
		panel_33.add(sun5);
		
		lsun5 = new JLabel("lsun5");
		panel_33.add(lsun5);
		
		panel_32 = new JPanel();
		panel.add(panel_32);
		panel_32.setLayout(new GridLayout(2, 0, 0, 0));
		
		mon5 = new JLabel("mon5");
		panel_32.add(mon5);
		
		lmon5 = new JLabel("lmon5");
		panel_32.add(lmon5);
		
		panel_20 = new JPanel();
		panel.add(panel_20);
		panel_20.setLayout(new GridLayout(2, 0, 0, 0));
		
		tue5 = new JLabel("tue5");
		panel_20.add(tue5);
		
		ltue5 = new JLabel("ltue5");
		panel_20.add(ltue5);
		
		panel_21 = new JPanel();
		panel.add(panel_21);
		panel_21.setLayout(new GridLayout(2, 0, 0, 0));
		
		wed5 = new JLabel("wed5");
		panel_21.add(wed5);
		
		lwed5 = new JLabel("lwed5");
		panel_21.add(lwed5);
		
		panel_22 = new JPanel();
		panel.add(panel_22);
		panel_22.setLayout(new GridLayout(2, 0, 0, 0));
		
		thu5 = new JLabel("thu5");
		panel_22.add(thu5);
		
		lthu5 = new JLabel("lthu5");
		panel_22.add(lthu5);
		
		panel_23 = new JPanel();
		panel.add(panel_23);
		panel_23.setLayout(new GridLayout(2, 0, 0, 0));
		
		fri5 = new JLabel("fri5");
		panel_23.add(fri5);
		
		lfri5 = new JLabel("lfri5");
		panel_23.add(lfri5);
		
		panel_24 = new JPanel();
		panel.add(panel_24);
		panel_24.setLayout(new GridLayout(2, 0, 0, 0));
		
		sat5 = new JLabel("sat5");
		panel_24.add(sat5);
		
		lsat5 = new JLabel("lsat5");
		panel_24.add(lsat5);
		
		panel_25 = new JPanel();
		panel.add(panel_25);
		panel_25.setLayout(new GridLayout(2, 0, 0, 0));
		
		sun6 = new JLabel("sun6");
		panel_25.add(sun6);
		
		lsun6 = new JLabel("lsun6");
		panel_25.add(lsun6);
		
		panel_26 = new JPanel();
		panel.add(panel_26);
		panel_26.setLayout(new GridLayout(2, 0, 0, 0));
		
		mon6 = new JLabel("mon6");
		panel_26.add(mon6);
		
		lmon6 = new JLabel("lmon6");
		panel_26.add(lmon6);
		
		panel_29 = new JPanel();
		panel.add(panel_29);
		panel_29.setLayout(new GridLayout(2, 0, 0, 0));
		
		tue6 = new JLabel("tue6");
		panel_29.add(tue6);
		
		ltue6 = new JLabel("ltue6");
		panel_29.add(ltue6);
		
		panel_31 = new JPanel();
		panel.add(panel_31);
		panel_31.setLayout(new GridLayout(2, 0, 0, 0));
		
		wed6 = new JLabel("wed6");
		panel_31.add(wed6);
		
		lwed6 = new JLabel("lwed6");
		panel_31.add(lwed6);
		
		panel_30 = new JPanel();
		panel.add(panel_30);
		panel_30.setLayout(new GridLayout(2, 0, 0, 0));
		
		thu6 = new JLabel("thu6");
		panel_30.add(thu6);
		
		lthu6 = new JLabel("lthu6");
		panel_30.add(lthu6);
		
		panel_27 = new JPanel();
		panel.add(panel_27);
		panel_27.setLayout(new GridLayout(2, 0, 0, 0));
		
		fri6 = new JLabel("fri6");
		panel_27.add(fri6);
		
		lfri6 = new JLabel("lfri6");
		panel_27.add(lfri6);
		
		panel_28 = new JPanel();
		panel.add(panel_28);
		panel_28.setLayout(new GridLayout(2, 0, 0, 0));
		
		sat6 = new JLabel("sat6");
		panel_28.add(sat6);
		
		lsat6 = new JLabel("lsat6");
		panel_28.add(lsat6);
		
		
		

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
		initList();
		initLunarList();
		setStartDate(1, month, year);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	void setStartDate(int d, int m, int y) {

		int current = DateController.DayOfWeekByZeller(d, m, y);
		int numberDaysOfPreviousMonth = DateController.numberDaysOfMonth(m - 1, y);
		int numberDaysOfCurrentMonth = DateController.numberDaysOfMonth(m, y);
		for (int i = 0; i < current; i++) {
			int ngayDuong = numberDaysOfPreviousMonth - current + 1;
			
			startDate.get(i).setText(Integer.toString(ngayDuong));
			startDate.get(i).setFont(new Font("arial", Font.ITALIC, 16));
			
			String ngayAm = LichAm.convertSolar2Lunar(ngayDuong, m-1, y);
			
			
			
			if(i == 0 || ngayAm.equals(1)) {
				startLunar.get(i).setText(ngayAm + "/" +  (m == 1 ? 12 : (m-1)));
				startLunar.get(i).setFont(new Font("arial", Font.ITALIC, 10));
				numberDaysOfPreviousMonth++;
				continue;
			}
			startLunar.get(i).setText(ngayAm);
			startLunar.get(i).setFont(new Font("arial", Font.ITALIC, 10));
			
			numberDaysOfPreviousMonth++;
		}
		int day = 1;
		int i;
		System.out.println(numberDaysOfCurrentMonth);
		for (i = current; i < current + numberDaysOfCurrentMonth; i++) {
			
			
			startDate.get(i).setText(Integer.toString(day));
			startDate.get(i).setFont(new Font("arial", Font.BOLD, 16));
			
			String ngayAm = LichAm.convertSolar2Lunar(day, m, y);
			
			if(i == 0 || ngayAm.equals(1)) {
				startLunar.get(i).setText(ngayAm + "/" + (m == 1 ? 12 : (m-1)));
				startLunar.get(i).setFont(new Font("arial", Font.ITALIC, 10));
				day++;
				
				continue;
			}
			
			startLunar.get(i).setText(ngayAm);
			startLunar.get(i).setFont(new Font("arial", Font.PLAIN, 10));
			day++;
			if (day == numberDaysOfCurrentMonth+1)
				break;
			
		}

		current = DateController.DayOfWeekByZeller(day, m, y); // always point to final date of the month

		i++; // jump to first day of the next month by index List<>

		int j;
		for (j = 1; j < 7 - current; j++) {
			
			startDate.get(i).setText(Integer.toString(j));
			startDate.get(i).setFont(new Font("arial", Font.ITALIC, 16));
			
			String ngayAm = LichAm.convertSolar2Lunar(j, m+1, y);
			startLunar.get(i).setText(ngayAm);
			startLunar.get(i).setFont(new Font("arial", Font.PLAIN, 10));
			
			i++;

		}
		if (i != 42) { //dong cuoi
			while (j != DateController.DayOfWeekByZeller(j, m, y)) {
				startDate.get(i).setText(Integer.toString(j));
				startDate.get(i).setFont(new Font("arial", Font.ITALIC, 16));
				
				String ngayAm = LichAm.convertSolar2Lunar(j, m+1, y);
				startLunar.get(i).setText(ngayAm);
				startLunar.get(i).setFont(new Font("arial", Font.PLAIN, 10));
				i++;
				j++;
				if(i == 42) break;
			}
		}

	}
	
	void setLunarDate(int m, int y) {
		int i = 0;
		for(JLabel label : startDate) {
			String ngayAm = LichAm.convertSolar2Lunar(Integer.parseInt(label.getText()), m, y);
			System.out.println("OK1");
			if(label.getFont() == new Font("arial", Font.ITALIC, 16)) {
				System.out.println("OK");
			}
			startLunar.get(i).setText(ngayAm);
			i++;
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
		//setLunarDate(month, year);
	}
}
