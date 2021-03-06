/*
    Copyright 2010-2012 David Fritz, Brian Gordon, Wira Mulia

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

package plptool.gui.frames;

import plptool.ArchRegistry;
import plptool.gui.ProjectDriver;

/**
 *
 * @author wira
 */
public class ISASelector extends javax.swing.JDialog
{
	private Object[][] archs;
	private ProjectDriver plp;
	
	/** Creates new form ISASelector */
	public ISASelector(java.awt.Frame parent, ProjectDriver plp)
	{
		super(parent, true);
		initComponents();
		this.plp = plp;
		populateISASelector();
	}
	
	public final void populateISASelector()
	{
		cmbISA.removeAllItems();
		archs = ArchRegistry.getArchList();
		for (int i = 0; i < archs.length; i++)
		{
			cmbISA.addItem(archs[i][2] + " - ID:" + archs[i][0] + " ("
					+ ((Class) archs[i][1]).getCanonicalName() + ")");
		}
	}
	
	/**
	 * This method is called from within the constructor to initialize the form. WARNING:
	 * Do NOT modify this code. The content of this method is always regenerated by the
	 * Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{
		
		jLabel1 = new javax.swing.JLabel();
		cmbISA = new javax.swing.JComboBox<String>();
		jLabel2 = new javax.swing.JLabel();
		btnSet = new javax.swing.JButton();
		btnCancel = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtDescription = new javax.swing.JTextArea();
		
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(plptool.gui.PLPToolApp.class).getContext()
				.getResourceMap(ISASelector.class);
		setTitle(resourceMap.getString("Form.title")); // NOI18N
		setName("Form"); // NOI18N
		setResizable(false);
		
		jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
		jLabel1.setName("jLabel1"); // NOI18N
		
		cmbISA.setName("cmbISA"); // NOI18N
		cmbISA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				cmbISAActionPerformed(evt);
			}
		});
		
		jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
		jLabel2.setName("jLabel2"); // NOI18N
		
		btnSet.setText(resourceMap.getString("btnSet.text")); // NOI18N
		btnSet.setName("btnSet"); // NOI18N
		btnSet.setPreferredSize(new java.awt.Dimension(100, 23));
		btnSet.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				btnSetActionPerformed(evt);
			}
		});
		
		btnCancel.setText(resourceMap.getString("btnCancel.text")); // NOI18N
		btnCancel.setName("btnCancel"); // NOI18N
		btnCancel.setPreferredSize(new java.awt.Dimension(100, 23));
		btnCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				btnCancelActionPerformed(evt);
			}
		});
		
		jScrollPane1.setName("jScrollPane1"); // NOI18N
		
		txtDescription.setColumns(20);
		txtDescription.setEditable(false);
		txtDescription.setLineWrap(true);
		txtDescription.setRows(5);
		txtDescription.setWrapStyleWord(true);
		txtDescription.setName("txtDescription"); // NOI18N
		jScrollPane1.setViewportView(txtDescription);
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(cmbISA, 0, 710,
														Short.MAX_VALUE)
												.addComponent(jLabel1)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		btnCancel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		btnSet,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jLabel2)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														710, Short.MAX_VALUE))
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1)
						.addPreferredGap(
								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(cmbISA, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(
								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(
								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel2)
						.addGap(18, 18, 18)
						.addGroup(
								layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnCancel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSet,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		
		pack();
	}// </editor-fold>//GEN-END:initComponents
	
	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_btnCancelActionPerformed
		this.setVisible(false);
	}// GEN-LAST:event_btnCancelActionPerformed
	
	private void btnSetActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_btnSetActionPerformed
		if (plp.isSimulating())
			plp.desimulate();
		plp.setArch((Integer) archs[cmbISA.getSelectedIndex()][0]);
		plp.assemble();
		this.setVisible(false);
	}// GEN-LAST:event_btnSetActionPerformed
	
	private void cmbISAActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_cmbISAActionPerformed
		if (cmbISA.getSelectedIndex() != -1)
		{
			txtDescription.setText((String) archs[cmbISA.getSelectedIndex()][3]);
		}
	}// GEN-LAST:event_cmbISAActionPerformed
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCancel;
	private javax.swing.JButton btnSet;
	private javax.swing.JComboBox<String> cmbISA;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea txtDescription;
	// End of variables declaration//GEN-END:variables
	
}
