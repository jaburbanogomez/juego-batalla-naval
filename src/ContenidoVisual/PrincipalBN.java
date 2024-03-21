package ContenidoVisual;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ContenidoLogico.CodigoJuegoBN;

public class PrincipalBN extends javax.swing.JFrame {

    CodigoJuegoBN control_batalla = new CodigoJuegoBN();
    ImageIcon imagen;
    Icon icono;
    int fila;
    int col;
    int puntaje = 0;
    int misiles = 50;
    char valor = ' ';
    boolean turno = true;    
    public PrincipalBN() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/fondo_ganado.jpg")).getImage());
        setTitle("Batalla Naval");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton28 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn0_0 = new javax.swing.JButton();
        btn0_1 = new javax.swing.JButton();
        btn0_2 = new javax.swing.JButton();
        btn0_3 = new javax.swing.JButton();
        btn0_4 = new javax.swing.JButton();
        btn0_5 = new javax.swing.JButton();
        btn0_6 = new javax.swing.JButton();
        btn0_7 = new javax.swing.JButton();
        btn0_8 = new javax.swing.JButton();
        btn0_9 = new javax.swing.JButton();
        btn1_0 = new javax.swing.JButton();
        btn1_1 = new javax.swing.JButton();
        btn1_2 = new javax.swing.JButton();
        btn1_3 = new javax.swing.JButton();
        btn1_4 = new javax.swing.JButton();
        btn1_5 = new javax.swing.JButton();
        btn1_6 = new javax.swing.JButton();
        btn1_7 = new javax.swing.JButton();
        btn1_8 = new javax.swing.JButton();
        btn1_9 = new javax.swing.JButton();
        btn2_0 = new javax.swing.JButton();
        btn2_1 = new javax.swing.JButton();
        btn2_2 = new javax.swing.JButton();
        btn2_3 = new javax.swing.JButton();
        btn2_4 = new javax.swing.JButton();
        btn2_5 = new javax.swing.JButton();
        btn2_6 = new javax.swing.JButton();
        btn2_7 = new javax.swing.JButton();
        btn2_8 = new javax.swing.JButton();
        btn2_9 = new javax.swing.JButton();
        btn3_0 = new javax.swing.JButton();
        btn3_1 = new javax.swing.JButton();
        btn3_2 = new javax.swing.JButton();
        btn3_3 = new javax.swing.JButton();
        btn3_4 = new javax.swing.JButton();
        btn3_5 = new javax.swing.JButton();
        btn3_6 = new javax.swing.JButton();
        btn3_7 = new javax.swing.JButton();
        btn3_8 = new javax.swing.JButton();
        btn3_9 = new javax.swing.JButton();
        btn4_0 = new javax.swing.JButton();
        btn4_1 = new javax.swing.JButton();
        btn4_2 = new javax.swing.JButton();
        btn4_3 = new javax.swing.JButton();
        btn4_4 = new javax.swing.JButton();
        btn4_5 = new javax.swing.JButton();
        btn4_6 = new javax.swing.JButton();
        btn4_7 = new javax.swing.JButton();
        btn4_8 = new javax.swing.JButton();
        btn4_9 = new javax.swing.JButton();
        btn5_0 = new javax.swing.JButton();
        btn5_1 = new javax.swing.JButton();
        btn5_2 = new javax.swing.JButton();
        btn5_3 = new javax.swing.JButton();
        btn5_4 = new javax.swing.JButton();
        btn5_5 = new javax.swing.JButton();
        btn5_6 = new javax.swing.JButton();
        btn5_7 = new javax.swing.JButton();
        btn5_8 = new javax.swing.JButton();
        btn5_9 = new javax.swing.JButton();
        btn6_0 = new javax.swing.JButton();
        btn6_1 = new javax.swing.JButton();
        btn6_2 = new javax.swing.JButton();
        btn6_3 = new javax.swing.JButton();
        btn6_4 = new javax.swing.JButton();
        btn6_5 = new javax.swing.JButton();
        btn6_6 = new javax.swing.JButton();
        btn6_7 = new javax.swing.JButton();
        btn6_8 = new javax.swing.JButton();
        btn6_9 = new javax.swing.JButton();
        btn7_0 = new javax.swing.JButton();
        btn7_1 = new javax.swing.JButton();
        btn7_2 = new javax.swing.JButton();
        btn7_3 = new javax.swing.JButton();
        btn7_4 = new javax.swing.JButton();
        btn7_5 = new javax.swing.JButton();
        btn7_6 = new javax.swing.JButton();
        btn7_7 = new javax.swing.JButton();
        btn7_8 = new javax.swing.JButton();
        btn7_9 = new javax.swing.JButton();
        btn8_0 = new javax.swing.JButton();
        btn8_1 = new javax.swing.JButton();
        btn8_2 = new javax.swing.JButton();
        btn8_3 = new javax.swing.JButton();
        btn8_4 = new javax.swing.JButton();
        btn8_5 = new javax.swing.JButton();
        btn8_6 = new javax.swing.JButton();
        btn8_7 = new javax.swing.JButton();
        btn8_8 = new javax.swing.JButton();
        btn8_9 = new javax.swing.JButton();
        btn9_0 = new javax.swing.JButton();
        btn9_1 = new javax.swing.JButton();
        btn9_2 = new javax.swing.JButton();
        btn9_3 = new javax.swing.JButton();
        btn9_4 = new javax.swing.JButton();
        btn9_5 = new javax.swing.JButton();
        btn9_6 = new javax.swing.JButton();
        btn9_7 = new javax.swing.JButton();
        btn9_8 = new javax.swing.JButton();
        btn9_9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_mostrar_matriz = new javax.swing.JTextArea();
        btn_jugar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_puntaje = new javax.swing.JTextField();
        btn_logo = new javax.swing.JButton();
        txt_misiles = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jButton28.setText("jButton1");
        jButton28.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton38.setText("jButton1");
        jButton38.setPreferredSize(new java.awt.Dimension(40, 40));

