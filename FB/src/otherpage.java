import java.sql.SQLException;

/*
 * otherpage.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class otherpage extends javax.swing.JFrame {

	/** Creates new form otherpage */
	public otherpage() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea3 = new javax.swing.JTextArea();
		jTextField2 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
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

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(153, 153, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 204,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 245,
				Short.MAX_VALUE));

		jButton4.setFont(new java.awt.Font("Chiller", 1, 48));
		jButton4.setForeground(new java.awt.Color(0, 0, 204));
		jButton4.setText("Face Book");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton4ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

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

		jButton5.setText("sign out");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jPanel2.setBackground(new java.awt.Color(153, 153, 255));

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jLabel1.setFont(new java.awt.Font("Chiller", 1, 24));
		jLabel1.setText("fans");

		jTextArea3.setColumns(20);
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

		jLabel4.setFont(new java.awt.Font("Chiller", 1, 36));
		jLabel4.setText("current status");

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
																		.addContainerGap()
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				209,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
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
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane3,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								436,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												301,
																												Short.MAX_VALUE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												128,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGap(1, 1, 1)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				28,
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
																				241,
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
																		.addGap(
																				80,
																				80,
																				80)
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				47,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				68,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

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
						.addGap(0, 1077, Short.MAX_VALUE)
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
																204,
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
						.addGap(0, 535, Short.MAX_VALUE)
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
														.addComponent(
																jPanel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		//////////////////////////////////////////////////////////////////////////////////////////////////
		Main.otheruser.setStatus(jTextField2.getText());
		Main.ChangeStatus();
		jTextField2.setText(null);
		jTextArea3.setText(Main.otheruser.getStatus());
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		new WelcomeToFaceBook().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		///////////////////////////////////////////////////////////////////////////////////////////////////
		if (Main.UnFriend(jTextField1.getText())) {
			dispose();
			new FaceBook().setVisible(true);
		} else {
			jTextField1.setText("relation does not exist");
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		////////////////////////////////////////////////////////////////////////////////////////////////////

		if (Main.AddFriend(jTextField1.getText())) {
			dispose();
			new FaceBook().setVisible(true);
		} else {
			jTextField1.setText("user does not exist");
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		if (Main.Find(jTextField1.getText())) {
			dispose();
			new FaceBook2().setVisible(true);
		} else if (Main.FindPage(jTextField1.getText())) {
			dispose();
			new FaceBook2().setVisible(true);
		} else {
			jTextField1.setText("user or page does not exist");
		}
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		dispose();
		new FaceBook().setVisible(true);
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
				new otherpage().setVisible(true);
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
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveMenuItem;
	// End of variables declaration//GEN-END:variables

}