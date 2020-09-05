import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class StandardCalculator extends JPanel {
	
	private static final long serialVersionUID = 5543373472368171843L;

	//private properties
	private int width=200,height=210;
	
	//the numbers we use
	double num1,num2;
	double answer;
	
	//operation
	String operation;
	
	//Text Boxes
	JTextField mainTextField;
	JTextField upperTextField;
	
	//labels used us BUTTON
	private JLabel  btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6, btn_7,btn_8,btn_9; 
	private JLabel  btn_add, btn_backspace,btn_c, btn_ce,  btn_div,btn_dot,btn_equla;
	private JLabel btn_mod, btn_mul,btn_p_n,btn_rad, btn_sub;
	
	//The button images 
	private String[] btn_name = {
			"btn_0.png", "btn_1.png", "btn_2.png", "btn_3.png", "btn_4.png", "btn_5.png", "btn_6.png", "btn_7.png", "btn_8.png", "btn_9.png", 
			"btn_add.png", "btn_backspace.png", "btn_c.png", "btn_ce.png", "btn_div.png", "btn_dot.png", "btn_equla.png",
			"btn_mod.png", "btn_mul.png", "btn_p_n.png", "btn_rad.png", "btn_sub.png"
	};
	
	String[] btn_name_hover = {
			"btn_0_hover.png", "btn_1_hover.png", "btn_2_hover.png", "btn_3_hover.png", "btn_4_hover.png", "btn_5_hover.png", "btn_6_hover.png", "btn_7_hover.png", "btn_8_hover.png", "btn_9_hover.png",
			"btn_add_hover.png", "btn_backspace_hover.png", "btn_c_hover.png", "btn_ce_hover.png", "btn_div_hover.png", "btn_dot_hover.png", "btn_equal_hover.png",
			"btn_mod_hover.png", "btn_mul_hover.png", "btn_p_n_hover.png", "btn_rad_hover.png", "btn_sub_hover.png"
	};
	
		
	//class constructor
	public StandardCalculator() {
		setBackground(new Color(0,51,51));
		setForeground(new Color(0,51,51));
		setSize(width,height);
		setLayout(null);
		
		initComponent();	
	}
	
	public void initComponent(){
		
		mainTextField = new JTextField();
		mainTextField.setEditable(false);
		mainTextField.setBackground(new java.awt.Color(0, 51, 51));
		mainTextField.setColumns(14);
		mainTextField.setFont(new Font("Consolas", 0, 35));
		mainTextField.setForeground(new Color(255, 255, 255));
		mainTextField.setHorizontalAlignment(JTextField.RIGHT);
		mainTextField.setBorder(null);
		mainTextField.setText("0");
		
		
		upperTextField = new JTextField();
		upperTextField.setEditable(false);
		upperTextField.setBackground(new java.awt.Color(0, 51, 51));
		upperTextField.setColumns(14);
		upperTextField.setFont(new Font("Consolas", Font.PLAIN, 18));
		upperTextField.setForeground(new Color(255, 255, 255));
		upperTextField.setHorizontalAlignment(JTextField.RIGHT);
		upperTextField.setBorder(null);
		upperTextField.setText("0");
		

		
		btn_0 = new JLabel();
		btn_1 = new JLabel();
		btn_2 = new JLabel();
		btn_3 = new JLabel();
		btn_4 = new JLabel();
		btn_5 = new JLabel();
		btn_6 = new JLabel();
		btn_7 = new JLabel();
		btn_8 = new JLabel();
		btn_9 = new JLabel();
		btn_add = new JLabel();
		btn_backspace = new JLabel();
		btn_c = new JLabel();
		btn_ce = new JLabel();
		btn_div = new JLabel();
		btn_dot = new JLabel();
		btn_equla = new JLabel();
		btn_mod = new JLabel();
		btn_mul = new JLabel();
		btn_p_n = new JLabel();
		btn_rad = new JLabel();
		btn_sub = new JLabel();
		
		btn_0.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[0])));
		btn_1.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[1])));
		btn_2.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[2])));
		btn_3.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[3])));
		btn_4.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[4])));
		btn_5.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[5])));
		btn_6.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[6])));
		btn_7.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[7])));
		btn_8.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[8])));
		btn_9.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[9])));
		btn_add.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[10])));
		btn_backspace.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[11])));
		btn_c.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[12])));
		btn_ce.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[13]))); 
		btn_div.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[14])));
		btn_dot.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[15])));
		btn_equla.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[16])));
		btn_mod.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[17])));
		btn_mul.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[18])));
		btn_p_n.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[19])));
		btn_rad.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[20])));
		btn_sub.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[21])));

		
		Events();
		
		Layouting();
		
		add(mainTextField);
		add(upperTextField);
		add(btn_0);                       
		add(btn_1);                   
		add(btn_2);             
		add(btn_3);             
		add(btn_4);             
		add(btn_5);             
		add(btn_6);           	
		add(btn_7);              
		add(btn_8);            
		add(btn_9);             
		add(btn_add);         	
		add(btn_backspace);     
		add(btn_c);            
		add(btn_ce);            
		add(btn_div);           
		add(btn_dot);               
		add(btn_equla);         
		add(btn_mod);           
		add(btn_mul);           
		add(btn_p_n);           
		add(btn_rad);                  
		add(btn_sub);  
		
	}
	
	//methods
	
	public void Events(){
		btn_0.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_0.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[0]))); 
			}
			public void mouseReleased(MouseEvent e) {
				btn_0.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[0])));
				btn_0_Action_Performed(e);
			}
		});                  
		btn_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_1.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[1])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_1.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[1])));
				btn_1_Action_Performed(e);
			}
		});
		btn_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_2.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[2])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_2.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[2])));
				btn_2_Action_Performed(e);
			}
		});        
		btn_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_3.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[3])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_3.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[3])));
				btn_3_Action_Performed(e);
			}
		});
		btn_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_4.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[4])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_4.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[4])));
				btn_4_Action_Performed(e);
			}
		});                   
		btn_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_5.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[5])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_5.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[5])));
				btn_5_Action_Performed(e);
			}
		});                  
		btn_6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_6.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[6])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_6.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[6])));
				btn_6_Action_Performed(e);
			}
		});           	    
		btn_7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_7.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[7])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_7.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[7])));
				btn_7_Action_Performed(e);
			}
		});                   
		btn_8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_8.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[8])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_8.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[8])));
				btn_8_Action_Performed(e);
			}
		});                 
		btn_9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_9.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[9])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_9.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[9])));
				btn_9_Action_Performed(e);
			}
		});                  
		btn_add.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_add.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[10])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_add.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[10])));
				btn_add_Action_Performed(e);
			}
		});        	    
		btn_backspace.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_backspace.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[11])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_backspace.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[11])));
				btn_backspace_Action_Performed(e);
			}
		});               
		btn_c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_c.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[12])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_c.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[12])));
				btn_c_Action_Performed(e);
			}
		}); 
		btn_ce.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_ce.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[13])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_ce.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[13])));
				btn_ce_Action_Performed(e);
			}
		}); 
		btn_div.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_div.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[14])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_div.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[14])));
				btn_div_Action_Performed(e);
			}
		});
		btn_dot.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_dot.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[15])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_dot.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[15])));
				btn_dot_Action_Performed(e);
			}
		});
		btn_equla.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
				
			}
			public void mousePressed(MouseEvent e) {
				btn_equla.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[16])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_equla.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[16])));
				btn_equla_Action_Performed(e);
			}
		});  
		btn_mod.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_mod.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[17])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_mod.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[17])));
				btn_mod_Action_Performed(e);
			}
		});
		btn_mul.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_mul.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[18])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_mul.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[18])));
				btn_mul_Action_Performed(e);
			}
		});
		btn_p_n.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_p_n.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[19])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_p_n.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[19])));
				btn_p_n_Action_Performed(e);
			}
		});   
		btn_rad.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){

			}
			public void mousePressed(MouseEvent e) {
				btn_rad.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[20])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_rad.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[20])));
				btn_rad_Action_Performed(e);
			}
		});   
		btn_sub.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_sub.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[21])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_sub.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[21])));
				btn_sub_Action_Performed(e);
			}
		}); 
	
	}
	
	public void Layouting(){
			/////////******THE STANDARD CALCULATOR LAYOUT FULL******/////////
				upperTextField.setBounds(0,0,250,20);
				mainTextField.setBounds(0,22,250,45);
				
				//the first raw
				btn_backspace.setBounds(0,70,50,50);
				btn_ce.setBounds(50,70,50,50);
				btn_c.setBounds(100,70,50,50);
				btn_add.setBounds(150,70,50,50);
				btn_rad.setBounds(200,70,50,50);
				
				//the second raw
				btn_7.setBounds(0,120,50,50);
				btn_8.setBounds(50,120,50,50);
				btn_9.setBounds(100,120,50,50);
				btn_div.setBounds(150,120,50,50);
				btn_mod.setBounds(200,120,50,50);
				
				//the therd raw
				btn_4.setBounds(0,170,50,50);
				btn_5.setBounds(50,170,50,50);
				btn_6.setBounds(100,170,50,50);
				btn_mul.setBounds(150,170,50,50);
				btn_equla.setBounds(200,170,50,150);
				
				
				//the fourth raw
				btn_1.setBounds(0,220,50,50);
				btn_2.setBounds(50,220,50,50);
				btn_3.setBounds(100,220,50,50);
				btn_sub.setBounds(150,220,50,50);
				
				
				//the fiveth raw
				btn_0.setBounds(0,270,100,50);
				btn_dot.setBounds(100,270,50,50);
				btn_p_n.setBounds(150,270,50,50);
				
	}
	
	//THE ACTION TO BE PERFORMED FOR THE JLABEL BUTTONS 
	public void btn_0_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "0");
	}
	public void btn_1_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "1");
	}
	public void btn_2_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "2");
	}
	public void btn_3_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "3");
	}
	public void btn_4_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "4");
	}
	public void btn_5_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "5");
	}
	public void btn_6_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "6");
	}
	public void btn_7_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "7");
	}
	public void btn_8_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "8");
	}
	public void btn_9_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + "9");
	}
	public void btn_backspace_Action_Performed(MouseEvent e){
		chake();
		int length= mainTextField.getText().length();
		int number = mainTextField.getText().length()-1;
		String store;
		if(length>0){
			StringBuilder back =new StringBuilder(mainTextField.getText());
			back.deleteCharAt(number);
			store=back.toString();
			mainTextField.setText(store);
		}
	}
	public void btn_c_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText("0");
	}
	public void btn_ce_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText("0");
		upperTextField.setText("0");
		
	}
	public void btn_add_Action_Performed(MouseEvent e){
		chake();
		num1 = number();
		upperTextField.setText(num1+"+");
		mainTextField.setText("");
		operation = "+";
	}
	public void btn_div_Action_Performed(MouseEvent e){
		chake();
		num1 = number();
		upperTextField.setText(num1+"/");
		mainTextField.setText("");
		operation = "/";
	}
	public void btn_dot_Action_Performed(MouseEvent e){
		chake();
		mainTextField.setText(mainTextField.getText() + ".");
	}
	
	public void btn_mod_Action_Performed(MouseEvent e){
		chake();
		num1 = number();
		upperTextField.setText(num1+"%");
		mainTextField.setText("");
		operation = "%";
	}
	public void btn_mul_Action_Performed(MouseEvent e){
		chake();
		num1 = number();
		upperTextField.setText(num1+"*");
		mainTextField.setText("");
		operation = "*";
	}
	public void btn_p_n_Action_Performed(MouseEvent e){
		chake();
		num1 = number();
		double ops = Double.parseDouble(String.valueOf(mainTextField.getText()));
		ops=ops*(-1);
		mainTextField.setText(String.valueOf(ops));
	}
	public void btn_rad_Action_Performed(MouseEvent e){
		chake();
		num1 = number();
		upperTextField.setText("");
		upperTextField.setText("sqrt("+num1+")");
		mainTextField.setText("");
		operation = "s";
	}
	public void btn_sub_Action_Performed(MouseEvent e){
		chake();
		num1 = number();
		upperTextField.setText(num1+"-");
		mainTextField.setText("");
		operation = "-";
	}
	
	public double number(){
		double number = Double.parseDouble(mainTextField.getText());
		return number;
	}
	
	public void chake(){
		if(mainTextField.getText().equals("0")){
			mainTextField.setText("");
		}else{
			return;
		}
	}
	
	//TREGGER THE ANSWERS
	public void btn_equla_Action_Performed(MouseEvent e){
		if(operation=="+"){
			num2 = number();
			answer = num1 + num2;
		}else if(operation=="-"){
			num2 = number();
			answer = num1 - num2;
		}else if(operation=="/"){
			num2 = number();
			System.out.println("The Devision");
			answer = num1 / num2;
		}else if(operation=="*"){
			num2 = number();
			answer = num1 * num2;
		}else if(operation=="%"){
			mainTextField.setText("0");
			num2 = number();
			answer = (num1/100);
		}else if(operation=="s"){
			mainTextField.setText("0");
			num2 = number();
			answer = Math.sqrt(num1);
		}
		
		upperTextField.setText("");
		upperTextField.setText("");
		mainTextField.setText(""+answer);
		
	}
	
}