        jButton39.setText("jButton1");
        jButton39.setPreferredSize(new java.awt.Dimension(40, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 497));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 350));

        btn0_0.setBackground(new java.awt.Color(121, 17, 17));
        btn0_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_0MouseExited(evt);
            }
        });
        btn0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_0ActionPerformed(evt);
            }
        });

        btn0_1.setBackground(new java.awt.Color(121, 17, 17));
        btn0_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_1MouseExited(evt);
            }
        });
        btn0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_1ActionPerformed(evt);
            }
        });

        btn0_2.setBackground(new java.awt.Color(121, 17, 17));
        btn0_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_2MouseExited(evt);
            }
        });
        btn0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_2ActionPerformed(evt);
            }
        });

        btn0_3.setBackground(new java.awt.Color(121, 17, 17));
        btn0_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_3MouseExited(evt);
            }
        });
        btn0_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_3ActionPerformed(evt);
            }
        });

        btn0_4.setBackground(new java.awt.Color(121, 17, 17));
        btn0_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_4MouseExited(evt);
            }
        });
        btn0_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_4ActionPerformed(evt);
            }
        });

        btn0_5.setBackground(new java.awt.Color(121, 17, 17));
        btn0_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_5MouseExited(evt);
            }
        });
        btn0_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_5ActionPerformed(evt);
            }
        });

        btn0_6.setBackground(new java.awt.Color(121, 17, 17));
        btn0_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_6MouseExited(evt);
            }
        });
        btn0_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_6ActionPerformed(evt);
            }
        });

        btn0_7.setBackground(new java.awt.Color(121, 17, 17));
        btn0_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_7MouseExited(evt);
            }
        });
        btn0_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_7ActionPerformed(evt);
            }
        });

        btn0_8.setBackground(new java.awt.Color(121, 17, 17));
        btn0_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_8MouseExited(evt);
            }
        });
        btn0_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_8ActionPerformed(evt);
            }
        });

        btn0_9.setBackground(new java.awt.Color(121, 17, 17));
        btn0_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn0_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0_9MouseExited(evt);
            }
        });
        btn0_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0_9ActionPerformed(evt);
            }
        });

        btn1_0.setBackground(new java.awt.Color(121, 17, 17));
        btn1_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_0MouseExited(evt);
            }
        });
        btn1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_0ActionPerformed(evt);
            }
        });

        btn1_1.setBackground(new java.awt.Color(121, 17, 17));
        btn1_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_1MouseExited(evt);
            }
        });
        btn1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_1ActionPerformed(evt);
            }
        });

        btn1_2.setBackground(new java.awt.Color(121, 17, 17));
        btn1_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_2MouseExited(evt);
            }
        });
        btn1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_2ActionPerformed(evt);
            }
        });

        btn1_3.setBackground(new java.awt.Color(121, 17, 17));
        btn1_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_3MouseExited(evt);
            }
        });
        btn1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_3ActionPerformed(evt);
            }
        });

        btn1_4.setBackground(new java.awt.Color(121, 17, 17));
        btn1_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_4MouseExited(evt);
            }
        });
        btn1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_4ActionPerformed(evt);
            }
        });

        btn1_5.setBackground(new java.awt.Color(121, 17, 17));
        btn1_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_5MouseExited(evt);
            }
        });
        btn1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_5ActionPerformed(evt);
            }
        });

        btn1_6.setBackground(new java.awt.Color(121, 17, 17));
        btn1_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_6MouseExited(evt);
            }
        });
        btn1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_6ActionPerformed(evt);
            }
        });

        btn1_7.setBackground(new java.awt.Color(121, 17, 17));
        btn1_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_7MouseExited(evt);
            }
        });
        btn1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_7ActionPerformed(evt);
            }
        });

        btn1_8.setBackground(new java.awt.Color(121, 17, 17));
        btn1_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_8MouseExited(evt);
            }
        });
        btn1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_8ActionPerformed(evt);
            }
        });

        btn1_9.setBackground(new java.awt.Color(121, 17, 17));
        btn1_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn1_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1_9MouseExited(evt);
            }
        });
        btn1_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_9ActionPerformed(evt);
            }
        });

        btn2_0.setBackground(new java.awt.Color(121, 17, 17));
        btn2_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_0MouseExited(evt);
            }
        });
        btn2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_0ActionPerformed(evt);
            }
        });

        btn2_1.setBackground(new java.awt.Color(121, 17, 17));
        btn2_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_1MouseExited(evt);
            }
        });
        btn2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_1ActionPerformed(evt);
            }
        });

        btn2_2.setBackground(new java.awt.Color(121, 17, 17));
        btn2_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_2MouseExited(evt);
            }
        });
        btn2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_2ActionPerformed(evt);
            }
        });

        btn2_3.setBackground(new java.awt.Color(121, 17, 17));
        btn2_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_3MouseExited(evt);
            }
        });
        btn2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_3ActionPerformed(evt);
            }
        });

        btn2_4.setBackground(new java.awt.Color(121, 17, 17));
        btn2_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_4MouseExited(evt);
            }
        });
        btn2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_4ActionPerformed(evt);
            }
        });

        btn2_5.setBackground(new java.awt.Color(121, 17, 17));
        btn2_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_5MouseExited(evt);
            }
        });
        btn2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_5ActionPerformed(evt);
            }
        });

        btn2_6.setBackground(new java.awt.Color(121, 17, 17));
        btn2_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_6MouseExited(evt);
            }
        });
        btn2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_6ActionPerformed(evt);
            }
        });

        btn2_7.setBackground(new java.awt.Color(121, 17, 17));
        btn2_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_7MouseExited(evt);
            }
        });
        btn2_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_7ActionPerformed(evt);
            }
        });

        btn2_8.setBackground(new java.awt.Color(121, 17, 17));
        btn2_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_8MouseExited(evt);
            }
        });
        btn2_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_8ActionPerformed(evt);
            }
        });

        btn2_9.setBackground(new java.awt.Color(121, 17, 17));
        btn2_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn2_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2_9MouseExited(evt);
            }
        });
        btn2_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_9ActionPerformed(evt);
            }
        });

        btn3_0.setBackground(new java.awt.Color(121, 17, 17));
        btn3_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_0MouseExited(evt);
            }
        });
        btn3_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_0ActionPerformed(evt);
            }
        });

        btn3_1.setBackground(new java.awt.Color(121, 17, 17));
        btn3_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_1MouseExited(evt);
            }
        });
        btn3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_1ActionPerformed(evt);
            }
        });

        btn3_2.setBackground(new java.awt.Color(121, 17, 17));
        btn3_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_2MouseExited(evt);
            }
        });
        btn3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_2ActionPerformed(evt);
            }
        });

        btn3_3.setBackground(new java.awt.Color(121, 17, 17));
        btn3_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_3MouseExited(evt);
            }
        });
        btn3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_3ActionPerformed(evt);
            }
        });

        btn3_4.setBackground(new java.awt.Color(121, 17, 17));
        btn3_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_4MouseExited(evt);
            }
        });
        btn3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_4ActionPerformed(evt);
            }
        });

        btn3_5.setBackground(new java.awt.Color(121, 17, 17));
        btn3_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_5MouseExited(evt);
            }
        });
        btn3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_5ActionPerformed(evt);
            }
        });

        btn3_6.setBackground(new java.awt.Color(121, 17, 17));
        btn3_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_6MouseExited(evt);
            }
        });
        btn3_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_6ActionPerformed(evt);
            }
        });

        btn3_7.setBackground(new java.awt.Color(121, 17, 17));
        btn3_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_7MouseExited(evt);
            }
        });
        btn3_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_7ActionPerformed(evt);
            }
        });

        btn3_8.setBackground(new java.awt.Color(121, 17, 17));
        btn3_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_8MouseExited(evt);
            }
        });
        btn3_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_8ActionPerformed(evt);
            }
        });

        btn3_9.setBackground(new java.awt.Color(121, 17, 17));
        btn3_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn3_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3_9MouseExited(evt);
            }
        });
        btn3_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_9ActionPerformed(evt);
            }
        });

        btn4_0.setBackground(new java.awt.Color(121, 17, 17));
        btn4_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_0MouseExited(evt);
            }
        });
        btn4_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_0ActionPerformed(evt);
            }
        });

        btn4_1.setBackground(new java.awt.Color(121, 17, 17));
        btn4_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_1MouseExited(evt);
            }
        });
        btn4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_1ActionPerformed(evt);
            }
        });

        btn4_2.setBackground(new java.awt.Color(121, 17, 17));
        btn4_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_2MouseExited(evt);
            }
        });
        btn4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_2ActionPerformed(evt);
            }
        });

        btn4_3.setBackground(new java.awt.Color(121, 17, 17));
        btn4_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_3MouseExited(evt);
            }
        });
        btn4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_3ActionPerformed(evt);
            }
        });

        btn4_4.setBackground(new java.awt.Color(121, 17, 17));
        btn4_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_4MouseExited(evt);
            }
        });
        btn4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_4ActionPerformed(evt);
            }
        });

        btn4_5.setBackground(new java.awt.Color(121, 17, 17));
        btn4_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_5MouseExited(evt);
            }
        });
        btn4_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_5ActionPerformed(evt);
            }
        });

        btn4_6.setBackground(new java.awt.Color(121, 17, 17));
        btn4_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_6MouseExited(evt);
            }
        });
        btn4_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_6ActionPerformed(evt);
            }
        });

        btn4_7.setBackground(new java.awt.Color(121, 17, 17));
        btn4_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_7MouseExited(evt);
            }
        });
        btn4_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_7ActionPerformed(evt);
            }
        });

        btn4_8.setBackground(new java.awt.Color(121, 17, 17));
        btn4_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_8MouseExited(evt);
            }
        });
        btn4_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_8ActionPerformed(evt);
            }
        });

        btn4_9.setBackground(new java.awt.Color(121, 17, 17));
        btn4_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn4_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4_9MouseExited(evt);
            }
        });
        btn4_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_9ActionPerformed(evt);
            }
        });

        btn5_0.setBackground(new java.awt.Color(121, 17, 17));
        btn5_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_0MouseExited(evt);
            }
        });
        btn5_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_0ActionPerformed(evt);
            }
        });

        btn5_1.setBackground(new java.awt.Color(121, 17, 17));
        btn5_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_1MouseExited(evt);
            }
        });
        btn5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_1ActionPerformed(evt);
            }
        });

        btn5_2.setBackground(new java.awt.Color(121, 17, 17));
        btn5_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_2MouseExited(evt);
            }
        });
        btn5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_2ActionPerformed(evt);
            }
        });

        btn5_3.setBackground(new java.awt.Color(121, 17, 17));
        btn5_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_3MouseExited(evt);
            }
        });
        btn5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_3ActionPerformed(evt);
            }
        });

        btn5_4.setBackground(new java.awt.Color(121, 17, 17));
        btn5_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_4MouseExited(evt);
            }
        });
        btn5_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_4ActionPerformed(evt);
            }
        });

        btn5_5.setBackground(new java.awt.Color(121, 17, 17));
        btn5_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_5MouseExited(evt);
            }
        });
        btn5_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_5ActionPerformed(evt);
            }
        });

        btn5_6.setBackground(new java.awt.Color(121, 17, 17));
        btn5_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_6MouseExited(evt);
            }
        });
        btn5_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_6ActionPerformed(evt);
            }
        });

        btn5_7.setBackground(new java.awt.Color(121, 17, 17));
        btn5_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_7MouseExited(evt);
            }
        });
        btn5_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_7ActionPerformed(evt);
            }
        });

        btn5_8.setBackground(new java.awt.Color(121, 17, 17));
        btn5_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_8MouseExited(evt);
            }
        });
        btn5_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_8ActionPerformed(evt);
            }
        });

        btn5_9.setBackground(new java.awt.Color(121, 17, 17));
        btn5_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn5_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5_9MouseExited(evt);
            }
        });
        btn5_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_9ActionPerformed(evt);
            }
        });

        btn6_0.setBackground(new java.awt.Color(121, 17, 17));
        btn6_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_0MouseExited(evt);
            }
        });
        btn6_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_0ActionPerformed(evt);
            }
        });

        btn6_1.setBackground(new java.awt.Color(121, 17, 17));
        btn6_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_1MouseExited(evt);
            }
        });
        btn6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_1ActionPerformed(evt);
            }
        });

        btn6_2.setBackground(new java.awt.Color(121, 17, 17));
        btn6_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_2MouseExited(evt);
            }
        });
        btn6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_2ActionPerformed(evt);
            }
        });

        btn6_3.setBackground(new java.awt.Color(121, 17, 17));
        btn6_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_3MouseExited(evt);
            }
        });
        btn6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_3ActionPerformed(evt);
            }
        });

        btn6_4.setBackground(new java.awt.Color(121, 17, 17));
        btn6_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_4MouseExited(evt);
            }
        });
        btn6_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_4ActionPerformed(evt);
            }
        });

        btn6_5.setBackground(new java.awt.Color(121, 17, 17));
        btn6_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_5MouseExited(evt);
            }
        });
        btn6_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_5ActionPerformed(evt);
            }
        });

        btn6_6.setBackground(new java.awt.Color(121, 17, 17));
        btn6_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_6MouseExited(evt);
            }
        });
        btn6_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_6ActionPerformed(evt);
            }
        });

        btn6_7.setBackground(new java.awt.Color(121, 17, 17));
        btn6_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_7MouseExited(evt);
            }
        });
        btn6_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_7ActionPerformed(evt);
            }
        });

        btn6_8.setBackground(new java.awt.Color(121, 17, 17));
        btn6_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_8MouseExited(evt);
            }
        });
        btn6_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_8ActionPerformed(evt);
            }
        });

        btn6_9.setBackground(new java.awt.Color(121, 17, 17));
        btn6_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn6_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6_9MouseExited(evt);
            }
        });
        btn6_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_9ActionPerformed(evt);
            }
        });

        btn7_0.setBackground(new java.awt.Color(121, 17, 17));
        btn7_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_0MouseExited(evt);
            }
        });
        btn7_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_0ActionPerformed(evt);
            }
        });

        btn7_1.setBackground(new java.awt.Color(121, 17, 17));
        btn7_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_1MouseExited(evt);
            }
        });
        btn7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_1ActionPerformed(evt);
            }
        });

        btn7_2.setBackground(new java.awt.Color(121, 17, 17));
        btn7_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_2MouseExited(evt);
            }
        });
        btn7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_2ActionPerformed(evt);
            }
        });

        btn7_3.setBackground(new java.awt.Color(121, 17, 17));
        btn7_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_3MouseExited(evt);
            }
        });
        btn7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_3ActionPerformed(evt);
            }
        });

        btn7_4.setBackground(new java.awt.Color(121, 17, 17));
        btn7_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_4MouseExited(evt);
            }
        });
        btn7_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_4ActionPerformed(evt);
            }
        });

        btn7_5.setBackground(new java.awt.Color(121, 17, 17));
        btn7_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_5MouseExited(evt);
            }
        });
        btn7_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_5ActionPerformed(evt);
            }
        });

        btn7_6.setBackground(new java.awt.Color(121, 17, 17));
        btn7_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_6MouseExited(evt);
            }
        });
        btn7_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_6ActionPerformed(evt);
            }
        });

        btn7_7.setBackground(new java.awt.Color(121, 17, 17));
        btn7_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_7MouseExited(evt);
            }
        });
        btn7_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_7ActionPerformed(evt);
            }
        });

        btn7_8.setBackground(new java.awt.Color(121, 17, 17));
        btn7_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_8MouseExited(evt);
            }
        });
        btn7_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_8ActionPerformed(evt);
            }
        });

        btn7_9.setBackground(new java.awt.Color(121, 17, 17));
        btn7_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn7_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7_9MouseExited(evt);
            }
        });
        btn7_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_9ActionPerformed(evt);
            }
        });

        btn8_0.setBackground(new java.awt.Color(121, 17, 17));
        btn8_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_0MouseExited(evt);
            }
        });
        btn8_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_0ActionPerformed(evt);
            }
        });

        btn8_1.setBackground(new java.awt.Color(121, 17, 17));
        btn8_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_1MouseExited(evt);
            }
        });
        btn8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_1ActionPerformed(evt);
            }
        });

        btn8_2.setBackground(new java.awt.Color(121, 17, 17));
        btn8_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_2MouseExited(evt);
            }
        });
        btn8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_2ActionPerformed(evt);
            }
        });

        btn8_3.setBackground(new java.awt.Color(121, 17, 17));
        btn8_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_3MouseExited(evt);
            }
        });
        btn8_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_3ActionPerformed(evt);
            }
        });

        btn8_4.setBackground(new java.awt.Color(121, 17, 17));
        btn8_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_4MouseExited(evt);
            }
        });
        btn8_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_4ActionPerformed(evt);
            }
        });

        btn8_5.setBackground(new java.awt.Color(121, 17, 17));
        btn8_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_5MouseExited(evt);
            }
        });
        btn8_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_5ActionPerformed(evt);
            }
        });

        btn8_6.setBackground(new java.awt.Color(121, 17, 17));
        btn8_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_6MouseExited(evt);
            }
        });
        btn8_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_6ActionPerformed(evt);
            }
        });

        btn8_7.setBackground(new java.awt.Color(121, 17, 17));
        btn8_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_7MouseExited(evt);
            }
        });
        btn8_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_7ActionPerformed(evt);
            }
        });

        btn8_8.setBackground(new java.awt.Color(121, 17, 17));
        btn8_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_8MouseExited(evt);
            }
        });
        btn8_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_8ActionPerformed(evt);
            }
        });

        btn8_9.setBackground(new java.awt.Color(121, 17, 17));
        btn8_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn8_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8_9MouseExited(evt);
            }
        });
        btn8_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_9ActionPerformed(evt);
            }
        });

        btn9_0.setBackground(new java.awt.Color(121, 17, 17));
        btn9_0.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_0MouseExited(evt);
            }
        });
        btn9_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_0ActionPerformed(evt);
            }
        });

        btn9_1.setBackground(new java.awt.Color(121, 17, 17));
        btn9_1.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_1MouseExited(evt);
            }
        });
        btn9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_1ActionPerformed(evt);
            }
        });

        btn9_2.setBackground(new java.awt.Color(121, 17, 17));
        btn9_2.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_2MouseExited(evt);
            }
        });
        btn9_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_2ActionPerformed(evt);
            }
        });

        btn9_3.setBackground(new java.awt.Color(121, 17, 17));
        btn9_3.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_3MouseExited(evt);
            }
        });
        btn9_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_3ActionPerformed(evt);
            }
        });

        btn9_4.setBackground(new java.awt.Color(121, 17, 17));
        btn9_4.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_4MouseExited(evt);
            }
        });
        btn9_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_4ActionPerformed(evt);
            }
        });

        btn9_5.setBackground(new java.awt.Color(121, 17, 17));
        btn9_5.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_5MouseExited(evt);
            }
        });
        btn9_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_5ActionPerformed(evt);
            }
        });

        btn9_6.setBackground(new java.awt.Color(121, 17, 17));
        btn9_6.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_6MouseExited(evt);
            }
        });
        btn9_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_6ActionPerformed(evt);
            }
        });

        btn9_7.setBackground(new java.awt.Color(121, 17, 17));
        btn9_7.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_7MouseExited(evt);
            }
        });
        btn9_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_7ActionPerformed(evt);
            }
        });

        btn9_8.setBackground(new java.awt.Color(121, 17, 17));
        btn9_8.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_8MouseExited(evt);
            }
        });
        btn9_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_8ActionPerformed(evt);
            }
        });

        btn9_9.setBackground(new java.awt.Color(121, 17, 17));
        btn9_9.setPreferredSize(new java.awt.Dimension(40, 40));
        btn9_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9_9MouseExited(evt);
            }
        });
        btn9_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn7_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn8_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn9_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9_0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        txta_mostrar_matriz.setBackground(new java.awt.Color(121, 17, 17));
        txta_mostrar_matriz.setColumns(20);
        txta_mostrar_matriz.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txta_mostrar_matriz.setForeground(new java.awt.Color(250, 242, 242));
        txta_mostrar_matriz.setRows(5);
        txta_mostrar_matriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txta_mostrar_matrizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txta_mostrar_matrizMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(txta_mostrar_matriz);

        btn_jugar.setBackground(new java.awt.Color(121, 17, 17));
        btn_jugar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_jugar.setForeground(new java.awt.Color(251, 246, 246));
        btn_jugar.setText("NEW GAME");
        btn_jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_jugarMouseExited(evt);
            }
        });
        btn_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jugarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/score.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        txt_puntaje.setBackground(new java.awt.Color(121, 17, 17));
        txt_puntaje.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_puntaje.setForeground(new java.awt.Color(248, 241, 241));
        txt_puntaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_puntajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_puntajeMouseExited(evt);
            }
        });

        btn_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/batalla-naval-1.png"))); // NOI18N

        txt_misiles.setBackground(new java.awt.Color(121, 17, 17));
        txt_misiles.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_misiles.setForeground(new java.awt.Color(248, 241, 241));
        txt_misiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_misilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_misilesMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cohetefinal.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_ganado2.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_ganado2.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajedrez.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajedrez.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajedrez.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bombas.jpg"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bombas.jpg"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajedrez.jpg"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajedrez.jpg"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bombas.jpg"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bombas.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btn_jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_misiles, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_jugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txt_misiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleParent(jPanel2);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo para llenar la matriz cuando de click en el boton jugar
    public void llenarFilasColum(JButton boton_matriz) {
        control_batalla.sinBarcos();
        control_batalla.ponerBarcos();
        txta_mostrar_matriz.setText(control_batalla.mostrarMatriz());
        txta_mostrar_matriz.setEditable(false);
    }
    //Metodo para saber donde poner o barcos y poner imagen al boton
    public void validarPosicionesVaciasYBarcos(JButton btn_barcos_bombas) {
        if (control_batalla.posicionesBarcosMatriz(fila, col) == true) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/explosion_barco.png"));
            icono = new ImageIcon(imagen.getImage().getScaledInstance(btn_barcos_bombas.getWidth(),
                    btn_barcos_bombas.getHeight(), Image.SCALE_SMOOTH));
            btn_barcos_bombas.setIcon(icono);
            puntaje = puntaje + 10;
            txt_puntaje.setText(" " + puntaje);
            txt_puntaje.setEditable(false);
            if (puntaje == 100) {
                //Limpia la matriz
                control_batalla.vaciarMatriz();
                //Activa el boton jugar
                btn_jugar.setEnabled(true);
                puntaje = 0;
                misiles = 50;
                //Muestra la ventana cuando gana
                GanadorBN gn = new GanadorBN();
                gn.setVisible(true);
            }
            
        } else if (control_batalla.posicionessSinBarcos(fila, col) == true) {
            btn_barcos_bombas.setBackground(new Color(243, 236, 236));
            misiles = misiles - 1;
            txt_misiles.setText(" " + misiles);
            txt_misiles.setEditable(false);
            btn_barcos_bombas.setEnabled(false);
            
            if (misiles == 0) {
                //Limpia la matriz
                control_batalla.vaciarMatriz();
                //Activa el boton jugar
                btn_jugar.setEnabled(true);                
                misiles = 50;
                puntaje = 0;
                //Muestra la ventana cuando pierde
                PerdedorBN gn = new PerdedorBN();
                gn.setVisible(true);
            }
        }
    }
    //Quita icono de la explosion al reiniciar el juego
    public void quitarIconoExplosion(JButton btn_QuitarExplosion) {
        imagen = new ImageIcon(getClass().getResource(""));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(btn_QuitarExplosion.getWidth(), btn_QuitarExplosion.getHeight(), Image.SCALE_SMOOTH));
        btn_QuitarExplosion.setIcon(null);
    }
    private void btn_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jugarActionPerformed

        puntaje = 0;
        misiles = 50;
        llenarFilasColum(btn_jugar);
        txt_puntaje.setText(" " + puntaje);
        txt_misiles.setText(" " + misiles);
        txt_puntaje.setEditable(false);
        txt_misiles.setEditable(false);
        
        quitarIconoExplosion(btn0_0);quitarIconoExplosion(btn1_0);quitarIconoExplosion(btn2_0);quitarIconoExplosion(btn3_0);
        quitarIconoExplosion(btn0_1);quitarIconoExplosion(btn1_1);quitarIconoExplosion(btn2_1);quitarIconoExplosion(btn3_1);
        quitarIconoExplosion(btn0_2);quitarIconoExplosion(btn1_2);quitarIconoExplosion(btn2_2);quitarIconoExplosion(btn3_2);
        quitarIconoExplosion(btn0_3);quitarIconoExplosion(btn1_3);quitarIconoExplosion(btn2_3);quitarIconoExplosion(btn3_3);
        quitarIconoExplosion(btn0_4);quitarIconoExplosion(btn1_4);quitarIconoExplosion(btn2_4);quitarIconoExplosion(btn3_4);
        quitarIconoExplosion(btn0_5);quitarIconoExplosion(btn1_5);quitarIconoExplosion(btn2_5);quitarIconoExplosion(btn3_5);
        quitarIconoExplosion(btn0_6);quitarIconoExplosion(btn1_6);quitarIconoExplosion(btn2_6);quitarIconoExplosion(btn3_6);
        quitarIconoExplosion(btn0_7);quitarIconoExplosion(btn1_7);quitarIconoExplosion(btn2_7);quitarIconoExplosion(btn3_7);
        quitarIconoExplosion(btn0_8);quitarIconoExplosion(btn1_8);quitarIconoExplosion(btn2_8);quitarIconoExplosion(btn3_8);
        quitarIconoExplosion(btn0_9);quitarIconoExplosion(btn1_9);quitarIconoExplosion(btn2_9);quitarIconoExplosion(btn3_9);
        
        quitarIconoExplosion(btn4_0);quitarIconoExplosion(btn5_0);quitarIconoExplosion(btn6_0);
        quitarIconoExplosion(btn4_1);quitarIconoExplosion(btn5_1);quitarIconoExplosion(btn6_1);
        quitarIconoExplosion(btn4_2);quitarIconoExplosion(btn5_2);quitarIconoExplosion(btn6_2);
        quitarIconoExplosion(btn4_3);quitarIconoExplosion(btn5_3);quitarIconoExplosion(btn6_3);
        quitarIconoExplosion(btn4_4);quitarIconoExplosion(btn5_4);quitarIconoExplosion(btn6_4);
        quitarIconoExplosion(btn4_5);quitarIconoExplosion(btn5_5);quitarIconoExplosion(btn6_5);
        quitarIconoExplosion(btn4_6);quitarIconoExplosion(btn5_6);quitarIconoExplosion(btn6_6);
        quitarIconoExplosion(btn4_7);quitarIconoExplosion(btn5_7);quitarIconoExplosion(btn6_7);
        quitarIconoExplosion(btn4_8);quitarIconoExplosion(btn5_8);quitarIconoExplosion(btn6_8);
        quitarIconoExplosion(btn4_9);quitarIconoExplosion(btn5_9);quitarIconoExplosion(btn6_9);
        
        quitarIconoExplosion(btn7_0);quitarIconoExplosion(btn8_0);quitarIconoExplosion(btn9_0);
        quitarIconoExplosion(btn7_1);quitarIconoExplosion(btn8_1);quitarIconoExplosion(btn9_1);
        quitarIconoExplosion(btn7_2);quitarIconoExplosion(btn8_2);quitarIconoExplosion(btn9_2);
        quitarIconoExplosion(btn7_3);quitarIconoExplosion(btn8_3);quitarIconoExplosion(btn9_3);
        quitarIconoExplosion(btn7_4);quitarIconoExplosion(btn8_4);quitarIconoExplosion(btn9_4);
        quitarIconoExplosion(btn7_5);quitarIconoExplosion(btn8_5);quitarIconoExplosion(btn9_5);
        quitarIconoExplosion(btn7_6);quitarIconoExplosion(btn8_6);quitarIconoExplosion(btn9_6);
        quitarIconoExplosion(btn7_7);quitarIconoExplosion(btn8_7);quitarIconoExplosion(btn9_7);
        quitarIconoExplosion(btn7_8);quitarIconoExplosion(btn8_8);quitarIconoExplosion(btn9_8);
        quitarIconoExplosion(btn7_9);quitarIconoExplosion(btn8_9);quitarIconoExplosion(btn9_9);       
             
        btn0_0.setEnabled(true);btn1_0.setEnabled(true);btn2_0.setEnabled(true);btn3_0.setEnabled(true);
        btn0_1.setEnabled(true);btn1_1.setEnabled(true);btn2_1.setEnabled(true);btn3_1.setEnabled(true);
        btn0_2.setEnabled(true);btn1_2.setEnabled(true);btn2_2.setEnabled(true);btn3_2.setEnabled(true);
        btn0_3.setEnabled(true);btn1_3.setEnabled(true);btn2_3.setEnabled(true);btn3_3.setEnabled(true);
        btn0_4.setEnabled(true);btn1_4.setEnabled(true);btn2_4.setEnabled(true);btn3_4.setEnabled(true);
        btn0_5.setEnabled(true);btn1_5.setEnabled(true);btn2_5.setEnabled(true);btn3_5.setEnabled(true);
        btn0_6.setEnabled(true);btn1_6.setEnabled(true);btn2_6.setEnabled(true);btn3_6.setEnabled(true);
        btn0_7.setEnabled(true);btn1_7.setEnabled(true);btn2_7.setEnabled(true);btn3_7.setEnabled(true);
        btn0_8.setEnabled(true);btn1_8.setEnabled(true);btn2_8.setEnabled(true);btn3_8.setEnabled(true);
        btn0_9.setEnabled(true);btn1_9.setEnabled(true);btn2_9.setEnabled(true);btn3_9.setEnabled(true);
        
        btn4_0.setEnabled(true);btn5_0.setEnabled(true);btn6_0.setEnabled(true);
        btn4_1.setEnabled(true);btn5_1.setEnabled(true);btn6_1.setEnabled(true);
        btn4_2.setEnabled(true);btn5_2.setEnabled(true);btn6_2.setEnabled(true);
        btn4_3.setEnabled(true);btn5_3.setEnabled(true);btn6_3.setEnabled(true);
        btn4_4.setEnabled(true);btn5_4.setEnabled(true);btn6_4.setEnabled(true);
        btn4_5.setEnabled(true);btn5_5.setEnabled(true);btn6_5.setEnabled(true);
        btn4_6.setEnabled(true);btn5_6.setEnabled(true);btn6_6.setEnabled(true);
        btn4_7.setEnabled(true);btn5_7.setEnabled(true);btn6_7.setEnabled(true);
        btn4_8.setEnabled(true);btn5_8.setEnabled(true);btn6_8.setEnabled(true);
        btn4_9.setEnabled(true);btn5_9.setEnabled(true);btn6_9.setEnabled(true);
        
        btn7_0.setEnabled(true);btn8_0.setEnabled(true);btn9_0.setEnabled(true);
        btn7_1.setEnabled(true);btn8_1.setEnabled(true);btn9_1.setEnabled(true);
        btn7_2.setEnabled(true);btn8_2.setEnabled(true);btn9_2.setEnabled(true);
        btn7_3.setEnabled(true);btn8_3.setEnabled(true);btn9_3.setEnabled(true);
        btn7_4.setEnabled(true);btn8_4.setEnabled(true);btn9_4.setEnabled(true);
        btn7_5.setEnabled(true);btn8_5.setEnabled(true);btn9_5.setEnabled(true);
        btn7_6.setEnabled(true);btn8_6.setEnabled(true);btn9_6.setEnabled(true);
        btn7_7.setEnabled(true);btn8_7.setEnabled(true);btn9_7.setEnabled(true);
        btn7_8.setEnabled(true);btn8_8.setEnabled(true);btn9_8.setEnabled(true);       
        btn7_9.setEnabled(true);btn8_9.setEnabled(true);btn9_9.setEnabled(true);             
    }//GEN-LAST:event_btn_jugarActionPerformed
    //Todos las acciones que realizaran los botones en la posicion fila-columna
    private void btn0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_0ActionPerformed
        fila = 0;
        col = 0;
        validarPosicionesVaciasYBarcos(btn0_0);
    }//GEN-LAST:event_btn0_0ActionPerformed
    private void btn0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_1ActionPerformed
        fila = 0;
        col = 1;
        validarPosicionesVaciasYBarcos(btn0_1);
    }//GEN-LAST:event_btn0_1ActionPerformed
    private void btn0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_2ActionPerformed
        fila = 0;
        col = 2;
        validarPosicionesVaciasYBarcos(btn0_2);
    }//GEN-LAST:event_btn0_2ActionPerformed
    private void btn0_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_3ActionPerformed
        fila = 0;
        col = 3;
        validarPosicionesVaciasYBarcos(btn0_3);
    }//GEN-LAST:event_btn0_3ActionPerformed
    private void btn0_4ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 0;
        col = 4;
        validarPosicionesVaciasYBarcos(btn0_4);
    }
    private void btn0_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_5ActionPerformed
        fila = 0;
        col = 5;
        validarPosicionesVaciasYBarcos(btn0_5);
    }//GEN-LAST:event_btn0_5ActionPerformed
    private void btn0_6ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 0;
        col = 6;
        validarPosicionesVaciasYBarcos(btn0_6);
    }
    private void btn0_7ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 0;
        col = 7;
        validarPosicionesVaciasYBarcos(btn0_7);
    }
    private void btn0_8ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 0;
        col = 8;
        validarPosicionesVaciasYBarcos(btn0_8);
    }
    private void btn0_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0_9ActionPerformed
        fila = 0;
        col = 9;
        validarPosicionesVaciasYBarcos(btn0_9);
    }//GEN-LAST:event_btn0_9ActionPerformed
    private void btn1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_0ActionPerformed
        fila = 1;
        col = 0;
        validarPosicionesVaciasYBarcos(btn1_0);
    }//GEN-LAST:event_btn1_0ActionPerformed
    private void btn1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 1;
        col = 1;
        validarPosicionesVaciasYBarcos(btn1_1);
    }
    private void btn1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_2ActionPerformed
        fila = 1;
        col = 2;
        validarPosicionesVaciasYBarcos(btn1_2);
    }//GEN-LAST:event_btn1_2ActionPerformed
    private void btn1_3ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 1;
        col = 3;
        validarPosicionesVaciasYBarcos(btn1_3);
    }
    private void btn1_4ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 1;
        col = 4;
        validarPosicionesVaciasYBarcos(btn1_4);
    }
    private void btn1_5ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 1;
        col = 5;
        validarPosicionesVaciasYBarcos(btn1_5);
    }
    private void btn1_6ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 1;
        col = 6;
        validarPosicionesVaciasYBarcos(btn1_6);
    }
    private void btn1_7ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 1;
        col = 7;
        validarPosicionesVaciasYBarcos(btn1_7);
    }
    private void btn1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_8ActionPerformed
        fila = 1;
        col = 8;
        validarPosicionesVaciasYBarcos(btn1_8);
    }//GEN-LAST:event_btn1_8ActionPerformed
    private void btn1_9ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 1;
        col = 9;
        validarPosicionesVaciasYBarcos(btn1_9);
    }
    private void btn2_0ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 2;
        col = 0;
        validarPosicionesVaciasYBarcos(btn2_0);
    }
    private void btn2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 2;
        col = 1;
        validarPosicionesVaciasYBarcos(btn2_1);
    }
    private void btn2_2ActionPerformed(java.awt.event.ActionEvent evt) {
        fila = 2;
        col = 2;
        validarPosicionesVaciasYBarcos(btn2_2);
    }
    private void btn2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_3ActionPerformed
        fila = 2;
        col = 3;
        validarPosicionesVaciasYBarcos(btn2_3);
    }//GEN-LAST:event_btn2_3ActionPerformed
    private void btn2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_4ActionPerformed
        fila = 2;
        col = 4;
        validarPosicionesVaciasYBarcos(btn2_4);
    }//GEN-LAST:event_btn2_4ActionPerformed
    private void btn2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_5ActionPerformed
        fila = 2;
        col = 5;
        validarPosicionesVaciasYBarcos(btn2_5);
    }//GEN-LAST:event_btn2_5ActionPerformed
    private void btn2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_6ActionPerformed
        fila = 2;
        col = 6;
        validarPosicionesVaciasYBarcos(btn2_6);
    }//GEN-LAST:event_btn2_6ActionPerformed
    private void btn2_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_7ActionPerformed
        fila = 2;
        col = 7;
        validarPosicionesVaciasYBarcos(btn2_7);
    }//GEN-LAST:event_btn2_7ActionPerformed
    private void btn2_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_8ActionPerformed
        fila = 2;
        col = 8;
        validarPosicionesVaciasYBarcos(btn2_8);
    }//GEN-LAST:event_btn2_8ActionPerformed
    private void btn2_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_9ActionPerformed
        fila = 2;
        col = 9;
        validarPosicionesVaciasYBarcos(btn2_9);
    }//GEN-LAST:event_btn2_9ActionPerformed
    private void btn3_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_0ActionPerformed
        fila = 3;
        col = 0;
        validarPosicionesVaciasYBarcos(btn3_0);
    }//GEN-LAST:event_btn3_0ActionPerformed
    private void btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_1ActionPerformed
        fila = 3;
        col = 1;
        validarPosicionesVaciasYBarcos(btn3_1);
    }//GEN-LAST:event_btn3_1ActionPerformed
    private void btn3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_2ActionPerformed
        fila = 3;
        col = 2;
        validarPosicionesVaciasYBarcos(btn3_2);
    }//GEN-LAST:event_btn3_2ActionPerformed
    private void btn3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_3ActionPerformed
        fila = 3;
        col = 3;
        validarPosicionesVaciasYBarcos(btn3_3);
    }//GEN-LAST:event_btn3_3ActionPerformed
    private void btn3_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_4ActionPerformed
        fila = 3;
        col = 4;
        validarPosicionesVaciasYBarcos(btn3_4);
    }//GEN-LAST:event_btn3_4ActionPerformed
    private void btn3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_5ActionPerformed
        fila = 3;
        col = 5;
        validarPosicionesVaciasYBarcos(btn3_5);
    }//GEN-LAST:event_btn3_5ActionPerformed
    private void btn3_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_6ActionPerformed
        fila = 3;
        col = 6;
        validarPosicionesVaciasYBarcos(btn3_6);
    }//GEN-LAST:event_btn3_6ActionPerformed
    private void btn3_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_7ActionPerformed
        fila = 3;
        col = 7;
        validarPosicionesVaciasYBarcos(btn3_7);
    }//GEN-LAST:event_btn3_7ActionPerformed
    private void btn3_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_8ActionPerformed
        fila = 3;
        col = 8;
        validarPosicionesVaciasYBarcos(btn3_8);
    }//GEN-LAST:event_btn3_8ActionPerformed
    private void btn3_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_9ActionPerformed
        fila = 3;
        col = 9;
        validarPosicionesVaciasYBarcos(btn3_9);
    }//GEN-LAST:event_btn3_9ActionPerformed
    private void btn4_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_0ActionPerformed
        fila = 4;
        col = 0;
        validarPosicionesVaciasYBarcos(btn4_0);
    }//GEN-LAST:event_btn4_0ActionPerformed
    private void btn4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_1ActionPerformed
        fila = 4;
        col = 1;
        validarPosicionesVaciasYBarcos(btn4_1);
    }//GEN-LAST:event_btn4_1ActionPerformed
    private void btn4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_2ActionPerformed
        fila = 4;
        col = 2;
        validarPosicionesVaciasYBarcos(btn4_2);
    }//GEN-LAST:event_btn4_2ActionPerformed
    private void btn4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_3ActionPerformed
        fila = 4;
        col = 3;
        validarPosicionesVaciasYBarcos(btn4_3);
    }//GEN-LAST:event_btn4_3ActionPerformed
    private void btn4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_4ActionPerformed
        fila = 4;
        col = 4;
        validarPosicionesVaciasYBarcos(btn4_4);
    }//GEN-LAST:event_btn4_4ActionPerformed
    private void btn4_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_5ActionPerformed
        fila = 4;
        col = 5;
        validarPosicionesVaciasYBarcos(btn4_5);
    }//GEN-LAST:event_btn4_5ActionPerformed
    private void btn4_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_6ActionPerformed
        fila = 4;
        col = 6;
        validarPosicionesVaciasYBarcos(btn4_6);
    }//GEN-LAST:event_btn4_6ActionPerformed
    private void btn4_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_7ActionPerformed
        fila = 4;
        col = 7;
        validarPosicionesVaciasYBarcos(btn4_7);
    }//GEN-LAST:event_btn4_7ActionPerformed
    private void btn4_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_8ActionPerformed
        fila = 4;
        col = 8;
        validarPosicionesVaciasYBarcos(btn4_8);
    }//GEN-LAST:event_btn4_8ActionPerformed
    private void btn4_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_9ActionPerformed
        fila = 4;
        col = 9;
        validarPosicionesVaciasYBarcos(btn4_9);
    }//GEN-LAST:event_btn4_9ActionPerformed
    private void btn5_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_0ActionPerformed
        fila = 5;
        col = 0;
        validarPosicionesVaciasYBarcos(btn5_0);
    }//GEN-LAST:event_btn5_0ActionPerformed
    private void btn5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_1ActionPerformed
        fila = 5;
        col = 1;
        validarPosicionesVaciasYBarcos(btn5_1);
    }//GEN-LAST:event_btn5_1ActionPerformed
    private void btn5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_2ActionPerformed
        fila = 5;
        col = 2;
        validarPosicionesVaciasYBarcos(btn5_2);
    }//GEN-LAST:event_btn5_2ActionPerformed
    private void btn5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_3ActionPerformed
        fila = 5;
        col = 3;
        validarPosicionesVaciasYBarcos(btn5_3);
    }//GEN-LAST:event_btn5_3ActionPerformed
    private void btn5_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_4ActionPerformed
        fila = 5;
        col = 4;
        validarPosicionesVaciasYBarcos(btn5_4);
    }//GEN-LAST:event_btn5_4ActionPerformed
    private void btn5_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_5ActionPerformed
        fila = 5;
        col = 5;
        validarPosicionesVaciasYBarcos(btn5_5);
    }//GEN-LAST:event_btn5_5ActionPerformed
    private void btn5_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_6ActionPerformed
        fila = 5;
        col = 6;
        validarPosicionesVaciasYBarcos(btn5_6);
    }//GEN-LAST:event_btn5_6ActionPerformed
    private void btn5_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_7ActionPerformed
        fila = 5;
        col = 7;
        validarPosicionesVaciasYBarcos(btn5_7);
    }//GEN-LAST:event_btn5_7ActionPerformed
    private void btn5_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_8ActionPerformed
        fila = 5;
        col = 8;
        validarPosicionesVaciasYBarcos(btn5_8);
    }//GEN-LAST:event_btn5_8ActionPerformed
    private void btn5_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_9ActionPerformed
        fila = 5;
        col = 9;
        validarPosicionesVaciasYBarcos(btn5_9);
    }//GEN-LAST:event_btn5_9ActionPerformed
    private void btn6_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_0ActionPerformed
        fila = 6;
        col = 0;
        validarPosicionesVaciasYBarcos(btn6_0);
    }//GEN-LAST:event_btn6_0ActionPerformed
    private void btn6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_1ActionPerformed
        fila = 6;
        col = 1;
        validarPosicionesVaciasYBarcos(btn6_1);
    }//GEN-LAST:event_btn6_1ActionPerformed
    private void btn6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_2ActionPerformed
        fila = 6;
        col = 2;
        validarPosicionesVaciasYBarcos(btn6_2);
    }//GEN-LAST:event_btn6_2ActionPerformed
    private void btn6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_3ActionPerformed
        fila = 6;
        col = 3;
        validarPosicionesVaciasYBarcos(btn6_3);
    }//GEN-LAST:event_btn6_3ActionPerformed
    private void btn6_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_4ActionPerformed
        fila = 6;
        col = 4;
        validarPosicionesVaciasYBarcos(btn6_4);
    }//GEN-LAST:event_btn6_4ActionPerformed
    private void btn6_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_5ActionPerformed
        fila = 6;
        col = 5;
        validarPosicionesVaciasYBarcos(btn6_5);
    }//GEN-LAST:event_btn6_5ActionPerformed
    private void btn6_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_6ActionPerformed
        fila = 6;
        col = 6;
        validarPosicionesVaciasYBarcos(btn6_6);
    }//GEN-LAST:event_btn6_6ActionPerformed
    private void btn6_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_7ActionPerformed
        fila = 6;
        col = 7;
        validarPosicionesVaciasYBarcos(btn6_7);
    }//GEN-LAST:event_btn6_7ActionPerformed
    private void btn6_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_8ActionPerformed
        fila = 6;
        col = 8;
        validarPosicionesVaciasYBarcos(btn6_8);
    }//GEN-LAST:event_btn6_8ActionPerformed
    private void btn6_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_9ActionPerformed
        fila = 6;
        col = 9;
        validarPosicionesVaciasYBarcos(btn6_9);
    }//GEN-LAST:event_btn6_9ActionPerformed
    private void btn7_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_0ActionPerformed
        fila = 7;
        col = 0;
        validarPosicionesVaciasYBarcos(btn7_0);
    }//GEN-LAST:event_btn7_0ActionPerformed
    private void btn7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_1ActionPerformed
        fila = 7;
        col = 1;
        validarPosicionesVaciasYBarcos(btn7_1);
    }//GEN-LAST:event_btn7_1ActionPerformed
    private void btn7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_2ActionPerformed
        fila = 7;
        col = 2;
        validarPosicionesVaciasYBarcos(btn7_2);
    }//GEN-LAST:event_btn7_2ActionPerformed
    private void btn7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_3ActionPerformed
        fila = 7;
        col = 3;
        validarPosicionesVaciasYBarcos(btn7_3);
    }//GEN-LAST:event_btn7_3ActionPerformed
    private void btn7_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_4ActionPerformed
        fila = 7;
        col = 4;
        validarPosicionesVaciasYBarcos(btn7_4);
    }//GEN-LAST:event_btn7_4ActionPerformed
    private void btn7_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_5ActionPerformed
        fila = 7;
        col = 5;
        validarPosicionesVaciasYBarcos(btn7_5);
    }//GEN-LAST:event_btn7_5ActionPerformed
    private void btn7_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_6ActionPerformed
        fila = 7;
        col = 6;
        validarPosicionesVaciasYBarcos(btn7_6);
    }//GEN-LAST:event_btn7_6ActionPerformed
    private void btn7_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_7ActionPerformed
        fila = 7;
        col = 7;
        validarPosicionesVaciasYBarcos(btn7_7);
    }//GEN-LAST:event_btn7_7ActionPerformed
    private void btn7_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_8ActionPerformed
        fila = 7;
        col = 8;
        validarPosicionesVaciasYBarcos(btn7_8);
    }//GEN-LAST:event_btn7_8ActionPerformed
    private void btn7_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_9ActionPerformed
        fila = 7;
        col = 9;
        validarPosicionesVaciasYBarcos(btn7_9);
    }//GEN-LAST:event_btn7_9ActionPerformed
    private void btn8_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_0ActionPerformed
        fila = 8;
        col = 0;
        validarPosicionesVaciasYBarcos(btn8_0);
    }//GEN-LAST:event_btn8_0ActionPerformed
    private void btn8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_1ActionPerformed
        fila = 8;
        col = 1;
        validarPosicionesVaciasYBarcos(btn8_1);
    }//GEN-LAST:event_btn8_1ActionPerformed
    private void btn8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_2ActionPerformed
        fila = 8;
        col = 2;
        validarPosicionesVaciasYBarcos(btn8_2);
    }//GEN-LAST:event_btn8_2ActionPerformed
    private void btn8_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_3ActionPerformed
        fila = 8;
        col = 3;
        validarPosicionesVaciasYBarcos(btn8_3);
    }//GEN-LAST:event_btn8_3ActionPerformed
    private void btn8_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_4ActionPerformed
        fila = 8;
        col = 4;
        validarPosicionesVaciasYBarcos(btn8_4);
    }//GEN-LAST:event_btn8_4ActionPerformed
    private void btn8_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_5ActionPerformed
        fila = 8;
        col = 5;
        validarPosicionesVaciasYBarcos(btn8_5);
    }//GEN-LAST:event_btn8_5ActionPerformed
    private void btn8_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_6ActionPerformed
        fila = 8;
        col = 6;
        validarPosicionesVaciasYBarcos(btn8_6);
    }//GEN-LAST:event_btn8_6ActionPerformed
    private void btn8_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_7ActionPerformed
        fila = 8;
        col = 7;
        validarPosicionesVaciasYBarcos(btn8_7);
    }//GEN-LAST:event_btn8_7ActionPerformed
    private void btn8_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_8ActionPerformed
        fila = 8;
        col = 8;
        validarPosicionesVaciasYBarcos(btn8_8);
    }//GEN-LAST:event_btn8_8ActionPerformed
    private void btn8_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_9ActionPerformed
        fila = 8;
        col = 9;
        validarPosicionesVaciasYBarcos(btn8_9);
    }//GEN-LAST:event_btn8_9ActionPerformed
    private void btn9_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_0ActionPerformed
        fila = 9;
        col = 0;
        validarPosicionesVaciasYBarcos(btn9_0);
    }//GEN-LAST:event_btn9_0ActionPerformed
    private void btn9_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_1ActionPerformed
        fila = 9;
        col = 1;
        validarPosicionesVaciasYBarcos(btn9_1);
    }//GEN-LAST:event_btn9_1ActionPerformed
    private void btn9_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_2ActionPerformed
        fila = 9;
        col = 2;
        validarPosicionesVaciasYBarcos(btn9_2);
    }//GEN-LAST:event_btn9_2ActionPerformed
    private void btn9_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_3ActionPerformed
        fila = 9;
        col = 3;
        validarPosicionesVaciasYBarcos(btn9_3);
    }//GEN-LAST:event_btn9_3ActionPerformed
    private void btn9_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_4ActionPerformed
        fila = 9;
        col = 4;
        validarPosicionesVaciasYBarcos(btn9_4);
    }//GEN-LAST:event_btn9_4ActionPerformed
    private void btn9_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_5ActionPerformed
        fila = 9;
        col = 5;
        validarPosicionesVaciasYBarcos(btn9_5);
    }//GEN-LAST:event_btn9_5ActionPerformed
    private void btn9_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_6ActionPerformed
        fila = 9;
        col = 6;
        validarPosicionesVaciasYBarcos(btn9_6);
    }//GEN-LAST:event_btn9_6ActionPerformed
    private void btn9_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_7ActionPerformed
        fila = 9;
        col = 7;
        validarPosicionesVaciasYBarcos(btn9_7);
    }//GEN-LAST:event_btn9_7ActionPerformed
    private void btn9_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_8ActionPerformed
        fila = 9;
        col = 8;
        validarPosicionesVaciasYBarcos(btn9_8);
    }//GEN-LAST:event_btn9_8ActionPerformed
    private void btn9_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_9ActionPerformed
        fila = 9;
        col = 9;
        validarPosicionesVaciasYBarcos(btn9_9);
    }//GEN-LAST:event_btn9_9ActionPerformed

    //EVENTO CAMBIO DE COLOR BOTONES
	private void btn5_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_0MouseExited
            btn5_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_0MouseExited
    private void btn5_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_0MouseEntered
        btn5_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_0MouseEntered
    private void btn4_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_9MouseExited
        btn4_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_9MouseExited
    private void btn4_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_9MouseEntered
        btn4_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_9MouseEntered
    private void btn4_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_8MouseExited
        btn4_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_8MouseExited
    private void btn4_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_8MouseEntered
        btn4_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_8MouseEntered
    private void btn4_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_7MouseExited
        btn4_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_7MouseExited
    private void btn4_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_7MouseEntered
        btn4_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_7MouseEntered
    private void btn4_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_6MouseExited
        btn4_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_6MouseExited
    private void btn4_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_6MouseEntered
        btn4_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_6MouseEntered
    private void btn4_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_5MouseExited
        btn4_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_5MouseExited
    private void btn4_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_5MouseEntered
        btn4_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_5MouseEntered
	private void btn4_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_4MouseExited
            btn4_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_4MouseExited
    private void btn4_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_4MouseEntered
        btn4_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_4MouseEntered
    private void btn4_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_3MouseExited
        btn4_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_3MouseExited
    private void btn4_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_3MouseEntered
        btn4_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_3MouseEntered
    private void btn4_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_2MouseExited
        btn4_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_2MouseExited
    private void btn4_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_2MouseEntered
        btn4_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_2MouseEntered
    private void btn4_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_1MouseExited
        btn4_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_1MouseExited
	 private void btn4_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_1MouseEntered
             btn4_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_1MouseEntered
    private void btn0_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_0MouseEntered
        btn0_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_0MouseEntered
	private void btn0_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_0MouseExited
            btn0_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_0MouseExited
	private void btn0_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_1MouseExited
            btn0_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_1MouseExited
    private void btn0_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_1MouseEntered
        btn0_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_1MouseEntered
	 private void btn0_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_2MouseExited
             btn0_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_2MouseExited
    private void btn0_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_2MouseEntered
        btn0_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_2MouseEntered
	private void btn0_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_3MouseExited
            btn0_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_3MouseExited
    private void btn0_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_3MouseEntered
        btn0_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_3MouseEntered
	private void btn0_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_4MouseExited
            btn0_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_4MouseExited
    private void btn0_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_4MouseEntered
        btn0_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_4MouseEntered
	 private void btn0_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_5MouseExited
             btn0_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_5MouseExited
    private void btn0_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_5MouseEntered
        btn0_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_5MouseEntered
	private void btn0_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_6MouseExited
            btn0_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_6MouseExited
    private void btn0_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_6MouseEntered
        btn0_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_6MouseEntered
	private void btn0_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_7MouseExited
            btn0_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_7MouseExited
    private void btn0_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_7MouseEntered
        btn0_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_7MouseEntered
	 private void btn0_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_8MouseExited
             btn0_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_8MouseExited
    private void btn0_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_8MouseEntered
        btn0_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_8MouseEntered
	  private void btn0_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_9MouseExited
              btn0_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn0_9MouseExited
    private void btn0_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0_9MouseEntered
        btn0_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn0_9MouseEntered
	private void btn1_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_0MouseExited
            btn1_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_0MouseExited
    private void btn1_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_0MouseEntered
        btn1_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_0MouseEntered
	 private void btn1_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_1MouseExited
             btn1_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_1MouseExited
    private void btn1_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_1MouseEntered
        btn1_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_1MouseEntered
	 private void btn1_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_2MouseExited
             btn1_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_2MouseExited
    private void btn1_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_2MouseEntered
        btn1_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_2MouseEntered
	private void btn1_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_3MouseExited
            btn1_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_3MouseExited
    private void btn1_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_3MouseEntered
        btn1_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_3MouseEntered
	 private void btn1_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_4MouseExited
             btn1_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_4MouseExited
    private void btn1_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_4MouseEntered
        btn1_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_4MouseEntered
	 private void btn1_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_5MouseExited
             btn1_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_5MouseExited
    private void btn1_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_5MouseEntered
        btn1_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_5MouseEntered
    private void btn1_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_7MouseExited
        btn1_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_7MouseExited
    private void btn1_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_7MouseEntered
        btn1_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_7MouseEntered
	private void btn1_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_6MouseExited
            btn1_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_6MouseExited
    private void btn1_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_6MouseEntered
        btn1_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_6MouseEntered
	private void btn1_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_8MouseExited
            btn1_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_8MouseExited
    private void btn1_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_8MouseEntered
        btn1_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_8MouseEntered
    private void btn1_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_9MouseExited
        btn1_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn1_9MouseExited
    private void btn1_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1_9MouseEntered
        btn1_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn1_9MouseEntered
	 private void btn2_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_0MouseExited
             btn2_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_0MouseExited
    private void btn2_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_0MouseEntered
        btn2_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_0MouseEntered
	private void btn2_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_1MouseExited
            btn2_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_1MouseExited
    private void btn2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_1MouseEntered
        btn2_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_1MouseEntered
	private void btn2_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_2MouseExited
            btn2_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_2MouseExited
    private void btn2_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_2MouseEntered
        btn2_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_2MouseEntered
	  private void btn2_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_3MouseExited
              btn2_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_3MouseExited
    private void btn2_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_3MouseEntered
        btn2_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_3MouseEntered
	 private void btn2_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_4MouseExited
             btn2_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_4MouseExited
    private void btn2_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_4MouseEntered
        btn2_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_4MouseEntered
	 private void btn2_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_5MouseExited
             btn2_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_5MouseExited
    private void btn2_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_5MouseEntered
        btn2_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_5MouseEntered
	 private void btn2_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_6MouseExited
             btn2_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_6MouseExited
    private void btn2_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_6MouseEntered
        btn2_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_6MouseEntered
	private void btn2_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_7MouseExited
            btn2_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_7MouseExited
    private void btn2_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_7MouseEntered
        btn2_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_7MouseEntered
	   private void btn2_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_8MouseExited
               btn2_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_8MouseExited
    private void btn2_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_8MouseEntered
        btn2_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_8MouseEntered
	private void btn2_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_9MouseExited
            btn2_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn2_9MouseExited
    private void btn2_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2_9MouseEntered
        btn2_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn2_9MouseEntered
	 private void btn3_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_0MouseExited
             btn3_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_0MouseExited
    private void btn3_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_0MouseEntered
        btn3_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_0MouseEntered
	 private void btn3_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_1MouseExited
             btn3_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_1MouseExited
    private void btn3_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_1MouseEntered
        btn3_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_1MouseEntered
	private void btn3_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_2MouseExited
            btn3_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_2MouseExited
    private void btn3_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_2MouseEntered
        btn3_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_2MouseEntered
	 private void btn3_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_3MouseExited
             btn3_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_3MouseExited
    private void btn3_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_3MouseEntered
        btn3_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_3MouseEntered
	    private void btn3_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_8MouseExited
                btn3_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_8MouseExited
    private void btn3_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_8MouseEntered
        btn3_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_8MouseEntered
    private void btn3_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_7MouseExited
        btn3_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_7MouseExited
    private void btn3_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_7MouseEntered
        btn3_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_7MouseEntered
    private void btn3_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_6MouseExited
        btn3_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_6MouseExited
    private void btn3_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_6MouseEntered
        btn3_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_6MouseEntered
    private void btn3_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_5MouseExited
        btn3_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_5MouseExited
    private void btn3_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_5MouseEntered
        btn3_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_5MouseEntered
    private void btn3_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_4MouseExited
        btn3_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_4MouseExited
    private void btn3_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_4MouseEntered
        btn3_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_4MouseEntered
	private void btn4_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_0MouseExited
            btn4_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn4_0MouseExited
    private void btn4_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4_0MouseEntered
        btn4_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn4_0MouseEntered
    private void btn3_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_9MouseExited
        btn3_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn3_9MouseExited
    private void btn3_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3_9MouseEntered
        btn3_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn3_9MouseEntered
	  private void btn5_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_9MouseExited
              btn5_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_9MouseExited
    private void btn5_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_9MouseEntered
        btn5_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_9MouseEntered
    private void btn5_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_8MouseExited
        btn5_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_8MouseExited
    private void btn5_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_8MouseEntered
        btn5_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_8MouseEntered
	private void btn5_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_7MouseExited
            btn5_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_7MouseExited
    private void btn5_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_7MouseEntered
        btn5_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_7MouseEntered
    private void btn5_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_6MouseExited
        btn5_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_6MouseExited
    private void btn5_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_6MouseEntered
        btn5_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_6MouseEntered
    private void btn5_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_5MouseExited
        btn5_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_5MouseExited
    private void btn5_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_5MouseEntered
        btn5_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_5MouseEntered
    private void btn5_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_4MouseExited
        btn5_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_4MouseExited
    private void btn5_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_4MouseEntered
        btn5_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_4MouseEntered
    private void btn5_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_3MouseExited
        btn5_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_3MouseExited
    private void btn5_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_3MouseEntered
        btn5_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_3MouseEntered
    private void btn5_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_2MouseExited
        btn5_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_2MouseExited
    private void btn5_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_2MouseEntered
        btn5_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_2MouseEntered
    private void btn5_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_1MouseExited
        btn5_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn5_1MouseExited
    private void btn5_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5_1MouseEntered
        btn5_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn5_1MouseEntered
	    private void btn6_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_9MouseExited
                btn6_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_9MouseExited
    private void btn6_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_9MouseEntered
        btn6_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_9MouseEntered
    private void btn6_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_8MouseExited
        btn6_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_8MouseExited
    private void btn6_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_8MouseEntered
        btn6_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_8MouseEntered
    private void btn6_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_7MouseExited
        btn6_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_7MouseExited
    private void btn6_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_7MouseEntered
        btn6_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_7MouseEntered
    private void btn6_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_6MouseExited
        btn6_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_6MouseExited
    private void btn6_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_6MouseEntered
        btn6_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_6MouseEntered
    private void btn6_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_5MouseExited
        btn6_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_5MouseExited
    private void btn6_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_5MouseEntered
        btn6_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_5MouseEntered
    private void btn6_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_4MouseExited
        btn6_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_4MouseExited
    private void btn6_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_4MouseEntered
        btn6_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_4MouseEntered
    private void btn6_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_3MouseExited
        btn6_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_3MouseExited
    private void btn6_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_3MouseEntered
        btn6_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_3MouseEntered
    private void btn6_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_2MouseExited
        btn6_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_2MouseExited
    private void btn6_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_2MouseEntered
        btn6_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_2MouseEntered
       private void btn6_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_1MouseExited
           btn6_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_1MouseExited
    private void btn6_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_1MouseEntered
        btn6_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_1MouseEntered
    private void btn6_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_0MouseExited
        btn6_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn6_0MouseExited
    private void btn6_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6_0MouseEntered
        btn6_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn6_0MouseEntered
    private void btn7_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_9MouseExited
        btn7_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_9MouseExited
    private void btn7_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_9MouseEntered
        btn7_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_9MouseEntered
    private void btn7_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_8MouseExited
        btn7_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_8MouseExited
    private void btn7_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_8MouseEntered
        btn7_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_8MouseEntered
    private void btn7_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_7MouseExited
        btn7_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_7MouseExited
    private void btn7_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_7MouseEntered
        btn7_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_7MouseEntered
    private void btn7_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_6MouseExited
        btn7_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_6MouseExited
    private void btn7_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_6MouseEntered
        btn7_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_6MouseEntered
    private void btn7_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_5MouseExited
        btn7_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_5MouseExited
    private void btn7_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_5MouseEntered
        btn7_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_5MouseEntered
    private void btn7_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_4MouseExited
        btn7_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_4MouseExited
    private void btn7_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_4MouseEntered
        btn7_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_4MouseEntered
