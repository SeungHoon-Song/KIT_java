package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ManagerGUI {
	// 화면에 관련된 컴포넌트들을 전역 변수로 선언
	Frame frame;
	Panel[] panel;
	Label lblTitle, lblName, lblHeight, lblWeight, lblSex, lblAge, lblStatus;
	TextField tfName, tfHeight, tfAge, tfWeight;
	Button btnSave, btnDelete, btnUpdate, btnReset, btnSearch;
	List list;
	Checkbox chMale, chFemale;
	CheckboxGroup chGroup;

	public ManagerGUI() {
		frame = new Frame("회원 관리");
		panel = new Panel[13];
		for (int i = 0; i < panel.length; i++) {
			panel[i] = new Panel();
		}

		lblTitle = new Label("회원 관리", Label.CENTER);
		Font font = new Font("dialog", Font.BOLD, 20);
		lblTitle.setFont(font);
		lblTitle.setForeground(new Color(123, 54, 32));
		lblName = new Label("이 름");
		lblAge = new Label("연 령");
		lblHeight = new Label("키");
		lblWeight = new Label("체 중");
		lblSex = new Label("성 별");
		lblStatus = new Label("");
		lblStatus.setBackground(Color.LIGHT_GRAY);
		tfName = new TextField("");
		tfHeight = new TextField("");
		tfWeight = new TextField("");
		tfAge = new TextField("");
		btnSave = new Button("저장");
		btnSearch = new Button("검색");
		btnDelete = new Button("삭제");
		btnUpdate = new Button("수정");
		btnReset = new Button("지우기");
		chGroup = new CheckboxGroup();
		chMale = new Checkbox("Male", chGroup, false);
		chFemale = new Checkbox("Female", chGroup, false);
		list = new List(7, false);

		// 프레임 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// list 아이템 클릭하면 회원정보 입력 필드값 채우기
		list.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = list.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str);
				tfName.setText(st.nextToken());
				tfAge.setText(st.nextToken());
				tfWeight.setText(st.nextToken());
				tfHeight.setText(st.nextToken());

				String sex = st.nextToken();
				if (sex.equals("여")) {
					chFemale.setState(true);
				} else {
					chMale.setState(true);
				}

			}
		});
	

	}// end 생성자

	public void launchFrame() {
		panel[1].setLayout(new GridLayout(2, 1));
		panel[1].add(lblName);
		panel[1].add(lblHeight);
		panel[2].setLayout(new GridLayout(2, 1));
		panel[2].add(tfName);
		panel[2].add(tfHeight);
		panel[3].setLayout(new BorderLayout());
		panel[3].add(panel[1], "West");
		panel[3].add(panel[2], "Center");
		panel[3].add(new Label(""), "East");
		panel[4].setLayout(new GridLayout(2, 1));
		panel[4].add(lblAge);
		panel[4].add(lblWeight);
		panel[5].setLayout(new GridLayout(2, 1));
		panel[5].add(tfAge);
		panel[5].add(tfWeight);
		panel[6].setLayout(new BorderLayout());
		panel[6].add(panel[4], "West");
		panel[6].add(panel[5], "Center");
		panel[6].add(new Label(""), "East");
		panel[7].setLayout(new GridLayout(1, 2));
		panel[7].add(panel[3]);
		panel[7].add(panel[6]);
		panel[8].add(lblSex);
		panel[8].add(chMale);
		panel[8].add(chFemale);
		panel[9].setLayout(new BorderLayout());
		panel[9].add(lblTitle, "North");
		panel[9].add(panel[7], "Center");
		panel[9].add(panel[8], "South");
		panel[10].setLayout(new GridLayout(1, 5));
		panel[10].setBackground(Color.black);
		panel[10].setForeground(Color.white);
		panel[10].add(new Label("이 름   "));
		panel[10].add(new Label("나 이   "));
		panel[10].add(new Label("체 중  "));
		panel[10].add(new Label(" 키    "));
		panel[10].add(new Label("성 별   "));
		panel[11].setLayout(new BorderLayout());
		panel[11].add(panel[10], "North");
		panel[11].add(list, "Center");
		panel[0].add(btnSave);
		panel[0].add(new Label(" "));
		panel[0].add(btnSearch);
		panel[0].add(new Label(" "));
		panel[0].add(btnDelete);
		panel[0].add(new Label(" "));
		panel[0].add(btnUpdate);
		panel[0].add(new Label(" "));
		panel[0].add(btnReset);
		panel[12].setLayout(new BorderLayout());
		panel[12].add(panel[9], "North");
		panel[12].add(panel[11], "Center");
		panel[12].add(panel[0], "South");

		frame.add(panel[12], "Center");
		frame.add(lblStatus, "South");
		frame.pack();

		frame.setResizable(false);
		frame.setLocation(((frame.getToolkit().getScreenSize()).width - frame.getWidth()) / 2,
				((frame.getToolkit().getScreenSize()).height - frame.getHeight()) / 2);

		frame.setVisible(true);

		displayAll();// 회원정보 보기

		// 회원정보 저장하기 버튼 메소드
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// insert(String name, String age, String weight, String height, String sex)
				String name = tfName.getText();
				String age = tfAge.getText();
				String weight = tfWeight.getText();
				String height = tfHeight.getText();
				String sex = "여";
				if (chMale.getState()) {
					sex = "남";
				}
				MemberDAO dao = new MemberDAO();
				dao.insert(name, age, weight, height, sex);
				displayAll();
				lblStatus.setText("1행이 저장되었습니다.");

			}
		});
		// 지우기 버튼
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tfName.setText("");
				tfAge.setText("");
				tfWeight.setText("");
				tfHeight.setText("");
				chGroup.setSelectedCheckbox(null);
				lblStatus.setText("항목이 지워졌습니다.");

			}
		});
		// 삭제 버튼
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				MemberDAO dao = new MemberDAO();
				dao.delete(name);
				displayAll();
				lblStatus.setText("1행이 삭제되었습니다.");

			}
		});

		// 수정 버튼
		btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				String age = tfAge.getText();
				String weight = tfWeight.getText();
				String height = tfHeight.getText();
				String sex = "남";
				if (chFemale.getState()) {
					sex = "여";
				}
				MemberDAO dao = new MemberDAO();
				dao.update(name, age, weight, height, sex);
				displayAll();
				lblStatus.setText(name+"의 자료가 수정되었습니다.");

			}
		});

		// 검색 버튼
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				MemberDAO dao = new MemberDAO();
				MemberDTO dto = new MemberDTO();
				try {
					dto = dao.search(name);
				} catch (RecordNotFoundException e1) {
					e1.printStackTrace();
					lblStatus.setText(e1.getMessage());
					final Dialog dialog = new Dialog(frame, "경고");
					dialog.setLayout(new FlowLayout());
					dialog.setSize(200,80);
					dialog.setTitle(e1.getMessage());
					Button btnOk = new Button("확 인");
					btnOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							dialog.dispose();
						}
					});
					dialog.add(btnOk);
					dialog.setVisible(true);
					return;
					
				}
				//dto안에는 데이터베이스에서 가져온 검색하는 항목의 값들이 들어 있다.
				//dto-->화면 넣기
				
				tfName.setText(dto.getName());
				tfAge.setText(Integer.toString(dto.getAge()));
				tfWeight.setText(String.valueOf(dto.getWeight()));
				tfHeight.setText(String.valueOf(dto.getHeight()));
				String sex = Character.toString(dto.getSex());	//'남' ==> "남"
				if(sex.equals("남")) {
					chMale.setState(true);
				}else {
					chFemale.setState(true);
				}
			}
		});
		
	}// end launchFrame

	public void displayAll() {
		list.removeAll(); // 리스트(awt) 화면 클리어
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> allData = dao.select();
		for (MemberDTO dto : allData) {
			String name = dto.getName();
			int age = dto.getAge();
			int weight = dto.getWeight();
			int height = dto.getHeight();
			char sex = dto.getSex();
			list.add(name + "           " + age + "               " + weight + "                " + height
					+ "                  " + sex);
		}

	}

	public static void main(String[] args) {
		ManagerGUI mem = new ManagerGUI();
		mem.launchFrame(); // 화면

	}

}
