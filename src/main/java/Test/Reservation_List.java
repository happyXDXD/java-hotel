/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;



import java.awt.Component;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author 916
 */
public class Reservation_List extends javax.swing.JFrame {

    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    // 예약 정보 ArrayList 생성
    ArrayList<guest_list> gu_list = new ArrayList<guest_list>(); 
    
    
    // 예약 정보 마우스로 누른 키값 전달
    public String getKey(JTable jTable1){
        
        String key = null;
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int row = jTable1.getSelectedRow();
        key = (String) model.getValueAt(row, 2);
        
        return key;
    }
    
    
    // 예약 정보 txt파일을 ArrayList에 저장
    public void getguest_list( ArrayList<guest_list> gu_list) throws FileNotFoundException, IOException{
    
        String str;
        // String형 키값
        String[] key;
        
        gu_list.clear();
        
        // 텍스트파일 생성
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("Guest_Reservation.txt")));
        
        // txt 파일 한 행씩 읽어서 ArrayList에 저장
        while((str = read.readLine()) != null){
            key = str.split("/");
            gu_list.add(new guest_list(key[0], key[1], key[2], key[3], key[4], key[5], key[6], key[7], key[8], key[9]));
        }
    }
    
    
    
    guest_list p1 = new guest_list();
    
    
    public void master_list() {
    // 예약관리 목록 텍스트 파일 생성
    File guest_list = new File("Guest_Reservation.txt");
    
     try {
        FileReader filereader = null;
        filereader = new FileReader(guest_list);
        
        BufferedReader bufReader = new BufferedReader(filereader);
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        
        String line;
        String[] key;
        
        
        // 한 행씩 읽어서 한 행씩 테이블에 저장
        while((line = bufReader.readLine()) != null){
            key = line.split("/");
            Object[] list = {key[0], key[1], key[2], key[3], key[4], key[5], key[6], key[7], key[8], key[9]};
            table.addRow(list);
        }

        
        
    }catch (FileNotFoundException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e) {
            e.getStackTrace();
        }
}
    
    public Reservation_List(){}
    
    
    /**
     * Creates new form Reservation_List
     */
    
    int count;
    
    public Reservation_List(int count){
        
        this.count = count;
        
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Guesrt Reservation_List");
        master_list();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel10.setText("Check_Out");

        jTextField8.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("휴먼옛체", 0, 20)); // NOI18N
        jLabel1.setText("Guest Reservation List");

        jLabel11.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel11.setText("결제 방법");

        jLabel2.setFont(new java.awt.Font("휴먼엑스포", 1, 14)); // NOI18N
        jLabel2.setText("( 고객 예약 리스트 )");

        jTextField9.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "방 번호", "이름", "전화번호", "인원 수", "체크인 일정", "Check_In", "체크아웃 일정", "Check_Out", "결제 방법", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel12.setText("Status");

        jTextField10.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("수정");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Modify");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("삭제");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("휴먼옛체", 0, 15)); // NOI18N
        jLabel13.setText("Modify_List");

        jLabel3.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel3.setText("방 번호");

        jTextField1.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel4.setText("이름");

        jTextField2.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel5.setText("전화번호");

        jTextField3.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel6.setText("인원 수");

        jTextField4.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel7.setText("체크인 일정");

        jTextField5.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel8.setText("Check_In");

        jTextField6.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N
        jLabel9.setText("체크아웃 일정");

        jTextField7.setFont(new java.awt.Font("휴먼엑스포", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(806, 806, 806))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(46, 46, 46)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(73, 73, 73))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField6))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField7))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(22, 22, 22))
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(14, 14, 14)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setText("Menu");

        jMenuItem1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem1.setText("뒤로가기");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem2.setText("종료");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // 수정 버튼
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

          
        String str;
        String key = getKey(jTable1);
        FileOutputStream file;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try{
            getguest_list(gu_list);
            for(int i = 0; i<gu_list.size(); i++){
                if(key.equals(gu_list.get(i).getPhone())){
                    
                    jTextField1.setText(gu_list.get(i).getRoomN());
                    jTextField2.setText(gu_list.get(i).getName());
                    jTextField3.setText(gu_list.get(i).getPhone());
                    jTextField4.setText(gu_list.get(i).getUser());
                    jTextField5.setText(gu_list.get(i).getCheckin_day());
                    jTextField6.setText(gu_list.get(i).getCheckin_time());
                    jTextField7.setText(gu_list.get(i).getCheckout_day());
                    jTextField8.setText(gu_list.get(i).getCheckout_time());
                    jTextField9.setText(gu_list.get(i).getPay());
                    jTextField10.setText(gu_list.get(i).getCheckin_status());

                }
            }
  
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // 삭제 버튼
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        String str;
        String key = getKey(jTable1);
        FileOutputStream file;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try{
            getguest_list(gu_list);
            model.setNumRows(0);
            
            for(int i = 0; i<gu_list.size(); i++){
                if(key.equals(gu_list.get(i).getPhone()))
                    gu_list.remove(i);
            }
            
            file = new FileOutputStream("Guest_Reservation.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(file));
            
            for(int i = 0; i < gu_list.size(); i++){
                str = String.format("%s/%s/%s/%s/%s/%s/%s/%s/%s/%s%n",gu_list.get(i).getRoomN(), gu_list.get(i).getName(), gu_list.get(i).getPhone(), gu_list.get(i).getUser(), gu_list.get(i).getCheckin_day(), gu_list.get(i).getCheckin_time(), gu_list.get(i).getCheckout_day(), gu_list.get(i).getCheckout_time(), gu_list.get(i).getPay(), gu_list.get(i).getCheckin_status());
                writer.write(str);
            }
            writer.close();
            
            File guest_list = new File("Guest_Reservation.txt");
            FileReader filereader = null;
            filereader = new FileReader(guest_list);
        
            BufferedReader bufReader = new BufferedReader(filereader);
            
            String line;
            String[] key1;
            
            // 한 행씩 읽어서 한 행씩 테이블에 저장
             while((line = bufReader.readLine()) != null){
                key1 = line.split("/");
                Object[] list = {key1[0], key1[1], key1[2], key1[3], key1[4], key1[5], key1[6], key1[7], key1[8], key1[9]};
                model.addRow(list);
            }   
            
            
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "삭제 성공", "Result", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // 메뉴 -> 뒤로가기
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed


        
        // 직원으로 들어왔을때
        if(count == 1){
            staff_List q = new staff_List();
            q.setVisible(true);
            setVisible(false);
        }
        
        // 메니저로 들어왔을때
        if(count == 2){
            manager_List p = new manager_List();
            p.setVisible(true);
            setVisible(false);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    // 메뉴 -> 종료
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    // 수정 수정
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // 클릭시 텍스트 필드에 뜨는 것 순서대로 변수에 저장
        String t1 = jTextField1.getText();
        String t2 = jTextField2.getText();
        String t3 = jTextField3.getText();
        String t4 = jTextField4.getText();
        String t5 = jTextField5.getText();
        String t6 = jTextField6.getText();
        String t7 = jTextField7.getText();
        String t8 = jTextField8.getText();
        String t9 = jTextField9.getText();
        String t10 = jTextField10.getText();
        
       
        
        // 수정 되는 구간
        String str;
        String key = getKey(jTable1);
        FileOutputStream file;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        try{
            getguest_list(gu_list);
            model.setNumRows(0);
            
            file = new FileOutputStream("Guest_Reservation.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(file));
            
            for(int i = 0; i<gu_list.size(); i++){
                if(key.equals(gu_list.get(i).getPhone())){
                    gu_list.get(i).setRoomN(t1);
                    gu_list.get(i).setName(t2);
                    gu_list.get(i).setPhone(t3);
                    gu_list.get(i).setUser(t4);
                    gu_list.get(i).setCheckin_day(t5);
                    gu_list.get(i).setCheckin_time(t6);
                    gu_list.get(i).setCheckout_day(t7);
                    gu_list.get(i).setCheckout_time(t8);
                    gu_list.get(i).setPay(t9);
                    gu_list.get(i).setCheckin_status(t10);
                }
                str = String.format("%s/%s/%s/%s/%s/%s/%s/%s/%s/%s%n"
                        ,gu_list.get(i).getRoomN(), gu_list.get(i).getName(), gu_list.get(i).getPhone(), gu_list.get(i).getUser() 
                        ,gu_list.get(i).getCheckin_day(), gu_list.get(i).getCheckin_time(), gu_list.get(i).getCheckout_day()
                        ,gu_list.get(i).getCheckout_time(), gu_list.get(i).getPay(), gu_list.get(i).getCheckin_status());
                writer.write(str);
            }
            writer.close();
            
            
            
            
            
            // 테이블 새로고침
            File guest_list = new File("Guest_Reservation.txt");
            FileReader filereader = null;
            filereader = new FileReader(guest_list);
        
            BufferedReader bufReader = new BufferedReader(filereader);
            
            String line;
            String[] key1;
            
            // 초기화 한 후 다시 테이블에 출력
            // 한 행씩 읽어서 한 행씩 테이블에 저장
             while((line = bufReader.readLine()) != null){
                key1 = line.split("/");
                Object[] list = {key1[0], key1[1], key1[2], key1[3], key1[4], key1[5], key1[6], key1[7], key1[8], key1[9]};
                model.addRow(list);
            }
            
             
             
             
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Reservation_List.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        
        
        JOptionPane.showMessageDialog(null, "수정 완료", "Result", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Reservation_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
