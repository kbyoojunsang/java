package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyCalculator implements ActionListener {
	// im 치고, ctrl + space bar 치면 implements 자동생성됨.
	// actionlistener -> 오류가 생겨있는 my claculator 커서 갖다대고 첫번째꺼 클릭 아래 자동완성

	static JLabel l1, l2, result;  // static은 전체가 공통으로 사용시 선언함! 글로벌함! 사용할수 있는 범위다.
	static JTextField t1, t2;
	static JButton plus, minus, mul, div;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 계산기");
		f.setSize(250, 380);

		l1 = new JLabel("숫자1>> ");
		l2 = new JLabel("숫자2>> ");
		result = new JLabel("X");
		Font font = new Font("견고딕", Font.BOLD, 150);
		                   // 글꼴,     효과,   글자크기
		result.setFont(font);

		t1 = new JTextField(15); // 15 -> 15자리까지 입력칸 생성
		t2 = new JTextField(15);

		// 글자색과 배경색 세팅 방법
		t1.setForeground(Color.RED);  // foreground 글자색
		t1.setBackground(Color.ORANGE);  // background 배경색

		plus = new JButton("<<<<<더하기>>>>>");
		minus = new JButton("<<<<<빼기>>>>>");
		mul= new JButton("<<<<<곱하기>>>>>");
		div = new JButton("<<<<<나누기>>>>>");

		plus.setForeground(Color.BLUE);
		plus.setBackground(Color.YELLOW);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(mul);
		f.add(div);
		f.add(result);
		
		MyCalculator cal = new MyCalculator();
		plus.addActionListener(cal);
		minus.addActionListener(cal);
		mul.addActionListener(cal);
		div.addActionListener(cal);

		f.setVisible(true);
	}

	@Override // 덮어쓰기 overwrite 개념
	public void actionPerformed(ActionEvent e) {
		String n1 = t1.getText(); // String 모든 프로그램의 입출력은 스트링이다.
		/* System.out.println("입력한 숫자1은 " + n1 ); // 연결해서 쓸때는 + 사용 */
		String n2 = t2.getText();
		int num1 = Integer.parseInt(n1); // int형으로 변환
		int num2 = Integer.parseInt(n2); // int형으로 변환

		if (e.getSource() == plus) {
			// System.out.println("두 숫자의 합은 " + (num1 + num2)); // (num1 + num2) 소괄호를 통해 합계를 표현
			result.setText(num1 + num2 + "");  // int + string -> string
											// num1, num2 는 int형인데,    "" 스트링이 들어오면 된다.
		}
		if (e.getSource() == minus) {
			// System.out.println("두 숫자의 차는 " + (num1 - num2));
			result.setText(num1 - num2 + "");  // int + string -> string
		}
		if (e.getSource() == mul) {
			// System.out.println("두 숫자의 곱은 " + (num1 * num2));
			result.setText(num1 * num2 + "");  // int + string -> string
		}
		if (e.getSource() == div) {
			// System.out.println("두 숫자의 나눗셈은 " + (num1 / num2));
			result.setText(num1 / num2 + "");  // int + string -> string
		}
	}
}
