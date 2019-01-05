package window2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {

	JFrame f;
	JLabel top, count;
	JButton b1, b2, b3;
	JTextField total;
	int sum = 0;
	int combo = 0;
	int potato = 0;
	int bulgoki = 0;

	JTextArea list;

	public Pizza() {
		// 1. 부품 복사(객체 생성)
		f = new JFrame();
		top = new JLabel("<<<<<자바 피자에 오신 것을 환영합니다. 반갑습니다.>>>>>");
		f.setSize(400, 200);
		count = new JLabel("개수");
		b1 = new JButton("콤보피자");
		b2 = new JButton("포테이토피자");
		b3 = new JButton("불고기피자");
		total = new JTextField(20); // 20글자까지 사용

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		list = new JTextArea(3, 30); // ( 가로행 , 세로열)

		f.add(top);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(total);
		f.add(list);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// b1 을 눌렀을때 할 작업을 써준다.
				sum++;
				total.setText(sum + "");
				combo++;

				list.setText("콤보 수량: " + combo + "개\n" + "포테이토 수량: " + potato + "개\n" + "불고기 수량: " + bulgoki + "개\n");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sum++;
				total.setText(sum + "");
				potato++;
				list.setText("콤보 수량: " + combo + "개\n" + "포테이토 수량: " + potato + "개\n" + "불고기 수량: " + bulgoki + "개\n");
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sum++;
				total.setText(sum + "");
				bulgoki++;
				list.setText("콤보 수량: " + combo + "개\n" // \n : 줄바꿈 엔터의 개념이다
						+ "포테이토 수량: " + potato + "개\n" + "불고기 수량: " + bulgoki + "개\n");
			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {
		Pizza p = new Pizza();

	}

}
