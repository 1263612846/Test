package com.test;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TestTimer {
	public static void main(String[] args) {
		ActionListener l = new TimePrinter();

		Timer t = new Timer(1000, l);
		t.start();

		JOptionPane.showMessageDialog(null, "退出程序？");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();
		System.out.println("现在时间：" + now);
		Toolkit.getDefaultToolkit().beep();
	}

}
