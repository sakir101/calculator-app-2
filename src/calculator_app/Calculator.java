package calculator_app;

import java.text.DecimalFormat;
import java.util.Stack;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
        disable1();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        displayTextField1 = new javax.swing.JTextField();
        powButton3 = new javax.swing.JButton();
        displayTextField = new javax.swing.JTextField();
        onRadioButton = new javax.swing.JRadioButton();
        offRadioButton = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        display2TextField = new javax.swing.JTextField();
        powButton1 = new javax.swing.JButton();
        sbracketButton = new javax.swing.JButton();
        fbracketButton = new javax.swing.JButton();

        displayTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        displayTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        powButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        powButton3.setText("^");
        powButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        displayTextField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        displayTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(onRadioButton);
        onRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        onRadioButton.setText("ON");
        onRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(offRadioButton);
        offRadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        offRadioButton.setText("OFF");
        offRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offRadioButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        backButton.setText("<--");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        plusButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(153, 153, 153));
        eightButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        sevenButton.setBackground(new java.awt.Color(153, 153, 153));
        sevenButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        nineButton.setBackground(new java.awt.Color(153, 153, 153));
        nineButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        minusButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(153, 153, 153));
        sixButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        mulButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        mulButton.setText("*");
        mulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulButtonActionPerformed(evt);
            }
        });

        fiveButton.setBackground(new java.awt.Color(153, 153, 153));
        fiveButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        fourButton.setBackground(new java.awt.Color(153, 153, 153));
        fourButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        threeButton.setBackground(new java.awt.Color(153, 153, 153));
        threeButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        divButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        divButton.setText("/");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        twoButton.setBackground(new java.awt.Color(153, 153, 153));
        twoButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        oneButton.setBackground(new java.awt.Color(153, 153, 153));
        oneButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        equalButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });

        pointButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        pointButton.setText(".");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });

        zeroButton.setBackground(new java.awt.Color(153, 153, 153));
        zeroButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Scientific Calculator");

        display2TextField.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        display2TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2TextFieldActionPerformed(evt);
            }
        });

        powButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        powButton1.setText("^");
        powButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powButton1ActionPerformed(evt);
            }
        });

        sbracketButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sbracketButton.setText(")");
        sbracketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbracketButtonActionPerformed(evt);
            }
        });

        fbracketButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        fbracketButton.setText("(");
        fbracketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbracketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(display2TextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(onRadioButton)
                                    .addComponent(offRadioButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(powButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fbracketButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sbracketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(twoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(divButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(display2TextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(onRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offRadioButton))
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(powButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sbracketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fbracketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static String s = "0";
    static int i = 0;
    static String op = "+";

    static double curNum = 0.00;
    static double curNum2 = 0.00;
    static char[] operator = op.toCharArray();

    static int l2 = 0;
    static int l3 = 0;
    static int p;

    static String str2 = "p";

    static char[] arr = new char[s.length()];
    static char[] arr3 = new char[1000];
    static int q1 = 0;
    static double m = 0;
    static char n = '+';

    public static double bracket(double number, char c) {
        Stack<Double> stack2 = new Stack<>();
        String op2 = "+";
        char[] operator2 = op2.toCharArray();
        double total2 = 0;
        l3 = 0;
        for (i = i + 1; i < arr.length; i++) {

            if (arr[i] == '(') {
                q1 = 1;
                if (arr[i - 1] == '*') {
                    int o;
                    char c1 = arr[i - 1];
                    stack2.push(bracket(stack2.pop(), c1));
                    continue;
                } else if (arr[i - 1] == '/') {
                    int o;
                    char c1 = arr[i - 1];
                    stack2.push(bracket(stack2.pop(), c1));
                    continue;
                } else if (arr[i - 1] == '-') {

                    stack2.push(bracket(0.00, '-'));
                    continue;
                } else {

                    stack2.push(bracket(0.00, '+'));

                    continue;
                }
            }
            if (arr[i] == ')') {
                q1 = 0;
                while (!stack2.isEmpty()) {
                    total2 += stack2.pop();
                }

                if (c == '-') {
                    total2 *= -1;
                }
                if (c == '*') {
                    total2 *= number;

                }
                if (c == '/') {
                    total2 = number / total2;
                }

                if (i + 1 == arr.length) {
                    l2 = l3 = 0;

                    return total2;

                } else {
                    l2 = l3 = 0;
                    break;
                }
            }//

            if (Character.isDigit(arr[i]) || arr[i] == '.') {

                if (Character.isDigit(arr[i])) {

                    StringBuilder buildNum3 = new StringBuilder();
                    while (i < arr.length && Character.isDigit(arr[i])) {
                        buildNum3.append(arr[i++]);
                    }
                    str2 = buildNum3.toString();
                    curNum = Double.parseDouble(str2);
                }
                if (arr3[p = i] == '.') {
                    i++;
                    StringBuilder buildNum4 = new StringBuilder();
                    while (i < arr.length && Character.isDigit(arr[i])) {
                        buildNum4.append(arr[i++]);
                    }
                    String str = buildNum4.toString();
                    char[] arr2 = str.toCharArray();
                    int l = 0;
                    for (int j = 0; j < arr2.length; j++) {
                        l++;
                    }

                    double dl2 = Double.parseDouble(str);
                    curNum2 = curNum + (dl2 / (Math.pow(10, l)));

                    i--;
                    if (operator2[0] == '^') {
                        if (n == '*') {
                            curNum2 = Math.pow(stack2.pop(), curNum2);
                            curNum2 *= m;
                            m = 0;
                            n = '+';
                        } else if (n == '/') {
                            curNum2 = Math.pow(stack2.pop(), curNum2);

                            curNum2 = m / curNum2;
                            m = 0;
                            n = '+';
                        } else {
                            curNum2 = Math.pow(stack2.pop(), curNum2);
                        }
                    }
                    if (operator2[0] == '-') {
                        curNum2 *= -1;
                    }
                    if (operator2[0] == '*') {
                        if (arr3[i + 1] == '^') {
                            m = stack2.pop();
                            n = operator2[0];
                            stack2.push(curNum2);
                            l3 = 0;
                            continue;
                        } else {
                            curNum2 *= stack2.pop();
                        }
                    }
                    if (operator2[0] == '/') {
                        if (arr3[i + 1] == '^') {
                            m = stack2.pop();
                            n = operator2[0];
                            stack2.push(curNum2);
                            l3 = 0;
                            continue;
                        } else {
                            curNum2 = stack2.pop() / curNum2;
                        }
                    }
                    stack2.push(curNum2);
                    curNum2 = 0.00;
                    l3 = 0;
                    continue;
                }//
                i--;

                if (operator2[0] == '^') {
                    if (n == '*') {
                        curNum = Math.pow(stack2.pop(), curNum);
                        curNum *= m;
                        m = 0;
                        n = '+';
                    } else if (n == '/') {
                        curNum = Math.pow(stack2.pop(), curNum);

                        curNum = m / curNum;
                        m = 0;
                        n = '+';
                    } else {
                        curNum = Math.pow(stack2.pop(), curNum);
                    }

                }
                if (operator2[0] == '-') {
                    curNum *= -1;
                }
                if (operator2[0] == '*') {
                    if (arr3[i + 1] == '^') {
                        m = stack2.pop();
                        n = operator2[0];
                        stack2.push(curNum);
                        l3 = 0;
                        continue;
                    } else {
                        curNum *= stack2.pop();
                    }

                }
                if (operator2[0] == '/') {
                    if (arr3[i + 1] == '^') {
                        m = stack2.pop();
                        n = operator2[0];
                        stack2.push(curNum);
                        l3 = 0;
                        continue;
                    } else {
                        curNum = stack2.pop() / curNum;
                    }
                }
                stack2.push(curNum);

                curNum = 0.00;
                l3 = 0;
            } else {

                if (i == 0 && arr[i] == '*') {

                    q1 = 1;
                }
                if (i == 0 && arr[i] == '/') {

                    q1 = 1;
                }
                for (int j = 0; j < operator2.length; j++) {
                    l3++;

                }
                if (l3 > 1) {

                    q1 = 1;
                }
                if (i == arr.length - 1) {
                    q1 = 1;
                } else {
                    operator2[0] = arr[i];

                }
            }//
        }
        if (q1 != 0) {
            q1 = 1;
            return 0.0;
        }
        return total2;
    }

    public void calculate() {
        Stack<Double> stack = new Stack<>();
        for (int j = 0; j < arr.length; j++) {
            arr3[j] = arr[j];

        }
        for (i = 0; i < arr.length; i++) {

            if (arr[i] == '(') {
                q1 = 1;
                if (i == 0) {

                    stack.push(bracket(0.00, '+'));
                    continue;
                }
                if (arr[i - 1] == '*' && i > 0) {
                    stack.push(bracket(stack.pop(), operator[0]));
                    continue;
                } else if (arr[i - 1] == '/' && i > 0) {
                    stack.push(bracket(stack.pop(), operator[0]));
                    continue;
                } else if (arr[i - 1] == '-' && i > 0) {
                    stack.push(bracket(0.00, '-'));
                    continue;
                } else {

                    stack.push(bracket(0.00, '+'));
                    continue;
                }
            }
            if (Character.isDigit(arr[i]) || arr[i] == '.') {
                if (Character.isDigit(arr[i])) {

                    StringBuilder buildNum1 = new StringBuilder();
                    while (i < arr.length && Character.isDigit(arr[i])) {
                        buildNum1.append(arr[i++]);
                    }
                    str2 = buildNum1.toString();
                    curNum = Double.parseDouble(str2);
                }

                if (arr3[p = i] == '.') {
                    i++;
                    StringBuilder buildNum2 = new StringBuilder();
                    while (i < arr.length && Character.isDigit(arr[i])) {
                        buildNum2.append(arr[i++]);
                    }
                    String str = buildNum2.toString();
                    char[] arr2 = str.toCharArray();
                    int l = 0;
                    for (int j = 0; j < arr2.length; j++) {
                        l++;
                    }

                    double dl2 = Double.parseDouble(str);
                    curNum2 = curNum + (dl2 / (Math.pow(10, l)));

                    i--;
                    if (operator[0] == '^') {
                        if (n == '*') {
                            curNum2 = Math.pow(stack.pop(), curNum2);
                            curNum2 *= m;
                            m = 0;
                            n = '+';
                        } else if (n == '/') {
                            curNum2 = Math.pow(stack.pop(), curNum2);

                            curNum2 = m / curNum2;
                            m = 0;
                            n = '+';
                        } else {
                            curNum2 = Math.pow(stack.pop(), curNum);
                        }
                    }
                    if (operator[0] == '-') {
                        curNum2 *= -1;
                    }
                    if (operator[0] == '*') {
                        if (arr3[i + 1] == '^') {
                            m = stack.pop();
                            n = operator[0];
                            stack.push(curNum2);
                            l2 = 0;
                            continue;
                        } else {
                            curNum2 *= stack.pop();
                        }

                    }
                    if (operator[0] == '/') {
                        if (arr3[i + 1] == '^') {
                            m = stack.pop();
                            n = operator[0];
                            stack.push(curNum2);
                            l2 = 0;
                            continue;
                        } else {
                            curNum2 = stack.pop() / curNum2;
                        }
                    }
                    stack.push(curNum2);
                    curNum2 = 0.00;
                    l2 = 0;
                    continue;
                }//

                i--;

                if (operator[0] == '^') {
                    if (n == '*') {
                        curNum = Math.pow(stack.pop(), curNum);
                        curNum *= m;
                        m = 0;
                        n = '+';
                    } else if (n == '/') {
                        curNum = Math.pow(stack.pop(), curNum);

                        curNum = m / curNum;
                        m = 0;
                        n = '+';
                    } else {
                        curNum = Math.pow(stack.pop(), curNum);
                    }
                }
                if (operator[0] == '-') {
                    curNum *= -1;
                }
                if (operator[0] == '*') {
                    if (arr3[i + 1] == '^') {
                        m = stack.pop();
                        n = operator[0];
                        stack.push(curNum);
                        l2 = 0;
                        continue;
                    } else {
                        curNum *= stack.pop();
                    }

                }
                if (operator[0] == '/') {
                    if (arr3[i + 1] == '^') {
                        m = stack.pop();
                        n = operator[0];
                        stack.push(curNum);
                        l2 = 0;
                        continue;
                    } else {
                        curNum = stack.pop() / curNum;
                    }
                }
                stack.push(curNum);
                curNum = 0.00;
                l2 = 0;
            } else {
                if (arr[i] == ')') {
                    q1 = 1;
                }
                if (i == 0 && arr[i] == '*') {
                    q1 = 1;
                }
                if (i == 0 && arr[i] == '/') {
                    q1 = 1;
                }
                for (int j = 0; j < operator.length; j++) {
                    l2++;

                }
                if (l2 > 1) {
                    q1 = 1;
                }
                if (i == arr.length - 1) {
                    q1 = 1;
                } else {
                    operator[0] = arr[i];
                }
            }//
        }//
        if (q1 == 0) {
            double total = 0;
            while (!stack.isEmpty()) {
                total += stack.pop();
            }
            DecimalFormat df = new DecimalFormat(".000");
            String t2 = df.format(total);
            display2TextField.setText(t2);
        } else {
            display2TextField.setText("Syntax Error!");
        }
    }

    public void enable1() {
        displayTextField.setEnabled(true);
        display2TextField.setEnabled(true);

        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        zeroButton.setEnabled(true);
        oneButton.setEnabled(true);
        twoButton.setEnabled(true);
        threeButton.setEnabled(true);
        fourButton.setEnabled(true);
        fiveButton.setEnabled(true);
        sixButton.setEnabled(true);
        sevenButton.setEnabled(true);
        eightButton.setEnabled(true);
        nineButton.setEnabled(true);
        equalButton.setEnabled(true);
        minusButton.setEnabled(true);
        plusButton.setEnabled(true);
        mulButton.setEnabled(true);
        divButton.setEnabled(true);
        pointButton.setEnabled(true);
        cButton.setEnabled(true);
        backButton.setEnabled(true);
        powButton1.setEnabled(true);
        fbracketButton.setEnabled(true);
        sbracketButton.setEnabled(true);
    }

    public void disable1() {
        displayTextField.setEnabled(false);
        display2TextField.setEnabled(false);

        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        zeroButton.setEnabled(false);
        oneButton.setEnabled(false);
        twoButton.setEnabled(false);
        threeButton.setEnabled(false);
        fourButton.setEnabled(false);
        fiveButton.setEnabled(false);
        sixButton.setEnabled(false);
        sevenButton.setEnabled(false);
        eightButton.setEnabled(false);
        nineButton.setEnabled(false);
        equalButton.setEnabled(false);
        pointButton.setEnabled(false);
        cButton.setEnabled(false);
        backButton.setEnabled(false);
        minusButton.setEnabled(false);
        plusButton.setEnabled(false);
        mulButton.setEnabled(false);
        divButton.setEnabled(false);
        powButton1.setEnabled(false);
        fbracketButton.setEnabled(false);
        sbracketButton.setEnabled(false);
    }
    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "0");
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "3");
    }//GEN-LAST:event_threeButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "2");
    }//GEN-LAST:event_twoButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "1");
    }//GEN-LAST:event_oneButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "6");
    }//GEN-LAST:event_sixButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "5");
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "4");
    }//GEN-LAST:event_fourButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "9");
    }//GEN-LAST:event_nineButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "8");
    }//GEN-LAST:event_eightButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "7");
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + ".");
    }//GEN-LAST:event_pointButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "+");
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "-");
    }//GEN-LAST:event_minusButtonActionPerformed

    private void mulButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "*");
    }//GEN-LAST:event_mulButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "/");
    }//GEN-LAST:event_divButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed

        s = displayTextField.getText();
        if (s == null) {
            s = "0";
            arr = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                arr[j] = s.charAt(j);
            }
        } else {
            arr = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                arr[j] = s.charAt(j);
            }
            calculate();
        }
    }//GEN-LAST:event_equalButtonActionPerformed

    private void onRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRadioButtonActionPerformed
        enable1();
    }//GEN-LAST:event_onRadioButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        operator[0] = '+';
        displayTextField.setText("");
        display2TextField.setText("");

    }//GEN-LAST:event_cButtonActionPerformed

    private void offRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offRadioButtonActionPerformed
        displayTextField.setText("");
        display2TextField.setText("");
        disable1();
    }//GEN-LAST:event_offRadioButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        StringBuilder st = new StringBuilder(displayTextField.getText());
        int length = st.length();
        st.delete(length - 1, length);
        String st2 = st.toString();
        displayTextField.setText(st2);
    }//GEN-LAST:event_backButtonActionPerformed

    private void display2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display2TextFieldActionPerformed

    private void powButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powButton1ActionPerformed
        displayTextField.setText(displayTextField.getText() + "^");
    }//GEN-LAST:event_powButton1ActionPerformed

    private void powButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powButton3ActionPerformed

    private void sbracketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbracketButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + ")");
    }//GEN-LAST:event_sbracketButtonActionPerformed

    private void fbracketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbracketButtonActionPerformed
        displayTextField.setText(displayTextField.getText() + "(");
    }//GEN-LAST:event_fbracketButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cButton;
    private javax.swing.JTextField display2TextField;
    private javax.swing.JTextField displayTextField;
    private javax.swing.JTextField displayTextField1;
    private javax.swing.JButton divButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton fbracketButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JRadioButton offRadioButton;
    private javax.swing.JRadioButton onRadioButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton powButton1;
    private javax.swing.JButton powButton3;
    private javax.swing.JButton sbracketButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
