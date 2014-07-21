/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sommerard.passwordgenerator.application;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.UIManager;

/**
 * @author Romain SOMMERARD
 */
public class Window extends javax.swing.JFrame {

	private PasswordGenerator _passGen;

	public Window() {
		this.initComponents();
		this.init();
	}

	private void init() {
		this._passGen = new PasswordGenerator();
		this.jTextFieldPassword.setEditable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/sommerard/passwordgenerator/resources/icon.png")));
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		buttonGroupLength = new javax.swing.ButtonGroup();
		jPopupMenuEdit = new javax.swing.JPopupMenu();
		jMenuItemCopy = new javax.swing.JMenuItem();
		jPanelMain = new javax.swing.JPanel();
		jPanelPassword = new javax.swing.JPanel();
		jTextFieldPassword = new javax.swing.JTextField();
		jButtonGenerate = new javax.swing.JButton();
		jMenuBarMain = new javax.swing.JMenuBar();
		jMenuFile = new javax.swing.JMenu();
		jMenuItemExit = new javax.swing.JMenuItem();
		jMenuOptions = new javax.swing.JMenu();
		jCheckBoxMenuItemNumber = new javax.swing.JCheckBoxMenuItem();
		jCheckBoxMenuItemUppercase = new javax.swing.JCheckBoxMenuItem();
		jCheckBoxMenuItemLowercase = new javax.swing.JCheckBoxMenuItem();
		jCheckBoxMenuItemSpecialChars = new javax.swing.JCheckBoxMenuItem();
		jSeparatorOptions = new javax.swing.JPopupMenu.Separator();
		jMenuPasswordLength = new javax.swing.JMenu();
		jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
		jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
		jRadioButtonMenuItem16 = new javax.swing.JRadioButtonMenuItem();
		jRadioButtonMenuItem32 = new javax.swing.JRadioButtonMenuItem();

		jPopupMenuEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jPopupMenuEdit.setPreferredSize(new java.awt.Dimension(135, 28));

		jMenuItemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_C,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItemCopy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jMenuItemCopy.setText("Copy");
		jMenuItemCopy.setToolTipText("");
		jMenuItemCopy.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemCopyActionPerformed(evt);
			}
		});
		jPopupMenuEdit.add(jMenuItemCopy);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Password Generator");
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setResizable(false);
		addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				formMouseClicked(evt);
			}
		});

		jPanelPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(
				null, "Password",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 1, 12))); // NOI18N
		jPanelPassword.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

		jTextFieldPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		jTextFieldPassword
				.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextFieldPassword.setCursor(new java.awt.Cursor(
				java.awt.Cursor.TEXT_CURSOR));
		jTextFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextFieldPasswordMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanelPasswordLayout = new javax.swing.GroupLayout(
				jPanelPassword);
		jPanelPassword.setLayout(jPanelPasswordLayout);
		jPanelPasswordLayout
				.setHorizontalGroup(jPanelPasswordLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelPasswordLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jTextFieldPassword,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												380, Short.MAX_VALUE)
										.addContainerGap()));
		jPanelPasswordLayout.setVerticalGroup(jPanelPasswordLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanelPasswordLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(jTextFieldPassword,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		jButtonGenerate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		jButtonGenerate.setText("Generate");
		jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonGenerateActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(
				jPanelMain);
		jPanelMain.setLayout(jPanelMainLayout);
		jPanelMainLayout.setHorizontalGroup(jPanelMainLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanelMainLayout
								.createSequentialGroup()
								.addGap(189, 189, 189)
								.addComponent(jButtonGenerate)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanelMainLayout
								.createSequentialGroup()
								.addContainerGap(30, Short.MAX_VALUE)
								.addComponent(jPanelPassword,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(30, 30, 30)));
		jPanelMainLayout.setVerticalGroup(jPanelMainLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanelMainLayout
						.createSequentialGroup()
						.addGap(30, 30, 30)
						.addComponent(jPanelPassword,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, Short.MAX_VALUE)
						.addComponent(jButtonGenerate,
								javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)));

		jMenuBarMain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

		jMenuFile.setText("File");
		jMenuFile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

		jMenuItemExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jMenuItemExit.setText("Exit");
		jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemExitActionPerformed(evt);
			}
		});
		jMenuFile.add(jMenuItemExit);

		jMenuBarMain.add(jMenuFile);

		jMenuOptions.setText("Options");
		jMenuOptions.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

		jCheckBoxMenuItemNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jCheckBoxMenuItemNumber.setSelected(true);
		jCheckBoxMenuItemNumber.setText("Numbers");
		jCheckBoxMenuItemNumber
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jCheckBoxMenuItemNumberActionPerformed(evt);
					}
				});
		jMenuOptions.add(jCheckBoxMenuItemNumber);

		jCheckBoxMenuItemUppercase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jCheckBoxMenuItemUppercase.setSelected(true);
		jCheckBoxMenuItemUppercase.setText("Uppercase");
		jCheckBoxMenuItemUppercase
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jCheckBoxMenuItemUppercaseActionPerformed(evt);
					}
				});
		jMenuOptions.add(jCheckBoxMenuItemUppercase);

		jCheckBoxMenuItemLowercase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jCheckBoxMenuItemLowercase.setSelected(true);
		jCheckBoxMenuItemLowercase.setText("Lowercase");
		jCheckBoxMenuItemLowercase
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jCheckBoxMenuItemLowercaseActionPerformed(evt);
					}
				});
		jMenuOptions.add(jCheckBoxMenuItemLowercase);

		jCheckBoxMenuItemSpecialChars
				.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jCheckBoxMenuItemSpecialChars.setSelected(true);
		jCheckBoxMenuItemSpecialChars.setText("Special Chars");
		jCheckBoxMenuItemSpecialChars
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jCheckBoxMenuItemSpecialCharsActionPerformed(evt);
					}
				});
		jMenuOptions.add(jCheckBoxMenuItemSpecialChars);
		jMenuOptions.add(jSeparatorOptions);

		jMenuPasswordLength.setText("Length");
		jMenuPasswordLength.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

		buttonGroupLength.add(jRadioButtonMenuItem4);
		jRadioButtonMenuItem4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jRadioButtonMenuItem4.setText("4");
		jRadioButtonMenuItem4.setActionCommand("");
		jRadioButtonMenuItem4
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRadioButtonMenuItem4ActionPerformed(evt);
					}
				});
		jMenuPasswordLength.add(jRadioButtonMenuItem4);

		buttonGroupLength.add(jRadioButtonMenuItem8);
		jRadioButtonMenuItem8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jRadioButtonMenuItem8.setSelected(true);
		jRadioButtonMenuItem8.setText("8");
		jRadioButtonMenuItem8
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRadioButtonMenuItem8ActionPerformed(evt);
					}
				});
		jMenuPasswordLength.add(jRadioButtonMenuItem8);

		buttonGroupLength.add(jRadioButtonMenuItem16);
		jRadioButtonMenuItem16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jRadioButtonMenuItem16.setText("16");
		jRadioButtonMenuItem16
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRadioButtonMenuItem16ActionPerformed(evt);
					}
				});
		jMenuPasswordLength.add(jRadioButtonMenuItem16);

		buttonGroupLength.add(jRadioButtonMenuItem32);
		jRadioButtonMenuItem32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jRadioButtonMenuItem32.setText("32");
		jRadioButtonMenuItem32
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jRadioButtonMenuItem32ActionPerformed(evt);
					}
				});
		jMenuPasswordLength.add(jRadioButtonMenuItem32);

		jMenuOptions.add(jMenuPasswordLength);

		jMenuBarMain.add(jMenuOptions);

		setJMenuBar(jMenuBarMain);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemExitActionPerformed
		System.exit(0);
	}// GEN-LAST:event_jMenuItemExitActionPerformed

	private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGenerateActionPerformed
		this.jTextFieldPassword.setText(this._passGen.generatePassword());
	}// GEN-LAST:event_jButtonGenerateActionPerformed

	private void jCheckBoxMenuItemNumberActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBoxMenuItemNumberActionPerformed
		if (this.jCheckBoxMenuItemNumber.isSelected())
			this._passGen.setNumberActivate(true);
		else
			this._passGen.setNumberActivate(false);

		this.checkBoxUpdate();
	}// GEN-LAST:event_jCheckBoxMenuItemNumberActionPerformed

	private void jCheckBoxMenuItemUppercaseActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBoxMenuItemUppercaseActionPerformed
		if (this.jCheckBoxMenuItemUppercase.isSelected())
			this._passGen.setUppercaseActivate(true);
		else
			this._passGen.setUppercaseActivate(false);

		this.checkBoxUpdate();
	}// GEN-LAST:event_jCheckBoxMenuItemUppercaseActionPerformed

	private void jCheckBoxMenuItemLowercaseActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBoxMenuItemLowercaseActionPerformed
		if (this.jCheckBoxMenuItemLowercase.isSelected())
			this._passGen.setLowercaseActivate(true);
		else
			this._passGen.setLowercaseActivate(false);

		this.checkBoxUpdate();
	}// GEN-LAST:event_jCheckBoxMenuItemLowercaseActionPerformed

	private void jCheckBoxMenuItemSpecialCharsActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBoxMenuItemSpecialCharsActionPerformed
		if (this.jCheckBoxMenuItemSpecialChars.isSelected())
			this._passGen.setSpecialCharsActivate(true);
		else
			this._passGen.setSpecialCharsActivate(false);

		this.checkBoxUpdate();
	}// GEN-LAST:event_jCheckBoxMenuItemSpecialCharsActionPerformed

	private void jRadioButtonMenuItem4ActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
		this.selectedPasswordLength(4);
	}// GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

	private void jRadioButtonMenuItem8ActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonMenuItem8ActionPerformed
		this.selectedPasswordLength(8);
	}// GEN-LAST:event_jRadioButtonMenuItem8ActionPerformed

	private void jRadioButtonMenuItem16ActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonMenuItem16ActionPerformed
		this.selectedPasswordLength(16);
	}// GEN-LAST:event_jRadioButtonMenuItem16ActionPerformed

	private void jRadioButtonMenuItem32ActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonMenuItem32ActionPerformed
		this.selectedPasswordLength(32);
	}// GEN-LAST:event_jRadioButtonMenuItem32ActionPerformed

	private void jTextFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTextFieldPasswordMouseClicked
		this.jTextFieldPassword.requestFocus();
		this.jTextFieldPassword.selectAll();
		if ((evt.getButton() == MouseEvent.BUTTON3)
				&& (this.jTextFieldPassword.getSelectedText() != null)) {
			this.jPopupMenuEdit.show(this.jTextFieldPassword, evt.getX(),
					evt.getY());
		}
	}// GEN-LAST:event_jTextFieldPasswordMouseClicked

	private void jMenuItemCopyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemCopyActionPerformed
		this.jTextFieldPassword.copy();
	}// GEN-LAST:event_jMenuItemCopyActionPerformed

	private void formMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseClicked
		this.jTextFieldPassword.select(0, 0);
	}// GEN-LAST:event_formMouseClicked

	private void selectedPasswordLength(int length) {
		this._passGen.setPasswordLength(length);
	}

	private void checkBoxUpdate() {
		this.jCheckBoxMenuItemLowercase.setSelected(this._passGen
				.isLowercaseActivate());
		this.jCheckBoxMenuItemNumber.setSelected(this._passGen
				.isNumberActivate());
		this.jCheckBoxMenuItemSpecialChars.setSelected(this._passGen
				.isSpecialCharsActivate());
		this.jCheckBoxMenuItemUppercase.setSelected(this._passGen
				.isUppercaseActivate());
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Window.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Window.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Window.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Window.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Window().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.ButtonGroup buttonGroupLength;
	private javax.swing.JButton jButtonGenerate;
	private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemLowercase;
	private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemNumber;
	private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemSpecialChars;
	private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemUppercase;
	private javax.swing.JMenuBar jMenuBarMain;
	private javax.swing.JMenu jMenuFile;
	private javax.swing.JMenuItem jMenuItemCopy;
	private javax.swing.JMenuItem jMenuItemExit;
	private javax.swing.JMenu jMenuOptions;
	private javax.swing.JMenu jMenuPasswordLength;
	private javax.swing.JPanel jPanelMain;
	private javax.swing.JPanel jPanelPassword;
	private javax.swing.JPopupMenu jPopupMenuEdit;
	private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem16;
	private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem32;
	private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
	private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem8;
	private javax.swing.JPopupMenu.Separator jSeparatorOptions;
	private javax.swing.JTextField jTextFieldPassword;
	// End of variables declaration//GEN-END:variables
}
