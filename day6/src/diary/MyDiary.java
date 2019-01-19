package diary;

import javax.annotation.processing.Filer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MyDiary extends JFrame {
	private JTextField noText;
	private JTextField titleText;

	public MyDiary() {
		getContentPane().setBackground(Color.GREEN);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);/* 어떤것을 붙이든 순서대로 붙는다 */

		ImageIcon main = new ImageIcon("일기장위.JPG");
		lblNewLabel.setIcon(main);

		JLabel No = new JLabel("번호");
		getContentPane().add(No);

		noText = new JTextField();
		getContentPane().add(noText);
		noText.setColumns(18);

		JLabel TitleText = new JLabel("제목");
		getContentPane().add(TitleText);

		titleText = new JTextField();
		titleText.setColumns(18);
		getContentPane().add(titleText);

		JLabel label = new JLabel("내용");
		getContentPane().add(label);

		JTextArea contentText = new JTextArea();
		contentText.setColumns(18);
		contentText.setRows(5);
		getContentPane().add(contentText);

		JButton save = new JButton("일기저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();

				try {

					// 크롤링 예시
					// 인터넷 주소의 모든 정보를 긁어옴.
					// URL url = new URL("http://www.kb.com");

					// IPAddress("210.125.88.7");
					// IP에 대한 정보

					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					f.write(noT + "\r\n"); // 역슬러쉬 (원화기호) "\r\n" 은 엔터의 기능임.
					f.write(titleT + "\r\n");
					f.write(contentT + "\r\n");
					f.flush(); // 위에 write 본문들 쓰고, 싹다 밀어버리는 의미
					f.close();

					// 저장한 이후, 비어있는 값으로 세팅하기
					noText.setText("");
					titleText.setText("");
					contentText.setText("");

					// 확인 창 띄우기
					JOptionPane.showMessageDialog(null, "파일로 저장 성공");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "파일로 저장 실패");

				}
			}
		});
		save.setBackground(Color.PINK);
		save.setFont(new Font("HY견고딕", Font.BOLD, 10));
		getContentPane().add(save);

		JButton read = new JButton("일기읽기");
		read.setBackground(Color.YELLOW);
		read.setFont(new Font("HY견고딕", Font.BOLD, 10));
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();

				try {
					FileReader f2 = new FileReader("c:/diary/" + noT + ".txt");
					BufferedReader reader = new BufferedReader(f2); 	//string으로 연결된걸 통째로 가져오는 것
					String noR = reader.readLine(); // 첫번째 줄 읽어옴  , 변수 생성시 첫글자는 소문자로!!!
					String titleR = reader.readLine();
					String contentR = reader.readLine();
					
					noText.setText(noR);
					titleText.setText(titleR);
					contentText.setText(contentR);
					
					noText.setForeground(Color.red);
					
					JOptionPane.showMessageDialog(null, "파일로 일기 성공");
				} catch (Exception e2) { // Exception 은 상속이다.
					JOptionPane.showMessageDialog(null, "파일로 읽기 실패");

				}
			}
		});
		getContentPane().add(read);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noText.setText("");
				titleText.setText("");
				contentText.setText("");
			}
		});
		btnReset.setFont(new Font("HY견고딕", Font.BOLD, 10));
		btnReset.setBackground(Color.ORANGE);
		getContentPane().add(btnReset);
		setTitle("나의 일기장 입력 화면");
		setSize(270, 500);
		FlowLayout name = new FlowLayout();
		setVisible(true);
	}

	public static void main(String[] args) {
		MyDiary name = new MyDiary();
	}
}