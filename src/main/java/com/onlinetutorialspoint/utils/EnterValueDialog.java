/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-03 17:05:06 +0200 (Do., 03 Sep 2020) $
 */
public class EnterValueDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField passwordEdt;
    private JLabel labelTxt;
    private DialogResult dialogResult = DialogResult.NONE;

    public EnterValueDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        dialogResult = DialogResult.OK;
        dispose();
    }

    private void onCancel() {
        dialogResult = DialogResult.CANCEL;
        dispose();
    }

//    public static void main(String[] args) {
//        PasswordDialog dialog = new PasswordDialog();
//        dialog.pack();
//        dialog.setVisible(true);
//        System.exit(0);
//    }

    public void setPassword(String password) {
        passwordEdt.setText(password);
    }

    public String getPassword() {
        return passwordEdt.getText();
    }

    public DialogResult getDialogResult() {
        return dialogResult;
    }

    public void setLabelTxt(String labelTxt) {
        this.labelTxt.setText(labelTxt);

        Dimension maxDimension = new Dimension();
        maxDimension.height = contentPane.getHeight();
        maxDimension.width = contentPane.getWidth() + labelTxt.length() * 5;
        contentPane.setMaximumSize(maxDimension);
        contentPane.setSize(contentPane.getWidth() + labelTxt.length() * 5, contentPane.getHeight());
    }
}
