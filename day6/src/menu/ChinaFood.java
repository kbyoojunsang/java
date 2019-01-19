package menu;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon; // <- 없을때 자동완성, ctrl + shift + O(영문)

public class ChinaFood extends JFrame {
	/* 공통으로 적용하려면 class 바로 아래에다가 써줘라 */
	int count = 0;
	final int price = 5000; // final 붙은거는 변경 불가
	JLabel lblNewLabel_2;

	private JTextField textField;
	private JTextField textField_1;

	public ChinaFood() {
		getContentPane().setBackground(Color.YELLOW);
		setSize(750, 500);
		setTitle("주문하세요.");

		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JButton button_1 = new JButton("짬뽕");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count + "");
				textField_1.setText(count * price + "");
				// + "" 숫자들 중에 문자열이 하나라도 들어가면, 전체가 문자로 변함

				ImageIcon icon4 = new ImageIcon("C:\\yoojs\\day6\\짬뽕.jpg");
				lblNewLabel_2.setIcon(icon4);

			}
		});

		JButton button = new JButton("짜장면");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count + "");
				textField_1.setText(count * price + "");
				// +"" 숫자들 중에 문자열이 하나라도 들어가면, 전체가 문자로 변함

				ImageIcon icon3 = new ImageIcon("C:\\yoojs\\day6\\짜장면.jpg");
				lblNewLabel_2.setIcon(icon3);

			}
		});

		button.setToolTipText("짜장면 하나가 추가됨");
		button.setForeground(Color.MAGENTA);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		button.setBackground(Color.ORANGE);
		getContentPane().add(button);

		JButton btnNewButton = new JButton("우동");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count + "");
				textField_1.setText(count * price + "");
				// +"" 숫자들 중에 문자열이 하나라도 들어가면, 전체가 문자로 변함

				ImageIcon icon2 = new ImageIcon("C:\\yoojs\\day6\\우동.png");
				lblNewLabel_2.setIcon(icon2);

			}
		});
		btnNewButton.setToolTipText("우동 하나가 추가됨");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.MAGENTA);
		getContentPane().add(btnNewButton);
		button_1.setToolTipText("짬뽕 하나가 추가됨");
		button_1.setForeground(Color.MAGENTA);
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		button_1.setBackground(Color.CYAN);
		getContentPane().add(button_1);

		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setForeground(Color.BLUE);
		getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField.setBackground(Color.WHITE);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("금액");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setForeground(Color.BLUE);
		getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField_1.setBackground(Color.WHITE);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\yoojs\\day6\\중국집.png"));
		getContentPane().add(lblNewLabel_2);

		setVisible(true);

	}

	public static void main(String[] args) {
		ChinaFood china = new ChinaFood(); // 자동호출

	}

}
