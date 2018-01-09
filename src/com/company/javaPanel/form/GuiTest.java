package com.company.javaPanel.form;

import com.company.javaPanel.control.LoginControl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2018/1/8.
 */
public class GuiTest {
	private JPanel jpanelMain;
	private JButton button1;
	private JTextField idTextField;
	private JLabel idLabel;
	private JLabel userLabel;
	private JTextField textField1;

	private LoginControl loginControl;

	public GuiTest() {
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String idString = idTextField.getText();
				int id = 0;
				id = Integer.parseInt(idString);
				String user = textField1.getText();
				LoginControl loginControl = new LoginControl();
				boolean isInGood = loginControl.loginTest1(id, user);
				if (isInGood) {
					JOptionPane.showMessageDialog(null, "Username and password correct");
				} else {
					JOptionPane.showMessageDialog(null, "failed");
				}

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
