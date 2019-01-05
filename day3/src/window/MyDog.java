package window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyDog {

	public static void main(String[] args) {
		JFrame f = new JFrame();  // new -> jf -> f 라고 수기세팅
		f.setSize(600, 600);
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("dog2.jpg"); 
	// 사진을 src에 드래그해서 넣어준다. 사진명과 확장자는 큰 따옴표로 표기한다!!!
		l.setIcon(icon);
		f.add(l);
		f.setVisible(true);
	}
}