private void btn7_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_3MouseExited
    btn7_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_3MouseExited
    private void btn7_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_3MouseEntered
        btn7_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_3MouseEntered
    private void btn7_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_2MouseExited
        btn7_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_2MouseExited
    private void btn7_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_2MouseEntered
        btn7_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_2MouseEntered
    private void btn7_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_1MouseExited
        btn7_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_1MouseExited
    private void btn7_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_1MouseEntered
        btn7_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_1MouseEntered
    private void btn7_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_0MouseExited
        btn7_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn7_0MouseExited
    private void btn7_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7_0MouseEntered
        btn7_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn7_0MouseEntered
	 private void btn8_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_9MouseExited
             btn8_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_9MouseExited
    private void btn8_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_9MouseEntered
        btn8_9.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_9MouseEntered
    private void btn8_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_8MouseExited
        btn8_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_8MouseExited
    private void btn8_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_8MouseEntered
        btn8_8.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_8MouseEntered
    private void btn8_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_7MouseExited
        btn8_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_7MouseExited
    private void btn8_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_7MouseEntered
        btn8_7.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_7MouseEntered
    private void btn8_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_6MouseExited
        btn8_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_6MouseExited
    private void btn8_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_6MouseEntered
        btn8_6.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_6MouseEntered
        private void btn8_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_5MouseExited
            btn8_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_5MouseExited
    private void btn8_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_5MouseEntered
        btn8_5.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_5MouseEntered
	private void btn8_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_4MouseExited
            btn8_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_4MouseExited
    private void btn8_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_4MouseEntered
        btn8_4.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_4MouseEntered
    private void btn8_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_3MouseExited
        btn8_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_3MouseExited
    private void btn8_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_3MouseEntered
        btn8_3.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_3MouseEntered
    private void btn8_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_2MouseExited
        btn8_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_2MouseExited
    private void btn8_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_2MouseEntered
        btn8_2.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_2MouseEntered
    private void btn8_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_1MouseExited
        btn8_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_1MouseExited
    private void btn8_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_1MouseEntered
        btn8_1.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_1MouseEntered
    private void btn8_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_0MouseExited
        btn8_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn8_0MouseExited
    private void btn8_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8_0MouseEntered
        btn8_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn8_0MouseEntered
	  private void btn9_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_9MouseExited
              btn9_9.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_9MouseExited
    private void btn9_9MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_9.setBackground(new Color(181, 39, 39));
    }
    private void btn9_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_8MouseExited
        btn9_8.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_8MouseExited
    private void btn9_8MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_8.setBackground(new Color(181, 39, 39));
    }
    private void btn9_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_7MouseExited
        btn9_7.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_7MouseExited
    private void btn9_7MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_7.setBackground(new Color(181, 39, 39));
    }
    private void btn9_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_6MouseExited
        btn9_6.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_6MouseExited
    private void btn9_6MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_6.setBackground(new Color(181, 39, 39));
    }
    private void btn9_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_5MouseExited
        btn9_5.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_5MouseExited
    private void btn9_5MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_5.setBackground(new Color(181, 39, 39));
    }
    private void btn9_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_4MouseExited
        btn9_4.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_4MouseExited
    private void btn9_4MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_4.setBackground(new Color(181, 39, 39));
    }
    private void btn9_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_3MouseExited
        btn9_3.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_3MouseExited
    private void btn9_3MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_3.setBackground(new Color(181, 39, 39));
    }
    private void btn9_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_2MouseExited
        btn9_2.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_2MouseExited
    private void btn9_2MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_2.setBackground(new Color(181, 39, 39));
    }
    private void btn9_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_1MouseExited
        btn9_1.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_1MouseExited
    private void btn9_1MouseEntered(java.awt.event.MouseEvent evt) {
        btn9_1.setBackground(new Color(181, 39, 39));
    }
    private void btn9_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_0MouseExited
        btn9_0.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn9_0MouseExited
    private void btn9_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9_0MouseEntered
        btn9_0.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn9_0MouseEntered

    private void btn_jugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jugarMouseEntered
        btn_jugar.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_btn_jugarMouseEntered

    private void btn_jugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jugarMouseExited
        btn_jugar.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_btn_jugarMouseExited

    private void txta_mostrar_matrizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txta_mostrar_matrizMouseEntered
        txta_mostrar_matriz.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_txta_mostrar_matrizMouseEntered

    private void txta_mostrar_matrizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txta_mostrar_matrizMouseExited
        txta_mostrar_matriz.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_txta_mostrar_matrizMouseExited

    private void txt_puntajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_puntajeMouseEntered
        txt_puntaje.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_txt_puntajeMouseEntered

    private void txt_puntajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_puntajeMouseExited
        txt_puntaje.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_txt_puntajeMouseExited

    private void txt_misilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_misilesMouseEntered
        txt_misiles.setBackground(new Color(181, 39, 39));
    }//GEN-LAST:event_txt_misilesMouseEntered

    private void txt_misilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_misilesMouseExited
        txt_misiles.setBackground(new Color(121, 17, 17));
    }//GEN-LAST:event_txt_misilesMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PrincipalBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalBN().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0_0;
    private javax.swing.JButton btn0_1;
    private javax.swing.JButton btn0_2;
    private javax.swing.JButton btn0_3;
    private javax.swing.JButton btn0_4;
    private javax.swing.JButton btn0_5;
    private javax.swing.JButton btn0_6;
    private javax.swing.JButton btn0_7;
    private javax.swing.JButton btn0_8;
    private javax.swing.JButton btn0_9;
    private javax.swing.JButton btn1_0;
    private javax.swing.JButton btn1_1;
    private javax.swing.JButton btn1_2;
    private javax.swing.JButton btn1_3;
    private javax.swing.JButton btn1_4;
    private javax.swing.JButton btn1_5;
    private javax.swing.JButton btn1_6;
    private javax.swing.JButton btn1_7;
    private javax.swing.JButton btn1_8;
    private javax.swing.JButton btn1_9;
    private javax.swing.JButton btn2_0;
    private javax.swing.JButton btn2_1;
    private javax.swing.JButton btn2_2;
    private javax.swing.JButton btn2_3;
    private javax.swing.JButton btn2_4;
    private javax.swing.JButton btn2_5;
    private javax.swing.JButton btn2_6;
    private javax.swing.JButton btn2_7;
    private javax.swing.JButton btn2_8;
    private javax.swing.JButton btn2_9;
    private javax.swing.JButton btn3_0;
    private javax.swing.JButton btn3_1;
    private javax.swing.JButton btn3_2;
    private javax.swing.JButton btn3_3;
    private javax.swing.JButton btn3_4;
    private javax.swing.JButton btn3_5;
    private javax.swing.JButton btn3_6;
    private javax.swing.JButton btn3_7;
    private javax.swing.JButton btn3_8;
    private javax.swing.JButton btn3_9;
    private javax.swing.JButton btn4_0;
    private javax.swing.JButton btn4_1;
    private javax.swing.JButton btn4_2;
    private javax.swing.JButton btn4_3;
    private javax.swing.JButton btn4_4;
    private javax.swing.JButton btn4_5;
    private javax.swing.JButton btn4_6;
    private javax.swing.JButton btn4_7;
    private javax.swing.JButton btn4_8;
    private javax.swing.JButton btn4_9;
    private javax.swing.JButton btn5_0;
    private javax.swing.JButton btn5_1;
    private javax.swing.JButton btn5_2;
    private javax.swing.JButton btn5_3;
    private javax.swing.JButton btn5_4;
    private javax.swing.JButton btn5_5;
    private javax.swing.JButton btn5_6;
    private javax.swing.JButton btn5_7;
    private javax.swing.JButton btn5_8;
    private javax.swing.JButton btn5_9;
    private javax.swing.JButton btn6_0;
    private javax.swing.JButton btn6_1;
    private javax.swing.JButton btn6_2;
    private javax.swing.JButton btn6_3;
    private javax.swing.JButton btn6_4;
    private javax.swing.JButton btn6_5;
    private javax.swing.JButton btn6_6;
    private javax.swing.JButton btn6_7;
    private javax.swing.JButton btn6_8;
    private javax.swing.JButton btn6_9;
    private javax.swing.JButton btn7_0;
    private javax.swing.JButton btn7_1;
    private javax.swing.JButton btn7_2;
    private javax.swing.JButton btn7_3;
    private javax.swing.JButton btn7_4;
    private javax.swing.JButton btn7_5;
    private javax.swing.JButton btn7_6;
    private javax.swing.JButton btn7_7;
    private javax.swing.JButton btn7_8;
    private javax.swing.JButton btn7_9;
    private javax.swing.JButton btn8_0;
    private javax.swing.JButton btn8_1;
    private javax.swing.JButton btn8_2;
    private javax.swing.JButton btn8_3;
    private javax.swing.JButton btn8_4;
    private javax.swing.JButton btn8_5;
    private javax.swing.JButton btn8_6;
    private javax.swing.JButton btn8_7;
    private javax.swing.JButton btn8_8;
    private javax.swing.JButton btn8_9;
    private javax.swing.JButton btn9_0;
    private javax.swing.JButton btn9_1;
    private javax.swing.JButton btn9_2;
    private javax.swing.JButton btn9_3;
    private javax.swing.JButton btn9_4;
    private javax.swing.JButton btn9_5;
    private javax.swing.JButton btn9_6;
    private javax.swing.JButton btn9_7;
    private javax.swing.JButton btn9_8;
    private javax.swing.JButton btn9_9;
    private javax.swing.JButton btn_jugar;
    private javax.swing.JButton btn_logo;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_misiles;
    private javax.swing.JTextField txt_puntaje;
    private javax.swing.JTextArea txta_mostrar_matriz;
    // End of variables declaration//GEN-END:variables
}
