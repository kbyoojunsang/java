// 가위 바위 보 프로그램  실행후  연속 클릭 가능함!!! 

package window;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game implements ActionListener {
	// static 은 메모리를 많이 먹는다. 비추!!
	static JButton s, r, p;
	static JFrame f;

	public static void main(String[] args) {

		f = new JFrame();
		f.setTitle("나의 가위바위보");
		f.setSize(500, 2000);

		s = new JButton();
		r = new JButton();
		p = new JButton();

		ImageIcon icon1 = new ImageIcon("s.png");
		ImageIcon icon2 = new ImageIcon("r.png");
		ImageIcon icon3 = new ImageIcon("p.png");

		s.setIcon(icon1);
		r.setIcon(icon2);
		p.setIcon(icon3);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(s);
		f.add(r);
		f.add(p);

		Game game = new Game();
		s.addActionListener(game);
		r.addActionListener(game);
		p.addActionListener(game);

		f.setVisible(true);
	}

	/*
	 * 
	 * public static void main(String[] args) { // action 처리하려 만든애 Game game = new
	 * Game(); }
	 */

	@Override // action 시작하려 만든애
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);
		// 0 : 가위 , 1 : 바위, 2 : 보

		if (e.getSource() == s) { // 내가 가위 낸거
			if (computer == 0) { // 컴퓨터가 가위
				f.setTitle("비겼음");
			}
			if (computer == 1) { // 컴퓨터가 바위
				f.setTitle("컴퓨터 승");
			}
			if (computer == 2) { // 컴퓨터가 보
				f.setTitle("내가 승");
			}
		}

		if (e.getSource() == r) { // 내가 바위 낸거
			if (computer == 0) { // 컴퓨터가 가위
				f.setTitle("컴퓨터 승");
			}
			if (computer == 1) { // 컴퓨터가 바위
				f.setTitle("비겼음");
			}
			if (computer == 2) { // 컴퓨터가 보
				f.setTitle("컴퓨터 승");
			}
		}

		if (e.getSource() == p) { // 내가 보 낸거
			if (computer == 0) { // 컴퓨터가 가위
				f.setTitle("컴퓨터 승");
			}
			if (computer == 1) { // 컴퓨터가 바위
				f.setTitle("내가 승");
			}
			if (computer == 2) { // 컴퓨터가 보
				f.setTitle("비겼음");
			}
		}

	}
}
