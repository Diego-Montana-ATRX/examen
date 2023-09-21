package fomulageneral;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form {

	private JFrame frmElChicharinero;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JLabel lblsol1;
	private JLabel lblsol2;
	private JButton btnborrar;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form();
					window.frmElChicharinero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElChicharinero = new JFrame();
		frmElChicharinero.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SALA2-PC29\\Downloads\\chi.jpg"));
		frmElChicharinero.setTitle("EL CHICHARINERO");
		frmElChicharinero.setBounds(100, 100, 578, 384);
		frmElChicharinero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElChicharinero.getContentPane().setLayout(null);
		
		JLabel lbla = new JLabel("A");
		lbla.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbla.setBounds(50, 31, 24, 14);
		frmElChicharinero.getContentPane().add(lbla);
		
		JLabel lblb = new JLabel("B");
		lblb.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblb.setBounds(50, 70, 24, 14);
		frmElChicharinero.getContentPane().add(lblb);
		
		JLabel lblc = new JLabel("C");
		lblc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblc.setBounds(50, 103, 46, 14);
		frmElChicharinero.getContentPane().add(lblc);
		
		txta = new JTextField();
		txta.setBounds(74, 30, 86, 20);
		frmElChicharinero.getContentPane().add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(74, 69, 86, 20);
		frmElChicharinero.getContentPane().add(txtb);
		txtb.setColumns(10);
		
		txtc = new JTextField();
		txtc.setBounds(74, 102, 86, 20);
		frmElChicharinero.getContentPane().add(txtc);
		txtc.setColumns(10);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(txta.getText());
				double b=Double.parseDouble(txtb.getText());
				double c=Double.parseDouble(txtc.getText());
				double factor=(b*b)-(4*a*c);
				if(factor ==0) {
			double x=-b/(2*a);
					
					lblsol1.setText("x1=x2:"+x);
					lblsol2.setText("");
					
					
					}else if (factor>0) {
						double x1= (-b+Math.sqrt(factor)) / (2 * a);
						double x2= (-b-Math.sqrt(factor)) / (2 * a);			
					
					
					lblsol1.setText("x1:" + x1);
					lblsol2.setText("x2:" +x2);
					
			}else if (factor<0) {
					
				lblsol1.setText("no tiene solucion");
					lblsol2.setText("");
				}
				
			}
		});
		btnCalcular.setBounds(30, 145, 89, 23);
		frmElChicharinero.getContentPane().add(btnCalcular);
		
		btnborrar = new JButton("BORRAR");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setText(""); 
				txtb.setText(""); 
				txtc.setText(""); 
				lblsol1.setText("");
				lblsol2.setText(""); 
				lblsol2.setText(null);
				lblsol1.setText(null);
			}
					
			
			}
		
		);
		btnborrar.setBounds(149, 145, 89, 23);
		frmElChicharinero.getContentPane().add(btnborrar);
		
		lblsol1 = new JLabel("");
		lblsol1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lblsol1.setBounds(31, 193, 207, 52);
		frmElChicharinero.getContentPane().add(lblsol1);
		
		lblsol2 = new JLabel("");
		lblsol2.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lblsol2.setBounds(30, 256, 207, 52);
		frmElChicharinero.getContentPane().add(lblsol2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno.SALA2-PC29\\Downloads\\ECUACION.png"));
		lblNewLabel_2.setBounds(301, 11, 230, 271);
		frmElChicharinero.getContentPane().add(lblNewLabel_2);
	}
	
		
	
	
	}

