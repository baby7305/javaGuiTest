package com.company.javaPanel.form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2018/1/8.
 */
public class GuiTest {
	private JPanel jpanelMain;
	private JButton button1;

	public GuiTest() {
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hello world");
			}
		});
	}

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("GuiTest");
		jFrame.setContentPane(new GuiTest().jpanelMain);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
