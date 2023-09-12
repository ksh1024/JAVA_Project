package Pro;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JFrame {
    public static void main(String[] args) {
        new main();
    }

    public main() {
        super("제목"); // 제목 지정
        this.setSize(1200, 800); // 화면 크기 지정
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기 버튼 클릭 시 창 닫음

        // 판넬 추가
        JPanel panel = new JPanel();
 //btn_signup.setPreferredSize(new Dimension(100, 50)); // 버튼 크기 가로, 세로
        //로그인 버튼
        JButton btn_login = new JButton();
        ImageIcon loginIcon = new ImageIcon("C:\\Users\\ksh25\\Desktop\\image\\login.png"); // 이미지 파일의 경로를 지정
        btn_login.setIcon(loginIcon);
        btn_login.setPreferredSize(new Dimension(loginIcon.getIconWidth(), loginIcon.getIconHeight()));
        //회원가입 버튼
        JButton btn_signup = new JButton();
        ImageIcon signupIcon = new ImageIcon("C:\\Users\\ksh25\\Desktop\\image\\signup.png"); // 이미지 파일의 경로를 지정
        btn_signup.setIcon(signupIcon);
        btn_signup.setPreferredSize(new Dimension(signupIcon.getIconWidth(), signupIcon.getIconHeight()));
        
        // FlowLayout을 사용하여 세로로 배치하고 중앙 정렬
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 600)); // 버튼간 간격, y위치

        // 버튼을 판넬에 추가
        panel.add(btn_login);
        panel.add(btn_signup);

        // 판넬을 프레임에 추가
        this.add(panel);

        this.setLocationRelativeTo(null); // 창을 정중앙에 띄움
        this.setVisible(true); // 창을 띄움
    }
}
