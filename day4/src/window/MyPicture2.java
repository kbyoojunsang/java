package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture2 implements ActionListener { // 어떻게 처리하는지는 없다.
	// error 발생시 아래 첫번째꺼 클릭시 아래 자동 문구 세팅됨.
	static JButton b1;
	static JButton b2;
	static JLabel img;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		// 세부적 기능 세팅 : 사이즈, 화면명
		f.setTitle("나의 그래픽 프로그램 창제목"); // f. -> JFrame을 사용 , 스트링은 " " 큰따옴표 사용
		f.setSize(400, 550);
		// 안보이는게 기본값이다!!! 보이게 하는 명령은 맨 끝에 넣는다 f.setVisible(true);

		JLabel l = new JLabel("나의 강아지 ");
		JLabel l2 = new JLabel("사모예드 흰둥이 ");

		img = new JLabel(); // 복사 : ctrl + alt + 아래화살표
		ImageIcon icon = new ImageIcon("dog2.jpg"); // 파일명을 입력 대소문자 구분
		FlowLayout flow = new FlowLayout(); // 물흐르듯이 배치
		f.setLayout(flow);
		img.setIcon(icon);

		b1 = new JButton("다른 강아지로");
		b2 = new JButton("원래강아지로 ");

		f.add(l);
		f.add(img);
		f.add(l2);
		f.add(b1);
		f.add(b2);

		MyPicture2 pic = new MyPicture2();
		// 반응처리 할것을 세팅
		b1.addActionListener(pic);
		b2.addActionListener(pic);

		// 안보이는게 기본값이다!!! 보이게 하는 명령은 맨 끝에 넣는다 f.setVisible(true);
		f.setVisible(true);
	}

	@Override // method를 재정의
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			ImageIcon icon2 = new ImageIcon("dog3.jpg");
			img.setIcon(icon2);

		}
		if (e.getSource() == b2) {

		}
	}
}