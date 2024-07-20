package mainpackage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;


public class Loginpage extends JFrame {

	public Loginpage(){
		initComponents();
	}
 
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jempid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    	try {
        	    		if(Homepage.conn != null) {
        	    			Statement stmt = Homepage.conn.createStatement();
        	        		String getempid=jempid.getText();
        	        		String getpassword = jpassword.getText();
        	        		String statement = "Select username, fullname, loccode, deptcode, password, activestatus, lastlogin, usercategory, logincount, loginfail, email, contactno from mstuser where empid = " + getempid+";";
        	        		ResultSet rslogin = stmt.executeQuery(statement);
        	        		
        	        	      while (rslogin.next()) {
        	                      if(rslogin.getString("username") == null)
        	                      {
        	                      //Invalid Authentication , return back to login screen
        	                    	  System.out.println("Invalid Employee ID or Password.");
        	                      }
        	                      else
        	                      {
        	                    	  if(!(rslogin.getString("password").contentEquals(getpassword))) 
        	                    	  {
        	                    		//Invalid Authentication/Password , return back to login screen
        	                    		  System.out.println("Invalid Employee ID or Password.");
        	                    	  }
        	                    	  else
        	                    	  {
        	                    		  System.out.println(rslogin.getString("fullname") + " " + rslogin.getString("deptcode"));  
        	                    		  Mainpage mpage = new Mainpage();
        	                    		  mpage.setVisible(true);
        	                    		  mpage.pack();
        	                    		  mpage.setLocationRelativeTo(null);
//        	                    		  this.dispose;
        	                    	  }
        	                      }
        	                  }
        	    		}
        	    		else {
        	    			System.out.println("Connection is not established");
        	    		}
        	    	}
        	    	catch (SQLException ex) {
        	    		System.out.println(ex);
        	    	}
        		
        		
        	}
        });
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        
        ImageIcon icon = new ImageIcon("D:\\Hariom\\Software\\IssueTicketManagement\\src\\img_login\\caregroup_logo.png");
        Image img = icon.getImage();
        Image imgresize = img.getScaledInstance(225, 225, Image.SCALE_SMOOTH);
        ImageIcon scaledicon = new ImageIcon(imgresize);
        jLabel5.setIcon(scaledicon); // NOI18N

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Care Group Sight Solutions");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); 
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © care group sight solutions All rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        RightLayout.setHorizontalGroup(
        	RightLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, RightLayout.createSequentialGroup()
        			.addGap(88)
        			.addComponent(jLabel5)
        			.addContainerGap(87, Short.MAX_VALUE))
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap(42, Short.MAX_VALUE)
        			.addComponent(jLabel6)
        			.addGap(40))
        		.addGroup(RightLayout.createSequentialGroup()
        			.addContainerGap(29, Short.MAX_VALUE)
        			.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        RightLayout.setVerticalGroup(
        	RightLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, RightLayout.createSequentialGroup()
        			.addContainerGap(63, Short.MAX_VALUE)
        			.addComponent(jLabel5)
        			.addGap(50)
        			.addComponent(jLabel6)
        			.addGap(30)
        			.addComponent(jLabel7)
        			.addGap(80))
        );
        Right.setLayout(RightLayout);

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Employee Id");

        jempid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jempid.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(Color.WHITE);
        jButton1.setText("Login");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//        	public void actionPerformed(java.awt.event.ActionEvent ae) {
//        		String statement = "Select username, fullname, loccode, deptcode, password, activestatus, lastlogin, usercategory, logincount, loginfail, email, contactno from mstuser where empid = ";
//        		String empid = 
//
//        	}
//        });

        jLabel4.setText("I don't have an account");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jempid)
                                .addComponent(jLabel3)
                                .addComponent(jpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jempid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        SignUpPage SignUpFrame = new SignUpPage();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null); 
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jempid;
}

