
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CalculatorApplication{
	private static final long serialVersionUID = 8405994729994189931L;
	
	//Confermation Box Class object
	ConfirmBox confirmBox;
	static boolean con = false;
	
	//Static JFrame
	public static JFrame frame = new JFrame();
	
	
	//private properties
	private String[]  btn_icons = {
			"power_button.png", "btn_scientific.png", 
			"btn_standard.png", "btn_unitconversion.png",
			"btn_about.png"
	};
	
	private String[]  btn_icons_hover = {
			"power_button_hover.png", "btn_scientific_hover.png", 
			"btn_standard_hover.png", "btn_unitconversion_hover.png",
			"btn_about_hover.png"
	};
	
	//jframe Properties
	private JPanel frameBar;
	private JLabel powerButton;
	private JLabel btn_about;
	private JLabel btn_scientific,btn_standard,btn_unitconversion;
	@SuppressWarnings("unused")
	private ConfirmBox confirm_box;
	
	private int x,y;
	private static int widthSy=480, heightSy=390;
	private static int widthSt=250, heightSt=390;
	
	
	//public properties
	public StandardCalculator standardCalculator;
	public SintificCalculator sintificCalculator;
	public UnitConverter unitConverter;
	
	//class constructor
	public CalculatorApplication() {
		confirmBox = new ConfirmBox();
		initFrame();
	}
	
	//set the frame method
	private void initFrame(){
		frame.setUndecorated(true); // we make this because we want to create own own UI
		frame.setLayout(null);      // and custom Layout
		//this code used to drag the undecorated frame
		frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
            	frame.setLocation((evt.getXOnScreen()-x), (evt.getYOnScreen()-y));
            }
        });
		frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                x = evt.getX();
    			y = evt.getY();
            }
        });
		
		frame.setResizable(false);
		frame.setBackground(new Color(0,55,55));
		frame.setForeground(new Color(255,255,255));
		frame.setSize(widthSt,heightSt);
		frame.setOpacity(0.88f);

		frame.setIconImage(new ImageIcon(getClass().getResource("assets/images/AppIcon.png")).getImage());
		
		initCompnent();
	}
	
	//methods
	public void initCompnent(){
		frameBar = new JPanel(null);
		frameBar.setBackground(new Color(148,27,61));
		
		
		powerButton = new JLabel();
		btn_about = new JLabel();
		btn_scientific = new JLabel();
		btn_standard = new JLabel(); 
		btn_unitconversion = new JLabel();
		
		powerButton.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[0])));
		btn_scientific.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[1])));
		btn_standard.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[2]))); 
		btn_unitconversion.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[3])));
		btn_about.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[4])));
		
		//frameBar.add(powerButton);
		frame.add(frameBar);

		frameBar.add(powerButton);
		frameBar.add(btn_about);
		frame.add(btn_scientific);
		frame.add(btn_standard);
		frame.add(btn_unitconversion);
		
		
		Event();
		Layout();
		Launch();
		
	}
	
	public void Event(){
		confirm_box = new ConfirmBox();
		
		powerButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				powerButton.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons_hover[0]))); 
			}
			public void mouseExited(MouseEvent evt){
				powerButton.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[0])));
			}
			public void mouseEntered(MouseEvent evt) {
				powerButton.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons_hover[0])));
			}
			public void mouseReleased(MouseEvent evt){
				powerButton.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[0])));
				actionPerformedPowerButton(evt);
			}
		});
		btn_scientific.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				launchScientific();
			}
			public void mouseEntered(MouseEvent evt) {
				btn_scientific.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons_hover[1]))); 
			}
			public void mouseExited(MouseEvent evt) {
				btn_scientific.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[1])));
			}
		});
		btn_standard.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				launchStandard();
			}
			public void mouseEntered(MouseEvent evt) {
				btn_standard.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons_hover[2]))); 
			}
			public void mouseExited(MouseEvent evt) {
				btn_standard.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[2])));
			}
		});
		btn_unitconversion.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				laynchUnitConversion();
			}
			public void mouseEntered(MouseEvent evt) {
				btn_unitconversion.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons_hover[3]))); 
			}
			public void mouseExited(MouseEvent evt) {
				btn_unitconversion.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[3])));
			}
		});
		btn_about.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				btn_about.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons_hover[4]))); 
			}
			public void mouseExited(MouseEvent evt){
				btn_about.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[4])));
			}
			public void mouseEntered(MouseEvent evt) {
				btn_about.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons_hover[4])));
			}
			public void mouseReleased(MouseEvent evt){
				btn_about.setIcon(new ImageIcon(getClass().getResource("assets/images/"+btn_icons[4])));
				actionPerformedAbout(evt);
			}
		});
	}

	public void Layout(){
		standardCalculator = new StandardCalculator();
		sintificCalculator = new SintificCalculator();
		//unitConverter = new UnitConverter();
		
		frameBar.setBounds(0,0,300,35);
		
		powerButton.setBounds(200,0,35,35);
		btn_about.setBounds(0,0,35,35);
		
		btn_scientific.setBounds(10,30,70,30);
		btn_standard.setBounds(90,30,70,30);
		btn_unitconversion.setBounds(170,30,70,30);
		
		

		
		standardCalculator.setBounds(0,70,250,380);
		sintificCalculator.setBounds(250,70,350,380);
		//unitConverter.setBounds(0,70,400,380);
		
	}
	
	public void Launch(){
		standardCalculator.setVisible(true);
		sintificCalculator.setVisible(true);
		
		frame.add(standardCalculator);
		frame.add(sintificCalculator);
	}
	
	
	public void launchScientific(){
		frame.setSize(widthSy,heightSy);
		powerButton.setBounds(widthSy-35,0,35,35);
		frameBar.setBounds(0,0,widthSy,35);
	}
	
	public void launchStandard(){
		frame.setSize(widthSt,heightSt);
		powerButton.setBounds(200,0,35,35);
		frameBar.setBounds(0,0,300,35);
		
	}

	public void laynchUnitConversion(){
		
	}
	//All Actions On The class methods
	public void actionPerformedPowerButton(MouseEvent e){
		confirmBox.launchX(true);
	}
	public void actionPerformedAbout(MouseEvent e){
		confirmBox.launchX(false);
		
	}

	public static void exit(){
		System.exit(0);
	}
	
}
