
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SintificCalculator extends JPanel{
	private static final long serialVersionUID = 8805539624510178808L;
	
	private int width=230,height=210;
	
	private String[] btn_name = {
			"btn_cbr.png","btn_cos.png","btn_cosh.png",
			"btn_fact.png","btn_hex.png","btn_mod_.png",
			"btn_oct.png","btn_sin.png","btn_sinh.png",
			"btn_tan.png","btn_tanh.png","btn_x^2.png",
			"btn_x^y.png","btn_x^3.png","btn_lnx.png",
			"btn_log.png","btn_pi.png","btn_rund.png"	
	};
	String[] btn_name_hover = {
			"btn_cbr_hover.png","btn_cos_hover.png","btn_cosh_hover.png",
			"btn_fact_hover.png","btn_hex_hover.png","btn_mod__hover.png",
			"btn_oct_hover.png","btn_sin_hover.png","btn_sinh_hover.png",
			"btn_tan_hover.png","btn_tanh_hover.png","btn_x^2_hover.png",
			"btn_x^y_hover.png","btn_x^3_hover.png","btn_lnx_hover.png",
			"btn_log_hover.png","btn_pi_hover.png","btn_rund_hover.png"
	};

	
	private JLabel btn_cbr,btn_cos,btn_cosh,btn_fact,btn_hex,btn_mod_,
				   btn_oct,btn_sin,btn_sinh,btn_tan,btn_tanh,btn_x2,btn_xy,btn_x3,
				   btn_lnx,btn_log,btn_pi,btn_rund;
	
	public SintificCalculator() {
		
		setBackground(new Color(0,51,51));
		setForeground(new Color(0,51,51));
		setSize(width,height);
		setLayout(null);
		
		initComponent();
		
	}
	
	public void initComponent(){
		btn_cbr     = new JLabel(); 
		btn_cos     = new JLabel();
		btn_cosh    = new JLabel();
		btn_fact    = new JLabel();
		btn_hex     = new JLabel();
		btn_mod_    = new JLabel();
		btn_oct     = new JLabel();
		btn_sin     = new JLabel();
		btn_sinh    = new JLabel();
		btn_tan     = new JLabel();
		btn_tanh    = new JLabel();
		btn_x2      = new JLabel();
		btn_xy      = new JLabel();
		btn_x3      = new JLabel();
		btn_lnx     = new JLabel();
		btn_log     = new JLabel();
		btn_pi      = new JLabel();
		btn_rund    = new JLabel();
		
		
		btn_cbr.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[0])));      
		btn_cos.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[1])));     
		btn_cosh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[2])));   
		btn_fact.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[3])));    
		btn_hex.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[4])));     
		btn_mod_.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[5])));    
		btn_oct.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[6])));     
		btn_sin.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[7])));     
		btn_sinh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[8])));    
		btn_tan.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[9])));     
		btn_tanh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[10])));    
		btn_x2.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[11])));      
		btn_xy.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[12])));      
		btn_x3.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[13])));       
		btn_lnx.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[14])));     
		btn_log.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[15])));     
		btn_pi.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[16])));      
		btn_rund.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[17])));    

		Events();
		
		Layouting();
		
		add(btn_cbr);    
		add(btn_cos);   
		add(btn_cosh);   
		add(btn_fact);   
		add(btn_hex);   
		add(btn_mod_);   
		add(btn_oct);    
		add(btn_sin);    
		add(btn_sinh);   
		add(btn_tan);    
		add(btn_tanh);   
		add(btn_x2);    
		add(btn_xy);
		add(btn_x3);
		add(btn_lnx);
		add(btn_log);
		add(btn_pi);
		add(btn_rund);
		setVisible(true);
	}
	

	//methods
	
	public void Events(){
		btn_cbr.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_cbr.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[0]))); 
			}
			public void mouseReleased(MouseEvent e) {
				btn_cbr.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[0])));
				btn_btn_cbr_Action_Performed(e);
			}
		});                  
		btn_cos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_cos.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[1])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_cos.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[1])));
				btn_btn_cos_Action_Performed(e);
			}
		});
		btn_cosh.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_cosh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[2])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_cosh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[2])));
				btn_btn_cosh_Action_Performed(e);
			}
		});        
		btn_fact.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_fact.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[3])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_fact.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[3])));
				btn_btn_fact_Action_Performed(e);
			}
		});
		btn_hex.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_hex.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[4])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_hex.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[4])));
				btn_btn_hex_Action_Performed(e);
			}
		});                   
		btn_mod_.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_mod_.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[5])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_mod_.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[5])));
				btn_btn_mod__Action_Performed(e);
			}
		});                  
		btn_oct.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_oct.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[6])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_oct.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[6])));
				btn_btn_oct_Action_Performed(e);	
			}
		});           	    
		btn_sin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_sin.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[7])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_sin.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[7])));
				btn_btn_sin_Action_Performed(e);
			}
		});                   
		btn_sinh.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_sinh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[8])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_sinh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[8])));
				btn_btn_sinh_Action_Performed(e);
			}
		});                 
		btn_tan.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_tan.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[9])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_tan.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[9])));
				btn_btn_tan_Action_Performed(e);
			}
		});                  
		btn_tanh.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_tanh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[10])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_tanh.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[10])));
				btn_btn_tanh_Action_Performed(e);
			}
		});        	    
		btn_x2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_x2.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[11])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_x2.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[11])));
				btn_btn_x2_Action_Performed(e);
			}
		});               
		btn_xy.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_xy.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[12])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_xy.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[12])));
				btn_btn_xy_Action_Performed(e);
			}
		}); 
		btn_x3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_x3.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[13])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_x3.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[13])));
				btn_btn_x3_Action_Performed(e);
			}
		}); 
		btn_lnx.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_lnx.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[14])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_lnx.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[14])));
				btn_btn_lnx_Action_Performed(e);
			}
		});
		btn_log.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_log.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[15])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_log.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[15])));
				btn_btn_log_Action_Performed(e);
			}
		});
		btn_pi.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
				
			}
			public void mousePressed(MouseEvent e) {
				btn_pi.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[16])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_pi.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[16])));
				btn_btn_pi_Action_Performed(e);
			}
		});  
		btn_rund.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
			public void mousePressed(MouseEvent e) {
				btn_rund.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name_hover[17])));
			}
			public void mouseReleased(MouseEvent e) {
				btn_rund.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_name[17])));
				btn_btn_rund_Action_Performed(e);
			}
		});
		
	}
	
	public void Layouting(){
		/////////******THE SINTIFIC CALCULATOR LAYOUT FULL******/////////
		
		//
		btn_cbr.setBounds(0,70,65,50);
		btn_cos.setBounds(65,70,50,50);
		btn_fact.setBounds(115,70,50,50);
		btn_cosh.setBounds(165,70,65,50);
		//
		btn_hex.setBounds(0,120,65,50);
		btn_sin.setBounds(65,120,50,50);
		btn_oct.setBounds(115,120,65,50);
		btn_pi.setBounds(180,120,65,50);
		
		//
		btn_sinh.setBounds(0,170,65,50);
		btn_tan.setBounds(65,170,50,50);
		btn_x2.setBounds(115,170,65,50);
		btn_log.setBounds(180,170,50,50);
		
		//
		btn_xy.setBounds(0,219,65,50);
		btn_lnx.setBounds(65,220,50,50);
		btn_x3.setBounds(115,220,65,50);
		btn_tanh.setBounds(165,219,65,50);
		
		//
		btn_mod_.setBounds(0,269,100,50);
		btn_rund.setBounds(100,269,100,50);
		
	}
	
	public void btn_btn_cbr_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_cos_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_cosh_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_fact_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_hex_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_mod__Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_oct_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_sin_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_sinh_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_tan_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_tanh_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_x2_Action_Performed(MouseEvent e){
		
		
		
	}
	public void btn_btn_xy_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_x3_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_lnx_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_log_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_pi_Action_Performed(MouseEvent e){
		
	}
	public void btn_btn_rund_Action_Performed(MouseEvent e){
		
	}
	
}
