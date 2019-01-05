package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAge {
	JFrame f; // 선언!(사용할수 있는 범위를 선언함. 메모리 준비시킴. 맨위에서 하는게 좋다) jf 누르고 컨트롤 스페이스바 -> 엔터
	JLabel top, name, year, age, result;
	JButton confirm;
	JTextField n, y, a;

	public MyAge() {
		f = new JFrame();
		f.setSize(280, 200);
		top = new JLabel("<<<<<<<성인인증 프로그램입니다.>>>>>>>");
		name = new JLabel("이름");
		year = new JLabel("생년");
		age = new JLabel("나이");
		result = new JLabel();
		confirm = new JButton("인증");
		n = new JTextField(20); // 20글자까지 입력가능
		y = new JTextField(20);
		a = new JTextField(20);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(top);
		f.add(name);
		f.add(n);
		f.add(year);
		f.add(y);
		f.add(age);
		f.add(a);
		f.add(confirm);
		f.add(result);

		result.setForeground(Color.blue);
		top.setForeground(Color.BLUE);
		confirm.setForeground(Color.GREEN);
		confirm.setBackground(Color.yellow);

		// 이벤트 처리
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = n.getText();

				String year = y.getText();
				int yearInt = Integer.parseInt(year); // parse : 분석하다. parseInt : 분석해서 int 값으로 바꿔줌.

				int age = 2019 - yearInt + 1;
				a.setText(age + "");

				if (age >= 19) {
					result.setText(name + "님은 성인");
				} else {
					result.setText(name + "님은 미성인");
				}
			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {
		MyAge age = new MyAge(); // myage 본인을 복사한것임. 위에 myage 있음.
	}
}
