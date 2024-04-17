import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// پکیچ های  وارد شده به پروزه

public class main {
    public static void main(String[] args) {
        form();

    }
    public static void form(){
        // ساخت محیط گرافیگی برنامه
        JFrame jFrame=new JFrame("ثبت نام");
        jFrame .setSize(300,600);

        JButton jButton=new JButton("ثبت");


        JLabel L1,L2,L3,L4;

        L1=new JLabel("کد ملی");
        L2=new JLabel("نام");
        L3=new JLabel("نام خانوادگی");
        L4=new JLabel("سن");


        L1.setBounds(40,30,93,30);
        jFrame.add(L1);
        JTextField jTextField=new JTextField();


        jTextField.setBounds(110,30,93,30);
        jFrame.add(jTextField);
        L2.setBounds(40,80,93,30);

        jFrame.add(L2);
        JTextField jTextField1=new JTextField();
        jTextField1.setBounds(110,80,93,30);
        jFrame.add(jTextField1);
        L3.setBounds(40,130,93,30);
        jFrame.add(L3);
        JTextField jTextField2=new JTextField();
        jTextField2.setBounds(110,130,93,30);
        jFrame.add(jTextField2);
        L4.setBounds(40,180,93,30);
        jFrame.add(L4);
        JTextField jTextField3=new JTextField();
        jTextField3.setBounds(110,180,93,30);
        jFrame.add(jTextField3);
        jButton.setBounds(100,500,93,30);
        jFrame.add(jButton);
        jFrame.setSize(300,600);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //دادن یک اکشن به دکمه ثبت
                // برا ی کنترل استسنا از  try استفاده کرده
                try {

// تعریف متقیر ها و پر کرده انها با وردی فرم
                    String id = jTextField.getText();
                    String name = jTextField1.getText();
                    String family = jTextField2.getText();
                    String age = jTextField3.getText();

// اجرای کلاس json و دریافت 4 ورودی برای متد
                    Json json=new Json();
                    json.JSON(id,name,family,age);
                    // زمانی کد اجرا شود تمامی فیلد خالی شده و پیام زیر نمایش داده می شود
                    jTextField.setText("");
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    JOptionPane.showMessageDialog(jFrame," ثبت باموفقیت انجام شد");

                }catch (Exception E){
                    // د صورت خطا کد زیر نمایش داده می شود اگر متقیر E نمایش داده شود دلیل خطا نمایش داده میشود
                    JOptionPane.showMessageDialog(jFrame," لطفا اطلاعات را صحیح وارد کنید");

                }



            }
        });


        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
