import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ConfirmBox extends JFrame{

	private static final long serialVersionUID = -4627603830600739553L;

	private int x=0,y=0;
	
	private JPanel confirmPanel;
	private JPanel bar;
	
	private JLabel yes_btn,no_btn, prompt, ok_btn;
	private String yes_name,no_name,ok_name;
	private String yes_name_hover, no_name_hover,ok_name_hover;
	
	public ConfirmBox(){
		
	}
	
	public void launchX(boolean c){
		CalculatorApplication.con = true;
		setUndecorated(true);
		setSize(250,150);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				x = e.getX();
				y = e.getY();
			}
			
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				setLocation((e.getXOnScreen()-x), (e.getYOnScreen()-y));
			}
		});
		
		bar = new JPanel();
		bar.setBackground(new Color(0,0,0));
		
		confirmPanel = new JPanel();
		confirmPanel.setBackground(new Color(0,51,51));
		confirmPanel.setForeground(Color.WHITE);
		confirmPanel.setLayout(null);
		
		initComponent();
		event();
		prompt();
	}
	
	public void initComponent(){
		prompt = new JLabel();
		prompt.setForeground(Color.WHITE);
		
		yes_btn = new JLabel();
		no_btn = new JLabel();
			
		yes_name = "yes_button.png";
		no_name = "no_button.png";
		yes_name_hover = "yes_btn_hover.png";
		no_name_hover = "no_button_hover.png";
		prompt.setFont(new Font("century gothic", Font.PLAIN, 26));
		
	}
	
	public void event(){
		prompt.setText("Are You Sure?");
		yes_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+yes_name)));
		no_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+no_name)));
		
		yes_btn.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
					yes_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+yes_name_hover)));
			}
			public void mouseExited(MouseEvent e){
				yes_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+yes_name)));
			}
			public void mouseReleased(MouseEvent e){
				System.exit(0);
				CalculatorApplication.exit();
			}
		});
		
		no_btn.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				no_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+no_name_hover)));
			}
			public void mouseExited(MouseEvent e){
				no_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+no_name)));
			}
			public void mouseReleased(MouseEvent e){
				dispose();
				CalculatorApplication.con = false;
			}
		});
		
	}
	
	public void prompt(){
		//prompt = new JLabel("Are You Sure?");
		
		//THE LAYOUT FULL
		bar.setBounds(0,0,250,30);
		confirmPanel.setBounds(0,0,250,150);
		prompt.setBounds(40,50,220,40);
		
		yes_btn.setBounds(50,100,60,20);
		no_btn.setBounds(130,100,60,20);
		
		confirmPanel.add(prompt);
		confirmPanel.add(yes_btn);
		confirmPanel.add(no_btn);
		
		add(bar);
		add(confirmPanel);
		setVisible(true);
	}
	
	
	/*ok_btn.setBounds(100,100,60,20);
	
	
	prompt.setText("->>> DEVELOPER OF THE CALCLATOR: Leul");
	ok_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+ok_name)));
	
	
	ok_btn.addMouseListener(new MouseAdapter(){
		public void mouseEntered(MouseEvent e){
			ok_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+ok_name_hover)));
		}
		public void mouseExited(MouseEvent e){
			ok_btn.setIcon(new ImageIcon(getClass().getResource("assets/images/"+ok_name)));
		}
		public void mouseReleased(MouseEvent e){
			dispose();
			CalculatorApplication.con = false;
		}
	});
	
	
	ok_btn = new JLabel();
	ok_name = "btn_ok.png";
	ok_name_hover = "btn_ok_hover.png";
	prompt.setFont(new Font("century gothic", Font.PLAIN, 18));*/
}
