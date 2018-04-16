package com.example.saksham.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView text1;
private TextView text2;

    private String texta="";
    private String sum="";
    private Double a=0.0;

    int ad,mu,mi,di=0;
    int flag=0;
   int sumg=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(TextView) findViewById(R.id.texta);
        text2=(TextView) findViewById(R.id.textb);

    }

    public void seven(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta += 7;
            sum += 7;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();
        }
    }
    public void zero(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=0;
            sum+=0;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void six(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=6;
            sum+=6;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void five(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=5;
            sum+=5;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void four(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=4;
            sum+=4;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void three(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=3;
            sum+=3;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }
    }
    public void two(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=2;
            sum+=2;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void one(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=1;
            sum+=1;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void eight(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=8;
            sum+=8;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void nine(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=9;
            sum+=9;
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void point(View view) {
        int lines = text1.getLineCount();
        if (lines<3) {
            texta+=".";
            sum+=".";
            text1.setText(texta);
        }
        else
        {
            Toast.makeText(this,"Cannot Enter More Values",Toast.LENGTH_SHORT).show();;
        }

    }
    public void submit(View view) {
        if(ad==1)
        {
            if (!sum.equalsIgnoreCase("0")) {
                Double temp = 0.0;
                temp = Double.parseDouble(sum);
                sum = "0";
                a = a + temp;
                text2.setText(String.valueOf(a));
                ad=mu=mi=di=0;
            }
        }
        else if(mu==1)
        {
            if (!sum.equalsIgnoreCase("0")) {
                Double temp = 0.0;
                temp = Double.parseDouble(sum);
                sum = "0";

                a = a * temp;

                text2.setText(String.valueOf(a));
                ad=mu=mi=di=0;
            }
        }
        else if(di==1)
        {
            if (!sum.equalsIgnoreCase("0")) {
                Double temp = 0.0;
                temp = Double.parseDouble(sum);
                sum = "0";

                    a = a / temp;

                text2.setText(String.valueOf(a));
                ad=mu=mi=di=0;
            }
        }
        else if (mi==1) {
            if (!sum.equalsIgnoreCase("0")) {
                Double temp = 0.0;
                temp = Double.parseDouble(sum);
                sum = "0";

                a = a - temp;

                text2.setText(String.valueOf(a));
                ad = mu = mi = di = 0;
            }
        }



    }
    public void delete(View view) {
       // if (texta != null && texta.length() > 0) {
          //  texta = texta.substring(0, texta.length() - 1);
          //  text1.setText(texta);
      // }

        a=0.0;
        sum="";
        texta="";
        text1.setText(texta);
        text2.setText(sum);
        flag=0;
        ad=mi=mu=di=0;
    }
    public void divide(View view) {
        submit(view);
        ad=mu=mi=0;
        di=1;
        if (sum.equalsIgnoreCase("")) {
            sum = "";
        }
        else
        {
        String atemp = texta.substring(texta.length() - 1);
        if (atemp.equalsIgnoreCase("+") || atemp.equalsIgnoreCase("x") || atemp.equalsIgnoreCase("/") ||atemp.equalsIgnoreCase("-")) {
            texta = texta.substring(0, texta.length() - 1);
            texta += "÷";
            String htmlText = texta.replace("÷","<font color='#F44336'>÷</font>");
            text1.setText(Html.fromHtml(htmlText ));
        } else {
            texta += "÷";
            String htmlText = texta.replace("÷","<font color='#F44336'>÷</font>");
            text1.setText(Html.fromHtml(htmlText ));
        }

        if (!sum.equalsIgnoreCase("0")) {
            Double temp = 0.0;
            temp = Double.parseDouble(sum);
            sum = "0";
            if (flag==0) {
                a=a+temp;
            } else {
                a = a / temp;
            }
            text2.setText(String.valueOf(a));
        }
    }
    flag=1;
    }
    public void minus(View view) {
        submit(view);
        ad=mu=di=0;
        mi=1;
        if(sum.equalsIgnoreCase(""))
        {
            sum="";
        }
        else {
            String atemp = texta.substring(texta.length() - 1);
            if (atemp.equalsIgnoreCase("+")||atemp.equalsIgnoreCase("-") || atemp.equalsIgnoreCase("x") || atemp.equalsIgnoreCase("/")) {
                texta = texta.substring(0, texta.length() - 1);
                texta += "-";
                String htmlText = texta.replace("-","<font color='#F44336'>-</font>");
                text1.setText(Html.fromHtml(htmlText ));

            } else {
                texta += "-";
                String htmlText = texta.replace("-","<font color='#F44336'>-</font>");
                text1.setText(Html.fromHtml(htmlText ));

            }
            if (!sum.equalsIgnoreCase("0")) {
                Double temp = 0.0;
                temp = Double.parseDouble(sum);
                sum = "0";
                if (flag==0) {
                    a = a+temp;
                } else {
                    a = a-temp;
                }
                text2.setText(String.valueOf(a));
            }
        }
        flag=1;
    }
    public void add(View view) {
        submit(view);
        di=mu=mi=0;
        ad=1;

        if(sum.equalsIgnoreCase(""))
        {
            sum="";
        }
        else {
            String atemp = texta.substring(texta.length() - 1);
            if (atemp.equalsIgnoreCase("+")||atemp.equalsIgnoreCase("-") || atemp.equalsIgnoreCase("x") || atemp.equalsIgnoreCase("/")) {
                texta = texta.substring(0, texta.length() - 1);
                texta += "+";
                String htmlText = texta.replace("+","<font color='#F44336'>+</font>");
                text1.setText(Html.fromHtml(htmlText ));
            } else {
                texta += "+";
                String htmlText = texta.replace("+","<font color='#F44336'>+</font>");
                text1.setText(Html.fromHtml(htmlText ));
            }
            if (!sum.equalsIgnoreCase("0")) {
                Double temp = 0.0;
                temp = Double.parseDouble(sum);
                sum = "0";
                a = a + temp;
                text2.setText(String.valueOf(a));
            }
        }
        flag=1;
    }
    public void multiply(View view) {
        submit(view);
        ad=di=mi=0;
        mu=1;
        if(sum.equalsIgnoreCase(""))
        {
            sum="";
        }
        else {
            String atemp = texta.substring(texta.length() - 1);
            if (atemp.equalsIgnoreCase("+")||atemp.equalsIgnoreCase("-") || atemp.equalsIgnoreCase("x") || atemp.equalsIgnoreCase("/")) {
                texta = texta.substring(0, texta.length() - 1);
                texta += "x";
                String htmlText = texta.replace("x","<font color='#F44336'>x</font>");
                text1.setText(Html.fromHtml(htmlText ));
            } else {
                texta += "x";
                String htmlText = texta.replace("x","<font color='#F44336'>x</font>");
                text1.setText(Html.fromHtml(htmlText ));
            }

            if (!sum.equalsIgnoreCase("0")) {
                Double temp = 0.0;
                temp = Double.parseDouble(sum);
                sum = "0";
                if (flag == 0) {
                    a = a + temp;
                } else {
                    a = a * temp;
                }
                text2.setText(String.valueOf(a));
            }
        }
        flag=1;
    }


}
