/*
 * PLPToolAboutBox.java
 */

package plptool.gui.frames;

import plptool.Text;
import plptool.gui.PLPToolApp;
import org.jdesktop.application.Action;
import java.net.URI;
import java.awt.Desktop;

public class AboutBoxDialog extends javax.swing.JDialog
{
	
	public AboutBoxDialog(java.awt.Frame parent)
	{
		super(parent);
		plptool.PLPToolbox.attachHideOnEscapeListener(this);
		initComponents();
		getRootPane().setDefaultButton(closeButton);
		lblVersion.setText(plptool.Version.stamp);
		this.setTitle("About: PLPTool " + plptool.Text.versionString + " ("
				+ plptool.Version.stamp + ")");
		this.setLocationRelativeTo(null);
		txtContact.setText(Text.contactString);
		txtAbout.setText(Text.copyrightString + "\n\n" + PLPToolApp.getBuildInfo()
				+ "\n\nCommand line arguments: "
				+ plptool.PLPToolbox.getCommandLineArgs() + "\nJVM arguments: "
				+ plptool.PLPToolbox.getJVMCommandLineArgs());
		txtThirdParty.setText(Text.thirdPartyCopyrightString);
		txtGPL.setText(Text.GPL);
		txtContact.setCaretPosition(0);
		txtAbout.setCaretPosition(0);
		txtThirdParty.setCaretPosition(0);
		txtGPL.setCaretPosition(0);
	}
	
	@Action
	public void closeAboutBox()
	{
		dispose();
	}
	
