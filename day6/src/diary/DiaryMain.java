package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
// 로그인 하는 프로그램 만들기
public class DiaryMain extends JFrame {
	private JTextField id;
	private JTextField pw;

	public DiaryMain() {
		getContentPane().setBackground(Color.GREEN);
		// ctrl + shift + F : 자동 줄 정리 사용
		setTitle("나의 일기장 시작화면");
		setSize(484, 800);

		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);/* 어떤것을 붙이든 순서대로 붙는다 */

		ImageIcon main = new ImageIcon("일기장메인.JPG");
		lblNewLabel.setIcon(main);

		JLabel label = new JLabel("아이디 : ");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		label.setForeground(Color.MAGENTA);
		label.setBackground(Color.YELLOW);
		getContentPane().add(label);

		id = new JTextField();
		id.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		getContentPane().add(id);
		id.setColumns(20);

		JLabel label_1 = new JLabel("패스워드 : ");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		label_1.setForeground(Color.MAGENTA);
		getContentPane().add(label_1);

		pw = new JTextField();
		pw.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(pw);
		pw.setColumns(20);

		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sId = "root";
				String sPw = "1234"; // root, 1234 이면 오케이
				String gId = id.getText();
				String gPw = pw.getText();

				if ((sId.equals(gId)) && (sPw.equals(gPw))) { 
					// 조건 2개이므로, ()두개, 그 사이에 && 추가
					JOptionPane.showMessageDialog(null, "로그인 ok 입니다.");
					// 조그마한 창을 띄워줌.
					
					MyDiary my = new MyDiary();
										
				} else {
					JOptionPane.showMessageDialog(null, "로그인 not 입니다. 재입력해주세요.");
					// 조그마한 창을 띄워줌.
				}

			}
		});
		login.setFont(new Font("맑은 고딕", Font.BOLD, 33));
		getContentPane().add(login);

		JButton reset = new JButton("초기화");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText(""); // 공백으로 만듬
				pw.setText(""); // 공백으로 만듬
			}
		});
		reset.setFont(new Font("맑은 고딕", Font.BOLD, 33));
		getContentPane().add(reset);

		setVisible(true);
	}

	public static void main(String[] args) {
		DiaryMain name = new DiaryMain();
	}
}
