import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * FaceBook.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class FaceBook extends javax.swing.JFrame {

	/** Creates new form FaceBook 
	 * @throws SQLException */
	public FaceBook() throws SQLException {
		initComponents();
	}
	int i=0;
	ArrayList<String> suggest=new ArrayList<String>();
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() throws SQLException {

		jFrame1 = new javax.swing.JFrame();
		jFrame2 = new javax.swing.JFrame();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea3 = new javax.swing.JTextArea();
		jTextField2 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton7 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jTextField4 = new javax.swing.JTextField();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		openMenuItem = new javax.swing.JMenuItem();
		saveMenuItem = new javax.swing.JMenuItem();
		saveAsMenuItem = new javax.swing.JMenuItem();
		exitMenuItem = new javax.swing.JMenuItem();
		editMenu = new javax.swing.JMenu();
		cutMenuItem = new javax.swing.JMenuItem();
		copyMenuItem = new javax.swing.JMenuItem();
		pasteMenuItem = new javax.swing.JMenuItem();
		deleteMenuItem = new javax.swing.JMenuItem();
		helpMenu = new javax.swing.JMenu();
		contentsMenuItem = new javax.swing.JMenuItem();
		aboutMenuItem = new javax.swing.JMenuItem();
		Main.GetDetail();
		ImageIcon image;
		JFrame frame = new JFrame();
		JLabel label;
		image = new ImageIcon(Main.user.getImage());
	    label = new JLabel(image);
	    label.setIcon(image);
	    jPanel1.add(label);
	    frame.getContentPane().add(jPanel1);
	    frame.setSize(300, 300);
	    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.dispose();
	    jLabel2.setText(Main.user.getName());
	    ArrayList<String> friends=Main.Getfriends(Main.user.getEmail());
		String str="";
		String myemail=Main.user.getEmail();
		for (String string : friends) {
			Main.user.setEmail(string);
			Main.GetDetail();
			str=str+Main.user.getName()+"\n";
		}
		Main.user.setEmail(myemail);
		jTextArea1.setText(str);
		
		String str2="";
		if(Main.user.getStatus()==null){
			jTextArea3.setText(str2);
		}
		else{
			jTextArea3.setText(Main.user.getStatus());
		}
		String str3="";
		ArrayList<String> pages=Main.GetInterest(Main.user.getEmail());
		for (String string : pages) {
			str3=string+"\n";
		}
		jTextArea2.setText(str3);
		/*suggest=Main.Suggest(Main.user.getEmail());
		if(suggest.size()==0){
			jTextField4.setText("no idea for suggesting");
		}
		else{
			jTextField4.setText(suggest.get(0));
		}*/
		
		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(
				jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(
				jFrame2.getContentPane());
		jFrame2.getContentPane().setLayout(jFrame2Layout);
		jFrame2Layout.setHorizontalGroup(jFrame2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		jFrame2Layout.setVerticalGroup(jFrame2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton1.setText("search");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton2.setText("unfriend");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton3.setText("add friend");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton3ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton4.setFont(new java.awt.Font("Chiller", 1, 48));
		jButton4.setForeground(new java.awt.Color(0, 0, 204));
		jButton4.setText("Face Book");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("sign out");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(153, 153, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 203,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 245,
				Short.MAX_VALUE));

		jPanel2.setBackground(new java.awt.Color(153, 153, 255));

		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jLabel1.setFont(new java.awt.Font("Chiller", 1, 24));
		jLabel1.setText("friends");

		jTextArea2.setColumns(20);
		jTextArea2.setEditable(false);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jLabel3.setFont(new java.awt.Font("Chiller", 1, 24));
		jLabel3.setText("interests");

		jTextArea3.setColumns(20);
		jTextArea3.setEditable(false);
		jTextArea3.setRows(5);
		jScrollPane3.setViewportView(jTextArea3);

		jButton6.setText("change status");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton6ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel4.setFont(new java.awt.Font("Chiller", 1, 24));
		jLabel4.setText("current status");

		jButton7.setText("add interest");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton7ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				73,
																				73,
																				73)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jScrollPane3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								436,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField2)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												128,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				81,
																				81,
																				81)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jScrollPane2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								429,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												288,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jButton7,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				24,
																				24,
																				24)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								106,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								179,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				47,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												106,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jScrollPane1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																		.addGap(
																				12,
																				12,
																				12))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				19,
																				19,
																				19)
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				194,
																				Short.MAX_VALUE)
																		.addContainerGap()))));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				26,
																				26,
																				26)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton6)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								22,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jScrollPane3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				22,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				42,
																				42,
																				42)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton7))
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				96,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				7,
																				7,
																				7)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				22,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				258,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				22,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				39,
																				39,
																				39))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				55,
																				Short.MAX_VALUE)
																		.addContainerGap()))));

		jPanel3.setBackground(new java.awt.Color(51, 102, 255));

		jButton8.setText("add friend");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton8ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton9.setText("change suggest");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton9,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																179,
																Short.MAX_VALUE)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																179,
																Short.MAX_VALUE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																179,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jTextField4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton9).addGap(24, 24,
												24)));

		jButton10.setText("change picture");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton11.setText("confirm path");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton11ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		fileMenu.setText("File");

		openMenuItem.setText("Open");
		fileMenu.add(openMenuItem);

		saveMenuItem.setText("Save");
		fileMenu.add(saveMenuItem);

		saveAsMenuItem.setText("Save As ...");
		fileMenu.add(saveAsMenuItem);

		exitMenuItem.setText("Exit");
		exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});
		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		editMenu.setText("Edit");

		cutMenuItem.setText("Cut");
		editMenu.add(cutMenuItem);

		copyMenuItem.setText("Copy");
		editMenu.add(copyMenuItem);

		pasteMenuItem.setText("Paste");
		editMenu.add(pasteMenuItem);

		deleteMenuItem.setText("Delete");
		editMenu.add(deleteMenuItem);

		menuBar.add(editMenu);

		helpMenu.setText("Help");

		contentsMenuItem.setText("Contents");
		helpMenu.add(contentsMenuItem);

		aboutMenuItem.setText("About");
		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		setJMenuBar(menuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPanel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton10,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																203,
																Short.MAX_VALUE)
														.addComponent(
																jButton11,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																203,
																Short.MAX_VALUE))
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				194,
																				194,
																				194)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				296,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				24,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton5)
																		.addGap(
																				27,
																				27,
																				27))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				126,
																				126,
																				126)
																		.addComponent(
																				jPanel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton1)
																		.addComponent(
																				jButton3)
																		.addComponent(
																				jButton2)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				57,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(jButton5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton10)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton11)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jPanel3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		if (Main.AddFriend(jTextField4.getText())) {
			jTextField1.setText("user added to your friends");
		} else {
			jTextField1.setText("user does not exist");
		}
		ArrayList<String> string=Main.Suggest(Main.user.getEmail());
		if(string==null){
			jTextField4.setText("no idea for suggesting");
		}
		else{
			jTextField4.setText(string.get(0));
		}
		ArrayList<String> friends=Main.Getfriends(Main.user.getEmail());
		String str="";
		String myemail=Main.user.getEmail();
		for (String string2 : friends) {
			Main.user.setEmail(string2);
			Main.GetDetail();
			str=str+Main.user.getName()+"\n";
		}
		Main.user.setEmail(myemail);
		jTextArea1.setText(str);
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		if(++i<suggest.size()-1){
			jTextField4.setText(suggest.get(i));
		}
		else{
			if(suggest.size()==0){
				jTextField4.setText("no idea for suggesting");
			}
			else{
				jTextField4.setText(suggest.get(0));
			}
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException {
		//////////////////////////////////////////////////////////////////////////
		Main.page.setName(jTextField3.getText());
		Main.page.setImage("c:\\\\images\\\\0.png");
		Main.GetPageDetail();
		if (Main.AddInterest(jTextField3.getText())) {
			dispose();
			new page().setVisible(true);
		} else {
			ArrayList<String> list = new ArrayList<String>();
			list = Main.GetInterest(Main.user.getEmail());
			String interests = "";
			for (String string : list) {
				interests = interests + string + "\n";
			}
			jTextArea2.setText(interests);
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException {
		//////////////////////////////////////////////////////////////////////////////////////////////////
		Main.user.setStatus(jTextField2.getText());
		Main.ChangeStatus();
		jTextField2.setText(null);
		jTextArea3.setText(Main.user.getStatus());
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException {
		///////////////////////////////////////////////////////////////////////////////////////////////////
		if (Main.UnFriend(jTextField1.getText())) {
			jTextField1.setText("user unfriended with you");
		} else {
			jTextField1.setText("relation does not exist");
		}
		/*ArrayList<String> string=Main.Suggest(Main.user.getEmail());
		if(string==null){
			jTextField4.setText("no idea for suggesting");
		}
		else{
			jTextField4.setText(string.get(0));
		}*/
		ArrayList<String> friends=Main.Getfriends(Main.user.getEmail());
		String str="";
		String myemail=Main.user.getEmail();
		for (String string2 : friends) {
			Main.user.setEmail(string2);
			Main.GetDetail();
			str=str+Main.user.getName()+"\n";
		}
		Main.user.setEmail(myemail);
		jTextArea1.setText(str);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException {
		////////////////////////////////////////////////////////////////////////////////////////////////////
		if (Main.AddFriend(jTextField1.getText())) {
			jTextField1.setText("user added to your friends");
		} else {
			jTextField1.setText("user does not exist");
		}
		/*ArrayList<String> string=Main.Suggest(Main.user.getEmail());
		if(string==null){
			jTextField4.setText("no idea for suggesting");
		}
		else{
			jTextField4.setText(string.get(0));
		}*/
		ArrayList<String> friends=Main.Getfriends(Main.user.getEmail());
		String str="";
		String myemail=Main.user.getEmail();
		for (String string2 : friends) {
			Main.user.setEmail(string2);
			Main.GetDetail();
			str=str+Main.user.getName()+"\n";
		}
		Main.user.setEmail(myemail);
		jTextArea1.setText(str);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException {
		if (Main.Find(jTextField1.getText())) {
			dispose();
			new FaceBook2().setVisible(true);
		} else if (Main.FindPage(jTextField1.getText())) {
			dispose();
			new page().setVisible(true);
		} else {
			jTextField1.setText("user or page does not exist");
		}
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException {
		/*ImageIcon image;
		   JInternalFrame frame = new JInternalFrame();
		   JLabel label;
		       image = new ImageIcon("c:\\images\\1.png");
		       label = new JLabel(image);
		       label.setIcon(image);
		       jPanel1.add(label);
		       frame.getContentPane().add(jPanel1);
		       frame.setSize(300, 300);
		       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		       frame.setVisible(true);
		       //frame.dispose();
		 */
		dispose();
		new FaceBook().setVisible(true);
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		new FileExplorer().setVisible(true);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		new WelcomeToFaceBook().setVisible(true);
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}//GEN-LAST:event_exitMenuItemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					new FaceBook().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JMenuItem contentsMenuItem;
	private javax.swing.JMenuItem copyMenuItem;
	private javax.swing.JMenuItem cutMenuItem;
	private javax.swing.JMenuItem deleteMenuItem;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JFrame jFrame2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextArea jTextArea3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveMenuItem;
	// End of variables declaration//GEN-END:variables

}