	/**
	 * This method is called from within the constructor to initialize the form. WARNING:
	 * Do NOT modify this code. The content of this method is always regenerated by the
	 * Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{
		
		closeButton = new javax.swing.JButton();
		javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
		javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
		javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
		javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		lblVersion = new javax.swing.JLabel();
		tabText = new javax.swing.JTabbedPane();
		panelAbout = new javax.swing.JPanel();
		scrollAbout = new javax.swing.JScrollPane();
		txtAbout = new javax.swing.JTextArea();
		panelContact = new javax.swing.JPanel();
		scrollContact = new javax.swing.JScrollPane();
		txtContact = new javax.swing.JTextArea();
		panelThirdParty = new javax.swing.JPanel();
		scrollThirdParty = new javax.swing.JScrollPane();
		txtThirdParty = new javax.swing.JTextArea();
		panelGPL = new javax.swing.JPanel();
		scrollGPL = new javax.swing.JScrollPane();
		txtGPL = new javax.swing.JTextArea();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(plptool.gui.PLPToolApp.class).getContext()
				.getResourceMap(AboutBoxDialog.class);
		setTitle(resourceMap.getString("title")); // NOI18N
		setModal(true);
		setName("aboutBox"); // NOI18N
		setResizable(false);
		
		javax.swing.ActionMap actionMap = org.jdesktop.application.Application
				.getInstance(plptool.gui.PLPToolApp.class).getContext()
				.getActionMap(AboutBoxDialog.class, this);
		closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
		closeButton.setName("closeButton"); // NOI18N
		
		appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(
				appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD,
				appTitleLabel.getFont().getSize() + 4));
		appTitleLabel.setText(resourceMap.getString("Application.title")); // NOI18N
		appTitleLabel.setName("appTitleLabel"); // NOI18N
		
		appVendorLabel.setText(resourceMap.getString("Application.vendor")); // NOI18N
		appVendorLabel.setName("appVendorLabel"); // NOI18N
		
		appHomepageLabel.setFont(resourceMap.getFont("appHomepageLabel.font")); // NOI18N
		appHomepageLabel.setForeground(resourceMap
				.getColor("appHomepageLabel.foreground")); // NOI18N
		appHomepageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		appHomepageLabel.setText(resourceMap.getString("Application.homepage")); // NOI18N
		appHomepageLabel.setName("appHomepageLabel"); // NOI18N
		appHomepageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt)
			{
				appHomepageLabelMouseReleased(evt);
			}
		});
		
		appDescLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		appDescLabel.setText(resourceMap.getString("appDescLabel.text")); // NOI18N
		appDescLabel.setName("appDescLabel"); // NOI18N
		
		jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
		jLabel1.setName("jLabel1"); // NOI18N
		
		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
		jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
		jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
		jLabel2.setName("jLabel2"); // NOI18N
		jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt)
			{
				jLabel2MouseReleased(evt);
			}
		});
		
		jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
		jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
		jLabel3.setName("jLabel3"); // NOI18N
		
		lblVersion.setFont(resourceMap.getFont("lblVersion.font")); // NOI18N
		lblVersion.setText(resourceMap.getString("lblVersion.text")); // NOI18N
		lblVersion.setName("lblVersion"); // NOI18N
		
		tabText.setName("tabText"); // NOI18N
		
		panelAbout.setName("panelAbout"); // NOI18N
		
		scrollAbout.setName("scrollAbout"); // NOI18N
		
		txtAbout.setColumns(20);
		txtAbout.setEditable(false);
		txtAbout.setFont(resourceMap.getFont("txtAbout.font")); // NOI18N
		txtAbout.setRows(5);
		txtAbout.setName("txtAbout"); // NOI18N
		scrollAbout.setViewportView(txtAbout);
		
		javax.swing.GroupLayout panelAboutLayout = new javax.swing.GroupLayout(panelAbout);
		panelAbout.setLayout(panelAboutLayout);
		panelAboutLayout.setHorizontalGroup(panelAboutLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panelAboutLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollAbout, javax.swing.GroupLayout.DEFAULT_SIZE,
								612, Short.MAX_VALUE).addContainerGap()));
		panelAboutLayout.setVerticalGroup(panelAboutLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panelAboutLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollAbout, javax.swing.GroupLayout.DEFAULT_SIZE,
								227, Short.MAX_VALUE).addContainerGap()));
		
		tabText.addTab(resourceMap.getString("panelAbout.TabConstraints.tabTitle"),
				panelAbout); // NOI18N
		
		panelContact.setName("panelContact"); // NOI18N
		
		scrollContact.setName("scrollContact"); // NOI18N
		
		txtContact.setColumns(20);
		txtContact.setEditable(false);
		txtContact.setFont(resourceMap.getFont("txtContact.font")); // NOI18N
		txtContact.setRows(5);
		txtContact.setName("txtContact"); // NOI18N
		scrollContact.setViewportView(txtContact);
		
		javax.swing.GroupLayout panelContactLayout = new javax.swing.GroupLayout(
				panelContact);
		panelContact.setLayout(panelContactLayout);
		panelContactLayout.setHorizontalGroup(panelContactLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panelContactLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollContact,
								javax.swing.GroupLayout.DEFAULT_SIZE, 612,
								Short.MAX_VALUE).addContainerGap()));
		panelContactLayout.setVerticalGroup(panelContactLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panelContactLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollContact,
								javax.swing.GroupLayout.DEFAULT_SIZE, 227,
								Short.MAX_VALUE).addContainerGap()));
		
		tabText.addTab(resourceMap.getString("panelContact.TabConstraints.tabTitle"),
				panelContact); // NOI18N
		
		panelThirdParty.setName("panelThirdParty"); // NOI18N
		
		scrollThirdParty.setName("scrollThirdParty"); // NOI18N
		
		txtThirdParty.setColumns(20);
		txtThirdParty.setEditable(false);
		txtThirdParty.setFont(resourceMap.getFont("txtThirdParty.font")); // NOI18N
		txtThirdParty.setRows(5);
		txtThirdParty.setName("txtThirdParty"); // NOI18N
		scrollThirdParty.setViewportView(txtThirdParty);
		
		javax.swing.GroupLayout panelThirdPartyLayout = new javax.swing.GroupLayout(
				panelThirdParty);
		panelThirdParty.setLayout(panelThirdPartyLayout);
		panelThirdPartyLayout.setHorizontalGroup(panelThirdPartyLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						panelThirdPartyLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(scrollThirdParty,
										javax.swing.GroupLayout.DEFAULT_SIZE, 612,
										Short.MAX_VALUE).addContainerGap()));
		panelThirdPartyLayout.setVerticalGroup(panelThirdPartyLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panelThirdPartyLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollThirdParty,
								javax.swing.GroupLayout.DEFAULT_SIZE, 227,
								Short.MAX_VALUE).addContainerGap()));
		
		tabText.addTab(resourceMap.getString("panelThirdParty.TabConstraints.tabTitle"),
				panelThirdParty); // NOI18N
		
		panelGPL.setName("panelGPL"); // NOI18N
		
		scrollGPL.setName("scrollGPL"); // NOI18N
		
		txtGPL.setColumns(20);
		txtGPL.setEditable(false);
		txtGPL.setFont(resourceMap.getFont("txtGPL.font")); // NOI18N
		txtGPL.setRows(5);
		txtGPL.setName("txtGPL"); // NOI18N
		scrollGPL.setViewportView(txtGPL);
		
		javax.swing.GroupLayout panelGPLLayout = new javax.swing.GroupLayout(panelGPL);
		panelGPL.setLayout(panelGPLLayout);
		panelGPLLayout.setHorizontalGroup(panelGPLLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panelGPLLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollGPL, javax.swing.GroupLayout.DEFAULT_SIZE,
								612, Short.MAX_VALUE).addContainerGap()));
		panelGPLLayout.setVerticalGroup(panelGPLLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panelGPLLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollGPL, javax.swing.GroupLayout.DEFAULT_SIZE,
								227, Short.MAX_VALUE).addContainerGap()));
		
		tabText.addTab(resourceMap.getString("panelGPL.TabConstraints.tabTitle"),
				panelGPL); // NOI18N
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						closeButton)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						lblVersion,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						447,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		10,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel3))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		appTitleLabel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		321,
																		Short.MAX_VALUE)
																.addGap(18, 18, 18)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						appHomepageLabel,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						appDescLabel,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						298,
																						Short.MAX_VALUE))
																.addContainerGap())))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(appVendorLabel,
										javax.swing.GroupLayout.DEFAULT_SIZE, 451,
										Short.MAX_VALUE).addGap(196, 196, 196))
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(tabText,
										javax.swing.GroupLayout.DEFAULT_SIZE, 637,
										Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(appTitleLabel)
												.addComponent(appDescLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(appVendorLabel)
												.addComponent(appHomepageLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(tabText,
										javax.swing.GroupLayout.DEFAULT_SIZE, 274,
										Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(lblVersion)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(closeButton)
																.addContainerGap())
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.Alignment.TRAILING))));
		
		pack();
	}// </editor-fold>//GEN-END:initComponents
	
	private void jLabel2MouseReleased(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jLabel2MouseReleased
		Desktop desktop = Desktop.getDesktop();
		if (desktop.isSupported(Desktop.Action.BROWSE))
		{
			try
			{
				URI uri = new URI("http://www.gnu.org/licenses/gpl.html");
				desktop.browse(uri);
			}
			catch (Exception e)
			{
			}
		}
	}// GEN-LAST:event_jLabel2MouseReleased
	
	private void appHomepageLabelMouseReleased(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_appHomepageLabelMouseReleased
		Desktop desktop = Desktop.getDesktop();
		if (desktop.isSupported(Desktop.Action.BROWSE))
		{
			try
			{
				URI uri = new URI("http://plp.okstate.edu");
				desktop.browse(uri);
			}
			catch (Exception e)
			{
			}
		}
	}// GEN-LAST:event_appHomepageLabelMouseReleased
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton closeButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel lblVersion;
	private javax.swing.JPanel panelAbout;
	private javax.swing.JPanel panelContact;
	private javax.swing.JPanel panelGPL;
	private javax.swing.JPanel panelThirdParty;
	private javax.swing.JScrollPane scrollAbout;
	private javax.swing.JScrollPane scrollContact;
	private javax.swing.JScrollPane scrollGPL;
	private javax.swing.JScrollPane scrollThirdParty;
	private javax.swing.JTabbedPane tabText;
	private javax.swing.JTextArea txtAbout;
	private javax.swing.JTextArea txtContact;
	private javax.swing.JTextArea txtGPL;
	private javax.swing.JTextArea txtThirdParty;
	// End of variables declaration//GEN-END:variables
	
}