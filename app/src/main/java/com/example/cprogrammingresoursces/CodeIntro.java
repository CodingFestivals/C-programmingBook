package com.example.cprogrammingresoursces;

public class CodeIntro {
   static String s;
   public static String getStringIntro(){
        s="#include<stdio.h>\n" +
                "int main(){\n" +
                "    int x=17,y=24;\n" +
                "    printf(\"%d\\n\",(x&y));\n" +
                "    printf(\"%d\\n\",(x|y));\n" +
                "    printf(\"%d\\n\",(x^y));\n" +
                "    printf(\"%d\\n\",y>>2);\n" +
                "    printf(\"%d\\n\",x<<3);\n" +
                "}\n";
        return s;
   }public static String getStringAdvantage(){
        s="#include<stdio.h>\n" +
                "int bubble_sort(int b[],int n);\n" +
                "int main(){\n" +
                "    int n,i;\n" +
                "    printf(\"Enter Your Value\\n\");\n" +
                "    scanf(\"%d\",&n);\n" +
                "    int a[n];\n" +
                "    for(i=0;i<n;i++){\n" +
                "        printf(\"Enter Your Valuea[%d]\\n\",i);\n" +
                "        scanf(\"%d\",&a[i]);\n" +
                "    }\n" +
                "    bubble_sort(a,n);\n" +
                "    for(i=0;i<n;i++){\n" +
                "        printf(\"%d\\t\",a[i]);\n" +
                "    }\n" +
                "}\n" +
                "int bubble_sort(int b[],int n){\n" +
                "    int round,temp,compare;\n" +
                "    for(round=1;round<=n-1;round++){\n" +
                "        int skip=0;\n" +
                "        for(compare=0;compare<=n-1-round;compare++){\n" +
                "            if(b[compare]>b[compare+1]){\n" +
                "                skip=1;\n" +
                "                temp=b[compare];\n" +
                "                b[compare]=b[compare+1];\n" +
                "                b[compare+1]=temp;\n" +
                "            }\n" +
                "        }\n" +
                "        if(skip==0){\n" +
                "            printf(\"Your Round is:%d\\n\",round);\n" +
                "            return 0;\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n";
        return s;
   }
}
